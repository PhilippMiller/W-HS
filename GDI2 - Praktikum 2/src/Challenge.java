import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// import p.miller.java.github

public class Challenge {
	
	public static void main (String [] args) {
		try {
			FileReader fr = new FileReader("data\\testdatei.txt");
			
			int letter;
			while ((letter = fr.read()) != -1) {
				char result = encrypt((char)letter);
				if (result != 0)
					System.out.print(""+result);
				else
					System.out.println("ERROR!");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static char encrypt(char input) {
		/*
		char[] BigLetter = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90};
		char[] SmallLetter = {97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
		*/
		
		
		if ((input >= 65 && input <= 90) || (input >= 97 && input <= 122)) {
			// GrossBuchstabe
			int charNeu = input+13;
			if (charNeu > 90 && charNeu <= (90+13)) {
				charNeu = (65 + (charNeu - 91));
			}

			// Kleinbuchstabe
			if (charNeu > 122) {
				charNeu = 97 + (charNeu - 123);
			}
			
			return (char)charNeu;
		}
		else return input;
		
		
	}
	
}
