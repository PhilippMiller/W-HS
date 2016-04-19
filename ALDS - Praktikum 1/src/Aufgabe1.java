
public class Aufgabe1 {

	public static void main(String[] args) {
		System.out.println("Bitte geben sie eine Zahl ein");
		int zahl = io.read_int();
		System.out.println("Die gewählte Zahl ist: " + zahl);
		
		double zeit = System.currentTimeMillis();
		for (int i = 2; i <= zahl; i += 2) {
			if (vollkommen(i))
				System.out.println(i);
		}
		///zeit = ((zeit - System.currentTimeMillis())*-1)/1000;
		System.out.println("Es wurden " + zeit + " Millisekunden benötigt!");
		
	}
	
	private static boolean vollkommen(int zahl) {
		int summe = 0;
		for (int i = 1; i < zahl; i++) {
			if (zahl % i == 0)
				summe += i;
		}
		
		if (zahl == summe)
			return true;
		
		return false;
	}

}
