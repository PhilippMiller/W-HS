public class Main {

	public static void main(String[] args) {

		BauDenSchrank lagerGeb�ude = new BauDenSchrank();

		int wahlRegal = 0;
		String bearbeitenAntwort;
		int[][] lager;
		int anzahlRegale = 0;
		int anzahlF�cher = 0;

		int fach = 0;
		int regal = 0;

		System.out.println("################################");
		System.out.println("Willkommen im Lagermanager 1.0");
		System.out.println("  Dein Lager wird ge�ffnet...");
		System.out.println("################################");

		// Da NICHT gefordert...
		// System.out.print("\n\nWie viele Regale hat dein Lager: ");
		// anzahlRegale = io.read_int();
		// System.out.print("\n\nWie viele F�cher hat dein Lager: ");
		// anzahlF�cher = io.read_int();
		anzahlRegale = 2;
		anzahlF�cher = 2;
		lager = new int[anzahlRegale][anzahlF�cher];


		boolean exit = false;
		while (exit == false) {
			lagerGeb�ude.buildIt(lager);
			// Siehe Punkt "Da nicht anders gefordert!"
			System.out.println("Linke Seite:");
			System.out.println("\t\t- Flache, helle  Schuhe:\tFach Nr. [1]");
			System.out.println("\t\t- Flache, dunkle Schuhe:\tFach Nr. [2]");
			System.out.println("\nRechte Seite: Hohe Schuhe");
			System.out.println("\t\t- Hohe, helle  Schuhe:\t\tFach Nr. [3]");
			System.out.println("\t\t- Hohe, dunkle Schuhe:\t\tFach Nr. [4]");
			// Siehe Punkt ENDE
			System.out.print("\nBitte w�hle ein Schuhfach aus: ");

			boolean fachAuswahlKorrekt = false;
			while (fachAuswahlKorrekt == false) {

				wahlRegal = io.read_int();
				// Siehe Punkt "Da NICHT anders gefordert!
				if (wahlRegal <= anzahlRegale * anzahlF�cher) {

					regal = (wahlRegal - 1) / lager.length;
					fach = (wahlRegal - 1) % lager[regal].length;

					System.out.println("Im Fach " + wahlRegal + " befinden sich " + lager[(int) fach][(int) regal]
							+ " paar Schuhe.");
					fachAuswahlKorrekt = true;
				} else
					System.out.println("Bitte ein Fach von 1 bis " + anzahlRegale * anzahlF�cher);
			}

			System.out.print("\nWillst du dieses Fach bearbeiten? (\"ja\" oder \"nein\") ");
			bearbeitenAntwort = io.read_String_janein();
			if (bearbeitenAntwort.equalsIgnoreCase("ja") == true) {
				System.out.print("Bitte gib die neue Anzahl an Schuhe an: ");
				boolean eingabeKorrekt = false;
				while (eingabeKorrekt == false) {
					int neueAnzahl = io.read_int();
					if (neueAnzahl >= 0) {
						lager[fach][regal] = neueAnzahl;
						eingabeKorrekt = true;
					} else {
						System.out.print("Bitte einen positiven Wert eingeben: ");
					}
				}
				System.out.println("Im Fach " + (wahlRegal + 1) + " befinden sich nun " + lager[fach][(int) regal]
						+ " Paar Schuhe.");
			} else {
				System.out.println("Im Fach " + (wahlRegal + 1) + " befinden sich weiterhin "
						+ lager[fach][(int) regal] + " Paar Schuhe.");
			}
		}
		lagerGeb�ude.buildIt(lager);

		System.out.print("\nDen Schrank weiter bearbeiten? (\"ja\" oder \"nein\") ");
		bearbeitenAntwort = io.read_String_janein();
		if (bearbeitenAntwort.equalsIgnoreCase("nein")) {
			exit = true;
		}

		int Summe = 0;
		for (int i = 0; lager.length > i; i++)

		{
			for (int j = 0; lager[i].length > j; j++) {
				Summe = Summe + lager[i][j];
			}
		}

		System.out.println("In deinem Schrank befinden sich nun " + Summe + " " + "Paar Schuhe.");

		System.out.println("##############################################");
		System.out.println("Lagermanager 1.0 verschliesst den Lager...");
		System.out.println("       Lager verschlossen. Bis bald.");
		System.out.println("##############################################");
	}

}