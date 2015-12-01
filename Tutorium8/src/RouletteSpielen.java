
public class RouletteSpielen {

	private int kapital;
	private int einsatz;
	private String farbe;

	public RouletteSpielen(String farbe, int kapital) {
		this.farbe = farbe;
		this.kapital = kapital;
	}

	public void Game() {

		
		// Pos 0 - Runde | Pos 1 - Wert
		int[] pointOfBigWin = new int[2];
		int startKapital = kapital;

		int zielZahl;
		String zielFarbe;
		int runde = 1;
		int rundenKapital = 0;

		einsatz = 1;

		while (kapital > 0) {
			rundenKapital = kapital;
			zielZahl = (int) (Math.random() * 36);

			zielFarbe = ermittleFarbe(zielZahl);

			System.out.println("Spiel Nr. " + runde + "\n-------------------------");
			System.out.println("Ihr Einsatz beträgt " + einsatz + " €!");
			System.out.println("Gezogen wurde die " + zielZahl + ", diese ist " + zielFarbe + "!");

			if (farbe.equalsIgnoreCase(zielFarbe)) {
				System.out.println("Glückwunsch, Sie haben gewonnen!");
				kapital = kapital + einsatz;
				einsatz = 1;
			} else {
				System.out.println("Schade, Sie haben verloren!");
				kapital = kapital - einsatz;
				einsatz = einsatz * 2;
			}

			if (kapital >= 0)
				System.out.println("Sie haben jetzt noch " + kapital + " €\n");
			else
				System.out.println("Sie haben ihr Geld verspielt!");
			
			if (kapital > rundenKapital) {
				pointOfBigWin[0] = runde;
				pointOfBigWin[1] = kapital;
			}
			runde++;
		}

		System.out.println(
				"\nIst also doch besser Winfo zu studieren anstatt Roulette zu spielen, jetzt sind nämlich Ihre "
						+ startKapital + " € weg!");
		System.out.println("Wären Sie nach Spiel Nr. " + pointOfBigWin[0] + ", also dem optimalen Punkt, ausgestiegen, hätten Sie " + pointOfBigWin[1] + " € gewonnen!");
		replay();
	}

	public static String ermittleFarbe(int zahl1) {
		switch (zahl1) {
		case 1:
			return "rot";
		case 2:
			return "schwarz";
		case 3:
			return "rot";
		case 4:
			return "schwarz";
		case 5:
			return "rot";
		case 6:
			return "schwarz";
		case 7:
			return "rot";
		case 8:
			return "schwarz";
		case 9:
			return "rot";
		case 10:
			return "schwarz";
		case 11:
			return "schwarz";
		case 12:
			return "rot";
		case 13:
			return "schwarz";
		case 14:
			return "rot";
		case 15:
			return "schwarz";
		case 16:
			return "rot";
		case 17:
			return "schwarz";
		case 18:
			return "rot";
		case 19:
			return "rot";
		case 20:
			return "schwarz";
		case 21:
			return "rot";
		case 22:
			return "schwarz";
		case 23:
			return "rot";
		case 24:
			return "schwarz";
		case 25:
			return "rot";
		case 26:
			return "schwarz";
		case 27:
			return "rot";
		case 28:
			return "schwarz";
		case 29:
			return "schwarz";
		case 30:
			return "rot";
		case 31:
			return "schwarz";
		case 32:
			return "rot";
		case 33:
			return "schwarz";
		case 34:
			return "rot";
		case 35:
			return "schwarz";
		case 36:
			return "rot";
		}
		return null;
	}

	public void replay() {
		System.out.println();
		System.out.println("Wollen sie erneut spielen? (j = ja) / (n = nein)");

		char answer = io.read_char_jn();
		if (answer == 'j') {
			Main.Play();
		} else
			System.out.println("Auf wiedersehen!");

	}

}
