
public class Main {
	public static void main(String[] args) {
		int[] feld = { 124, 1, -34, 45, 78, -38, 122, 56, 0, 67, 45, -38, 3, 122, -12, 124 };

		int groessteZahl = groesste_zahl(feld);
		int zweitgroessteZahl = zweitGroesste_zahl(feld);
		int kleinsteZahel = kleinste_zahl(feld);

		System.out.println("Die größte Zahl in dem Feld ist die: " + groessteZahl);
		System.out.println("Die zweit größte Zahl in dem Feld ist die: " + zweitgroessteZahl);
		System.out.println("Die kleinste Zahl in diesem Feld ist die: " + kleinsteZahel);
	}

	public static int groesste_zahl(int[] feld) {

		// Wenn das Feld "feld" leer ist gib den kleinst möglichen Integer Wert
		// zurück und beende die funktion.
		if (feld.length == 0)
			return Integer.MIN_VALUE;

		// Hier hält "groessteZahl" die kleinst mögliche Zahl eines Integers
		// fest.
		int groessteZahl = Integer.MIN_VALUE;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] > groessteZahl)
				groessteZahl = feld[i];
		}
		return groessteZahl;
	}

	public static int zweitGroesste_zahl(int[] feld) {

		// Wenn das Feld "feld" leer ist gib den kleinst möglichen Integer Wert
		// zurück und beende die funktion.
		if (feld.length == 0)
			return Integer.MIN_VALUE;

		int ErmittelteGroessteZahl = groesste_zahl(feld);

		// um das eigentliche Feld nicht zu bearbeiten.
		int[] feld_clone = feld.clone();

		// die größte Zahl entfernen
		for (int i = 0; i < feld_clone.length; i++) {
			if (feld_clone[i] == ErmittelteGroessteZahl)
				feld_clone[i] = Integer.MIN_VALUE;
		}

		int zweitgroessteZahl = groesste_zahl(feld_clone);

		if (feld.length == 1 | feld.length == 2)
			if (zweitgroessteZahl == Integer.MIN_VALUE)
				zweitgroessteZahl = ErmittelteGroessteZahl;

		return zweitgroessteZahl;

	}

	public static int kleinste_zahl(int[] feld) {
		// Wenn das Feld "feld" leer ist gib den kleinst möglichen Integer Wert
		// zurück und beende die funktion.
		if (feld.length == 0)
			return Integer.MIN_VALUE;

		// Hier hält "kleinsteZahl" die größt mögliche Zahl eines Integers fest.
		int kleinsteZahl = Integer.MAX_VALUE;
		for (int i = 0; i < feld.length; i++) {
			if (feld[i] < kleinsteZahl)
				kleinsteZahl = feld[i];
		}
		return kleinsteZahl;
	}
}
