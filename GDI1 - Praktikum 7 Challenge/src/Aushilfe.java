import java.text.DecimalFormat;

public class Aushilfe extends Mitarbeiter{
	
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

}
