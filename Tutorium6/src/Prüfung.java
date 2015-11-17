
public class Prüfung {
	
	public static boolean istBuchstabe(char c) {
		return Character.isLetter(c);
	}

	public static boolean istZiffer(char c) {
		return Character.isDigit(c);
	}

	public static boolean istGroßBuchstabe(char c) {
		return Character.isUpperCase(c);
	}

	public static boolean istKleinBuchstabe(char c) {
		return Character.isLowerCase(c);
	}

}
