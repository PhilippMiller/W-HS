package Data;
public class Auftrag {
	
	private int auftragsnummer;
	
	public Auftrag(int auftragsnummer) {
		this.auftragsnummer = auftragsnummer;
	}

	public int getAuftragsnummer() {
		return auftragsnummer;
	}

	public void setAuftragsnummer(int auftragsnummer) {
		this.auftragsnummer = auftragsnummer;
	}
	
	public String toString() {
		return "" + auftragsnummer;
	}

}
