import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe21 {

	public static void main(String[] args) {

		Aufgabe21 aufgabe = new Aufgabe21();
		String in = null;
		boolean go_ahead = false;
		do {
			System.out.println("Bitte geben sie den Dateinamen an. (Bsp. 'test' >> = test.txt)");

			in = aufgabe.eingabe_string();
			if (in == null) {
				System.err.println("Fehler beim übergabe des Dateinamens!\nBeende Programm....");
				System.exit(0);
			}
			System.out.println("Soll wirklich die Datei '" + in + ".txt' aufgerufen werden?");
			if (aufgabe.eingabe_ja_nein() == 1) {
				go_ahead = true;
			} else if (aufgabe.eingabe_ja_nein() == -1) {
				System.err.println("Fehler bei der Verarbeitung der Eingabe!\nBeende Programm....");
				System.exit(0);
			}
		} while (go_ahead == false);

		System.out.println("Datei '" + in + ".txt' wird aufgerufen.");
		ArrayList<String> lines = aufgabe.einlesen((in + ".txt"));
		if (lines == null) {
			System.err.println("Fehler beim einlesen der Datei!\nBeende Programm....");
			System.exit(0);
		}

		String searchedWord = null;
		go_ahead = false;
		do {
			System.out.println("Bitte geben sie das gesuchte Wort ein:");

			searchedWord = aufgabe.eingabe_string();
			if (searchedWord == null) {
				System.err.println("Fehler beim übergabe des Dateinamens!\nBeende Programm....");
				System.exit(0);
			}
			System.out.println("Soll wirklich nach dem Wort '" + searchedWord + "' gesucht werden? ('ja' / 'nein')");
			if (aufgabe.eingabe_ja_nein() == 1) {
				go_ahead = true;
			} else if (aufgabe.eingabe_ja_nein() == -1) {
				System.err.println("Fehler bei der Verarbeitung der Eingabe!\nBeende Programm....");
				System.exit(0);
			}
		} while (go_ahead == false);

		int lineNumber = 0;
		int hits = 0;
		for (String line : lines) {
			lineNumber++;
			ArrayList<String> output;
			if (!(output = regExZumWarmwerden(line, searchedWord)).isEmpty()) {
				int inLineHit = 0;
				for (String hit : output) {
					inLineHit++;
					hits++;
					
					System.out.println("In Zeile " + lineNumber + " befindet sich das Pattern ('" + searchedWord
							+ "') an Position " + hit);
				}
				System.out.println("Somit " + inLineHit +  " mal in Zeile " + lineNumber + " gefunden.");
			}

		}

		System.out.println("Das Pattern ('" + searchedWord + "') wurde " + hits + " mal in allen " + lineNumber
				+ " Zeilen gefunden.");

	}

	static ArrayList<String> regExZumWarmwerden(String suchText, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(suchText);

		ArrayList<String> stringArray = new ArrayList<String>();
		while (m.find()) {
			stringArray.add(m.start() + " bis " + m.end());
		}
		return stringArray;
	}

	private ArrayList<String> einlesen(String fileName) {
		File file = new File(fileName);
		if (!file.exists()) {
			return null;
		}

		ArrayList<String> lines = new ArrayList<String>();

		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line = "";
			while ((line = br.readLine()) != null) {
				lines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!lines.isEmpty()) {
			return lines;
		} else {
			return null;
		}
	}

	private String eingabe_string() {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			if (input != null) {
				return input.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private int eingabe_ja_nein() {
		return eingabe_ja_nein(1);
	}

	private int eingabe_ja_nein(int counter) {
		if (counter < 3) {
			try {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				if (input != null) {
					String readLine = input.readLine();
					if (readLine.equalsIgnoreCase("ja")) {
						return 1;
					} else if (readLine.equalsIgnoreCase("nein")) {
						return 0;
					} else {
						System.out.println("Bitte nur 'ja' oder 'nein' eingeben! " + counter + "/3");
						return eingabe_ja_nein(counter + 1);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

}
