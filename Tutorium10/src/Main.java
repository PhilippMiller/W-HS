import java.text.DecimalFormat;

import abstract_classes.Immobilie;
import classes.Eigentumswohnung;
import classes.Mehrfamilienhaus;
//import java.von.p.miller

public class Main {

	public static void main(String[] args) {
		float eigenkapital = 60000f;
		Comparable<Immobilie> angebote[] = new Immobilie[6];
		angebote[0] = new Eigentumswohnung("Fichtenweg", 100, 80, 10.0f, 400000.00f, true, eigenkapital);
		angebote[1] = new Eigentumswohnung("Tannenweg", 100, 80, 10.0f, 400000.01f, true, eigenkapital);
		angebote[2] = new Mehrfamilienhaus("Buchenweg", 120, 100, 10.0f, 580000.0f, 10, eigenkapital);
		angebote[3] = new Eigentumswohnung("Eichenweg", 50, 45, 15.0f, 89000.0f, false, eigenkapital);
		angebote[4] = new Mehrfamilienhaus("Sternstrasse", 200, 80, 15.0f, 1200000, 13, eigenkapital);
		angebote[5] = new Eigentumswohnung("Milchstrasse", 800, 50, 12.35f, 1500000, false, eigenkapital);

		Comparable<Immobilie> rangliste[] = Immobilie.bestChoice(angebote);

		System.out.println("Platz\tImmobilienart\t\tAdresse\t\tRendite\t\tGR / WF\t\tF-Rate");
		System.out.println("=======================================================================================");
		for (int i = 0; i < rangliste.length; i++) {
			Immobilie immo = (Immobilie) rangliste[i];
			int platz = i + 1;
			String immoArt = immo.getClass().getSimpleName();
			float immoRendite = (100 / immo.getKaufpreis() * ((immo.getVermietbareFelaeche() * immo.getMietpreis_qm()) * 12));
			double immoGR_WF = ((double) immo.getGrundstuecksgroesse() / (double) immo.getVermietbareFelaeche());
			double rate = immo.getFinanzierungsRate();
			DecimalFormat f = new DecimalFormat("#0.00");
			System.out.println(platz + "\t" + immoArt + "\t" + immo.getAdresse() + "\t" + f.format(immoRendite) + "\t\t" + f.format(immoGR_WF) + "\t\t" + f.format(rate));
		}

	}

}
