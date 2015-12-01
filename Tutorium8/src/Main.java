
public class Main {

	public static void main(String[] args) {
		Play();
	}
	
	public static void Play() {
		
		String farbe;
		int kapital;

		System.out.println("Wie viel Geld haben Sie dabei?");
		kapital = io.read_int();

		System.out.println("Auf welche Farbe wollen sie setzen?");
		System.out.println("Rot / Schwarz");
		do {

			farbe = io.read_String();
			System.out.println(farbe);
			if (!farbe.equalsIgnoreCase("rot") && !farbe.equalsIgnoreCase("schwarz"))
				System.out.println("Bitte nur \"ROT\" oder \"SCHWARZ\" eingeben!");
		} while (!farbe.equalsIgnoreCase("rot") && !farbe.equalsIgnoreCase("schwarz"));

		farbe = farbe.toLowerCase();
		
		System.out.println("Ok, Sie setzen auf " + farbe + "!");

		RouletteSpielen theGame = new RouletteSpielen(farbe, kapital);
		theGame.Game();
		
	}

}
