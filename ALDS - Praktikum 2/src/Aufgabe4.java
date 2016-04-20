public class Aufgabe4 {

	public static void main(String[] args) {
		System.out.println("Schleife iterativ:");
		machEsIterativ(1, 11);
		System.out.println("Schleife rekursiv:");
		machEsRekursiv(1, 11);
	}

	static void machEsIterativ(int start, int ende) {
		do {
			System.out.println(start);
			start++;
		} while (start <= ende);
	}

	static void machEsRekursiv(int start, int ende) {
		if (start < ende) {
			System.out.println(start);
			machEsRekursiv(start + 1, ende);
		} else
			System.out.println(start);
	}
}
