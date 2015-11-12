
public class Main {

	static Rennauto BMW = new Rennauto(1, "Klaus", "BMW", "blau", 200);
	static Rennauto OPEL = new Rennauto(2, "Peter", "OPEL", "rot", 190);
	static Rennauto VW = new Rennauto(3, "Marie", "VW", "grün", 194);

	public static void main(String[] args) {

		fahren();
	}

	static void fahren() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Trainingssession "+(i+1)+":");
			System.out.println("===================");

			BMW.fahren();
			OPEL.fahren();
			VW.fahren();

			System.out.println("Der " + BMW.getFarbe() + " " + BMW.getName() + ", gefahren von " + BMW.getFahrer()
					+ ", hat jetzt " + BMW.getRundenzahl() + " Runden zurückgelegt.");
			System.out.println("Der " + OPEL.getFarbe() + " " + OPEL.getName() + ", gefahren von " + OPEL.getFahrer()
					+ ", hat jetzt " + OPEL.getRundenzahl() + " Runden zurückgelegt.");
			System.out.println("Der " + VW.getFarbe() + " " + VW.getName() + ", gefahren von " + VW.getFahrer()
					+ ", hat jetzt " + VW.getRundenzahl() + " Runden zurückgelegt.");
		}
	}

}
