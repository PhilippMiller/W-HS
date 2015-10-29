public class Main {
	
	public static void main(String[] args)
	{
		
		BauDenSchrank Schrank = new BauDenSchrank();
		
		int wahlSchublade;
		boolean exit = false;
		boolean bearbeiten = false;
		String antwort;
		int[] Schubladen;
		int neueAnzahl;
		boolean neueAnzahlG1 = false;
		int AnzahlFächer = 0;
		boolean maxFach = false;
		
		
		System.out.println("################################");
		System.out.println("Willkommen im Schrankmanager 1.0");
		System.out.println("  Dein Schrank wird geöffnet...");
		System.out.println("################################");
		
		System.out.print("\n\nWie viele Schubladen hat dein Schrank: ");
		AnzahlFächer = io.read_int(); 
		Schubladen = new int[AnzahlFächer];
		
		Schrank.buildIt(Schubladen);
		
		while (exit == false)
		{
			System.out.print("Bitte ein Schrankfach zwischen 1 und " + AnzahlFächer + " aus: ");
			
			do
			{
				wahlSchublade = io.read_int();
				wahlSchublade = wahlSchublade -1;
				if (wahlSchublade <= AnzahlFächer-1)
				{
					maxFach = true;
				}
				else
				{
					System.out.println("\nDas Fach " + wahlSchublade + " existiert nicht! (1 - " + AnzahlFächer + ")");
					System.out.print("Bitte ein Schrankfach zwischen 1 und " + AnzahlFächer + " aus: ");
				}
			}
			while (maxFach == false);
			
			System.out.println("Im Fach " + (wahlSchublade + 1) + " befinden sich " + Schubladen[wahlSchublade] + " T-Shirts.");
			while (bearbeiten == false)
			{
				System.out.print("\nWillst du dieses Fach bearbeiten? (\"ja\" oder \"nein\") ");
				antwort = io.read_String_janein();
				if (antwort.equalsIgnoreCase("ja") == true)
				{
					System.out.print("Bitte gib die neue Anzahl an T-Shirts an: ");
					do
					{
						neueAnzahl = io.read_int();
						if (neueAnzahl >= 0)
						{
							neueAnzahlG1 = true;
						}
						else
						{
							System.out.print("Bitte einen positiven Wert eingeben: ");
						}
					}
					while (neueAnzahlG1 == false);
					Schubladen[wahlSchublade] = neueAnzahl;
					System.out.println("Im Fach " + (wahlSchublade + 1) + " befinden sich nun " + Schubladen[wahlSchublade] + " T-Shirts.");
					bearbeiten = true;
				}
				else
				{
					System.out.println("Im Fach " + (wahlSchublade + 1) + " befinden sich weiterhin " + Schubladen[wahlSchublade] + " T-Shirts.");
					break;
				}
			}
			bearbeiten = false;
			Schrank.buildIt(Schubladen);
			
			System.out.print("\nDen Schrank weiter bearbeiten? (\"ja\" oder \"nein\") ");
			antwort = io.read_String_janein();
			if (antwort.equalsIgnoreCase("nein"))
			{
				break;
			}
		}
		
		int Summe = 0;
		for (int i = 0; Schubladen.length > i; i++)
		{
			Summe = Summe + Schubladen[i];
		}
		String plural;
		if (Summe == 1)
		{
			plural = "T-Shirt";
		}
		else
		{
			plural = "T-Shirts";
		}
		
		System.out.println("In deinem Schrank befinden sich nun " + Summe + " " + plural + ".");
		
		System.out.println("##############################################");
		System.out.println("Schrankmanager 1.0 verschliesst den Schrank...");
		System.out.println("       Schrank verschlossen. Bis bald.");
		System.out.println("##############################################");
		
	}

}
