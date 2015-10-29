
public class Umrechnungsprogramm 
{
	/* Dieses Programm zeigt den Aufbau eines JAVA-Programms mit Ein-/Ausgabe */
	public static void main(String args[])
	{		
		// Deklaration der Variablen bocholt_celsius als Ganzzahl 
		int bocholt_celsius;
		// Deklaration der Variablen bocholt_fahrenheit als Ganzzahl
		int bocholt_fahrenheit;
		
		// Die Temperatur in Bocholt in Celsius als Ganzzahl eingeben
		System.out.print("Bitte die Temperatur in Bocholt in Celsius als Ganzzahl eingeben: ");
		bocholt_celsius = io.read_int(); 

		// Die Temperatur von Celsius nach Fahrenheit umrechnen 
		bocholt_fahrenheit = (int) (bocholt_celsius * 1.8 + 32);

		// Die Temperatur in Celsius und Fahrenheit ausgeben 
		System.out.println("Die Temperatur in Bocholt liegt bei " + bocholt_celsius + " Grad Celsius!");
		System.out.println("Das entspricht " + bocholt_fahrenheit + " Fahrenheit!");
	}
}
