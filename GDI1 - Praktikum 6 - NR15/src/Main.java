
public class Main {

	public static void main(String[] args) {
		
		Rennauto BMW = new Rennauto(1, "Klaus", "BMW", "blau", 200);
		Rennauto OPEL = new Rennauto(2, "Peter", "OPEL", "rot", 190);
		Rennauto VW = new Rennauto(3, "Marie", "VW", "grün", 194); 
		
		System.out.println("Der Fahrer des " + BMW.getFarbe() + " BMW heißt Klaus!");
		System.out.println("Die Höchstgeschwindigkeit des " + OPEL.getFarbe() + " " + OPEL.getName() + " liegt bei " + OPEL.getHöchstgeschwindigkeit() + "km/h!");
		System.out.println("Der " + VW.getFarbe() + " " + VW.getName() + " hat die Startnummer " + VW.getAutonummer() + "."); 
		
		


	}

}
