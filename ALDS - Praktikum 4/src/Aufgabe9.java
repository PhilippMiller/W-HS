
public class Aufgabe9 {
	
	public static void main(String[] args) {
		MyLinkedList liste = new MyLinkedList();
		
		liste.add("Dies ");
		liste.add("ist ");
		liste.add("eine ");
		liste.add("schöne ");
		liste.add("Aufgabe ");
		liste.add("zum ");
		liste.add("warm ");
		liste.add("werden");
		
		for(int i = 0; i < liste.size(); i++) {
			System.out.print(liste.get(i));
		}
		System.out.println(".");
		
	}

}
