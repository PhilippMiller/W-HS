import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println("Welches Programm wollen sie starten? [1/2]");
		int programm = io.read_int();
		
		if (programm == 1){
			Primzahlen go = new Primzahlen();
			go.Primzahlen();
		}
	}

}
