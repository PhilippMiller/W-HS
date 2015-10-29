
public class PLZcheck
{
	int PLZEingabe;
	float faktor;	
	
	void getAndCheckPLZ()
	{
		System.out.print("Postleitzahl: ");
		PLZEingabe = io.read_int();
		if ((PLZEingabe >= 40000) && (PLZEingabe <= 49999))
		{
			if (PLZEingabe <= 40999) 
			{
				faktor = 1.9f;
			}
			if (PLZEingabe <= 41999)
			{
				faktor = 2.0f;
			}
			if (PLZEingabe <= 42999)
			{
				faktor = 2.3f;
			}
			if (PLZEingabe <= 44999)
			{
				faktor = 2.7f;
			}
			if (PLZEingabe <= 45999)
			{
				faktor = 2.5f;
			}
			if (PLZEingabe <= 46999)
			{
				faktor = 1.4f;
			}
			if (PLZEingabe <= 47999)
			{
				faktor = 2.1f;
			}
			if (PLZEingabe <= 48999)
			{
				faktor = 1.0f;
			}
			if (PLZEingabe <= 49999)
			{
				faktor = 1.2f;
			}
		}
		else
		{
			System.out.println("Eingabe ausserhalb des Bezirks. Bitte nur Postleitzahlen von 40000 bis 49999 verwenden!");
			getAndCheckPLZ();
		}
	}
}
