
public class Main 
{
	/* Dieses Programm zeigt den Aufbau eines JAVA-Programms mit Ein-/Ausgabe */
	public static void main(String args[])
	{		
		// Deklaration der Variablen bocholt_celsius als Ganzzahl 
		int Bocholt_celsius;
		// Deklaration der Variablen bocholt_fahrenheit als Ganzzahl
		int bocholt_fahrenheit;
		int borken_celsius;
		int borken_fahrenheit;
		
		// Die Temperatur in Bocholt in Celsius als Ganzzahl eingeben
		System.out.print("Bitte die Temperatur in Bocholt in Celsius als Ganzzahl eingeben: ");
		Bocholt_celsius = io.read_int(); 
		System.out.print("Bitte die Temperatur in Borken in Celsius als Ganzzahl eingeben: ");
		borken_celsius = io.read_int();

		// Die Temperatur von Celsius nach Fahrenheit umrechnen 
		bocholt_fahrenheit = (int) (Bocholt_celsius * 1.8 + 32);
		borken_fahrenheit = (int) (borken_celsius * 1.8 + 32);

		// Die Temperatur in Celsius und Fahrenheit ausgeben 
		System.out.println("Die Temperatur in Bocholt liegt bei " + Bocholt_celsius + " Grad Celsius!");
		System.out.println("Das entspricht " + bocholt_fahrenheit + " Fahrenheit!");
		System.out.println("Die Temperatur in Borken liegt bei " + borken_celsius + " Grad Celsius!");
		System.out.println("Das entspricht " + borken_fahrenheit + " Fahrenheit!");
		
		if (Bocholt_celsius > borken_celsius)
		{
			System.out.println("In Bocholt ist es wärmer als in Borken!");
		}
		else
		{
			System.out.println("In Borken ist es wärmer als in Bocholt oder die Temperatur ist in beiden Orten gleich!");
		}
	}
}
