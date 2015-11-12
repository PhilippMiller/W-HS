
public class Main {

	static Rennauto BMW = new Rennauto(1, "Klaus", "BMW", "blau", 200);
	static Rennauto OPEL = new Rennauto(2, "Peter", "OPEL", "rot", 190);
	static Rennauto VW = new Rennauto(3, "Marie", "VW", "grün", 194);
	static Rennauto FORD = new Rennauto(4, "Antje", "FORD", "gelb", 186);
	static Rennauto AUDI = new Rennauto(5, "Stefan", "Audi", "weiß", 192);
	
	static Rennauto [] AlleAutos = {BMW,OPEL,VW,FORD,AUDI};
	
	static Autorennen Rennen = new Autorennen(AlleAutos, 1000);

	public static void main(String[] args) {

		Rennen.alleFahren();
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
