package Challenge;

public class Artikel {
	
	private int artikelnummer;
	private int lagerbestand;
	private String bezeichnung;
	
	public Artikel(int artikelnummer, int lagerbestand, String bezeichnung) {
		this.artikelnummer = artikelnummer;
		this.lagerbestand = lagerbestand;
		this.bezeichnung = bezeichnung;
	}

	public int berechneFehlmenge(int bestellmenge) {
		int wert = this.lagerbestand - bestellmenge;
		if (wert > 0)
			return 0;
		else if(wert < 0)
			return Math.abs(wert);
		
		return 0;
	}
	
	public String toString() {
		return (""+artikelnummer);
	}
	
	// Getters / Setters
	public int getArtikelnummer() {
		return artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	public int getLagerbestand() {
		return lagerbestand;
	}

	public void setLagerbestand(int lagerbestand) {
		this.lagerbestand = lagerbestand;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

}
