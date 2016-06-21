import java.util.HashMap;

public class Aufgabe44_Main {

	public static void main(String[] args) {
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		
		myHashMap.put("Meyer", "manfred.meyer@w-hs.de");					//1
		myHashMap.put("Miller", "philipp.miller@studmail.w-hs.de");			//2
		myHashMap.put("Müller", "thomas.mueller@studmail.w-hs.de");			//3
		myHashMap.put("Momper", "jan-markus.momper@studmail.w-hs.de");		//4
		myHashMap.put("Kellner", "mario.kellner@studmail.w-hs.de");			//5
		myHashMap.put("Hausmann", "markus.hausmann@studmail.w-hs.de");		//6
		myHashMap.put("Friedrich", "mark.friedrich@studmail.w-hs.de");		//7
		
		for(String key : myHashMap.keySet()) {
			String tabs = "\t";
			if (key.length() < 9) {
				tabs = "\t\t";
			}
			System.out.println("Alias: " + key + tabs + "Mail-Adresse: " + myHashMap.get(key));
		}
		
		
		/*
		 * Egal ob die obere Reihenfolge geändert wird! Die Ausgabe ist immer gleich!
		 */
	}

}
