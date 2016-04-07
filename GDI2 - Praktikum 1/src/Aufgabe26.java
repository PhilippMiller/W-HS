
public class Aufgabe26 {

	public static void main(String[] args) {
		for (int i = -5; i < 6; i++) {
			try {
				System.out.println(1 / i);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}
	}

}
