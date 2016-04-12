package abstract_classes;

import java.util.ArrayList;
//import java.von.p.miller

public abstract class Immobilie implements Comparable<Immobilie> {

	protected String adresse;
	protected int grundstuecksgroesse;
	protected int vermietbareFelaeche;
	protected float mietpreis_qm;
	protected float kaufpreis;
	protected float eigenkaptial;
	protected double finanzierungsRate;

	public Immobilie(String adresse, int grundstuecksgroesse, int vermietbareFlaeche, float mietpreis_qm,
			float kaufpreis, float eigenkaptial) {
		this.adresse = adresse;
		this.grundstuecksgroesse = grundstuecksgroesse;
		this.vermietbareFelaeche = vermietbareFlaeche;
		this.mietpreis_qm = mietpreis_qm;
		this.kaufpreis = kaufpreis;
		this.eigenkaptial = eigenkaptial;
	}

	public static Comparable<Immobilie>[] bestChoice(Comparable<Immobilie>[] angebote) {
		Comparable<Immobilie> rangliste[] = new Immobilie[angebote.length];
		ArrayList<Integer> index_werte = new ArrayList<Integer>();

		int counter = 0;
		for (int i = 0; i < angebote.length; i++) {
			counter = 0;
			for (int j = 0; j < angebote.length; j++) {
				if (i != j) {
					counter += angebote[i].compareTo((Immobilie) angebote[j]);
				}
			}
			index_werte.add(counter);
			System.out.println("\n");
		}

		ArrayList<Immobilie> rangListe_list = new ArrayList<Immobilie>();

		for (int durchlaeufe = 0; durchlaeufe < angebote.length; durchlaeufe++) {
			int groesterWert_anStelle = 0;
			for (int i = 0; i < index_werte.size(); i++) {
				int groessterWert = Integer.MIN_VALUE;
				if (index_werte.get(i) > groessterWert) {
					groessterWert = index_werte.get(i);
					groesterWert_anStelle = i;
				}
			}
			rangListe_list.add((Immobilie) angebote[groesterWert_anStelle]);
			index_werte.remove(groesterWert_anStelle);
		}

		for (int i = 0; i < rangListe_list.size(); i++) {
			rangliste[i] = rangListe_list.get(i);
		}

		return rangliste;
	}

	public int compareTo(Immobilie renditeObjekt) {

		int myObject = 0;
		int otherObject = 0;

		// 1- RENDITE
		float rendite1 = (100 / this.kaufpreis * ((this.vermietbareFelaeche * this.mietpreis_qm) * 12));
		float rendite2 = (100 / renditeObjekt.getKaufpreis()
				* ((renditeObjekt.getVermietbareFelaeche() * renditeObjekt.getMietpreis_qm()) * 12));

		if (rendite1 > rendite2)
			myObject++;
		else if (rendite1 < rendite2)
			otherObject++;

		// 2- Differenz zwischen Grundstücksfläche und Vermietbare Fläche
		int diff1 = this.grundstuecksgroesse - this.vermietbareFelaeche;
		int diff2 = renditeObjekt.getGrundstuecksgroesse() - renditeObjekt.getVermietbareFelaeche();

		if (diff1 < diff2)
			myObject++;
		else if (diff1 > diff2)
			otherObject++;

		// 3- Beleihungswert
		double beleihungswert1 = getRate(this.eigenkaptial);
		double beleihungswert2 = getRate(renditeObjekt.getEigenkaptial());

		if (beleihungswert1 > beleihungswert2)
			myObject++;
		else if (beleihungswert1 < beleihungswert2)
			otherObject++;

		if (myObject == otherObject) {
			if (rendite1 != rendite2) {
				if (rendite1 > rendite2)
					myObject++;
				else
					otherObject++;
			} else if (diff1 != diff2) {
				if (diff1 < diff2)
					myObject++;
				else
					otherObject++;
			} else if (beleihungswert1 != beleihungswert2) {
				if (beleihungswert1 > beleihungswert2)
					myObject++;
				else
					otherObject++;
			}
		}

		if (myObject > otherObject)
			return 1;
		else
			return 0;
	}

	public double getRate(double eigenkapital) {

		double finanzierungsbedarf = this.kaufpreis - this.eigenkaptial;

		double u60p = this.kaufpreis * 0.6;

		double rest1 = finanzierungsbedarf - u60p;

		double u80p = rest1 * 0.8;

		double rest2 = rest1 - u80p;

		double tilgung = finanzierungsbedarf * 0.02;
		double zinsen1 = u60p * 0.016;
		double zinsen2 = u80p * 0.02;
		double zinsen3 = rest2 * 0.025;

		double tilgungUndZinsen = tilgung + zinsen1 + zinsen2 + zinsen3;
		double endWert = tilgungUndZinsen / 12;
		this.finanzierungsRate = endWert;
		return endWert;

	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getGrundstuecksgroesse() {
		return grundstuecksgroesse;
	}

	public void setGrundstuecksgroesse(int grundstuecksgroesse) {
		this.grundstuecksgroesse = grundstuecksgroesse;
	}

	public int getVermietbareFelaeche() {
		return vermietbareFelaeche;
	}

	public void setVermietbareFelaeche(int vermietbareFelaeche) {
		this.vermietbareFelaeche = vermietbareFelaeche;
	}

	public float getMietpreis_qm() {
		return mietpreis_qm;
	}

	public void setMietpreis_qm(float mietpreis_qm) {
		this.mietpreis_qm = mietpreis_qm;
	}

	public float getKaufpreis() {
		return kaufpreis;
	}

	public void setKaufpreis(float kaufpreis) {
		this.kaufpreis = kaufpreis;
	}

	public float getEigenkaptial() {
		return eigenkaptial;
	}

	public void setEigenkaptial(float eigenkaptial) {
		this.eigenkaptial = eigenkaptial;
	}

	public double getFinanzierungsRate() {
		return finanzierungsRate;
	}

	public void setFinanzierungsRate(double finanzierungsRate) {
		this.finanzierungsRate = finanzierungsRate;
	}

}
