public class Main {
	
	public static boolean auswertung(char antwort_spieler, char richtige_antwort){
		return antwort_spieler == richtige_antwort ? true : false;
	}
	
	public static void ausgeben(boolean richtig, int anzahl_richtige_antworten, char richtige_antwort){
		if (richtig) {
			System.out.println("Glückwunsch, die Antwort ist richtig!");
			anzahl_richtige_antworten++;
			System.out.println(
					"Sie haben bis jetzt " + anzahl_richtige_antworten + " richtige Antwort(en) gegeben!\n");
		} else {
			System.out.println("Schade, die Antwort ist leider falsch!");
			System.out.println("Die richtige Antwort wäre \"" + richtige_antwort + "\" gewesen.");
			System.out.println(
					"Sie haben bis jetzt " + anzahl_richtige_antworten + " richtige Antwort(en) gegeben!\n");
		}
	}
	
	public static void main(String[] args) {

		// Deklaration der Variablen "richtige_antwort" als char
		char richtige_antwort;
		// Deklaration der Variablen "antwort_spieler" als char
		char antwort_spieler;
		// Deklaration der Variablen "richtig" als boolean
		boolean richtig;
		// Deklaration und Initialisierung der Variablen
		// "anzahl_richtige_antworten" als int
		int anzahl_richtige_antworten = 0;
		int[] anzahl_im_durchgang = { 0, 0, 0 };
		int gesamtpunktzahl = 0;
		int counter = 1;
		char start_stop;
		boolean starto = false;

		System.out.println("Herzlich Willkommen zum WHS - WER WIRD MILLIONÄR!");
		System.out.println("=================================================");
		// Eine Leerzeile ausgeben
		System.out.println();

		for (int durchgang = 0; durchgang < 3; durchgang++) {

			// Bereit zum spielen?
			while (starto == false) {
				System.out.print("Sind sie bereit?\nBitte bestätigen sie mit \"j\" für ja oder \"n\" für nein: ");
				start_stop = io.read_char_jn();
				if (start_stop == 'j') {
					starto = true;
				}
			}
			System.out.println();
			starto = false;

			/*
			 * ########### # Frage 1 # ###########
			 */

			// Korrekte Antwort speichern
			richtige_antwort = 'd';
			// Frage stellen
			System.out.println("Hier kommt Frage 1:");
			System.out.println("Wo finden Sie die Vorlesungs-, Praktikums- und Tutoriumsunterlagen?");
			System.out.println("a - doodle\nb - google\nc - poodle\nd - moodle");
			// Antwort einlesen
			System.out.print("Bitte a,b,c oder d eingeben: ");
			antwort_spieler = io.read_char_abcd();
			// Antwort auswerten
			richtig = (antwort_spieler == richtige_antwort) ? true : false;
			// Ergebnis ausgeben
			richtig = auswertung(antwort_spieler, richtige_antwort);
			ausgeben(richtig, anzahl_richtige_antworten, richtige_antwort);

			/*
			 * ########### # Frage 2 # ###########
			 */

			// Korrekte Antwort speichern
			richtige_antwort = 'c';
			// Frage stellen
			System.out.println("Hier kommt Frage 2:");
			System.out.println(
					"Welches der folgenden Wörter dürfen Sie nicht als Variablenbezeichner in java verwenden?");
			System.out.println("a - inter\nb - mint\nc - int\nd - ginter");
			// Antwort einlesen
			System.out.print("Bitte a,b,c oder eingeben: ");
			antwort_spieler = io.read_char_abcd();
			// Antwort auswerten
			richtig = (antwort_spieler == richtige_antwort) ? true : false;
			// Ergebnis ausgeben
			richtig = auswertung(antwort_spieler, richtige_antwort);
			ausgeben(richtig, anzahl_richtige_antworten, richtige_antwort);

			/*
			 * ########### # Frage 3 # ###########
			 */

			// Korrekte Antwort speichern
			richtige_antwort = 'a';
			// Frage stellen
			System.out.println("Hier kommt Frage 3:");
			System.out.println("Welches der folgenden Wörter ist ein Schlüsselwort?");
			System.out.println("a - double\nb - doubed\nc - str\nd - flight");
			// Antwort einlesen
			System.out.print("Bitte a,b,c oder d eingeben: ");
			antwort_spieler = io.read_char_abcd();
			// Antwort auswerten
			richtig = (antwort_spieler == richtige_antwort) ? true : false;
			// Ergebnis ausgeben
			richtig = auswertung(antwort_spieler, richtige_antwort);
			ausgeben(richtig, anzahl_richtige_antworten, richtige_antwort);

			/*
			 * ########### # Frage 4 # ###########
			 */

			// Korrekte Antwort speichern
			richtige_antwort = 'd';
			// Frage stellen
			System.out.println("Hier kommt Frage 4:");
			System.out.println("Welcher Hörsaal ist der größte?");
			System.out.println("a - hs4\nb - hs3\nc - hs2\nd - hs1");
			// Antwort einlesen
			System.out.print("Bitte a,b oder c eingeben: ");
			antwort_spieler = io.read_char_abcd();
			// Antwort auswerten
			richtig = (antwort_spieler == richtige_antwort) ? true : false;
			// Ergebnis ausgeben
			richtig = auswertung(antwort_spieler, richtige_antwort);
			ausgeben(richtig, anzahl_richtige_antworten, richtige_antwort);

			anzahl_im_durchgang[durchgang] = anzahl_richtige_antworten;
			anzahl_richtige_antworten = 0;
			System.out.println("Dies war Durchgang " + counter + "/3\n\n");
			System.out.println("-----------------------------------------------");
			counter++;
		}

		for (int i = 0; i < anzahl_im_durchgang.length; i++) {
			gesamtpunktzahl = gesamtpunktzahl + anzahl_im_durchgang[i];
		}

		System.out.println("Sie haben insgesamt " + gesamtpunktzahl + "mal richtig geantwortet!");

	}

}