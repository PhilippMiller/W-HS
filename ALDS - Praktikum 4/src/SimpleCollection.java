// Vereinfachte Form einer Schnittstelle (engl. interface)
// für eine Collection
//
// Die Schnittstelle legt fest, welche Operationen eine
// eine Collection, d.h. eine Klasse, welche die Eigenschaften
// einer Collection besitzen soll, zur Verfügung stellen muss.
//
// Gegenüber der Schnittstelle Collection.java in der Java-
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
	
	