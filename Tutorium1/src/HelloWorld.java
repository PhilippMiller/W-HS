public class HelloWorld
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Hallo Welt!");
		System.out.println("Da bin ich!");
		
		// "\n" - Neue Zeile
		// "\t" - Tabulator
		
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("Gib eine Zahl ein!");
		int zahl = io.read_int();
		if (zahl == random)
		{
			System.out.println("Richtig geraten! " + zahl);
		}
		else
		{
			System.out.println("Falsch geraten! Die richtige Zahl wäre " + random + " gewesen!");
		}
		
		
	}

}
