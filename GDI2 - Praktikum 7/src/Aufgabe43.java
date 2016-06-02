import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Aufgabe43 {

	public static void main(String[] args) {

		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("objekte.ser")));
			Firma f1 = (Firma) ois.readObject();
			ois.close();

			System.out.println(f1.getName() + " aus " + f1.getSitz() + " hat " + f1.abt.size() + " Abteilungen.");
			if (f1.getChef() != null)
				System.out.println("Geschäftsführung: " + f1.getChef().getName());
			else {
				Chef chef = new Chef();
				chef.setName("Philipp Miller");
				chef.setPersnr(123007);
				f1.setChef(chef);
			}
			System.out.println(System.lineSeparator());
			
			for (Abteilung abteilung : f1.abt) {
				for (Mitarbeiter mitarbeiter : abteilung.ma) {
					System.out.println(mitarbeiter.getName() + " arbeitet in der " + abteilung.getBezeichnung() + " welche zur Firma " + f1.getName() + " gehört.");
				}
			}
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("objekte.ser")));
			oos.writeObject(f1);
			oos.close();
			
		} catch (IllegalArgumentException | IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}

	}

}
