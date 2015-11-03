public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Welches Programm wollen sie starten? [1/2]");
		System.out.println("[1] Primzahlen");
		System.out.println("[2] Seriennummer");
		int programm = io.read_int();
		
		if (programm == 1){
			Primzahlen go = new Primzahlen();
			go.PrimzahlenChecker();
		}else if (programm == 2){
			Geldchecker go = new Geldchecker();
			go.geldCheck();
		}
	}

}
