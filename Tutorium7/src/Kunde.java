import java.lang.reflect.Array;

public class Kunde {

	private int kundennummmer;
	private String name;
	private String vorname;
	private String ort;
	private String e_mail;
	private String telefon;
	private float rabatt;
	private String kundenbetreuer;
	private Kontakt[] historie = new Kontakt[5];

	public Kunde(int kundennummer, String name, String vorname, String ort, String e_mail, String telefon, float rabatt,
			String kundenbetreuer) {
		this.setKundennummmer(kundennummer);
		this.setName(name);
		this.setVorname(vorname);
		this.setOrt(ort);
		this.setE_mail(e_mail);
		this.setTelefon(telefon);
		this.setRabatt(rabatt);
		this.setKundenbetreuer(kundenbetreuer);
	}

	public void historieDrucken() {
		
		System.out.println("\nKontakthistorie von Kunde " + this.getVorname() + " " + this.getName());
		System.out.println("Datum\t\tUhrzeit\t\tKontaktform\tMitarbeiter\tInhalt");
		System.out.println("---------------------------------------------------------------------------------------");
		
		for (int i = 0; i < historie.length; i++) {
			
			String datum;
			String uhrzeit;
			String kontaktart;
			String mitarbeiter;
			String inhalt;
			
			if (historie[i] != null) {
				datum = historie[i].getDatum();
				uhrzeit = historie[i].getUhrzeit();
				kontaktart = historie[i].getKontaktart();
				mitarbeiter = historie[i].getMitarbeiter();
				inhalt = historie[i].getInhalt();
				
				System.out.println(datum + "\t" + uhrzeit + "\t\t" + kontaktart + "\t\t" + mitarbeiter + "\t\t" + inhalt); 
			} else
				break;
		}
		System.out.println();
	}

	public void historieSpeichern(String kontaktart, String mitarbeiter, String inhalt, int index) {
		this.setHistorie(new Kontakt(kontaktart, mitarbeiter, inhalt), index);
	}

	// GETTER und SETTER
	public int getKundennummmer() {
		return kundennummmer;
	}

	public void setKundennummmer(int kundennummmer) {
		this.kundennummmer = kundennummmer;
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

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public float getRabatt() {
		return rabatt;
	}

	public void setRabatt(float rabatt) {
		this.rabatt = rabatt;
	}

	public String getKundenbetreuer() {
		return kundenbetreuer;
	}

	public void setKundenbetreuer(String kundenbetreuer) {
		this.kundenbetreuer = kundenbetreuer;
	}

	public Kontakt[] getHistorie() {
		return historie;
	}

	public void setHistorie(Kontakt kontakt, int index) {
		this.historie[index] = kontakt;
	}

}
