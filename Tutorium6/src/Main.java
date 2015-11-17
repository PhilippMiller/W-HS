import java.net.SocketOptions;

public class Main {

	public static void main(String args[]) {
		// Passwort generieren
		char[] passwort = PasswortGenerator.Generator();

		// variablen initialisieren
		int buchstaben = 0;
		int zahlen = 0;
		boolean grossBuchstabe = false;
		boolean kleinBuchstabe = false;
		boolean sonderzeichen = false;
		boolean zahl = false;
		boolean l�nge = false;

		boolean minZahlen = false;
		boolean minBuchstaben = false;
		boolean grossUndKleinBuchstabe = false;
		boolean zahlOderSonderzeichen = false;

		// l�nge des Passwortes pr�fen
		if (passwort.length >= 8)
			l�nge = true;

		// eigenschaft der Characters an Stelle i pr�fen
		for (int i = 0; passwort.length > i; i++) {
			// wenn an stelle i ein Buchstabe steht
			if (Pr�fung.istBuchstabe(passwort[i])) {
				// Menge der Buchstaben um 1 erh�hen
				buchstaben++;
				// Buchstabe an Position i auf Gr��buchstabe pr�fen
				if (Pr�fung.istGro�Buchstabe(passwort[i])) {
					grossBuchstabe = true;
					// Buchstabe an Position i auf Kleinbuchstabe pr�fen
				} else if (Pr�fung.istKleinBuchstabe(passwort[i])) {
					kleinBuchstabe = true;
				}
				// wenn an stelle i eine Zahl steht
			} else if (Pr�fung.istZiffer(passwort[i])) {
				zahl = true;
				// menge der Zahlen um 1 erh�hen
				zahlen++;
				// wenn an stelle i kein Buchstabe und auch keine Zahl steht
			} else
				sonderzeichen = true;
		}

		/*
		 * FALSE or TURE PR�FUNGEN
		 */

		if (zahlen >= 2)
			minZahlen = true;
		if (buchstaben >= 2)
			minBuchstaben = true;
		if (kleinBuchstabe && grossBuchstabe)
			grossUndKleinBuchstabe = true;
		if (zahl || sonderzeichen)
			zahlOderSonderzeichen = true;
		
		// Ausgabe der Feststellungen
		System.out.println("Die Passwortpr�fung ergab folgendes Ergebnis:");
		System.out.println("\n=============================================");

		System.out.println("Passwort besteht aus mindestens 8 Zeichen: " + l�nge);
		System.out.println("Passwort enth�lt mindestens 2 Buchstaben: " + minBuchstaben);
		System.out.println("Passwort enth�lt mindestens 2 Ziffern: " + minZahlen);
		System.out.println("Passwort enth�lt mindestens einen Gro�- und mindestens einen Kleinbuchstaben: "
				+ grossUndKleinBuchstabe);
		System.out.println("Passwort enth�lt mindestens ein Sonderzeichen: " + sonderzeichen);
		System.out.println("Innerhalb des Passwortes befindet sich mindestens eine Ziffer oder ein Sonderzeichen: "
				+ zahlOderSonderzeichen);

	}
}
