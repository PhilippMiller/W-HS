import java.util.ArrayList;

public class Primzahlen {

	public void Primzahlen() {
		int zahl = 1;
		int zahl2;
		int summe = 0;
		int anzahlPrimZahlen = 10;
		ArrayList<Integer> Primzahlen = new ArrayList<>();
		boolean istPrim = false;

		System.out.print("Bitte geben sie den Wert ein, ab dem ich nach Primzahlen suchen soll: ");
		zahl = io.read_int();
		System.out.print("\nBitte geben sie den Wert ein, nach wie vielen Primzahlen gesucht werden soll: ");
		anzahlPrimZahlen = io.read_int();

		for (; Primzahlen.size() < anzahlPrimZahlen; zahl++) {
			zahl2 = zahl - 1;
			if (zahl == 2) {
				Primzahlen.add(zahl);
			}
			if (zahl >= 0) {
				while ((zahl2 > 1) && (zahl2 != 1)) {
					if (zahl % zahl2 != 0) {
						istPrim = true;
					} else {
						istPrim = false;
						break;
					}
					zahl2--;
				}
				if (istPrim == true) {
					Primzahlen.add(zahl);
				}
			}
		}

		System.out.println("");
		System.out.println("Die ersten " + anzahlPrimZahlen + " Primzahlen sind: ");
		for (int i = 0; Primzahlen.size() > i; i++) {
			System.out.print(Primzahlen.get(i) + "\t");
			summe = summe + Primzahlen.get(i);
		}

		System.out.println("\nDie Summe alle Zahlen ist: " + summe);
	}
}
