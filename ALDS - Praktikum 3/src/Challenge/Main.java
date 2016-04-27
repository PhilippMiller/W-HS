package Challenge;

import Data.BasicIo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bitte denken sie an eine Zahl zwischen 1 und 1000.");
		System.out.print("\n5... ");
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				System.out.print((4 - i) + "... ");
			}
		} catch (InterruptedException e) {
		}
		System.out.println();
		System.out.println("Ihre Zahl ist : " + binsearch_rekursiv(0, 1000));
	}

	public static int binsearch_rekursiv(int min, int max) {
		int mittelwert = (min + max) / 2;

		if (max - 1 == min) {
			return mittelwert;
		}
		if (frage(mittelwert)) {
			return binsearch_rekursiv(min, mittelwert);
		} else {
			return binsearch_rekursiv(mittelwert, max);
		}
	}

	public static boolean frage(int zahl) {
		System.out.println("Ist ihre Zahl kleiner als " + zahl + "? [j / n]");
		if (BasicIo.read_char_jn() == 'j')
			return true;
		return false;
	}

}
