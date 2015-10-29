
public class DurchschnittswertRechner {

	public static void main(String[] args)
	{
		
		int Monat = 1;
		float celsius = 0;
		float celsiusEingabe;
		float celsiusDurchschnitt;
		String Stadt;
		
		System.out.print("Bitte den Ort der Messung eingeben: ");
		Stadt = io.read_String();
		
		while (Monat <= 12)
		{
			System.out.println("Willkommen in "+Stadt+". Heute ist Monat "+Monat+" von 12.");
			System.out.println("Bitte gebe den Wert an!");
			celsiusEingabe = io.read_float();
			System.out.println("Heute sind es "+celsiusEingabe+"°C");
			celsius = celsius + celsiusEingabe;
			Monat = Monat + 1;
		}
		
		celsiusDurchschnitt = celsius/12;
		System.out.println("Die Durschnitts Temperatur in "+Stadt+" beträgt: "+celsiusDurchschnitt+"°C");
		
	}

}
