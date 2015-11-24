
// Als Kontaktart betrachten wir dabei lediglich Telefonate und E-Mails.


public class Kontakt {
	
	private DatumUhrzeit datum;
	private DatumUhrzeit uhrzeit;
	private String kontaktart;
	private String mitarbeiter;
	private String inhalt;
	
	public Kontakt() {
		
	}
	
	
	// GETTER und SETTER
	public DatumUhrzeit getDatum() {
		return datum;
	}

	public void setDatum(DatumUhrzeit datum) {
		this.datum = datum;
	}

	public DatumUhrzeit getUhrzeit() {
		return uhrzeit;
	}

	public void setUhrzeit(DatumUhrzeit uhrzeit) {
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
