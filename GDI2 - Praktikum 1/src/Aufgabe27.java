
public class Aufgabe27 {

	public static void main(String[] args) {
		for (int i = -5; i < 6; i++) {
			try {
				System.out.println(1 / i);
			} catch (ArithmeticException e) {
				System.out.println("Eine Division durch 0 ist nicht möglich!");
			}
		}
	}

}
