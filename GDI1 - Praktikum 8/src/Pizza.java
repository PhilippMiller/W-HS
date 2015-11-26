
public class Pizza extends Gericht{
	
	private String [] belag;
	private int backzeit;
	
	public Pizza(String name, double standardpreis, String[] belag, int backzeit) {
		super(name, standardpreis);
		this.setBelag(belag);
		this.setBackzeit(backzeit);
	}

	
	// GETTERS und SETTERS
	public String[] getBelag() {
		return belag;
	}

	public void setBelag(String[] belag) {
		this.belag = belag;
	}

	public int getBackzeit() {
		return backzeit;
	}

	public void setBackzeit(int backzeit) {
		this.backzeit = backzeit;
	}
	
	

}
