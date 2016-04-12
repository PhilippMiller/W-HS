package classes;

import abstract_classes.Immobilie;
//import java.von.p.miller

public class Mehrfamilienhaus extends Immobilie{
	
	protected int wohnungen;
	
	public Mehrfamilienhaus(String adresse, int grundstuecksgroesse, int vermietbareFlaeche, float mietpreis_qm,
			float kaufpreis, int wohnungen, float eigenkapital) {
		super(adresse, grundstuecksgroesse, vermietbareFlaeche, mietpreis_qm, kaufpreis, eigenkapital);
		this.wohnungen = wohnungen;
	}
	

	public int getWohnungen() {
		return wohnungen;
	}

	public void setWohnungen(int wohnungen) {
		this.wohnungen = wohnungen;
	}
	
	

}
