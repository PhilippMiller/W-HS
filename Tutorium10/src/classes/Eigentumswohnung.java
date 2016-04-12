package classes;

import abstract_classes.Immobilie;
//import java.von.p.miller

public class Eigentumswohnung extends Immobilie{
	
	protected boolean balkon;

	public Eigentumswohnung(String adresse, int grundstuecksgroesse, int vermietbareFlaeche, float mietpreis_qm,
			float kaufpreis, boolean balkon, float eigenkapital) {
		super(adresse, grundstuecksgroesse, vermietbareFlaeche, mietpreis_qm, kaufpreis, eigenkapital);
		this.balkon = balkon;
	}

	
	public boolean isBalkon() {
		return balkon;
	}

	public void setBalkon(boolean balkon) {
		this.balkon = balkon;
	}
	
	

}
