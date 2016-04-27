package Aufgabe8;

import Data.Auftrag;
import Data.BasicIo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Wie viele Aufträge sollen erstellt werden?");

		int index = -1;
		while(index < 0) {
			index = BasicIo.read_int();
		}

		Auftrag[] auftraege = new Auftrag[index];
		for (int i = 0; i < auftraege.length; i++) {
			System.out.println("Bitte gebe die Auftragsnummer für den " + (i + 1) + ". Auftrag ein:");
			int anr;
			if (insertIntoHashTable(auftraege, new Auftrag(anr = random())) == false) {
				if (i > 1)
					System.out.println("Es wurden " + i + " Aufträge eingelagert!\n\tEs ist kein Fach mehr frei!");
				else
					System.out.println("Es wurde " + i + " Auftrag eingelagert!\n\tEs ist kein Fach mehr frei!");
				break;
			}
			if (anr < 1000)
				System.out.println("00" + anr);
			else if (anr < 10000)
				System.out.println("0" + anr);
			else
				System.out.println(anr);
		}

		search(auftraege);
	}

	public static boolean insertIntoHashTable(Auftrag[] auftraege, Auftrag auftrag) {
		int hashFunktionswert = auftrag.getAuftragsnummer() % auftraege.length;

		if (auftraege[hashFunktionswert] == null) {
			auftraege[hashFunktionswert] = auftrag;
			return true;
		} else {
			for (int i = hashFunktionswert + 1; i < auftraege.length; i++) {
				if (auftraege[i] == null) {
					auftraege[i] = auftrag;
					return true;
				}
			}
			for (int i = 0; i < hashFunktionswert; i++) {
				if (auftraege[i] == null) {
					auftraege[i] = auftrag;
					return true;
				}
			}
		}
		return false;

	}

	public static Auftrag getFromHashTable(Auftrag[] auftraege, int auftragsnummer) {
		int hashFunktionswert = auftragsnummer % auftraege.length;
		if (auftragsnummer == auftraege[hashFunktionswert].getAuftragsnummer())
			return auftraege[hashFunktionswert];

		for (int i = hashFunktionswert; i < auftraege.length; i++) {
			if (auftragsnummer == auftraege[i].getAuftragsnummer())
				return auftraege[i];
		}
		for (int i = 0; i < hashFunktionswert; i++) {
			if (auftragsnummer == auftraege[i].getAuftragsnummer())
				return auftraege[i];
		}

		return null;
	}

	public static void search(Auftrag [] auftraege) {
		System.out.println("Bitte gib die gesuchte Auftragsnummer an:");
		int auftragsnummer = BasicIo.read_int();

		Auftrag auftrag = getFromHashTable(auftraege, auftragsnummer);
		String nuller = "";
		if (auftrag != null) {
			if (auftrag.getAuftragsnummer() < 1000)
				nuller = "00";
			else if (auftrag.getAuftragsnummer() < 1000)
				nuller = "0";
			System.out.println("Der Auftrag " + nuller + auftrag + " wurde gefunden und dem Fahrer zugeteilt!");
		} else {
			System.out.println("Der Auftrag " + auftragsnummer + " liegt im Büro noch nicht vor.");
		}
		
		System.out.println("\n\nNach einen weiteren Auftrag suchen? [j / n]");
		if (BasicIo.read_char_jn() == 'j')
			search(auftraege);
	}
	
	public static int random() {
		int randomWert = (int) (Math.random() * 12000);

		if (randomWert < 100) {
			return random();
		} else
			return randomWert;
	}

}
