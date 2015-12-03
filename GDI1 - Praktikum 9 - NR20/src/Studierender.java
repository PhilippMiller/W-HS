
public class Studierender implements Comparable {

	private String name;
	private String vorname;
	private Integer matrikelnummer;

	public Studierender(String name, String vorname, int matrikelnummer) {
		this.setName(name);
		this.setVorname(vorname);
		this.setMatrikelnummer(matrikelnummer);
	}

	@Override
	public int compareTo(Object merkzettel) {

		Studierender s = (Studierender) merkzettel;
		if (this.getName().compareTo(s.getName()) == 0) {
			if (this.getVorname().compareTo(s.getVorname()) == 0) {
				return this.getMatrikelnummer().compareTo(s.getMatrikelnummer());
			} else
				return this.getVorname().compareTo(s.getVorname());
		} else
			return this.getName().compareTo(s.getName());
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

	public Integer getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

}
