
public class Challenge {

	public static void main(String[] args) {
		
		System.out.println("Gib die Jahre zur Berechnung an: ");
		int jahre = io.read_int();
		System.out.println("\n\n\n");
		
		long start = System.currentTimeMillis();
		System.out.println(fibRekursiv(jahre));
		long ende = System.currentTimeMillis();
		System.out.println("Es wurden " + (ende - start) + " Millisekunden benötigt!");
		
		start = System.currentTimeMillis();
		System.out.println(fibIterativ(jahre));
		ende = System.currentTimeMillis();
		System.out.println("Es wurden " + (ende - start) + " Millisekunden benötigt!");
	}

	static int fibRekursiv(int jahre) {
		// fn=f(n-1)+f(n-2)
		// f0=0
		// f1=1

		if (jahre <= 0)
			return 0;
		if (jahre == 1)
			return 1;

		return fibRekursiv(jahre - 1) + fibRekursiv(jahre - 2);
	}

	static int fibIterativ(int jahre) {
		int hasen = 0;
		
		if (jahre <= 0)
			return 0;
		if (jahre == 1)
			return 1;
		
		int f_1 = 0;
		int f_2 = 1;
		
		for (int i = 2; i <= jahre; i++) {
			hasen = f_1 + f_2;
			f_1 = f_2;
			f_2 = hasen;
		}
		
		return hasen;
	}

}
