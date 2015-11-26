
public class Main {

	public static void main(String args[]) {
		
		// fehler kann aus folgenden Grund auftreten:
		// Hinter 5.50 fehlt das "f" f�r float
		// ERROR: "The constructor Gericht(String, double) is undefined"
		
		Pizza pizza1 = new Pizza("Pizza Speziale", 6.50, new String[] {"Tomatenso�e","Salami","Schinken","Champingions","K�se"}, 11);
		Nudeln nudeln1 = new Nudeln("Rigatoni", 5.00, "Bolognese", "Hackfleisch", true);
		
		pizza1.berechnePreis("gross");
		nudeln1.berechnePreis("klein");
		
		Speisekarte speisekarte = new Speisekarte();
		
		speisekarte.gerichteEinschreiben(pizza1);
		speisekarte.gerichteEinschreiben(nudeln1);
		
		
		System.out.println("Der Preis f�r eine gro�e " + speisekarte.getGerichte()[0].getName() 
				+ " ist: " + speisekarte.getGerichte()[0].getPreis() + " Euro");	
		System.out.println(speisekarte.getGerichte()[1].getName() + " " + speisekarte.getGerichte()[1].getNudelsorte() + " in klein kostet " 
				+ speisekarte.getGerichte()[1].getPreis() + " Euro");
		
	}

}
