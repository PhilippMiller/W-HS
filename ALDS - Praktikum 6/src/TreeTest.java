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
	
		System.out.println(dictionary.size());
		System.out.println("Engl.: "+"root"+" Dt.: "+dictionary.get("root"));
		System.out.println("Engl.: "+"node"+" Dt.: "+dictionary.get("node"));
		System.out.println("Engl.: "+"bla"+" Dt.: "+dictionary.get("bla"));
	
		dictionary.print();
		
		dictionary.remove("tree");
		System.out.println(dictionary.size());
		dictionary.print();
	}
}