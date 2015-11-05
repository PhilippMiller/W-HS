public class SchiffeVersenken {
	public static int eingabe(int untergrenze, int obergrenze) {
		/*
		 * Funktion um die Eingabe einer Ganzzahl zu erm?glichen, die zwischen 2
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
		// TODO Auto-generated method stub

		// Deklaration und Initialisierung eines zweidimensionalen Feldes mit
		// der Bezeichnung nordsee als Spielfeld im Raster 6 x 6

		// Hier muss etwas eingetragen werden!!!!!

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
			// Per Zufallsfunktion werden f?r die Zeile und die Spalte Zahlen
			// zwischen 0 und 5 ermittelt
			do {
				zeile = (int) (Math.random() * 6);
				spalte = (int) (Math.random() * 6);
			}
			// Es wird gepr?ft, ob an dieser Stelle des Spielfeldes ein Schiff
			// platziert werden darf
			while (nordsee[zeile][spalte] == 'S' || nordsee[zeile][spalte] == 'w');

			// Bei den m?glichen Koordinaten wird das Schiff platziert
			nordsee[zeile][spalte] = 'S';

			// Jetzt m?ssen noch die Felder rund um das Schiff "gesperrt"
			// werden, damit die Schiffe
			// nicht direkt aneinander sto?en - vertikal, horizontal und
			// diagonal

			// Hier muss etwas eingetragen werden!!!!!
		}

		// Schleife zur Abfrage der Felder, die darauf untersucht werden sollen,
		// ob auf ihnen
		// ein Schiff ist, l?uft solange bis alle Schiffe gefunden wurden
		while (treffer < 6) {
			// Hier muss etwas eingetragen werden!!!!!
		}

		// Am Ende des Spiels wird das Spielfeld ausgegeben
		{
			System.out.println("\nSo sieht das Spielfeld aus:\n");
			for (zeile = 0; zeile < 6; zeile++) {
				for (spalte = 0; spalte < 6; spalte++) {
					System.out.print(" " + nordsee[zeile][spalte] + " |");
				}
				System.out.println("\n========================");
			}
		}
	}
}