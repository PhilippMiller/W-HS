
public class Aufgabe28 {

	public static void main(String[] args) {
		Object[] feld = new Object[19];
		for (int i = 0; i<feld.length; i++) {
			feld[i] = i*i;
		}
		System.out.println("Die länge beträgt: " + array_length(feld));
	}

	public static int array_length(Object[] feld) {
		int counter = 0;
		try {
			for (int i = 0; i < (i+1); i++) {
				Object f = feld[i];
				counter++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ende des Felds erreicht!");
		}
		
		return counter;
	}

}
