import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Stammkunde> kundenListe = new ArrayList<Stammkunde>();
		kundenListe.add(new Stammkunde("Hallerforn", "Dieter"));
		kundenListe.add(new Stammkunde("Merkel", "Angela"));
		kundenListe.add(new Stammkunde("Miller", "Philipp"));
		kundenListe.add(new Stammkunde("Wackel", "Peter"));
		kundenListe.add(new Stammkunde("Momper", "Jan"));
		
		kundenListe.get(0).setRechnungsWert(150.75);
		kundenListe.get(1).setRechnungsWert(22.50);
		kundenListe.get(2).setRechnungsWert(10.25);
		kundenListe.get(3).setRechnungsWert(199.49);
		kundenListe.get(4).setRechnungsWert(25.79);
		
		for (Stammkunde kunde:kundenListe) {
			Rechnung.RechnungErstellen(kunde);
		}
		
		
		
	}

}
