import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Aufgabe42 {

	public static void main(String[] args) {
		
		try {

		Mitarbeiter m1 = new Mitarbeiter();
		m1.setName("Dieter");
		m1.setPersnr(12345);
		Mitarbeiter m2 = new Mitarbeiter();
		m2.setName("Paul");
		m2.setPersnr(12346);

		Abteilung a1 = new Abteilung();
		a1.setBezeichnung("Einkauf");

		Abteilung a2 = new Abteilung();
		a2.setBezeichnung("Verkauf");

		a1.link(m1);
		a2.link(m2);
		
		// Hier nach kommt die Firma!!!
		if (Abteilung.counter < 2)
			throw new IllegalArgumentException("Fehler bei Firmenerstellung: \n\tEs müssen Mindestes 2 Abteilungen existieren!");

		Firma f1 = new Firma();
		f1.setName("Schnell und Sicher Spedition GmbH.");
		f1.setSitz("Bocholt");
		f1.link(a1);
		f1.link(a2);

		f1.mitarbeiterListeDrucken();
		
		
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("objekte.ser")));
		oos.writeObject(f1);
		oos.close();
		
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
