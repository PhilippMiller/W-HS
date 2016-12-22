
public class Main {

	/**
	 * Create a new MyArrayQueue, fill it and remove and add fife objects
	 */
	public static void main(String[] args) {

		MyArrayQueue schlange = new MyArrayQueue(10);

		for (int i = 0; i < 10; i++) {
			schlange.add(42);
		}

		for (int i = 0; i < 5; i++) {
			if (schlange.remove(42)) {
				schlange.print();
			} else {
				System.err.println("ERROR!");
				System.err.flush();
			}
			
			if (schlange.add(43)) {
				schlange.print();
			} else {
				System.err.println("ERROR!");
				System.err.flush();
			}
		}

	}

}
