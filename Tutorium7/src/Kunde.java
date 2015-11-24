
public class Kunde {
	
	private int Kundennummmer;
	private String Name;
	private String Vorname;
	private String Ort;
	private String e_mail;
	private int telefon;
	private short rabatt;
	private String Kundenbetreuer;
	private Kontakt [] Feld;
	
	public Kunde() {
		
	}
	
	
	// GETTER und SETTER
	public int getKundennummmer() {
		return Kundennummmer;
	}

	public void setKundennummmer(int kundennummmer) {
		Kundennummmer = kundennummmer;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String ort) {
		Ort = ort;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public short getRabatt() {
		return rabatt;
	}

	public void setRabatt(short rabatt) {
		this.rabatt = rabatt;
	}

	public String getKundenbetreuer() {
		return Kundenbetreuer;
	}

	public void setKundenbetreuer(String kundenbetreuer) {
		Kundenbetreuer = kundenbetreuer;
	}

	public Kontakt[] getFeld() {
		return Feld;
	}

	public void setFeld(Kontakt[] feld) {
		Feld = feld;
	}
	

}
