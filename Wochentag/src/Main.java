import java.util.Calendar;

public class Main
{

	public int tag()
	{
		int Tag;
		boolean goOn = false;
		
		do
		{
			System.out.print("Bitte gib den Tag ein (1-31): ");
			Tag = io.read_int();
			if ((Tag >= 1) && (Tag <= 31))
			{
				goOn = true;
			}
		}
		while( goOn == false);
		return Tag;
	}
	
	public int monat()
	{
		int Monat;
		boolean goOn = false;
		
		do
		{
			System.out.print("Bite gib den Monat ein (1-12): ");
			Monat = io.read_int();
			if ((Monat >= 1) && (Monat <= 12))
			{
				goOn = true;
			}
		}
		while(goOn == false);
		
		return Monat;
		
	}
	
	public int jahr()
	{
		int Jahr = 0;
		boolean goOn = false;
		
		do
		{
			System.out.print("Bite gib das Jahr ein (1900-2100): ");
			Jahr = io.read_int();
			if ((Jahr > 1900) && (Jahr < 2100))
			{
				goOn = true;
			}
		}
		while(goOn == false);
		
		return Jahr;
		
	}
	
	public static void main(String[] args)
	{
		
		Calendar cal = Calendar.getInstance();
		int diesesJahr = cal.get(Calendar.YEAR);
		int dieserMonat = cal.get(Calendar.MONTH)+1;
		int dieserTag = cal.get(Calendar.DAY_OF_MONTH);
		String Zeit = "";
		String Zeit1 = "";
		int Tag;
		int Monat;
		int Jahr;
		int alleTage;
		int[] tageMonate = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] Wochentage = {"Sonntag","Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag"};
		int monatCount = 0;
		
		Main EingabeTag = new Main();
		Main EingabeMonat = new Main();
		Main EingabeJahr = new Main();
		
		Tag = EingabeTag.tag();
		Monat = EingabeMonat.monat();
		Jahr = EingabeJahr.jahr();
		
		alleTage = ((Jahr - 1900) * 365) + (Jahr - 1900) / 4;
		if ((((Jahr - 1900) % 4) == 0) && ((Monat == 1) || (Monat == 2)))
		{
			alleTage = alleTage - 1;
		}
		
		while (monatCount < (Monat-1))
		{
			alleTage = alleTage + tageMonate[monatCount];
			monatCount = monatCount + 1;
		}
		
		alleTage = alleTage + Tag;
		alleTage = alleTage % 7;
		
		
		if (Jahr < diesesJahr)
		{
			Zeit = " war ein ";
		}
		else if (Jahr > diesesJahr)
		{
			Zeit = " wird ein ";
			Zeit1 = " sein";
		}
		else if (Jahr == diesesJahr)
		{
			if (Monat < dieserMonat)
			{
				Zeit = " war ein ";
			}
			else if (Monat > dieserMonat)
			{
				Zeit = " wird ein ";
				Zeit1 = " sein";
			}
			else if (Monat == dieserMonat)
			{
				if (dieserTag < Tag)
				{
					Zeit = " war ein ";
				}
				else if (dieserTag > Tag)
				{
					Zeit = " wird ein ";
					Zeit1 = " sein";
				}
				else if (dieserTag == Tag)
				{
					Zeit = " ist ein ";
				}
			}
		}
		System.out.println("Der "+Tag+"."+Monat+"."+Jahr+""+Zeit+""+Wochentage[alleTage]+Zeit1+".");
		
		
	}

}
