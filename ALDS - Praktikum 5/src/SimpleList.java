// Vereinfachte Form einer Schnittstelle (engl. interface)
// f�r eine Liste
//
// Die Schnittstelle legt fest, welche Operationen eine
// eine Liste, d.h. eine Klasse, welche die Eigenschaften
// einer Liste besitzen soll, zur Verf�gung stellen muss.
//
// Gegen�ber der Schnittstelle List.java in der Java-
// Klassenbibliothek sind einige Operationen entfallen.

public interface SimpleList
extends SimpleCollection
{
	public void add(int index, Object o);
	
	public Object remove(int index);
	
	public Object get(int index);
	
	public int indexOf(Object o);
}