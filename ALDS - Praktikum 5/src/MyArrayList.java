/**
 * Implementierung der Schnittstelle SimpleList mit Hilfe eines Feldes, das bei
 * Bedarf vergrößert wird Die gespeicherten Objektreferenzen dürfen im Gegensatz
 * zur Klasse ArrayList in der Java-Klassenbibliothek nicht gleich null sein.
 */
public class MyArrayList implements SimpleList
{
    // Attribute
    private Object[] elementData; // Feld zur Speicherung der Nutzdaten
                                  // (Objekte)
    private int      size;        // Anzahl der Elemente in der Liste

    // Konstruktor
    /**
     * Erzeugung einer leeren Liste
     */
    public MyArrayList()
    {
        this.elementData=new Object[10]; // Erzeugung eines Feldes mit der
                                         // Startgröße 10
        this.size=0;
    }

    // Operationen
    /**
     * Sicherstellen, dass das Feld groß genug ist, um minCapacity Objekte
     * speichern zu können. Ist dies nicht der Fall, wird ein neues Feld
     * erzeugt, und die gespeicherten Objekte in das neue Feld umkopiert.
     */
    private void ensureCapacity(int minCapacity)
    {
        int oldCapacity=this.elementData.length;

        if (minCapacity>oldCapacity)
        {
            Object oldData[]=this.elementData;

            // Hier erfolgt die Erzeugung des neuen Feldes.
            // Für die Größe des neuen Feldes sind verschiedene
            // Strategien denkbar.
            // Hier erhält das neue Feld mindestens die doppelte Länge.
            int newCapacity=2*oldCapacity;
            if (newCapacity<minCapacity)
                newCapacity=minCapacity;
            this.elementData=new Object[newCapacity];

            // Kopieren der Daten aus dem alten in das neue Feld
            for (int i=0; i<oldCapacity; i++)
                this.elementData[i]=oldData[i];
        }
    }

    /**
     * Überprüfung, ob ein Index im gültigen Bereich liegt
     */
    private static void rangeCheck(int minIndex, int index, int maxIndex)
    {
        if (index<minIndex||index>maxIndex)
            throw new IndexOutOfBoundsException();
    }

    /**
     * Elemente ab der Position index+1 um 1 nach links schieben Element an der
     * Position index wird überschrieben.
     */
    private void shiftLeft(int index)
    {
        for (int i=index; i<this.size-1; i++)
            this.elementData[i]=this.elementData[i+1];
    }

    /**
     * Elemente ab der Position index um 1 nach rechts schieben
     */
    private void shiftRight(int index)
    {
        for (int i=this.size; i>index; i--)
            this.elementData[i]=this.elementData[i-1];
    }

    /**
     * Überprüfung, ob die Liste leer ist
     */
    public boolean isEmpty()
    {
        return this.size==0;
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
            // Ausreichende Größe des Feldes sicherstellen
            ensureCapacity(this.size+1);

            // Objekt speichern
            this.elementData[this.size]=o;
            this.size++;

            result=true;
        }
        else
            result=false;

        return result;
    }

    /**
     * Entfernen des ersten Elements der Liste, dessen gespeichertes Objekt zu o
     * inhaltsgleich ist
     */
    public boolean remove(Object o)
    {
        boolean result;

        // Bestimmung des Elements mit dem kleinsten Index, dessen
        // gespeichertes Objekt zu o inhaltsgleich ist
        int index=indexOf(o);

        if (index>=0)
        {
            // Elemente ab der Position index+1 um 1 nach links schieben
            shiftLeft(index);
            this.size--;
            result=true;
        }
        else
            result=false;

        return result;
    }

    /**
     * Überprüfung, ob ein zu o inhaltsleiches Objekt in der Liste gespeichert
     * ist
     */
    public boolean contains(Object o)
    {
        return indexOf(o)>=0;
    }

    /**
     * Erzeugung eines Iterators zum sequentiellen Durchlauf durch die Liste
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

            // Ausreichende Größe des Feldes sicherstellen
            ensureCapacity(this.size+1);

            // Elemente ab der Position index um 1 nach rechts schieben
            shiftRight(index);

            // Objekt an der Position index speichern
            this.elementData[index]=o;
            this.size++;
        }
    }

    /**
     * Entfernen des Elements an der Position index und Rückgabe des an dieser
     * Position gepseicherten Objekts
     */
    public Object remove(int index)
    {
        Object result=null;

        // Hier Lösung für Aufgabe 12 einfügen

        return result;
    }

    /**
     * Rückgabe des an der Position index gespeicherten Objekts als Ergebnis
     */
    public Object get(int index)
    {
        rangeCheck(0, index, this.size-1);

        return this.elementData[index];
    }

    /**
     * Bestimmung des Index des ersten Elements der Liste, dessen gespeichertes
     * Objekt zu o inhaltsgleich ist
     */
    public int indexOf(Object o)
    {
        int result=-1;

        if (o!=null)
        {
            int i=0;
            while (i<this.size&&result<0)
            {
                if (o.equals(this.elementData[i]))
                    result=i;
                else
                    i++;
            }
        }

        return result;
    }

    // Innere Klasse für einen Iterator zum sequentiellen Durchlauf
    // durch die Liste
    class Iter implements SimpleIterator
    {
        // Attribut
        int pos; // aktuelle Position des Iterators

        // Konstruktor
        Iter()
        {
            pos=-1;
        }

        // Operationen
        //
        // Überprüfung, ob der Iterator noch ein weiteres Element
        // besuchen kann
        public boolean hasNext()
        {
            return pos<size-1;
        }

        // Schritt zum nächsten Element und Rückgabe des gespeicherten
        // Objekts als Ergebnis
        public Object next()
        {
            Object result=null;

            pos++;
            if (pos<size)
                result=elementData[pos];

            return result;
        }
    }
}
