package Aufgaben;
import java.util.*;

/**
 * 
 * Beinhaltet die jeweilig eingesetzen Mitarbeiter.
 * @see Mitarbeiter
 * 
 * @author Chuckl0r
 * @version 1.0, 21.04.2015
 *
 */

class Abteilung {
	
	protected List<Mitarbeiter> ma;
	String bezeichnung;

	Abteilung() {
		this.ma = new LinkedList<Mitarbeiter>();
	}
	
	Abteilung(String bezeichnung) {
		this();
		this.bezeichnung = bezeichnung;
	}

	/**
	 * 
	 * @param mit Verbindung eines Mitarbeiters mit einer Abteilung.
	 */
	public void link(Mitarbeiter mit) {
		this.ma.add(mit);
		mit.link(this);
	}

	/**
	 * 
	 * @param mit Hebt die Verbindung eines Mitarbeiters mit einer Abteilung auf.
	 */
	public void unlink(Mitarbeiter mit) {
		this.ma.remove(mit);
		mit.unlink();
	}

	/**
	 * 
	 * @param pos 
	 * @return Gibt den Mitarbeiter an der [pos]-Position der Mitarbeiter Liste aus. 
	 */
	Mitarbeiter getlink(int pos) {
		return this.ma.get(pos);
	}
	
	/**
	 * @return Gibt die Bezeichnung der Abteilung wieder.
	 */
	public String toString() {
		return this.bezeichnung;
	}

	// Getter / Setter
	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
}