
public class Main {
	int[] zellorte;
	int anzahlTreffer = 0;

	// VOID MAIN
	public static void main(String[] args) {
		int anzahlTipps = 0;
		SpielHelfer helfer = new SpielHelfer();

		Main dotCom = new Main();

		int zufallsZahl = (int) (Math.random() * 5);

		int[] orte = { zufallsZahl, zufallsZahl + 1, zufallsZahl + 2 };
		dotCom.setZellorte(orte);

		boolean lebt = true;

		while (lebt == true) {

			String tipp = helfer.getBenutzereingabe("Geben Sie eine Zahl ein.");
			String ergebnis = dotCom.prüfDich(tipp);
			anzahlTipps++;

			if (ergebnis.equals("Versenkt")) {
				lebt = false;
				System.out.println("Sie haben " + anzahlTipps + " Versuche benöigt!");
			}

		}

	}

	// prüfDich()
	public String prüfDich(String stringTipp) {

		int tipp = Integer.parseInt(stringTipp);
		String ergebnis = "Vorbei";

		for (int zelle : zellorte) {
			if (tipp == zelle) {
				ergebnis = "Treffer";
				anzahlTreffer++;

				break;
			}
		}

		if (anzahlTreffer == zellorte.length) {
			ergebnis = "Versenkt";
		}

		System.out.println(ergebnis);
		return ergebnis;

	}

	// setZellorte()
	void setZellorte(int[] orte) {

		zellorte = orte;

	}

}
