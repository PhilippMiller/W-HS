
public class Chef extends Mitarbeiter{
	
	Chef(String name, String vorname, int gehalt){
		super(name, vorname, "Chef\t", gehalt);
		this.setUrlaubstage(26);
		this.ausgabe();
	}

}
