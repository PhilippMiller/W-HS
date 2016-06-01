/**
 * Implementierung der Schnittstelle SimpleList durch eine
 * einfach verkettete Liste.
 *
 * Die gespeicherten Objektreferenzen dürfen im Gegensatz
 * zur Klasse LinkedList in der Java-Klassenbibliothek nicht
 * gleich null sein.
 *
 * Die einfach verkettete Liste enthält immer ein zusätzliches
 * Element am Anfagng der Liste, in dem kein Objekt gespeichert ist.
 * Dadurch können bei einigen Operationen, Fallunterscheidungen
 * für die leere Liste vermieden werden.
 */
public class MyLinkedList
implements SimpleList
{
	/** 
	 * Innere Klasse für die einzelnen Elemente der einfach
	 * verketteten Liste
	 */
	class Entry 
	{
		// Attribute 
		Object data;	// Verweis auf gespeichertes Objekt
		Entry next;		// Verweis auf Nachfolger in der Liste
		
		// Konstruktor
		Entry(Object o, Entry next)
		{
	    	this.data = o;
	    	this.next = next;
	    }
    }

	// Attribute (Klasse MyLinkedList)
	private Entry head;  // Anfang der einfach verketteten Liste
	private Entry tail;  // Ende der einfach verketteten Liste
	private int size;    // Anzahl der Elemente in der Liste
	
	// Konstruktor (Klasse MyLinkedList)
	/**
	 * Erzeugung einer leeren Liste
	 */
	public MyLinkedList()
	{
		this.head = new Entry(null, null);
		this.tail = this.head;
		this.size = 0;
	}

	// Operationen (Klasse MyLinkedList)
	/**
	 * Überprüfung, ob ein Index im gültigen Bereich liegt
	 */	
	private static void rangeCheck(int minIndex, int index, int maxIndex)
	{
		if (index < minIndex || index > maxIndex)
			throw new IndexOutOfBoundsException();
	}

	/**
	 * Einfügen eines neuen Elements nach dem Element prev
	 */	
	private void addAfter(Object o, Entry prev) 
	{
		Entry e = new Entry(o, prev.next);
		prev.next = e;
		if (prev==this.tail)
			this.tail = e; // Listenende korrigieren
		this.size++;
    }
    
    /**
     * Entfernen des Elements nach dem Element prev
     */
    private Object removeAfter(Entry prev)
    {
    	Object result;
    	
    	Entry e = prev.next;
    	result = e.data;
    	
        prev.next = e.next;
        if (e==this.tail)
        	this.tail = prev; // Listenende korrigieren
        this.size--;
        
        return result;
    }

	/**
	 * Bestimmung des Elements zu einem vorgegebenen Index
	 */
    private Entry entry(int index) 
    {
		Entry e = this.head;

		for (int i=0; i<=index; i++)
			e = e.next;

        return e;
    }

	/**
	 * Überprüfung, ob die Liste leer ist
	 */	 
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	/**
	 * Bestimmung der Anzahl der Elemente in der Liste
	 */
	public int size()
	{
		return this.size;
	}
	
	/**
	 * Einfügen eines Elements am Ende der Liste
	 */
	public boolean add(Object o)
	{
		boolean result;
		
		if (o!=null)
		{
			addAfter(o, this.tail);
			result = true;
		}
		else
			result = false;
			
		return result;
	}

	/**
	 * Entfernen des ersten Elements der Liste des gespeichertes
	 * Objekt zu o inhaltsgleich ist
	 */	
	public boolean remove(Object o) 
	{
		boolean result = false;
		
        if (o!=null) 
        {
        	// Suche nach Element mit inhaltsgleichem Objekt
        	Entry e    = this.head.next;
        	Entry prev = this.head;
        	boolean found = false;
        	while (e!=null && !found)
        	{
        		if (o.equals(e.data))
        			found = true;
        		else
        		{
        			prev = e;
        			e = e.next;
        		}
        	}
        	
        	if (found)
        	{
        		removeAfter(prev);
        		result = true;
        	}
        }
        			
        return result;
    }

	/**
	 * Übrprüfung, ob ein zu o inhaltsleiches Objekt in der
	 * Liste gespeichert ist
	 */
	public boolean contains(Object o)
	{
		return indexOf(o)>=0;
	}
	
	/**
	 * Erzeugung eines Iterators zum sequentiellen Durchlauf durch
	 * die Liste
	 */
	public SimpleIterator iterator()
	{
		return new Iter();
	}

    /**
     * Einfügen eines Elements an der Position index
     */
	public void add(int index, Object o)
	{
		if (o!=null)
		{
			rangeCheck(0, index, this.size);
		
			Entry prev = entry(index-1);
			addAfter(o, prev);
		}
	}
	
	/**
	 * Entfernen des Elements an der Position index
	 * und Rückgabe des an dieser Position gespeicherten Objekts
	 */
	public Object remove(int index)
	{
		Object result = null;
		
		// Lösung Aufgabe 10:
		// ------------------
		
		rangeCheck(0,index,this.size()-1);
		Entry prev = entry(index-1);
		result = removeAfter(prev);
		return result;
		
		// Alternativer Ansatz:
		// --------------------
		//
		// Diese Implementierung ist aber nicht korrekt, da bei gleichen (equals)
		// Elementen immer das zuerst in der Liste stehende gelöscht wird - auch
		// dann, wenn index die Position des zweiten (oder dritten etc.) Vorkommens
		// in der Liste ist.
		//
		// Außerdem ist die Laufzeitkomplexität dieser "Lösung" quadratisch statt
		// linear!
		/*
		 
		result = get(index);
		remove(result);
		return result;
		
		*/
	}
	
	/**
	 * Rückgabe des an der Position index gespeicherten Objekts
	 * als Ergebnis
	 */ 
	public Object get(int index)
	{
		rangeCheck(0, index, this.size-1);
		
		Entry e = entry(index);
		return e.data;
	}
	
	/**
	 * Bestimmung des Index des ersten Elements der Liste, dessen gespeichertes
	 * Objekt zu o inhaltsgleich ist
	 */		
	public int indexOf(Object o)
	{
		int index = -1;
		
		// Lösung Aufgabe 11:
        // ------------------
		
		if (o!=null) 
		{
			// Suche nach Element mit inhaltsgleichem Objekt
		    
			Entry e    = this.head.next;
			boolean found = false;
			while (e!=null && !found)
			{
				index++;
				if (o.equals(e.data))
				{
					found = true;
				}
				else
				{
					e = e.next;
				}
			}
        	if (!found)
			{
				index = -1;
			}
        	
        	// So sollte es nicht gemacht werden - hat's schon gegeben!
        	// --------------------------------------------------------
        	//
        	// Aufrufe von entry(i) in der Schleife führen zu einer 
        	// quadratischen Laufzeitkomplexität!
        	/*
        	 
        	index = -1;
        	for(int i = 0; i < this.size; i++)
        	{
        		Entry entry = entry(i);
        		if (entry.data.equals(o))
        		{
        			index = i;
        			break;
        		}
        	}
        	return index;
        	*/
        	
        	// 
        	// So auch nicht - alles schon mal da gewesen... ;-)
        	// -------------------------------------------------
        	//
        	// Auch hier durch get(i) quadratischer Aufwand!
        	/*
        	 
        	for(int i = 0; i < this.size; i++)
        	{
        		if (get(i).equals(o))
        		{
        			return i;
        		}
        	}
        	return -1;
        	
        	*/
		}
		return index;
	}	
	
	
	// Innere Klasse für einen Iterator zum sequentiellen Durchlauf
	// durch die Liste
	class Iter
	implements SimpleIterator
	{
		// Attribut
		Entry e;	// Element an der aktuellen Position des Iterators
		
		// Konstruktor
		Iter()
		{
			e = head;
		}
		
		// Operationen

		// Überprüfung, ob der Iterator noch ein weiteres Element
		// besuchen kann
		public boolean hasNext()
		{
			return e.next != null;
		}
		
		// Schritt zum nächsten Element und Rückgabe des gespeicherten
		// Objekts als Ergebnis
		public Object next()
		{
			Object result = null;
			
			if (e.next != null)
			{
				e = e.next;
				result = e.data;
			}
				
			return result;
		}
	}
}
