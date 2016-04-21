package Challenge;

import java.util.LinkedList;
import java.util.List;

public class Bestellung {
	
	private List<Bestellposition> positionen;
	
	private int bestellnummer;
	private String datum;
	private String status;
	
	public Bestellung() {
		positionen = new LinkedList<Bestellposition>();
	}
	
	public void bestellungAufgeben(Kunde kunde, Artikel artikel, int anzahl) {
		kunde.link(this);
		this.status = "offen";
		positionen.add(new Bestellposition(anzahl, artikel));
	}
	
	public String toString() {
		return (""+bestellnummer);
	}

	// Getters / Setters
	public List<Bestellposition> getPositionen() {
		return positionen;
	}

	public void setPositionen(List<Bestellposition> positionen) {
		this.positionen = positionen;
	}

	public int getBestellnummer() {
		return bestellnummer;
	}

	public void setBestellnummer(int bestellnummer) {
		this.bestellnummer = bestellnummer;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
