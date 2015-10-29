
public class BauDenSchrank
{
	
	public void buildIt(int[][] Schubladen)
	{
		
		String Inhalt;
		int InhaltGesamt = 0;
		int InhaltGesamt_add = 0;
		
		
		System.out.println("\nDein Lager");
		
		for(int i = 0; Schubladen.length > i; i++)
		{
			for(int j = 0; Schubladen[i].length > j; j++)
			{
				Inhalt = "" + Schubladen[i][j];
				InhaltGesamt = InhaltGesamt + Inhalt.length();
			}
			
		}
		
		
		for(int i = 0; Schubladen.length > i; i++)
		{
			for(int j = 0; Schubladen[i].length > j; j++)
			{
				InhaltGesamt = InhaltGesamt + Schubladen[i].length*2 - 2;
			}
			
		}
		
		InhaltGesamt = InhaltGesamt - 2; 
		
		System.out.print("o");
		while( InhaltGesamt > InhaltGesamt_add)
		{
			System.out.print("_");
			InhaltGesamt_add++;
		}
		System.out.print("o");
		
		System.out.println("");
		
		for(int i = 0; Schubladen.length > i; i++)
		{
			for(int j = 0; Schubladen[i].length > j; j++)
			{
				System.out.print("["+Schubladen[i][j]+"]");
			}
			
			
		}
		System.out.println("");
		
		InhaltGesamt_add = 0;
		System.out.print("|");
		while( InhaltGesamt > InhaltGesamt_add)
		{
			System.out.print("_");
			InhaltGesamt_add++;
		}
		System.out.print("|");
		System.out.println("");
		
		InhaltGesamt_add = 0;
		System.out.print("o");
		while( InhaltGesamt > InhaltGesamt_add)
		{
			System.out.print(" ");
			InhaltGesamt_add++;
		}
		System.out.print("o");
		System.out.println("");
		
		System.out.println("\n");
	}
	
}
