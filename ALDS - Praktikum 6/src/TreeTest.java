import java.util.List;

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
	
		System.out.println("Engl.: "+"root"+" Dt.: "+dictionary.get("root"));
		System.out.println("Engl.: "+"node"+" Dt.: "+dictionary.get("node"));
		System.out.println("Engl.: "+"bla"+" Dt.: "+dictionary.get("bla"));
	
		System.out.println(dictionary.size());
		dictionary.print();
		
		dictionary.remove("tree");
		System.out.println(dictionary.size());
		dictionary.print();
		
		dictionary.heigth();
		List leaves = dictionary.getLeaves();
		if (leaves != null)
			System.out.println("Leaves: " + dictionary.getLeaves().size());
	}
}