
public class Geldchecker {

	public void geldCheck() {

		// LATEINISCHE ALPHABET AUFLISTEN FÜR EINEN SPÄTEREN ABGLEICH
		char alphabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		String Eingabe;

		do {
			System.out.println("Bitte eine Seriennummer Eingeben");
			System.out.print("=> ");
			Eingabe = io.read_String();
		} while (Eingabe.length() != 11);

		// LAND ZIFFER EINLESEN
		char landesZiffer = Eingabe.charAt(0);

		// LANDES ZIFFER GROSS MACHEN! (bsp. z = Z)
		String machGross = "" + landesZiffer;
		machGross = machGross.toUpperCase(); // <--- Wird nachher nochmal
												// wichtig für die Ausgabe!
		landesZiffer = machGross.charAt(0);
		int landesNummer = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if (landesZiffer == alphabet[i]) {
				landesNummer = i + 1;
			}
		}

		// LAND ZIFFER ALS "int" IN DEN STRING EINLESEN
		String neueEingabe = "" + landesNummer;
		
		// HIER EIN SPÄTERER AUSGABE STRING
		String serienNummerAusgabeOhneBuchstabe = "";
		// DIE VORHERIGE EINGABE (OHNE DEN BUCHSTABEN i=1) EINLESEN!
		for (int i = 1; i < Eingabe.length(); i++) {
			neueEingabe = neueEingabe + Eingabe.charAt(i);
			serienNummerAusgabeOhneBuchstabe = serienNummerAusgabeOhneBuchstabe + Eingabe.charAt(i);
		}

		String derUmrechenString = "";
		int prüfzifferBestimmung = 0;

		// QUERSUMME BERECHNEN [Integer.parseInt(x) - wandelt String in int um]
		for (int i = 0; i < neueEingabe.length(); i++) {
			derUmrechenString = "" + neueEingabe.charAt(i);
			prüfzifferBestimmung = prüfzifferBestimmung + Integer.parseInt(derUmrechenString);
		}

		// MIT REST TEILEN [MODULO]
		prüfzifferBestimmung = prüfzifferBestimmung % 9;
		prüfzifferBestimmung = 8 - prüfzifferBestimmung;

		if (prüfzifferBestimmung == 0) {
			prüfzifferBestimmung = 9;
		}

		// LANDES BESTIMMUNG
		String land;
		if (machGross.equals("Z"))
			land = "Belgien";
		else if (machGross.equals("Y"))
			land = "Griechenland";
		else if (machGross.equals("X"))
			land = "Deutschland";
		else if (machGross.equals("V"))
			land = "Spanien";
		else if (machGross.equals("U"))
			land = "Frankreich";
		else if (machGross.equals("T"))
			land = "Irland";
		else if (machGross.equals("S"))
			land = "Italien";
		else if (machGross.equals("P"))
			land = "der Niederlande";
		else if (machGross.equals("N"))
			land = "Österreich";
		else if (machGross.equals("M"))
			land = "Porugal";
		else if (machGross.equals("L"))
			land = "Finnland";
		else
			land = "#ERROR UNBEKANNTES LAND#";

		System.out.println("Die Prüfzimmer des aus " + land + " stammenden Geldscheines,");
		System.out.println("mit der Seriennummer " + Eingabe + " hat die Prüfziffer: " + prüfzifferBestimmung);
		System.out.println("\nDie vollständige Seriennummer lautet: " + alphabet[landesNummer-1] + serienNummerAusgabeOhneBuchstabe + prüfzifferBestimmung);

	}

}
