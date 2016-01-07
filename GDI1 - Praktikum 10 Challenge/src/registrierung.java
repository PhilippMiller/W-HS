import java.util.ArrayList;

public class registrierung {
	
	ArrayList<Fluechtling> alleFluechtLinge = new ArrayList<Fluechtling>();;
	
	public static void main(String[] args) {

		String[] vornamen = { "Abbas", "Abdul", "Achmed", "Aladdin", "Ali", "Alim", "Arif", "Azmi", "Bassam", "Dakhil",
				"Djadi", "Djamal", "Faris", "Fatih", "Hakim", "Halim", "Hamit", "Harun", "Hasan", "Hasim", "Hilal",
				"Hussein", "Ibrahim", "Iskandar", "Ismail", "Issam", "Jussuf", "Kamal", "Kadir", "Kalil", "Khaliq",
				"Kamal", "Kamil", "Karim", "Khasib", "Latif", "Melih", "Memnun", "Mohammed", "Mustafa", "Nabil",
				"Nadim", "Namik", "Nuri", "Omar", "Osman", "Rami", "Rasin", "Resmi", "Resul", "Ruhi", "Sabri", "Safi",
				"Said", "Saladin", "Salih", "Sameh", "Samir", "Sedat", "Salim", "Sharif", "Sinan", "Sofian", "Suleiman",
				"Tahir", "Tahsin", "Tarek", "Ulvi", "Wahdet", "Wakur", "Wedat", "Yassir", "Yaver", "Yusuf", "Zafer",
				"Zahit", "Zakir", "Zarif", "Zati", "Zeki" };

		String[] nachnamen = { "Mezoued", "Aziz", "Ibrahim", "Bin Al-Saud", "Ishaq", "Abu Salama", "Yahya", "Dawud",
				"Chalid", "Reza", "Samet", "Masaad", "Antun Sa'ada" };

		String[] laender = { "Syrien", "Afghanistan", "Irak", "Eritrea", "Pakistan", "Sudan" };
		

		// Ab hier Ihre Lösung, verwenden Sie um Objekte vom Datentyp
		// "Fluechtling" zu erstellen, die obigen
		// Feldinhalte, das Geburtsjahr sollte zwischen 1955 und 2000 liegen
		
		int anzahlEinwanderer = 200000;
		
		registrierung dieses = new registrierung();
		
		ArrayList<Long> timeDif = new ArrayList<Long>();
		
		for(int i = 0; i < 5; i++){
			timeDif.add(dieses.fluechtlingeEinwandernLassen(vornamen, nachnamen, laender, anzahlEinwanderer));
		}
		
		long timeDifDurchschnitt = 0;
		int counter = 0;
		
		for(long item:timeDif){
			timeDifDurchschnitt += item;
			counter++;
		}
		
		timeDifDurchschnitt = timeDifDurchschnitt / counter;
		
		System.out.println("Das registrieren der " + anzahlEinwanderer + " Flüchtlinge dauerte durchschnittlich " + timeDifDurchschnitt + " Millisekunden.");
	}
		
		public long fluechtlingeEinwandernLassen(String[] vornamen, String[] nachnamen, String[] laender, int anzahlEinwanderer){
		
			long timeStamp01 = System.currentTimeMillis();
			for(int i = 0; i < anzahlEinwanderer; i++){
			String nachnameAuswahl = nachnamen[(int)(Math.random()*nachnamen.length)];
			String vornameAuswahl = vornamen[(int)(Math.random()*vornamen.length)];
			String leanderAuswahl = laender[(int)(Math.random()*laender.length)];
			int jahrAuswahl = 0;
			
			boolean jahr_Auswahl = false;
			while (jahr_Auswahl == false) {
				jahrAuswahl = (int)(Math.random()*20) + 1955;
				if ((jahrAuswahl < 2000) && (jahrAuswahl > 1955)) {
					jahr_Auswahl = true;
				}
			}
			jahr_Auswahl = false;
			
			alleFluechtLinge.add(new Fluechtling(nachnameAuswahl, vornameAuswahl, leanderAuswahl, jahrAuswahl));
			Fluechtling.FluechtlingsListe.add(alleFluechtLinge.get(i));
			
		}
		long timeStamp02 = System.currentTimeMillis();
		
		long timeDif = timeStamp02 - timeStamp01;
		System.out.println("Es wurden " + anzahlEinwanderer + " Flüchtlinge in " + timeDif + " Millisekunden registriert!");
		return timeDif;
	}
}
