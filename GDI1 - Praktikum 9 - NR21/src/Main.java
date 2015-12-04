
public class Main {
	
	static double potenzen(double basis, int exponent) {

		double ergebnis = basis;

		for (int i = 1; i < exponent; i++) {
			ergebnis = ergebnis * basis;
		}

		return ergebnis;
	}

	static double berechneA(double t, double E) {
				
		double x,y,A;

		// x = (1-(1/t^2))^2;
		x = potenzen(1 - (1 / potenzen(t, 2)), 2);

		// (x-1/t^4+3/t^2-1)*t^2
		y = (x - 1 / potenzen(t, 4) + 3 / potenzen(t, 2) - 1) * potenzen(t, 2);

		// A = (E * y) - E
		A = (E * y) - E;

		return A;
	}

	public static void main(String[] args) {

		double x;
		double y;
		double t;

		double A;
		double E;

		t = 654321;
		E = 227.4;
		
		A = berechneA(t, E);

		System.out.println(A);
		
		
		System.out.println();
		
		//21b - "SCHEISSE ICH STERBE HIER....."
		
		Rational ersteZahl = new Rational(1,2);
		Rational zweiteZahl = new Rational(3,4);
		Rational ergebnis = ersteZahl.add(zweiteZahl);
		ergebnis.print();

	}

}
