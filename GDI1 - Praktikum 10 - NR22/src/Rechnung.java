
public class Rechnung {

	private static int rechnungsnummer = 10000;

	public static void RechnungErstellen(Stammkunde kunde) {
		kunde.setRechnungsnummer(rechnungsnummer);
		String rechnung = "########################\n\n" + kunde.getVorname() + " " + kunde.getName()
				+ "\n\nRechnungsnummer:\n" + rechnungsnummer + "\nRechnungssumme:\n" + kunde.getRechnungsWert()
				+ "\n\n########################";
		System.out.println(rechnung);
		rechnungsnummer++;
	}

}
