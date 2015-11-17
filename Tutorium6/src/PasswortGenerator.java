
public class PasswortGenerator {

	public static char[] Generator() {
		// Password mit einer Länge von 5 - 12 Stellen erzeugen
		int laenge = (int) (Math.random() * (12 - 4)) + 5;
		char[] passwort = new char[laenge];
		System.out.println("Folgendes Passwort wurde erzeugt:");
		System.out.println("=================================");
		for (int p = 0; p < passwort.length; p++) {
			passwort[p] = (char) ((int) (Math.random() * (126 - 32)) + 33);
			System.out.print(passwort[p]);
		}
		System.out.println();
		
		return passwort;
	}

}
