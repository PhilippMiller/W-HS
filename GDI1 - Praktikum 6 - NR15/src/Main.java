
public class Main {

	public static void main(String[] args) {
		
		Rennauto BMW = new Rennauto(1, "Klaus", "BMW", "blau", 200);
		Rennauto OPEL = new Rennauto(2, "Peter", "OPEL", "rot", 190);
		Rennauto VW = new Rennauto(3, "Marie", "VW", "gr�n", 194); 
		
		System.out.println("Der Fahrer des " + BMW.getFarbe() + " BMW hei�t Klaus!");
		System.out.println("Die H�chstgeschwindigkeit des " + OPEL.getFarbe() + " " + OPEL.getName() + " liegt bei " + OPEL.getH�chstgeschwindigkeit() + "km/h!");
		System.out.println("Der " + VW.getFarbe() + " " + VW.getName() + " hat die Startnummer " + VW.getAutonummer() + "."); 
		
		


	}

}
