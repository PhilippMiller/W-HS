
public class Main 
{
	
	/*
	public static void main(String args[])
	{		
		// Deklaration der Variablen bocholt_celsius als Ganzzahl 
		float Bocholt_kilometer;
		// Deklaration der Variablen bocholt_fahrenheit als Ganzzahl
		double bocholt_meile;
		float borken_kilometer;
		double borken_meile;
		
		// Die Temperatur in Bocholt in Celsius als Ganzzahl eingeben
		System.out.print("Bitte die Temperatur in Bocholt in Celsius als Ganzzahl eingeben: ");
		Bocholt_kilometer = io.read_int(); 
		System.out.print("Bitte die Temperatur in Borken in Celsius als Ganzzahl eingeben: ");
		borken_kilometer = io.read_int();

		// Die Temperatur von Celsius nach Fahrenheit umrechnen 
		bocholt_meile = (double) (Bocholt_kilometer * 1.60934);
		borken_meile = (double) (borken_kilometer * 1.60934);

		// Die Temperatur in Celsius und Fahrenheit ausgeben 
		System.out.println("Die Temperatur in Bocholt liegt bei " + Bocholt_kilometer + " Grad Celsius!");
		System.out.println("Das entspricht " + bocholt_meile + " Fahrenheit!");
		System.out.println("Die Temperatur in Borken liegt bei " + borken_kilometer + " Grad Celsius!");
		System.out.println("Das entspricht " + borken_meile + " Fahrenheit!");
		
		if (Bocholt_kilometer > borken_kilometer)
		{
			System.out.println("In Bocholt ist es wärmer als in Borken!");
		}
		else
		{
			System.out.println("In Borken ist es wärmer als in Bocholt oder die Temperatur ist in beiden Orten gleich!");
		}
		*/
	
	public static void main(String args[])
	{
		System.out.print("Bitte gebe eine Note von 1 bis 6 ein: ");
		int Eingabe = io.read_int();
		
		switch(Eingabe)
		{
		case 1: System.out.println("Du erhälst die Note: Sehr gut!"); break;
		case 2: System.out.println("Du erhälst die Note: Gut!"); break;
		case 3: System.out.println("Du erhälst die Note: Befriedigend!"); break;
		case 4: System.out.println("Du erhälst die Note: Ausreichend!"); break;
		case 5: System.out.println("Du erhälst die Note: Mangelhaft!"); break;
		case 6: System.out.println("Du erhälst die Note: Ungenügend!"); break;
		default: System.out.println("Du bist zu schlecht um eine Note ein zu geben!!!");
		}
		
	}
}
