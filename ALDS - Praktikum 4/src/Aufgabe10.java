public class Aufgabe10
{
	//Elemente in Liste einfügen
	static void fillList(SimpleList list)
  	{
		//Zahlen von 0 bis 19 als Zeichenketten (Strings) einfügen
    	for (int i = 0; i < 20; ++i) 
		{
      		list.add("" + i);
    	}
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
    	MyLinkedList liste = new MyLinkedList();
    	fillList(liste);
    	
    	//Letztes Element entfernen
    	String element = (String)liste.remove(liste.size()-1);
    	
    	//Erstes Element entfernen
    	element = (String)liste.remove(0);
    	        
        //Die Liste wieder vervollständigen
        liste.add(0, "1");
        liste.add("19");

        //Elemente 1 - 5 entfernen
        for(int i = 1; i <= 5; i++) {
        	liste.remove(i);
        	printList(liste);
        }
    	
    	//Element an der Stelle 5 ausgeben
		System.out.println(liste.get(4));
  	}
}