
public class Main {

	

	public static void main(String args[]) {
		
		int l�nge;
		String original = "";
		String r�ckwarts = "";
		
		System.out.println("Bitte gib die W�rter ein:");
		original = io.read_String();
		
		original.toLowerCase();
		
		l�nge = original.length();
		
		for (int i = l�nge - 1; i >= 0; i--) {
			r�ckwarts = r�ckwarts + original.charAt(i);
		}
		
		if (original.equals(r�ckwarts))
			System.out.println("Das ist ein Palindrom.");
		else
			System.out.println("Das ist kein Palindrom.");
	}
}
