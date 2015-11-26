
public class Main {

	public static void main(String args[]) {
		
		// fehler kann aus folgenden Grund auftreten:
		// Hinter 5.50 fehlt das "f" für float
		// ERROR: "The constructor Gericht(String, double) is undefined"
		
		Pizza pizza1 = new Pizza("Pizza Speziale", 6.50, new String[] {"Tomatensoße","Salami","Schinken","Champingions","Käse"}, 11);
		Nudeln nudeln1 = new Nudeln("Rigatoni", 5.00, "Bolognese", "Hackfleisch", true);
		
		pizza1.berechnePreis("gross");
		nudeln1.berechnePreis("klein");
		
		Speisekarte speisekarte = new Speisekarte();
		
		speisekarte.gerichteEinschreiben(pizza1);
		speisekarte.gerichteEinschreiben(nudeln1);
		
		
		System.out.println("Der Preis für eine große " + speisekarte.getGerichte()[0].getName() 
				+ " ist: " + speisekarte.getGerichte()[0].getPreis() + " Euro");	
		System.out.println(speisekarte.getGerichte()[1].getName() + " " + speisekarte.getGerichte()[1].getNudelsorte() + " in klein kostet " 
				+ speisekarte.getGerichte()[1].getPreis() + " Euro");
		
	}

}
