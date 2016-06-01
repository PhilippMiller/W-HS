import java.util.*;

/**
 * Implementierung eines binären Suchbaums
 *
 * Beachte: Der Suchbaum ist kein ausgeglichener Baum. Er kann durch Einfüge-
 * und Löschoperationen zu einer linearen Liste entarten.
 *
 * Die gespeicherten Objektreferenzen für Werte dürfen nicht gleich null sein.
 *
 */
public class MyTreeMap {
	/**
	 * Innere Klasse für die Knoten des binären Sucbaumes
	 */
	class Node {
		// Attribute
		Comparable key; // Verweis auf Schlüssel-Objekt
		Object value; // Verweis auf Wert-Objekt
		Node left; // Verweis auf linken Kindknoten
		Node right; // Verweis auf rechten Kindknoten

		// Konstruktor
		Node(Comparable key, Object value) {
			this.key = key;
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	// Attribute (Klasse MyTreeMap)
	private Node root; // Verweis auf Wurzelknoten des Binärbaumes
	private int size; // Anzahl der Knoten des Binärbaumes

	// Konstruktor (Klasse MyTreeMap)
	/**
	 * Erzeugung eines leeren Binärbaums
	 */
	public MyTreeMap() {
		this.root = null;
		this.size = 0;
	}

	// Operationen (Klasse MyTreeMap)
	/**
	 * Bestimmung der Anzahl der Knoten im Binärbaum
	 */
	public int size() {
		return this.size;
	}

	/*
	 * Bestimmung eines Knotens, der einen vorgegebenen Schlüssel enthält mit
	 * Hilfe eines rekursiven Algorithmus Die Operation setzt voraus, dass key
	 * ungleich null ist.
	 */
	private Node getNodeRec(Comparable key, Node tree) {
		Node result;

		if (tree == null) // Baum ist leer
			result = null;
		else {
			int cmp = key.compareTo(tree.key);
			if (cmp == 0) // Knoten ist gefunden
				result = tree;
			else if (cmp < 0) // Suchen im linken Teilbaum
				result = getNodeRec(key, tree.left);
			else // Suchen im rechten Teilbaum
				result = getNodeRec(key, tree.right);
		}

		return result;
	}

	/*
	 * Bestimmung eines Knotens, der einen vorgegebenen Schlüssel enthält mit
	 * Hilfe eines iterativen Algorithmus Die Operation setzt voraus, dass key
	 * ungleich null ist.
	 */
	private Node getNodeIt(Comparable key, Node tree) {
		if (tree == null) {
			return null;
		}

		Node result0 = tree;

		while (result0 != null) {

			int comp = key.compareTo(result0.key);
			if (comp == 0)
				return result0;
			else if (comp < 0) {
				result0 = result0.left;
			} else {
				result0 = result0.right;
			}

		}

		return result0;
	}

	/**
	 * Bestimmung des Wertes zu einem vorgegebenen Schlüssel
	 */
	Object get(Comparable key) {
		Object result = null;

		if (key != null) {
			// Node p = getNodeRec(key, this.root);
			Node p = getNodeIt(key, this.root);
			if (p != null)
				result = p.value;
		}

		return result;
	}

	/**
	 * Überprüfung, ob ein zu o inhaltsgleiches Objekt als Werte-Objekt
	 * enthalten ist
	 */
	boolean containsValue(Object o) {
		return containsValueRec(o, this.root);
	}

	private boolean containsValueRec(Object o, Node tree) {

		if (tree == null) // Baum ist leer
			return false;
		else {
			if (tree.value == o) {
				return true;
			}
			if (containsValueRec(o, tree.left))
				return true;
			if (containsValueRec(o, tree.right))
				return true;
		}

		return false;
	}

	/*
	 * Rekursives Verfahren zum Einfügen eines Paares (key,value) in den
	 * Binärbaum mit dem Wurzelknoten tree. Ist der Schlüssel key schon
	 * vorhanden, wird der alte Wert durch den Wert value ersetzt. Als Ergebnis
	 * wir ein Baum zurückgeliefert, der das Paar (key, value) enthält.
	 */
	private Node insertNode(Comparable key, Object value, Node tree) {
		if (tree == null) { // Neuen Knoten erzeugen
			tree = new Node(key, value);
			this.size++;
		} else {
			int cmp = key.compareTo(tree.key);
			if (cmp == 0) {
				// Alter Wert wir durch neuen Wert ersetzt
				tree.value = value;
			} else if (cmp < 0) // Einfügen im linken Teilbaum
				tree.left = insertNode(key, value, tree.left);
			else // Einfügen im rechten Teilbaum
				tree.right = insertNode(key, value, tree.right);
		}

		return tree;
	}

	/**
	 * Einfügen eines Paares (key,value) in den Binärbaum Ist der Schlüssel key
	 * schon vorhanden, wird der alte Wert durch den Wert value ersetzt.
	 */
	void put(Comparable key, Object value) {
		if (key != null && value != null)
			this.root = insertNode(key, value, this.root);
	}

	/*
	 * Bestimmung des Elternknotens des symmetrischen Nachfolgers des Knotens
	 * tree
	 *
	 * Der symmetrische Nachfolger eines Knotens, ist der Knoten mit dem
	 * kleinsten Schlüssel, der größer als der Schlüssel des Knotens tree ist.
	 * Dieser ist der am weitesten links stehende Knoten im rechten Teilbaum des
	 * Knotens tree.
	 */
	private Node parentSymSucc(Node tree) {
		Node result;

		result = tree;
		if (result.right.left != null) {
			result = result.right;
			while (result.left.left != null)
				result = result.left;
		}

		return result;
	}

	/*
	 * Rekursives Verfahren zum Entfernen eines Knotens zu einem vorgegebenen
	 * Schlüssel im Binärbaum mit dem Wurzelknoten tree. Als Ergebnis wir ein
	 * Baum zurückgeliefert, der den Schlüssel key nicht mehr enthält.
	 */
	private Node removeNode(Comparable key, Node tree) {
		if (tree != null) {
			int cmp = key.compareTo(tree.key);
			if (cmp < 0) // Entfernen im linken Teilbaum
				tree.left = removeNode(key, tree.left);
			else if (cmp > 0) // Entfernen im rechten Teilbaum
				tree.right = removeNode(key, tree.right);
			else {
				// zu entfernender Knoten gefunden
				this.size--;
				if (tree.left == null)
					tree = tree.right; // Fall 1: siehe Skript
				else if (tree.right == null)
					tree = tree.left; // Fall 2: siehe Skript
				else {
					// Knoten besitzt zwei Kindknoten
					Node p = parentSymSucc(tree);
					if (p == tree) // Fall 3: siehe Skript
					{
						tree.key = p.right.key;
						tree.value = p.right.value;
						p.right = p.right.right;
					} // Fall 4: siehe Skript
					else {
						tree.key = p.left.key;
						tree.value = p.left.value;
						p.left = p.left.right;
					}
				}
			}
		}

		return tree;
	}

	/**
	 * Entfernen eines Eintrags im Binärbaum zu einem vorgegebenen Schlüssel
	 */
	void remove(Comparable key) {
		if (key != null)
			this.root = removeNode(key, this.root);
	}

	/*
	 * Rekursives Verfahren zur Ausgabe der Paare (Schlüssel,Wert) sortiert nach
	 * aufsteigender Reihenfolge der Schlüsseln durch einen Inorder-Durchlauf
	 * durch den Binärbaum
	 */
	private void inorderPrint(Node tree) {
		if (tree != null) {
			inorderPrint(tree.left);
			System.out.println("(" + tree.key + "," + tree.value + ")");
			inorderPrint(tree.right);
		}
	}
	
	void heigth() {
		System.out.println("Baumhöhe: " + height(this.root));
	}
	
	private int height(Node tree) {
		int height = 0;
		if (tree == null)
			return 0;
		
		if (tree.left == null && tree.right == null)
			return 0;
		else
			height++;
		
		int height_left = height(tree.left);
		int height_right = height(tree.right);
		
		if (height_left > height_right)
			height += height_left;
		else if (height_left < height_right)
			height += height_right;
		else
			height += height_left;
		
		return height;
		
	}
	
	List<Node> getLeaves() {
		return getLeaves(this.root);
	}
	
	private List<Node> getLeaves(Node tree) {
		List<Node> leaves = new ArrayList<Node>();
		
		if (tree == null)
			return null;
		
		if (tree.left == null && tree.right == null)
			leaves.add(tree);
		else {
			if (tree.left != null)
				for (Node leav : getLeaves(tree.left)) {
					leaves.add(leav);
				}
			if (tree.right != null)
				for (Node leav : getLeaves(tree.right)) {
					leaves.add(leav);
				}
		}
		
		return leaves;
	}

	/**
	 * Ausgabe der Paare (Schlüssel,Wert) sortiert nach aufsteigender
	 * Reihenfolge der Schlüssel
	 */
	void print() {
		System.out.println("Liste der Einträge");
		System.out.println("------------------");
		inorderPrint(this.root);
		System.out.println();
	}
}
