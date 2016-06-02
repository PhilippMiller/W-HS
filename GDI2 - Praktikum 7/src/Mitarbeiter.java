import java.io.Serializable;

/**
 * Ein Mitarbeiter einer Firma.
 * 
 * @author Chuckl0r
 * @version 1.0, 21.04.2016
 *
 */

@SuppressWarnings("serial")
class Mitarbeiter implements Serializable{
	protected Abteilung arbeitetIn;
	protected int persnr;
	protected String name;

	/**
	 * 
	 * Die Abteilung in dem ein Mitarbeiter arbeitet wird verlinkt.
	 * @param abt Eine Abteilung, in der der Mitarbeiter arbeitet.
	 */
	public void link(Abteilung abt) {
		arbeitetIn = abt;
	}

	/**
	 * 
	 * @return Gibt die Bezeichnung der Abteilung aus.
	 */
	public Abteilung getlink() {
		return arbeitetIn;
	}

	/**
	 * 
	 * Hebt die Verbindung eines Mitarbeiters mit einer Abteilung auf.
	 */
	public void unlink() {
		arbeitetIn = null;
	}

	/**
	 * @return Gibt den Namen des Mitarbeiter zurück.
	 */
	public String toString() {
		return this.name;
	}

	// Getter / Setter
	public int getPersnr() {
		return persnr;
	}

	public void setPersnr(int persnr) {
		this.persnr = persnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAbteilung() {
		return this.arbeitetIn.bezeichnung;
	}

}