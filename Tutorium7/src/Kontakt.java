
// Als Kontaktart betrachten wir dabei lediglich Telefonate und E-Mails.


public class Kontakt {
	
	private String datum;
	private String uhrzeit;
	private String kontaktart;
	private String mitarbeiter;
	private String inhalt;
	
	public Kontakt(String kontaktart, String mitarbeiter, String inhalt) {
		this.setDatum(DatumUhrzeit.aktuellesDatum());
		this.setUhrzeit(DatumUhrzeit.aktuelleUhrzeit());
		this.setKontaktart(kontaktart);
		this.setMitarbeiter(mitarbeiter);
		this.setInhalt(inhalt);
	}
	
	
	// GETTER und SETTER
	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getUhrzeit() {
		return uhrzeit;
	}

	public void setUhrzeit(String uhrzeit) {
		this.uhrzeit = uhrzeit;
	}

	public String getKontaktart() {
		return kontaktart;
	}

	public void setKontaktart(String kontaktart) {
		this.kontaktart = kontaktart;
	}

	public String getMitarbeiter() {
		return mitarbeiter;
	}

	public void setMitarbeiter(String mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	
	

}
