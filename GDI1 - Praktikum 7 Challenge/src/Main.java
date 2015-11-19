import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		System.out.println("Mitarbeiter der TrinkWas GmbH");
		System.out.println("-----------------------------");

		Mitarbeiter [] mitarbeiter = new Mitarbeiter[6];
		mitarbeiter[0] = new Angestellter("Walser", "Frank", 1600);
		mitarbeiter[1] = new Buchhalter("Flink", "Eva", 1650);
		mitarbeiter[2] = new Chef("Boss", "Hans", 3500);
		mitarbeiter[3] = new Angestellter("Vogel", "Sven", 450);
		mitarbeiter[4] = new Aushilfe("Fritz", "Schmidt", 9.5f, 10);
		mitarbeiter[5] = new Aushilfe("Engel", "Meike", 11f, 10);
		
		// gehaltErhöhen Methode für den Mitarbeiter "chef" aufrufen
		mitarbeiter[2].gehaltErhoehen(1000);

		mitarbeiter[0].urlaubNehmen(14);
		mitarbeiter[1].urlaubNehmen(14);

		mitarbeiter[4].arbeiten(7);
		mitarbeiter[4].arbeiten(5);

		mitarbeiter[5].arbeiten(6);
		mitarbeiter[5].arbeiten(6);
		mitarbeiter[5].arbeiten(6);
		
		DecimalFormat df = new DecimalFormat("#0.00 €");

		System.out
				.println(mitarbeiter[4].getVorname() + " " + mitarbeiter[4].getName() + " bekommt: \t" + df.format((double)mitarbeiter[4].lohnBerechnen()) + "\n");
		System.out
				.println(mitarbeiter[5].getVorname() + " " + mitarbeiter[5].getName() + " bekommt: \t" + df.format((double)mitarbeiter[5].lohnBerechnen()) + "\n");

		System.out.println(mitarbeiter[0].getVorname() + " " + mitarbeiter[0].getName() + " verbleiben " + mitarbeiter[0].getUrlaubstage()
				+ " Uralaubstage" + "\n");
		System.out.println(mitarbeiter[1].getVorname() + " " + mitarbeiter[1].getName() + " verbleiben " + mitarbeiter[1].getUrlaubstage()
				+ " Uralaubstage" + "\n");
		System.out.println(mitarbeiter[2].getVorname() + " " + mitarbeiter[2].getName() + " verbleiben " + mitarbeiter[2].getUrlaubstage()
				+ " Uralaubstage" + "\n");
		System.out.println(mitarbeiter[3].getVorname() + " " + mitarbeiter[3].getName() + " verbleiben " + mitarbeiter[3].getUrlaubstage()
				+ " Uralaubstage" + "\n");

	}

}
