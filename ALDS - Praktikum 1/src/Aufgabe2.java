
public class Aufgabe2 {

	public static void main(String[] args) {
		System.out.println("Bitte geben sie eine Obergrenze ein: " );
		int zahl = io.read_int();
		
		System.out.println("Es wurden folgende Primzahlen gefunden:");
		
		double zeit = System.currentTimeMillis();
		for (int i = 1; i <= zahl; i++) {
			if (isPrimzahl(i))
				System.out.println(i);
		}
		zeit = ((zeit - System.currentTimeMillis())*-1)/1000;
		System.out.println("Es wurden " + zeit + " Sekunden benötigt!");
	}
	
	private static boolean isPrimzahl(int zahl) {
		if (zahl <= 1)
			return false;
		
		int summe = 1;
		
		int teiler;
		
		for (teiler = 2; teiler <= zahl; teiler++) {
			int modu = zahl % teiler;
			if (modu == 0) {
				if (teiler != 1 && teiler != zahl) {
					return false;
				} else
					summe += teiler;
			}
		}
		
		if (summe - 1 == zahl)
			return true;
		
		return false;
	}

}
