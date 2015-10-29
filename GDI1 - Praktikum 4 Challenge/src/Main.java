public class Main {
	
	public static void main(String[] args)
	{
		
		BauDenSchrank Schrank = new BauDenSchrank();
		
		int wahlSchublade;
		boolean exit = false;
		boolean bearbeiten = false;
		String antwort;
		int[][] Schubladen;
		int neueAnzahl;
		boolean neueAnzahlG1 = false;
		int AnzahlFächer = 0;
		boolean maxFach = false; 
		
		int realFach = 0;
		double fachx = 0;
		
		
		System.out.println("################################");
		System.out.println("Willkommen im Schrankmanager 1.0");
		System.out.println("  Dein Schrank wird geöffnet...");
		System.out.println("################################");
		
		// Da NICHT gefordert...
		/*System.out.print("\n\nWie viele Schubladen hat dein Schrank: ");
		AnzahlFächer = io.read_int();
		Schubladen = new int[AnzahlFächer][2];
		*/
		
		Schubladen = new int[2][2];
		
		Schrank.buildIt(Schubladen);
		while (exit = true)
		{
			//Siehe Punkt "Da nicht anders gefordert!"
			System.out.println("Flache Schuhe");
			System.out.println("\t- Helle Schuhe: Fach Nr. 1");
			System.out.println("\t- Dunkle Schuhe: Fach Nr. 2");
			System.out.println("Hohe Schuhe");
			System.out.println("\t- Helle Schuhe: Fach Nr. 3");
			System.out.println("\t- Dunkle Schuhe: Fach Nr. 4");
			//Siehe Punkt ENDE
			System.out.print("\nBitte wähle ein Schuhfach aus: ");
			
			while(true)
			{
				
				wahlSchublade = io.read_int();
				//Siehe Punkt "Da NICHT anders gefordert!
				if (wahlSchublade <= 4)
				{
				//Siehe Punkt ENDE
					fachx = wahlSchublade; 
					fachx = fachx/2;
					double fachy = Math.ceil(fachx);
					fachx = (fachx*100) % 100 /10;
					
					if (fachx == 0)
					{
						realFach = 1;
					}
					else if (fachx == 5)
					{
						realFach = 0;
					}
					System.out.println("Im Fach " + wahlSchublade + " befinden sich " + Schubladen[realFach][(int)fachy] + " paar Schuhe.");
				}
			}
			
			
		}
		
		/*		
		
		System.out.println("##############################################");
		System.out.println("Schrankmanager 1.0 verschliesst den Schrank...");
		System.out.println("       Schrank verschlossen. Bis bald.");
		System.out.println("##############################################");
		*/
	}

}
