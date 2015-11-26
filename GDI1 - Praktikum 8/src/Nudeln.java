
public class Nudeln extends Gericht{
	
	private String nudelsorte;
	private boolean ueberbacken;
	private String ueberbackenText = "al forno";
	private String soﬂe;
	
	
	public Nudeln(String name, double standardpreis, String nudelsorte, String soﬂe, boolean ueberbacken) {
		super(name, standardpreis);
		this.setNudelsorte(nudelsorte);
		this.setUeberbacken(ueberbacken);
		this.setSoﬂe(soﬂe);
		if (this.isUeberbacken()) {
			this.setName(name + " " + nudelsorte + " " + this.ueberbackenText);
		}
	}
	
	@Override
	public double berechnePreis(String groesse) {
		double preis = super.berechnePreis(groesse);
		if (this.isUeberbacken())
			super.setPreis(preis + 0.5);
		
		return preis;
	}

	
	// GETTER und SETTER
	public String getNudelsorte() {
		return nudelsorte;
	}


	public void setNudelsorte(String nudelsorte) {
		this.nudelsorte = nudelsorte;
	}


	public boolean isUeberbacken() {
		return ueberbacken;
	}


	public void setUeberbacken(boolean ueberbacken) {
		this.ueberbacken = ueberbacken;
	}

	public String getUeberbackenText() {
		return ueberbackenText;
	}

	public void setUeberbackenText(String ueberbackenText) {
		this.ueberbackenText = ueberbackenText;
	}

	public String getSoﬂe() {
		return soﬂe;
	}

	public void setSoﬂe(String soﬂe) {
		this.soﬂe = soﬂe;
	}
}
