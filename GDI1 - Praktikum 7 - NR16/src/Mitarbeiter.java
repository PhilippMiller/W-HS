
public class Mitarbeiter {
	
	// variablen erzeugen
	private String name;
	private String vorname;
	private String stelle;

	private int gehalt;

	public Mitarbeiter(String name, String vorname, String stelle, int gehalt) {
		// variablen füllen
		this.setName(name);
		this.setVorname(vorname);
		this.setStelle(stelle);

		this.setGehalt(gehalt);
		
		// instanztierten Mitarbeiter Ausgeben
		System.out.print(this.stelle + "\t" + this.vorname + " " + this.name + "\t" + this.gehalt + "\n");
	}
	
	// methode gehaltErhöhen
	public void gehaltErhoehen(int betrag) {
		this.gehalt = this.gehalt + betrag;
		
		System.out.println("Neues Gehalt von " + this.vorname + " " + this.name + ": " + this.gehalt);
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
		stelle = stelle;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
}
