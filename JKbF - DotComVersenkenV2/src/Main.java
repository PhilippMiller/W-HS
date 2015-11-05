import java.util.ArrayList;

public class Main {
	
	private static ArrayList<String> zellorte = new ArrayList<>();
	
	
	public static void setZellorte(ArrayList<String> orte) {
		zellorte = orte;
	}
	
	public static String prüfDich(String benutzerEingabe) {
		String ergebnis = "Vorbei";
		int index = zellorte.indexOf(benutzerEingabe);
		
		if (index >= 0) {
			zellorte.remove(index);
			
			if (zellorte.isEmpty()) {
				ergebnis = "Versenkt";
			} else {
				ergebnis = "Treffer";
			}
		}
		
		System.out.println(ergebnis);
		return ergebnis;
	}
	
	
	// VOID MAIN
		public static void main(String[] args) {
			int anzahlTipps = 0;
			SpielHelfer helfer = new SpielHelfer();

			int zufallsZahl = (int) (Math.random() * 5);
			
			String zufallsZahlAlsString = "";
			
			zufallsZahlAlsString = ""+zufallsZahl;
			zellorte.add(zufallsZahlAlsString);
			
			zufallsZahlAlsString = ""+(zufallsZahl+1);
			zellorte.add(zufallsZahlAlsString);
			
			zufallsZahlAlsString = ""+(zufallsZahl+2);
			zellorte.add(zufallsZahlAlsString);

			boolean lebt = true;

			while (lebt == true) {

				String tipp = helfer.getBenutzereingabe("Geben Sie eine Zahl zwischen 1 und 5 ein.");
				String ergebnis = prüfDich(tipp);
				anzahlTipps++;

				if (ergebnis.equals("Versenkt")) {
					lebt = false;
					System.out.println("Sie haben " + anzahlTipps + " Versuche benöigt!");
				}

			}

		}
}
