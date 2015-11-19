import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		System.out.println("Mitarbeiter der TrinkWas GmbH");
		System.out.println("-----------------------------");

		// Mitarbeiter Objekte initialisieren
		Angestellter mitarb1 = new Angestellter("Walser", "Frank", 1600);
		Buchhalter mitarb2 = new Buchhalter("Flink", "Eva", 1650);
		Chef chef = new Chef("Boss", "Hans", 3500);
		Angestellter azubi1 = new Angestellter("Vogel", "Sven", 450);
		System.out.println();
		Aushilfe aushilfe1 = new Aushilfe("Fritz", "Schmidt", 9.5f, 10);
		Aushilfe aushilfe2 = new Aushilfe("Engel", "Meike", 11f, 10);

		// Leere Zeile ausgeben
		System.out.println();
		// gehaltErhöhen Methode für den Mitarbeiter "chef" aufrufen
		chef.gehaltErhoehen(1000);

		mitarb1.urlaubNehmen(14);
		mitarb1.urlaubNehmen(14);

		aushilfe1.arbeiten(7);
		aushilfe1.arbeiten(5);

		aushilfe2.arbeiten(6);
		aushilfe2.arbeiten(6);
		aushilfe2.arbeiten(6);
		
		DecimalFormat df = new DecimalFormat("#0.00 €");

		System.out
				.println(aushilfe1.getVorname() + " " + aushilfe1.getName() + " bekommt: \t" + df.format((double)aushilfe1.lohnBerechnen()) + "\n");
		System.out
				.println(aushilfe2.getVorname() + " " + aushilfe2.getName() + " bekommt: \t" + df.format((double)aushilfe2.lohnBerechnen()) + "\n");

		System.out.println(mitarb1.getVorname() + " " + mitarb1.getName() + " verbleiben " + mitarb1.getUrlaubstage()
				+ " Uralaubstage" + "\n");
		System.out.println(mitarb2.getVorname() + " " + mitarb2.getName() + " verbleiben " + mitarb2.getUrlaubstage()
				+ " Uralaubstage" + "\n");
		System.out.println(chef.getVorname() + " " + chef.getName() + " verbleiben " + chef.getUrlaubstage()
				+ " Uralaubstage" + "\n");
		System.out.println(azubi1.getVorname() + " " + azubi1.getName() + " verbleiben " + azubi1.getUrlaubstage()
				+ " Uralaubstage" + "\n");

	}

}
