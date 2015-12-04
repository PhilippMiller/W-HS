
public class Main {
	
	static double potenzen(double basis, int exponent) {

		double ergebnis = basis;

		for (int i = 1; i < exponent; i++) {
			ergebnis = ergebnis * basis;
		}

		return ergebnis;
	}

	public static void main(String[] args) {
		
		Rational ersteZahl = new Rational(1,2);
		Rational ergebnis = ersteZahl.grenz(ersteZahl);
		ergebnis.print();
		
		

	}

}
