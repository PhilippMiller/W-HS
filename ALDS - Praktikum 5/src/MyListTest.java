public class MyListTest
{
	//Elemente in Liste einfügen
	static void fillList(SimpleList list)
  	{
		//Zahlen von 0 bis 19 als Zeichenketten (Strings) einfügen
    	for (int i = 0; i < 20; ++i) 
		{
      		list.add("" + i);
    	}
		//Element an der Position 3 entfernen
    	list.remove(3);
		//Erstes Element in der Liste entfernen, das gleich "6" ist
    	list.remove("6");
  	}

	//Liste vom Anfang bis zum Ende durchlaufen und Elemente ausgeben
  	static void printList(SimpleList list)
  	{
		SimpleIterator it = list.iterator();
		while (it.hasNext()) 
		{
      		System.out.print((String)it.next()+" ");
    	}
    	System.out.println("\n-");
  	}
  			
  	public static void main(String[] args)
  	{
    	//Erzeugen der LinkedList
    	System.out.println("Verkettete Liste");
    	MyLinkedList list1 = new MyLinkedList();
    	fillList(list1);
    	printList(list1);
    	
    	//Letztes Element entfernen
    	list1.remove(list1.size()-1);
    	printList(list1);

        //Erstes Element entfernen
        list1.remove(0);
    	printList(list1);

		//Elemente einfügen
		list1.add("42");
		list1.add(list1.size()/2, "0815");
		list1.add(0, "4711");
    	printList(list1);
    	
    	//Index bestimmen
    	System.out.println(list1.indexOf("4711"));
    	System.out.println(list1.indexOf("0815"));
    	System.out.println(list1.indexOf("42"));

		//Element ausgeben
		System.out.println(list1.get(5));		
		System.out.println();
            
		//Erzeugen der ArrayList
		System.out.println("Feld-Liste");
    	MyArrayList list2 = new MyArrayList();
    	fillList(list2);
    	printList(list2);

    	//Letztes Element entfernen
    	list2.remove(list2.size()-1);
    	printList(list2);

        //Erstes Element entfernen
        list2.remove(0);
    	printList(list2);

		//Elemente einfügen
		list2.add("42");
		list2.add(list2.size()/2, "0815");
		list2.add(0, "4711");
    	printList(list2);
    	
    	//Index bestimmen
    	System.out.println(list2.indexOf("4711"));
    	System.out.println(list2.indexOf("0815"));
    	System.out.println(list2.indexOf("42"));

		//Element ausgeben
		System.out.println(list2.get(5));		

  	}
}