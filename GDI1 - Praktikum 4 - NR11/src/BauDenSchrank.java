
public class BauDenSchrank
{
	
	public void buildIt(int[] Schubladen)
	{
		
		String Inhalt;
		int InhaltGesamt = 0;
		int InhaltGesamt_add = 0; 
		
		
		System.out.println("\nDein Schrank");
		
		for(int i = 0; Schubladen.length > i; i++)
		{
			Inhalt = "" + Schubladen[i];
			InhaltGesamt = InhaltGesamt + Inhalt.length();
			
		}
		
		InhaltGesamt = InhaltGesamt + Schubladen.length*2 - 2;
		
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
			System.out.print("["+Schubladen[i]+"]");
			
			
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
