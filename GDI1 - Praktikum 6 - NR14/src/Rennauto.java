
public class Rennauto {
	
	int autonummer;
	String fahrer;
	String name;
	String farbe;
	int h�chstgeschwindigkeit;
	int rundenzahl;
	
	public Rennauto(int autonummer, String fahrer, String name, String farbe, int h�chstgeschwindigkeit) {
		setAutonummer(autonummer);
		setFahrer(fahrer);
		setName(name);
		setFarbe(farbe);
		setH�chstgeschwindigkeit(h�chstgeschwindigkeit);
	}
	
	public int getAutonummer() {
		return autonummer;
	}
	public void setAutonummer(int autonummer) {
		this.autonummer = autonummer;
	}
	public String getFahrer() {
		return fahrer;
	}
	public void setFahrer(String fahrer) {
		this.fahrer = fahrer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getH�chstgeschwindigkeit() {
		return h�chstgeschwindigkeit;
	}
	public void setH�chstgeschwindigkeit(int h�chstgeschwindigkeit) {
		this.h�chstgeschwindigkeit = h�chstgeschwindigkeit;
	}
	public int getRundenzahl() {
		return rundenzahl;
	}
	public void setRundenzahl(int rundenzahl) {
		this.rundenzahl = rundenzahl;
	}
	
	
}
