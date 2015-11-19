import java.text.DecimalFormat;

public class Mitarbeiter {

	// variablen erzeugen
	private String name;
	private String vorname;
	private String stelle;

	private boolean firmenwagen = false;

	private float gehalt;
	private int urlaubstage = 26;
	
	private float stundenlohn;
	private int geleisteteStunden;

	Mitarbeiter(String name, String vorname, String stelle) {
		// variablen füllen
		this.setName(name);
		this.setVorname(vorname);
		this.setStelle(stelle);
	}

	Mitarbeiter(String name, String vorname, String stelle, int gehalt) {
		this(name, vorname, stelle);
		// variablen füllen
		this.setGehalt(gehalt);
	}

	Mitarbeiter(String name, String vorname, String stelle, int gehalt, int urlaubstage) {
		this(name, vorname, stelle);
		// variablen füllen

	}

	// Arbeiten
	public void arbeiten(int stunden) {
		this.setGeleisteteStunden(this.getGeleisteteStunden() + stunden);
		System.out.println(this.getVorname() + " " + this.getName() + " hat " + stunden + " gearbeitet.");
		System.out.println(this.getVorname() + " " + this.getName() + "'s Stundenkonto umfasst "
				+ this.getGeleisteteStunden() + "." + "\n");
	}

	// Lohn berechnen
	public double lohnBerechnen() {
		double arbeitsstunden = this.getGeleisteteStunden();
		double lohn = arbeitsstunden * this.getStundenlohn();
		return lohn;
	}

	// Gehalt Erhöhen
	public void gehaltErhoehen(int betrag) {
		this.gehalt = this.gehalt + betrag;

		System.out.println("Neues Gehalt von " + this.vorname + " " + this.name + ": " + this.gehalt + "\n");
	}

	// Urlaub nehmen
	public void urlaubNehmen(int tage) {
		if (tage > this.getUrlaubstage()) {
			System.out.println(this.getVorname() + " " + this.getName() + " hat nicht genug Uralubstage.");
			System.out.println(this.getVorname() + " " + this.getName() + " verbleiben lediglich "
					+ this.getUrlaubstage() + " Urlaubstage." + "\n");
			return;
		}

		this.setUrlaubstage(this.getUrlaubstage() - tage);
		System.out
				.println(this.getVorname() + " " + this.getName() + " hat nimmt " + tage + " Urlaubstage in Anspruch.");
		System.out
				.println(this.getVorname() + " " + this.getName() + " verbleiben noch " + this.getUrlaubstage() + "\n");
	}

	// AUSGABE
	public void ausgabe() {
		DecimalFormat f = new DecimalFormat("##0.00");
		String wert = f.format((double) this.getGehalt());
		System.out.print(this.getStelle() + "\t" + this.getVorname() + " " + this.getName() + "\t" + wert + "€/MM"
				+ "\tUrlaubstage: " + this.getUrlaubstage() + "\t\tFirmenwagen: "
				+ (this.getFirmenwagen() ? "Ja" : "Nein") + "\n");
	}

	// GETTER und SETTER
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

	public String getStelle() {
		return stelle;
	}

	public void setStelle(String stelle) {
		this.stelle = stelle;
	}

	public boolean getFirmenwagen() {
		return firmenwagen;
	}

	public void setFirmenwagen(boolean firmenwagen) {
		this.firmenwagen = firmenwagen;
	}

	public float getGehalt() {
		return gehalt;
	}

	public void setGehalt(float gehalt) {
		this.gehalt = gehalt;
	}

	public int getUrlaubstage() {
		return urlaubstage;
	}

	public void setUrlaubstage(int urlaubstage) {
		this.urlaubstage = urlaubstage;
	}
	
	public float getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(float stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public int getGeleisteteStunden() {
		return geleisteteStunden;
	}

	public void setGeleisteteStunden(int geleisteteStunden) {
		this.geleisteteStunden = geleisteteStunden;
	}
}
