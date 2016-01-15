package bocholt;

public class WinfoTut extends WinfoStudi {
	public void hello() {
		System.out.println("Hallo, ich studiere Wirtschaftsinformatik und bin Tutor");

		/*
		 * DIE VARIABLE 'lehrveranstaltung1' ist private
		 * und nur von der eigenen Klasse einsehbar. 
		 * System.out.println("Ich besuche die Lehrveranstaltung " + lehrveranstaltung1);
		 */
		System.out.println("Ich besuche die Lehrveranstaltung " + lehrveranstaltung2);
		System.out.println("Ich besuche die Lehrveranstaltung " + lehrveranstaltung3);
		System.out.println("Ich besuche die Lehrveranstaltung " + lehrveranstaltung4);
	}
}
