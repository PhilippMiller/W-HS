import java.util.ArrayList;

public class Fluechtling {
	
	public static ArrayList<Fluechtling> FluechtlingsListe = new ArrayList<Fluechtling>();
	
	private String name;
	private String vorname;
	private String herkunftsland;
	private int geburtsjahr;
	
	public Fluechtling(String name, String vorname, String herkunftsland, int geburtsjahr){
		this.setName(name);
		this.setVorname(vorname);
		this.setHerkunftsland(herkunftsland);
		this.setGeburtsjahr(geburtsjahr);
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

	public String getHerkunftsland() {
		return herkunftsland;
	}

	public void setHerkunftsland(String herkunftsland) {
		this.herkunftsland = herkunftsland;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

}
