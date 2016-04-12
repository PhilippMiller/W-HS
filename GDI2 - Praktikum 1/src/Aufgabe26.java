
public class Aufgabe26 {

	public static void main(String[] args) {
		try {
			for (int i = -5; i < 6; i++) {

				System.out.println(1 / i);
			}
		} catch (ArithmeticException e) {
			System.out.println("Fhlertext:\t\t" + e.getMessage());
			System.out.println("Art und Text:\t\t" + e.toString());
			System.out.print("Auszug Laufzeit-Keller:\n");
			e.printStackTrace();
		}
	}

}
