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
		boolean länge = false;

		boolean minZahlen = false;
		boolean minBuchstaben = false;
		boolean grossUndKleinBuchstabe = false;
		boolean zahlOderSonderzeichen = false;

		// länge des Passwortes prüfen
		if (passwort.length >= 8)
			länge = true;

		// eigenschaft der Characters an Stelle i prüfen
		for (int i = 0; passwort.length > i; i++) {
			// wenn an stelle i ein Buchstabe steht
			if (Prüfung.istBuchstabe(passwort[i])) {
				// Menge der Buchstaben um 1 erhöhen
				buchstaben++;
				// Buchstabe an Position i auf Größbuchstabe prüfen
				if (Prüfung.istGroßBuchstabe(passwort[i])) {
					grossBuchstabe = true;
					// Buchstabe an Position i auf Kleinbuchstabe prüfen
				} else if (Prüfung.istKleinBuchstabe(passwort[i])) {
					kleinBuchstabe = true;
				}
				// wenn an stelle i eine Zahl steht
			} else if (Prüfung.istZiffer(passwort[i])) {
				zahl = true;
				// menge der Zahlen um 1 erhöhen
				zahlen++;
				// wenn an stelle i kein Buchstabe und auch keine Zahl steht
			} else
				sonderzeichen = true;
		}

		/*
		 * FALSE or TURE PRÜFUNGEN
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
		System.out.println("Die Passwortprüfung ergab folgendes Ergebnis:");
		System.out.println("\n=============================================");

		System.out.println("Passwort besteht aus mindestens 8 Zeichen: " + länge);
		System.out.println("Passwort enthält mindestens 2 Buchstaben: " + minBuchstaben);
		System.out.println("Passwort enthält mindestens 2 Ziffern: " + minZahlen);
		System.out.println("Passwort enthält mindestens einen Groß- und mindestens einen Kleinbuchstaben: "
				+ grossUndKleinBuchstabe);
		System.out.println("Passwort enthält mindestens ein Sonderzeichen: " + sonderzeichen);
		System.out.println("Innerhalb des Passwortes befindet sich mindestens eine Ziffer oder ein Sonderzeichen: "
				+ zahlOderSonderzeichen);

	}
}
