
public class Speisekarte {

	private Gericht[] gerichte = new Gericht[10];
	private int index = 0;

	public void gerichteEinschreiben(Gericht gericht) {
		if (this.getIndex() < 10) {
			this.getGerichte()[this.index] = gericht;
			this.setIndex(this.getIndex() + 1);
		} else
			System.out.println("Die Speisekarte ist voll!");
	}
	
	
	// GETTERS und SETTERS
	public Gericht[] getGerichte() {
		return gerichte;
	}

	public void setGerichte(Gericht[] gerichte) {
		this.gerichte = gerichte;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
