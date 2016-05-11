
public class Challenge {

	public static void main(String[] args) {
		MyLinkedStack liste = new MyLinkedStack();

		System.out.println("Liste leer: " + liste.empty());
		
		String words[] = {"Dies","ist","eine","schöne","Aufgabe","zum","warm","werden"};
		
		liste.push(words[0]);
		liste.push(words[1]);
		liste.push(words[2]);
		liste.push(words[3]);
		liste.push(words[4]);
		liste.push(words[5]);
		liste.push(words[6]);
		liste.push(words[7]);

		System.out.println(liste.size());
		int a = liste.size();
		for (int i = 0; i < a; i++) {
			System.out.println("'" + words[i] + "' befindet sich an Pos: " + liste.search(words[i]));
		}
		for (int i = 0; i < a; i++) {
			System.out.println(liste.pop() + " wurde gelöscht!");
		}
		System.out.println(liste.size());
		
		
	}
}
