
public class Main {

	public static void main(String[] args)
	{
		
		int Wert1;
		int Wert2;
		int Wert3;
		int[] Platz = {0,0,0};
		
		System.out.print("Spieler 1 gib deinen Highscore ein: ");
		Wert1 = io.read_int();
		
		System.out.print("Spieler 2 gib deinen Highscore ein: ");
		Wert2 = io.read_int();
		
		System.out.print("Spieler 3 gib deinen Highscore ein: ");
		Wert3 = io.read_int();
		
		//###ERSTER PLATZ###
		if ((Wert1 > Wert2) && (Wert1 > Wert3))
		{
			Platz[0] = 1;
		}
		if ((Wert2 > Wert1) && (Wert2 > Wert3))
		{
			Platz[0] = 2;
		}
		if ((Wert3 > Wert1) && (Wert3 > Wert2))
		{
			Platz[0] = 3;
		}
		
		//###ZWEITER PLATZ###
		if (((Wert1 > Wert2) && (Wert1 < Wert3)) || ((Wert1 < Wert2) && (Wert1 > Wert3)))
		{
			Platz[1] = 1;
		}
		if (((Wert2 > Wert1) && (Wert2 < Wert3)) || ((Wert2 < Wert1) && (Wert2 > Wert3)))
		{
			Platz[1] = 2;
		}
		if (((Wert3 > Wert2) && (Wert3 < Wert1)) || ((Wert3 < Wert2) && (Wert3 > Wert1)))
		{
			Platz[1] = 1;
		}
		
		//###DRITTER PLATZ###
		if ((Wert1 < Wert2) && (Wert1 < Wert3))
		{
			Platz[2] = 1;
		}
		if ((Wert2 < Wert1) && (Wert2 < Wert3))
		{
			Platz[2] = 2;
		}
		if ((Wert3 < Wert1) && (Wert3 < Wert2))
		{
			Platz[2] = 3;
		}
		
		System.out.println("Der erste Platz geht an Spieler "+Platz[0]);
		System.out.println("Der zweite Platz geht an Spieler "+Platz[1]);
		System.out.println("Der dritte Platz geht an Spieler "+Platz[2]);
		
	}

}
