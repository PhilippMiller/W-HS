import java.nio.channels.ShutdownChannelGroupException;

public class Main {

	public static void main(String[] args) {

		Kunde Meier = new Kunde(10000, "Meier", "Klaus", "Bocholt", "klaus.meier@aol.com", "02871/ 12345", 5.5f,
				"Flink");
		Kunde Schmidt = new Kunde(10001, "Schmidt", "Antje", "Rhede", "antje.schmidt@tonline.cde", "02872/ 5432", 3.0f,
				"Lahm");
		Kunde Schulz = new Kunde(10002, "Schulz", "Peter", "Borken", "peter.schulz@web.de", "02861/ 9753", 1.5f,
				"Flink");
		
		
		for(int index = 0; index < Meier.getHistorie().length; index++) {
			System.out.print("Bitte die Kontaktart angeben: ");
			String kontaktart = io.read_String();
			System.out.print("Bitte Mitarbeiter angeben: ");
			String mitarbeiter = io.read_String();
			System.out.println("Bitte den Inhalt angeben:");
			String inhalt = io.read_String();
			Meier.historieSpeichern(kontaktart, mitarbeiter, inhalt, index);
			Meier.historieDrucken();
			
			if (index == 4) {
				Schmidt.historieDrucken();
				Schulz.historieDrucken();
			}
		}
		
		for(int index = 0; index < Schmidt.getHistorie().length; index++) {
			System.out.print("Bitte die Kontaktart angeben: ");
			String kontaktart = io.read_String();
			System.out.print("Bitte Mitarbeiter angeben: ");
			String mitarbeiter = io.read_String();
			System.out.println("Bitte den Inhalt angeben:");
			String inhalt = io.read_String();
			Schmidt.historieSpeichern(kontaktart, mitarbeiter, inhalt, index);
			Schmidt.historieDrucken();
			
			if (index == 4) {
				Meier.historieDrucken();
				Schulz.historieDrucken();
			}
		}
		
		for(int index = 0; index < Schulz.getHistorie().length; index++) {
			System.out.print("Bitte die Kontaktart angeben: ");
			String kontaktart = io.read_String();
			System.out.print("Bitte Mitarbeiter angeben: ");
			String mitarbeiter = io.read_String();
			System.out.println("Bitte den Inhalt angeben:");
			String inhalt = io.read_String();
			Schulz.historieSpeichern(kontaktart, mitarbeiter, inhalt, index);
			Schulz.historieDrucken();
			
			if (index == 4) {
				Meier.historieDrucken();
				Schmidt.historieDrucken();
			}
		}
		
	}

}
