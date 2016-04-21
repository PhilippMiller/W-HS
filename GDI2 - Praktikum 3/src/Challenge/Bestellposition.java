package Challenge;

public class Bestellposition {
	
	private Artikel auswahlArtikel;
	private int anzahl;
	
	public Bestellposition(int anzahl, Artikel artikel) {
		this.anzahl = anzahl;
		this.auswahlArtikel = artikel;
	}

	// Getters / Setters
	public Artikel getAuswahlArtikel() {
		return auswahlArtikel;
	}

	public void setAuswahlArtikel(Artikel auswahlArtikel) {
		this.auswahlArtikel = auswahlArtikel;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

}
