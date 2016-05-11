// Vereinfachte Form einer Schnittstelle (engl. interface)
// f�r einen Iterator zum sequentiellen Zugriff auf die 
// Elemente einer SimpleCollection
//
// Die Schnittstelle legt fest, welche Operationen ein
// Iterator, d.h. eine Klasse, welche die Eigenschaften
// eines Iterators besitzen soll, zur Verf�gung stellen muss.
//
// Gegen�ber der Schnittstelle Iterator.java in der Java-
// Klassenbibliothek ist die Operation remove entfallen.

public interface SimpleIterator
{
	public boolean hasNext();
	
	public Object next();
}