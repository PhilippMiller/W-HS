
public class Autorennen {

	Rennauto[] alleAutos;
	int maxrunden;

	// CONSTRUCTOR
	public Autorennen(Rennauto[] alleAutos, int maxrunden) {
		this.setAlleAutos(alleAutos);
		this.setMaxrunden(maxrunden);
	}

	// WEITERE FUNKTIONEN
	public void alleFahren() {
		while (zuEnde(alleAutos) == false) {
			for (int i = 0; i < this.alleAutos.length; i++) {
				this.alleAutos[i].fahren();
			}
		}
		sieger(alleAutos);

	}

	// ZU ENDE ?
	public boolean zuEnde(Rennauto[] teilnehmer) {
		for (int i = 0; i < teilnehmer.length; i++) {
			if (teilnehmer[i].rundenzahl >= maxrunden)
				return true;
			else
				teilnehmer[i].fahren();
		}
		return false;
	}

	public Rennauto sieger(Rennauto[] teilnehmer) {
		Rennauto sieger = null;
		for (int i = 0; i < teilnehmer.length; i++) {
			if (teilnehmer[i].rundenzahl >= maxrunden) {
				sieger = teilnehmer[i];
			}
		}
		System.out.println("Gewonnen hat der " + sieger.getName() + ", gefahren von " + sieger.getFahrer() + ".");
		return sieger;
	}

	// GETTER und SETTER
	public Rennauto[] getAlleAutos() {
		return alleAutos;
	}

	public void setAlleAutos(Rennauto[] alleAutos) {
		this.alleAutos = alleAutos;
	}

	public int getMaxrunden() {
		return maxrunden;
	}

	public void setMaxrunden(int maxrunden) {
		this.maxrunden = maxrunden;
	}

}
