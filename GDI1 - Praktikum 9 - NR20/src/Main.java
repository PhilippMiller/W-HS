
public class Main {
	
	static Comparable largest(Comparable[] elemente) {
		
		Comparable merkzettel = elemente[0];
		for (int i = 1;i < elemente.length; i++) {
			if (elemente[i].compareTo(merkzettel) > 0) {
				merkzettel = elemente[i];
			}
		}
		
		return merkzettel;
	}
	
	public static void main(String[] args) {
		
		Studierender [] studierenden = new Studierender[5];
		studierenden[0] = new Studierender("Miller", "Philipp", 123456790);
		studierenden[1] = new Studierender("Müller", "Thomas", 123456791);
		studierenden[2] = new Studierender("Holdschlag", "Tim", 123456792);
		studierenden[3] = new Studierender("Friedrich", "Mark", 123456793);
		studierenden[4] = new Studierender("Eckel", "Lucas", 123456794);
		
		Studierender derGroessteStudent;
		derGroessteStudent = (Studierender)largest(studierenden);
		
		System.out.println("Der Grösste Student ist: " + derGroessteStudent.getVorname() + " " + derGroessteStudent.getName());
		
		
	}

}
