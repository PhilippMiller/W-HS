
public class Stammkunde {
	
	private String name;
	private String vorname;
	private double rechnungsWert;
	private int kundennummer;
	private static int anzahlKunden;
	private int rechnungsnummer;


	public Stammkunde(String name, String vorname) {
		setName(name);
		setVorname(vorname);
		
		anzahlKunden++;
		setKundennummer(anzahlKunden);
	}
	
	
	
	//CONSTRUCTOREN

	public int getKundennummer() {
		return kundennummer;
	}



	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public double getRechnungsWert() {
		return rechnungsWert;
	}

	public void setRechnungsWert(double rechnungsWert) {
		this.rechnungsWert = rechnungsWert;
	}
	
	public int getRechnungsnummer() {
		return rechnungsnummer;
	}



	public void setRechnungsnummer(int rechnungsnummer) {
		this.rechnungsnummer = rechnungsnummer;
	}

}
