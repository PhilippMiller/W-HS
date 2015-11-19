import java.text.DecimalFormat;

public class Aushilfe extends Mitarbeiter{

	private float stundenlohn;
	private int geleisteteStunden;
	
	Aushilfe(String name, String vorname, float stundenlohn, int geleisteteStunden) {
		super(name,vorname,"Aushilfe");
		this.setStundenlohn(stundenlohn);
		this.setGeleisteteStunden(geleisteteStunden);
		this.ausgabe();
	}
	
	public void ausgabe() {
		DecimalFormat f = new DecimalFormat("##0.00");
		String wert = f.format((double)this.getStundenlohn());
		System.out.print(this.getStelle() + "\t" + this.getVorname() + " " + this.getName() + "\t" + 
				wert + "€/STD" + "\tGeleistete Stunden: " + this.getGeleisteteStunden() + "\n");
	}
	
	// Arbeiten
	public void arbeiten(int stunden){
		this.setGeleisteteStunden(this.getGeleisteteStunden() + stunden);
		System.out.println(this.getVorname() + " " + this.getName() + " hat " + stunden + " gearbeitet.");
		System.out.println(this.getVorname() + " " + this.getName() + "'s Stundenkonto umfasst " + this.getGeleisteteStunden() +"." + "\n");
	}
	
	// Lohn berechnen
	public double lohnBerechnen() {
		double arbeitsstunden = this.getGeleisteteStunden();
		double lohn = arbeitsstunden * this.getStundenlohn();
		return lohn;
	}

	// GETTER und SETTER
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
