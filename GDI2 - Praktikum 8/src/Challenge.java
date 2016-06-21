import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Entry {
	int counts;
	String key;
	
	public Entry(int counts, String key) {
		this.counts = counts;
		this.key = key;
	}
	
	public Entry() {
		this(0, "");
	}
}

public class Challenge {

	public static void main(String[] args) {
		
		Challenge challenge = new Challenge();
		String in = null;
		boolean go_ahead = false;
		do {
			System.out.println("Bitte geben sie den Dateinamen an. (Bsp. 'test' >> = test.txt)");
			
			in = challenge.eingabe_string();
			if (in == null) {
				System.err.println("Fehler beim übergabe des Dateinamens!\nBeende Programm....");
				System.exit(0);
			}
			System.out.println("Soll wirklich die Datei '" + in + ".txt' aufgerufen werden?");
			if (challenge.eingabe_ja_nein() == 1) {
				go_ahead = true;
			} else if (challenge.eingabe_ja_nein() == -1) {
				System.err.println("Fehler bei der Verarbeitung der Eingabe!\nBeende Programm....");
				System.exit(0);
			}
		} while(go_ahead == false);
		
		System.out.println("Datei '" + in + ".txt' wird aufgerufen.");
		ArrayList<String> lines = challenge.einlesen((in + ".txt"));
		if (lines == null) {
			System.err.println("Fehler beim einlesen der Datei!\nBeende Programm....");
			System.exit(0);
		}
		
		ArrayList<String[]> linesArrays = new ArrayList<String[]>();
		for (String line : lines) {
			String newLine = line.replace(",", ";");
			newLine = newLine.replace(".", ";");
			newLine = newLine.replace(":", ";");
			newLine = newLine.replace(" ", ";");
			newLine = newLine.replace("(", ";");
			newLine = newLine.replace(")", ";");
			newLine = newLine.replace("{", ";");
			newLine = newLine.replace("}", ";");
			newLine = newLine.replace("[", ";");
			newLine = newLine.replace("]", ";");
			newLine = newLine.replace("|", ";");
			newLine = newLine.replace("+", ";");
			newLine = newLine.replace("-", ";");
			newLine = newLine.replace("*", ";");
			newLine = newLine.replace("/", ";");
			newLine = newLine.replace("\\", ";");
			newLine = newLine.replace(";;", ";");
			newLine = newLine.replace(";;", ";");
			
			linesArrays.add(newLine.split(";"));
		}
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		
		int words = 0;
		for (String[] wordArray : linesArrays) {
			for (String word : wordArray) {
				words++;
				word = word.toLowerCase();
				if (!wordMap.containsKey(word)) {
					wordMap.put(word, 1);
				} else {
					wordMap.put(word, wordMap.get(word) + 1);
				}
			}
		}
		
		Entry theBestOne = new Entry();
		theBestOne.counts = Integer.MIN_VALUE;
		for (String key : wordMap.keySet() ) {
			if (wordMap.get(key) > theBestOne.counts) {
				theBestOne.counts = wordMap.get(key);
				theBestOne.key = key;
			}
		}
		
		Entry[] theTopTen = new Entry[10];
		for (int i = 0; i < theTopTen.length; i++) {
			theTopTen[i] = new Entry();
		}
		
		for (String key : wordMap.keySet() ) {
			for (int i = 0; i < theTopTen.length; i++) {
				if (wordMap.get(key) > theTopTen[i].counts) {
					theTopTen[i].counts = wordMap.get(key);
					theTopTen[i].key = key;
					break;
				}				
			}
		}
		
		System.out.println("Die Datei beinhaltet " + words + " Wörter.");
		System.out.println("Dabei sind es " + wordMap.size() + " verschieden Wörter.");
		System.out.println("Mit " + theBestOne.counts + " Wiederholungen ist '" + theBestOne.key + "' das sich am häufigsten wiederholende Wort.");
		
		System.out.println("Die top 10 Worte sind: ");
		int platz = 0;
		for (Entry entry : theTopTen) {
			platz++;
			String tab = "\t";
			if (entry.key.length() + 2 < 7) {
				tab = "\t\t";
			}
			
			if (platz < 10) {
				System.out.println("(0" + platz + ".) '" + entry.key + "' " + tab + "mit " + entry.counts + " Wiederholungen.");
			} else {
				System.out.println("(" + platz + ".) '" + entry.key + "' " + tab + "mit " + entry.counts + " Wiederholungen.");
			}
		}
		
		
		
		
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
