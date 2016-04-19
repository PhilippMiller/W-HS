import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Aufgabe29 {
	
	public static void main(String [] args) {
		try {
			
			System.out.println("Bitte geben sie die Input Datei ein: [Für Standard einfach bestätigen]");
			BufferedReader br_input = new BufferedReader(new InputStreamReader(System.in));
			String inputFile = br_input.readLine();
			
			System.out.println("Bitte geben sie die Output Datei ein: [Für Standard einfach bestätigen]");
			BufferedReader br_output = new BufferedReader(new InputStreamReader(System.in));
			String outputFile = br_output.readLine();
			
			if (inputFile.equals("")) {
				inputFile = ("testinput.txt");
			}
			if (outputFile.equals("")) {
				outputFile = "testingoutput.txt";
			}
			
			String direction = System.getProperties().getProperty("user.dir");
			
			LineNumberReader lnr = new LineNumberReader(new FileReader(direction + "\\data\\" + inputFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(direction + "\\data\\" + outputFile));
			
			String line = null;
			while ((line = lnr.readLine()) != null) {
				bw.write(lnr.getLineNumber() + " | " + line + System.lineSeparator());
			}
			bw.close();
			br_input.close();
			br_output.close();
			System.out.println(lnr.getLineNumber() + " Zeilen wurden erfolgreich eingelesen.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
