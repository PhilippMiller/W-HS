import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		int Zahl = 1;
		int Zahl2;
		ArrayList<Integer> Primzahlen = new ArrayList<>();
		boolean istPrim = false;
		
		for(;Primzahlen.size() < 11; Zahl++)
		{
			Zahl2 = Zahl - 1;
			if (Zahl == 2)
			{
				Primzahlen.add(Zahl);
			}
			if (Zahl >= 0)
			{
				while ((Zahl2 > 1) && (Zahl2 != 1))
				{
					if (Zahl % Zahl2 != 0)
					{
						istPrim = true;
					}
					else
					{
						istPrim = false;
						break;
					}
					Zahl2--;
				}
				if (istPrim == true)
				{
					Primzahlen.add(Zahl);
				}
			}
		}
		
		
		
		System.out.println("");
		System.out.println("Die ersten 10 Primzahlen sind: ");
		for (int i=0; Primzahlen.size() > i;i++)
		{
			System.out.print(Primzahlen.get(i) + "\t");
		}
	}

}
