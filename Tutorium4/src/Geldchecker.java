
public class Geldchecker {

	public void geldCheck() {

		String Eingabe = "";
		
		System.out.println("Bitte eine Seriennummer Eingeben");
		System.out.print("=> ");
		Eingabe = io.read_String();
		
		//LAND ZIFFER EINLESEN
		char landesZiffer = Eingabe.charAt(0);
		
		//LANDES ZIFFER GROSS MACHEN! (bsp. z = Z)
		String machGross = "" + landesZiffer;
		machGross = machGross.toUpperCase(); //<--- Wird nachher nochmal wichtig f�r die Ausgabe!
		landesZiffer = machGross.charAt(0);
		
		//LAND ZIFFER ALS "int" IN DEN STRING EINLESEN
		String neueEingabe = "" + (int)landesZiffer; //2 STELLIG!
		
		//DIE VORHERIGE EINGABE (OHNE DEN BUCHSTABEN i=1) EINLESEN!
		for (int i = 1; i < Eingabe.length(); i++){
			neueEingabe = neueEingabe + Eingabe.charAt(i);
		}
		
		String derUmrechenString = "";
		int pr�fzifferBestimmung = 0;
		
		//QUERSUMME BERECHNEN [Integer.parseInt(x) - wandelt String in int um]
		for (int i = 0; i < neueEingabe.length(); i++){
			derUmrechenString = "" + neueEingabe.charAt(i);
			pr�fzifferBestimmung = pr�fzifferBestimmung + Integer.parseInt(derUmrechenString);
		}
		
		//MIT REST TEILEN [MODULO]
		pr�fzifferBestimmung = pr�fzifferBestimmung % 9;
		pr�fzifferBestimmung = 8 - pr�fzifferBestimmung;
		
		if (pr�fzifferBestimmung == 0){
			pr�fzifferBestimmung = 9;
		}
		
		//LANDES BESTIMMUNG
		String land;
		if (machGross.equals("Z")) land = "Belgien";
		else if (machGross.equals("Y")) land = "Griechenland";
		else if (machGross.equals("X"))	land = "Deutschland";
		else if (machGross.equals("V")) land = "Spanien";
		else if (machGross.equals("U")) land = "Frankreich";
		else if (machGross.equals("T")) land = "Irland";
		else if (machGross.equals("S")) land = "Italien";
		else if (machGross.equals("P")) land = "der Niederlande";
		else if (machGross.equals("N")) land = "�sterreich";
		else if (machGross.equals("M")) land = "Porugal";
		else if (machGross.equals("L")) land = "Finnland";
		else land = "#ERROR UNBEKANNTES LAND#";
		
		System.out.println("Die Pr�fzimmer des aus " + land + " stammenden Geldscheines,");
		System.out.println("mit der Seriennummer " + Eingabe + " hat die Pr�fziffer: " + pr�fzifferBestimmung);
		System.out.println("\nDie vollst�ndige Seriennummer lautet: " + Eingabe + pr�fzifferBestimmung);
		
	}

}
