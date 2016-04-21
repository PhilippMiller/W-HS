package Challenge;

import java.util.*;

public class Kunde {

	private List<Bestellung> bestellungen;

	private String name;
	private String vorname;
	private int kundennummer;

	public Kunde() {
		this.bestellungen = new LinkedList<Bestellung>();
	}
	
	public void link(Bestellung bestellung) {
		bestellungen.add(bestellung);
	}

	void druckeAlleOffenenBestellungen() {
		System.out.println("Offende Bestellung von " + this);
		for (Bestellung bestellung : bestellungen) {
			if (bestellung.getStatus().equals("offen"))
				for (Bestellposition position : bestellung.getPositionen()) {
					System.out.println(position.getAnzahl() + " x " + position.getAuswahlArtikel());
					int zuBestellendeMenge = position.getAuswahlArtikel().berechneFehlmenge(position.getAnzahl());
					switch (zuBestellendeMenge) {
					case 0:
						System.out.println("Der Artikel ist in der gewünschten menge vorrätig!");
						break;
					default:
						System.out.println("Der Artikel '" + position.getAuswahlArtikel() + "' muss noch " + zuBestellendeMenge + "x bestellt werden!");
						break;
					}
				}
		}
		System.out.println();
	}
	
	public String toString() {
		return (this.vorname + " " + this.name + " | Kundennummer: " + this.kundennummer);
	}

	// Getters / Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public int getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

}
