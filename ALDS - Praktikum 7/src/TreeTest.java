class TreeTest
{
	public static void main(String[] args)
	{		
		MyTreeMap dictionary = new MyTreeMap();
	
		dictionary.put("node", "Knoten");
		dictionary.put("tree", "Baum");
		dictionary.put("root", "Wurzel");
		dictionary.put("left", "links");
		dictionary.put("right", "rechts");
	
		System.out.println("Anzahl der Einträge: "+dictionary.size());
		System.out.println("Engl.: "+"root"+" Dt.: "+dictionary.get("root"));
		System.out.println("Engl.: "+"node"+" Dt.: "+dictionary.get("node"));
		System.out.println("Engl.: "+"bla"+" Dt.: "+dictionary.get("bla"));
	
		dictionary.print();
		
		dictionary.remove("tree");
		System.out.println("Anzahl der Einträge: "+dictionary.size());

		dictionary.print();

		if (dictionary.containsValue("Wurzel"))
			System.out.println("Der Wert \"Wurzel\" ist enthalten.");
		else

			System.out.println("Der Wert \"Wurzel\" ist nicht enthalten.");
		if (dictionary.containsValue("Baum"))
			System.out.println("Der Wert \"Baum\" ist enthalten.");
		else

			System.out.println("Der Wert \"Baum\" ist nicht enthalten.");
		if (dictionary.isBalanced())
			System.out.println("Der Baum ist ausbalanciert.");
		else
			System.out.println("Der Baum ist nicht ausbalanciert.");	
	}
}