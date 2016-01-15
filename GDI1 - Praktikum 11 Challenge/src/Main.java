import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Windgeschwindigkeit> messungen = new ArrayList<Windgeschwindigkeit>();
		
		System.out.println("Wie viele Messungen wollen sie eineben?");
		int anzahl = io.read_int();
		
		for (int i = 0; i < anzahl; i++){
			System.out.println("Bitte gib den " + (i+1) + ". gemessenen Wert ein:");
			messungen.add(new Windgeschwindigkeit(io.read_int()));
		}
		
		for (Windgeschwindigkeit item:messungen) {
			item.printData();
		}
	}

}
