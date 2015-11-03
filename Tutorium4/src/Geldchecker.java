
public class Geldchecker {

	public void geldCheck() {

		String Eingabe = "";
		String derEingabeString[];
		
		System.out.println("Bitte eine Seriennummer Eingeben");
		System.out.print("=> ");
		Eingabe = io.read_String();
		
		char land = Eingabe.charAt(0);
		String neueEingabe = "" + (int)land; //2 STELLIG!
		char ablöseNeueEingabe[] = neueEingabe.toCharArray();
		neueEingabe = "";
		
		for (int i = 0; i < ablöseNeueEingabe.length; i++){
			neueEingabe = neueEingabe + ablöseNeueEingabe[i];
		}
		
		for (int i = 1; i < Eingabe.length(); i++){
			neueEingabe = neueEingabe + Eingabe.charAt(i);
		}
		
		for (int i = 0; i < neueEingabe.length()){
			derEingabeString[i] = neueEingabe[i];
		}
		derEingabeString = neueEingabe.toCharArray();
		System.out.println(derEingabeString.length);
		
		int quersumme = 0;
		for (int i = 0; i < derEingabeString.length; i++){
			quersumme = quersumme + Integer.parseInt(s));
		}
		System.out.println(quersumme);

	}

}
