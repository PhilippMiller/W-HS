
public class Main {

	

	public static void main(String args[]) {
		
		int länge;
		String original = "";
		String rückwarts = "";
		
		System.out.println("Bitte gib die Wörter ein:");
		original = io.read_String();
		
		original.toLowerCase();
		
		länge = original.length();
		
		for (int i = länge - 1; i >= 0; i--) {
			rückwarts = rückwarts + original.charAt(i);
		}
		
		if (original.equals(rückwarts))
			System.out.println("Das ist ein Palindrom.");
		else
			System.out.println("Das ist kein Palindrom.");
	}
}
