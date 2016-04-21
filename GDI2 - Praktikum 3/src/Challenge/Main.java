package Challenge;

public class Main {

	public static void main(String[] args) {
		
		Kunde kunde1 = new Kunde();
		kunde1.setName("Miller");
		kunde1.setVorname("Philipp");
		kunde1.setKundennummer(2016040001);
		Kunde kunde2 = new Kunde();
		kunde2.setName("Momper");
		kunde2.setVorname("Jan Markus");
		kunde2.setKundennummer(2016040002);
		
		Artikel artikel1 = new Artikel(100005561, 21, "Druckerpatrone");
		Artikel artikel2 = new Artikel(100005562, 8, "Computer Maus");
		Artikel artikel3 = new Artikel(100005563, 32, "Bildschirm");
		
		Bestellung b1 = new Bestellung();
		Bestellung b2 = new Bestellung();
		Bestellung b3 = new Bestellung();
		
		b1.bestellungAufgeben(kunde1, artikel1, 19);
		b2.bestellungAufgeben(kunde1, artikel3, 49);
		
		b3.bestellungAufgeben(kunde2, artikel2, 22);
		
		kunde1.druckeAlleOffenenBestellungen();
		kunde2.druckeAlleOffenenBestellungen();
		
		
	}

}
