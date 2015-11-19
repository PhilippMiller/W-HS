
public class Main {

	public static void main(String[] args) {

		System.out.println("Mitarbeiter der TrinkWas GmbH");
		System.out.println("-----------------------------");

		// Mitarbeiter Objekte initialisieren
		Mitarbeiter mitarb1 = new Mitarbeiter("Walser", "Frank", "Mitarbeiter", 1600);
		Mitarbeiter mitarb2 = new Mitarbeiter("Flink", "Eva", "Mitarbeiter", 1650);
		Mitarbeiter chef = new Mitarbeiter("Boss", "Hans", "Mitarbeiter", 3500);
		Mitarbeiter azubi1 = new Mitarbeiter("Vogel", "Sven", "Auszubildender", 450);

		// Leere Zeile ausgeben
		System.out.println();
		// gehaltErhöhen Methode für den Mitarbeiter "chef" aufrufen
		chef.gehaltErhoehen(1000);
	}

}
