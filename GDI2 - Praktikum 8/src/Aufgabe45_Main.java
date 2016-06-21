import java.util.HashSet;

public class Aufgabe45_Main {
	
	public static void main(String[] args) {
		HashSet<Integer> tipps = new HashSet<Integer>();
		
		int count = 1;
		while (tipps.size() < 6) {
			int zahl = (int) (Math.random() * 49);
			if (zahl > 0 && zahl < 50) {
				tipps.add(zahl);
				System.out.println("Zahl " + count + ": " + zahl);
				count++;
			}
		}
		
		System.out.println();
		
		int counter = 1;
		for (int zahl : tipps) {
			System.out.println(counter + ". Tipp: " + zahl);
			counter++;
		}
	}

}
