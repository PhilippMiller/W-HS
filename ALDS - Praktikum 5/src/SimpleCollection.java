// Vereinfachte Form einer Schnittstelle (engl. interface)
// f�r eine Collection
//
// Die Schnittstelle legt fest, welche Operationen eine
// eine Collection, d.h. eine Klasse, welche die Eigenschaften
// einer Collection besitzen soll, zur Verf�gung stellen muss.
//
// Gegen�ber der Schnittstelle Collection.java in der Java-
// Klassenbibliothek sind einige Operationen entfallen.
public interface SimpleCollection
{
	public boolean add(Object o);
	
	public boolean remove(Object o);
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean contains(Object o);
	
	public SimpleIterator iterator();
}
	
	