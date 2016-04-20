import java.util.ArrayList;

public class Aufgabe5 {

	public static void main(String[] args) {

		ArrayList<Long> iterativ = new ArrayList<Long>();
		ArrayList<Long> rekursiv = new ArrayList<Long>();
		
		System.out.println("Bitte den Exponenten angeben: ");
		int exponent = io.read_int();
		System.out.println();

		for (int i = 2; i <= 11; i++) {
			iterativ.add(potenzIterativ(i, exponent));
		}
		for (int i = 2; i <= 11; i++) {
			rekursiv.add(potenzRekursiv(i, exponent));
		}

		System.out.println("Start Iterativ");
		for (long item : iterativ) {
			System.out.println("\t" + item);
		}
		System.out.println("Ende Iterativ");
		System.out.println("Start Rekursiv");
		for (long item : rekursiv) {
			System.out.println("\t" + item);
		}
		System.out.println("Ende Rekursiv");
	}

	static long potenzIterativ(int basis, int exponent) {
		long ergebnis = basis;
		for (int i = 1; i < exponent; i++) {
			ergebnis *= basis;
		}
		return ergebnis;
	}

	static long potenzRekursiv(int basis, int exponent) {
		if (exponent != 0)
			return basis * potenzRekursiv(basis, exponent - 1);
		return 1;
	}

}
