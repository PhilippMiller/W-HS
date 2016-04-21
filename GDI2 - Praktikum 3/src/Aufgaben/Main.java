package Aufgaben;

public class Main {

	public static void main(String[] args) {
		
		try {

		Mitarbeiter m1 = new Mitarbeiter();
		m1.setName("Dieter");
		m1.setPersnr(12345);
		Mitarbeiter m2 = new Mitarbeiter();
		m2.setName("Paul");
		m2.setPersnr(12346);
		Mitarbeiter chef = new Chef();
		chef.setName("Manfred");
		chef.setPersnr(12346);

		Abteilung a1 = new Abteilung();
		a1.setBezeichnung("Einkauf");

		Abteilung a2 = new Abteilung();
		a2.setBezeichnung("Verkauf");

		a1.link(m1);
		a2.link(m2);
		
		// Hier nach kommt die Firma!!!
		if (Abteilung.counter < 2)
			throw new IllegalArgumentException("Fehler bei Firmenerstellung: \n\tEs müssen Mindestes 2 Abteilungen existieren!");
		if (Chef.chefCounter < 1) {
			throw new IllegalArgumentException("Fehler bei Firmenerstellung: \n\tEs muss mindestens 1 Chef angestellt sein!");
		}
		if (Chef.chefCounter > 1) {
			throw new IllegalArgumentException("Fehler bei Firmenerstellung: \n\tEs darf nur 1 Chef angestellt sein!");
		}

		Firma f1 = new Firma();
		f1.setName("Schnell und Sicher Spedition GmbH.");
		f1.setSitz("Bocholt");
		f1.setChef(chef);
		f1.link(a1);
		f1.link(a2);

		f1.mitarbeiterListeDrucken();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

}
