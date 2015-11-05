
public class Main {

	public static int eingabe(int untergrenze, int obergrenze) {
		/*
		 * Funktion um die Eingabe einer Ganzzahl zu ermöglichen, die zwischen 2
		 * Werten liegt untergrenze = kleinster Wert, der eingegeben werden darf
		 * obergrenze = gr??ter Wert, der eingegeben werden darf
		 */

		// Deklaration der Variable rueckgabewert als int
		int rueckgabewert;

		do {
			rueckgabewert = io.read_int();
			if (rueckgabewert < untergrenze | rueckgabewert > obergrenze) {
				System.out.println("Bitte nur Zahlen von " + untergrenze + " bis " + obergrenze + " eingeben!");
			}
		} while (rueckgabewert < untergrenze | rueckgabewert > obergrenze);

		return rueckgabewert;
	}

	public static void main(String[] args) {

		// Deklaration und Initialisierung eines zweidimensionalen Feldes mit
		// der Bezeichnung nordsee als Spielfeld im Raster 6 x 6

		char[][] nordsee = new char[6][6];

		// Deklaration der Variablen zeile als int
		int zeile;
		// Deklaration der Variablen spalte als int
		int spalte;
		// Deklaration und Initialisieren der Variablen treffer als int
		int treffer = 0;

		/*
		 * Ein Beispiel f?r ein Spielfeld - es gibt keine direkt benachbarten
		 * Schiffe!
		 * 
		 * 0 1 2 3 4 5 =========================== 0 | w | w | w | w | w | w |
		 * =========================== 1 | w | S | w | w | S | w |
		 * =========================== 2 | w | w | w | w | w | w |
		 * =========================== 3 | w | S | w | w | S | w |
		 * =========================== 4 | w | w | w | w | w | w |
		 * =========================== 5 | S | w | S | w | S | w |
		 * ===========================
		 */

		// Insgesamt sollen 6 Schiffe auf dem Spielfeld positioniert werden
		for (int schiff = 1; schiff <= 6; schiff++) {
			// Per Zufallsfunktion werden für die Zeile und die Spalte Zahlen
			// zwischen 0 und 5 ermittelt
			do {
				zeile = (int) (Math.random() * 6);
				spalte = (int) (Math.random() * 6);
			}
			// Es wird geprüft, ob an dieser Stelle des Spielfeldes ein Schiff
			// platziert werden darf
			while (nordsee[zeile][spalte] == 'S' || nordsee[zeile][spalte] == 'W');

			// Bei den möglichen Koordinaten wird das Schiff platziert
			nordsee[zeile][spalte] = 'S';

			// Jetzt müssen noch die Felder rund um das Schiff "gesperrt"
			// werden, damit die Schiffe
			// nicht direkt aneinander stoßen - vertikal, horizontal und
			// diagonal

			System.out.println("#############");
			System.out.println("# S in zeile: " + zeile + " | spalte: " + spalte);
			System.out.println("#############");
			// NICHT NACH OBEN
			if (zeile == 5) {

				// NICHT NACH OBEN UND NACH LINKS
				if (spalte == 0) {
					System.out.println("IF zeile == 5 & spalte == 0");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// RECHTS SPERRE
					nordsee[zeile][spalte + 1] = 'W';
					// UNTEN SPERRE
					nordsee[zeile - 1][spalte] = 'W';
					// UNTEN RECHTS SPERRE
					nordsee[zeile - 1][spalte + 1] = 'W';
				}

				// NICHT NACH OBEN UND NACH RECHTS
				else if (spalte == 5) {
					System.out.println("IF zeile == 5 & spalte == 5");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// LINKS SPERRE
					nordsee[zeile][spalte - 1] = 'W';
					// UNTEN SPERRE
					nordsee[zeile - 1][spalte] = 'W';
					// UNTEN LINKS SPERRE
					nordsee[zeile - 1][spalte - 1] = 'W';
				}

				// NICHT NACH OBEN
				else {
					System.out.println("IF zeile == 5 & spalte != 0 oder 5");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// RECHTS SPERRE
					nordsee[zeile][spalte + 1] = 'W';
					// LINKS SPERRE
					nordsee[zeile][spalte - 1] = 'W';
					// UNTEN SPERRE
					nordsee[zeile - 1][spalte] = 'W';
					// UNTEN RECHTS SPERRE
					nordsee[zeile - 1][spalte + 1] = 'W';
					// UNTEN LINKS SPERRE
					nordsee[zeile - 1][spalte - 1] = 'W';
				}
			}

			// NICHT NACH UNTEN
			else if (zeile == 0) {

				// NICHT NACH UNTEN UND NACH LINKS
				if (spalte == 0) {
					System.out.println("IF zeile == 0 & spalte == 0");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// RECHTS SPERRE
					nordsee[zeile][spalte + 1] = 'W';
					// OBEN SPERRE
					nordsee[zeile + 1][spalte] = 'W';
					// OBEN RECHTS SPERRE
					nordsee[zeile + 1][spalte + 1] = 'W';
				}

				// NICHT NACH UNTEN UND NACH RECHTS
				if (spalte == 5) {
					System.out.println("IF zeile == 0 & spalte == 5");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// LINKS SPERRE
					nordsee[zeile][spalte - 1] = 'W';
					// OBEN SPERRE
					nordsee[zeile + 1][spalte] = 'W';
					// OBEN LINKS SPERRE
					nordsee[zeile + 1][spalte - 1] = 'W';
				}
			}

			// SONST || ACHTUNG: Nur weil die "zeile" nicht 0 oder 5 ist heisst
			// das nicht das die "spalte" nicht 0 oder 5 ist!
			else {

				// NICHT NACH LINKS
				if (spalte == 0) {
					System.out.println("IF spalte == 0");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// RECHTS SPERRE
					nordsee[zeile][spalte + 1] = 'W';
					// OBEN SPERRE
					nordsee[zeile + 1][spalte] = 'W';
					// UNTEN SPERRE
					nordsee[zeile - 1][spalte] = 'W';
					// OBEN RECHTS SPERRE
					nordsee[zeile + 1][spalte + 1] = 'W';
					// UNTEN RECHTS SPERRE
					nordsee[zeile - 1][spalte + 1] = 'W';
				}
				// NICHT NACH RECHTS
				else if (spalte == 5) {
					System.out.println("IF spalte == 5");
					System.out.println("#############");
					System.out.println("zeile: " + zeile + " | spalte: " + spalte);
					System.out.println("#############");
					// LINKS SPERRE
					nordsee[zeile][spalte - 1] = 'W';
					// OBEN SPERRE
					nordsee[zeile + 1][spalte] = 'W';
					// UNTEN SPERRE
					nordsee[zeile - 1][spalte] = 'W';
					// OBEN LINKS SPERRE
					nordsee[zeile + 1][spalte - 1] = 'W';
					// UNTEN LINKS SPERRE
					nordsee[zeile - 1][spalte - 1] = 'W';
				}
				// SONST ALLES SPERREN
				else {
					// RECHTS SPERRE
					nordsee[zeile][spalte + 1] = 'W';
					// LINKS SPERRE
					nordsee[zeile][spalte - 1] = 'W';

					// OBEN SPERRE
					nordsee[zeile + 1][spalte] = 'W';
					// UNTEN SPERRE
					nordsee[zeile - 1][spalte] = 'W';

					// OBEN RECHTS SPERRE
					nordsee[zeile + 1][spalte + 1] = 'W';
					// OBEN LINKS SPERRE
					nordsee[zeile + 1][spalte - 1] = 'W';

					// UNTEN RECHTS SPERRE
					nordsee[zeile - 1][spalte + 1] = 'W';
					// UNTEN LINKS SPERRE
					nordsee[zeile - 1][spalte - 1] = 'W';
				}
			}
		}

		// JETZT SCHNELL DIE LETZEN EVENTUELL VERBLIEBENDEN LÜCKEN FÜLLEN
		for (int i = 0; i < nordsee.length; i++) {
			for (int j = 0; j < nordsee[i].length; j++) {
				if (nordsee[i][j] == 0) {
					nordsee[i][j] = 'W';
				}
			}
		}

		// ICH KOPIERE DAS SPIELFELD UM NACHHER DAS SPIELFELD VOM ANFANG AUSZUGEBEN!
		char[][] nordseeAnfang = new char[6][6];
		for (int i = 0; i < nordsee.length; i++) {
			for (int j = 0; j < nordsee[i].length; j++) {
				nordseeAnfang[i][j] = nordsee[i][j];
			}
		}

		// Schleife zur Abfrage der Felder, die darauf untersucht werden sollen,
		// ob auf ihnen
		// ein Schiff ist, läuft solange bis alle Schiffe gefunden wurden
		while (treffer < 6) {
			do {
				System.out.println("Bitte die Zeile Angeben auf die geschossen werden soll (1 - 6):");
				zeile = io.read_int();
			} while (zeile < 1 | zeile > 6);
			zeile--;

			do {
				System.out.println("Bitte die Spalte Angeben auf die geschossen werden soll (1 - 6)");
				spalte = io.read_int();
			} while (spalte < 1 | spalte > 6);
			spalte--;

			if (nordsee[zeile][spalte] == 'S') {
				treffer++;
				System.out.println("Guter Schuss Soldat! Das war Schiff " + treffer + "/6");
			} else {
				System.out.println("Was tun Sie Soldat?! Das war kein Treffer! [" + treffer + "/6]");
			}
		}

		// Am Ende des Spiels wird das Spielfeld ausgegeben
		{
			System.out.println("\nSo sieht das Spielfeld aus:\n");
			for (zeile = 0; zeile < 6; zeile++) {
				for (spalte = 0; spalte < 6; spalte++) {
					System.out.print(" " + nordseeAnfang[zeile][spalte] + " |");
				}
				System.out.println("\n========================");
			}
		}
	}

}
