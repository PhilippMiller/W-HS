import java.text.*;

public class Main
{

	public static void main(String[] args)
	{
		
		PLZcheck plzCheck = new PLZcheck();
		HaushaltCheck Haushalt = new HaushaltCheck();
		Rechnung Berechnung = new Rechnung();
		
		
		System.out.println("Hausratversicherungs Prämien Rechner");
		System.out.println("\nBitte gib folgende Daten zur Berechnung ein:");
		
		plzCheck.getAndCheckPLZ();
		Haushalt.haushalt();
		
		Berechnung.RechnungFaktor = plzCheck.faktor;
		Berechnung.RechnungHaushalt = Haushalt.bewohner;
		Berechnung.RechnungQuadratmeter = Haushalt.quadratmeter;
		
		Berechnung.Formel();
		
		DecimalFormat Format = new DecimalFormat("#0.00");
		
		System.out.println("Die Versicherungssumme beträgt: "+Format.format(Berechnung.Versicherungssumme)+" €");
		
		
	}

}
