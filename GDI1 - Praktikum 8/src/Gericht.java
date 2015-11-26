
public class Gericht {
	
	private String typ;
	private String name;
	private double standardpreis;
	private double preis;
	
	public Gericht(String name, double standardpreis) {
		this.setTyp(typ);
		this.setName(name);
		this.setStandardpreis(standardpreis);
	}
	
	public double berechnePreis(String groesse) {
		if (groesse.equalsIgnoreCase("gross") || groesse.equalsIgnoreCase("groﬂ")) {
			this.setPreis(this.standardpreis*1.2);
		} else if (groesse.equalsIgnoreCase("mittel")) {
			this.setPreis(this.standardpreis);
		} else if (groesse.equalsIgnoreCase("klein")) {
			this.setPreis(this.standardpreis*0.8);
		}
		
		return this.getPreis();
	}
	
	
	// GETTER und SETTER
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getStandardpreis() {
		return standardpreis;
	}
	public void setStandardpreis(double standardpreis) {
		this.standardpreis = standardpreis;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	

}
