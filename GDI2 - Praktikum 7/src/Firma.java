

import java.io.Serializable;
import java.util.*;

/**
 * 
 * Eine Firma, die die verschiedenen Abteilungen beinhaltet.
 * @see Abteilung
 * 
 * @author Chuckl0r
 * @version 1.0, 21.04.2016
 *
 */

@SuppressWarnings("serial")
public class Firma implements Serializable{

	private String name;
	private String sitz;
	private Mitarbeiter chef;

	protected List<Abteilung> abt;

	public Firma() {
		abt = new LinkedList<Abteilung>();
	}

	/**
	 * 
	 * @param abt Verbindung einer Abteilung mit der Firma.
	 */
	public void link(Abteilung abt) {
		this.abt.add(abt);
	}

	/**
	 * Druckt eine Übersicht aller Mitarbeiter in der jeweiligen Abteilung der Firma.
	 */
	public void mitarbeiterListeDrucken() {
		System.out.println("Geschäftsfüherer: " + chef);
		for (Abteilung item : abt) {
			System.out.println(item);
			for (Mitarbeiter mitti : item.ma) {
				System.out.println("\t- " + mitti);
			}
		}
	}

	// Getters / Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSitz() {
		return sitz;
	}

	public void setSitz(String sitz) {
		this.sitz = sitz;
	}

	public Mitarbeiter getChef() {
		return chef;
	}

	public void setChef(Mitarbeiter chef) {
		this.chef = chef;
	}

}
