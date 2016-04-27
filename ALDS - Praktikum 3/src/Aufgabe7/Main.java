package Aufgabe7;

import Data.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wie viele Aufträge sollen erstellt werden?");
		int index = BasicIo.read_int();

		Auftrag[] auftraege = new Auftrag[index];
		for (int i = 0; i < auftraege.length; i++) {
			System.out.println("Bitte gebe die Auftragsnummer für den " + (i + 1) + ". Auftrag ein:");
			auftraege[i] = new Auftrag(i + 1);
			System.out.println(auftraege[i].getAuftragsnummer());
		}

		System.out.println("Bitte gib die gesuchte Auftragsnummer an:");
		int auftragsnummer = BasicIo.read_int();

		int wahl = 0;
		do {
			System.out.println("\n\nWelches Verfahren soll angewand werden?");
			System.out.println("\t1\tIterativ");
			System.out.println("\t2\tRekursiv");
			wahl = BasicIo.read_int();
			if (wahl == 1)
				break;
			else if (wahl == 2)
				break;
		} while ((wahl != 1) || (wahl != 2));

		long start;
		long ende;
		int ergebnis = -1;

		switch (wahl) {
		case 1:
			start = System.currentTimeMillis();
			ergebnis = binsearch_iterativ(auftraege, auftragsnummer);
			ende = System.currentTimeMillis();
			System.out.println("Es wurden " + (ende - start) + " Millisekunden benötigt.");
			break;
		case 2:
			start = System.currentTimeMillis();
			ergebnis = binsearch_rekursiv(auftraege, auftragsnummer);
			ende = System.currentTimeMillis();
			System.out.println("Es wurden " + (ende - start) + " Millisekunden benötigt.");
			break;
		default:
			System.out.println("What ever!");
			break;
		}

		if (ergebnis == -1)
			System.out.println("Dieser Auftrag liegt noch nicht vor!");
		else
			System.out.println("Der Auftrag liegt an Position " + (ergebnis + 1));
	}

	public static int binsearch_iterativ(Auftrag[] auftraege, int auftragsnummer) {
		int kleineGrenze = 0;
		int grosseGrenze = auftraege.length;
		int mittelwert = grosseGrenze / 2;
		
		int ergebnis = -1;
		
		
		while(kleineGrenze +1 < grosseGrenze) {
			if (auftragsnummer == auftraege[mittelwert].getAuftragsnummer()) {
				ergebnis = mittelwert;
				break;
			}
			if (auftragsnummer > auftraege[mittelwert].getAuftragsnummer()) {
				kleineGrenze = mittelwert;
			}
			if (auftragsnummer < auftraege[mittelwert].getAuftragsnummer()) {
				grosseGrenze = mittelwert;
			}
			
			mittelwert = (kleineGrenze + grosseGrenze) / 2;
			System.out.println("m = " + mittelwert);
			if (mittelwert <= 1)
				break;
		}
		
		return ergebnis;
	}

	
	public static int binsearch_rekursiv(Auftrag[] auftraege, int auftragsnummer) {
		int mittelwert = (auftraege.length-1) / 2;
		
		if (auftragsnummer == auftraege[mittelwert].getAuftragsnummer()) {
			return mittelwert;
		}
		return binsearch_rekursiv(auftraege, auftragsnummer, 0, (auftraege.length-1));
	}
	
	public static int binsearch_rekursiv(Auftrag[] auftraege, int auftragsnummer, int kleineGrenze, int grosseGrenze) {
		int mittelwert = (kleineGrenze + grosseGrenze) / 2;
		
		if (auftragsnummer == auftraege[mittelwert].getAuftragsnummer()) {
			return mittelwert;
		}
		if (auftragsnummer > auftraege[mittelwert].getAuftragsnummer()) {
			return binsearch_rekursiv(auftraege, auftragsnummer, mittelwert, grosseGrenze);
		}
		if (auftragsnummer < auftraege[mittelwert].getAuftragsnummer()) {
			return binsearch_rekursiv(auftraege, auftragsnummer, kleineGrenze, mittelwert);
		}
		return -1;
	}

}
