public class Main
{

	public static void main(String[] args)
	{
		
		int Wert1 = 1;
		int Wert2 = 1;
		String Zeile = "";
		int Rechnung;
		
		while (Wert1 < 11)
		{
			for (Wert2 = 1;Wert2 < 11; Wert2++)
			{
				Rechnung = Wert1 * Wert2;
				Zeile  = Zeile + Rechnung + "\t";
				
			}
			System.out.println(Zeile);
			Zeile = "";
			Wert1 = Wert1 + 1;
		}
		
	}

}
