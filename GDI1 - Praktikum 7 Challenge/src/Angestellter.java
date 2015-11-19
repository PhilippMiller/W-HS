
public class Angestellter extends Mitarbeiter{
	
	Angestellter(String name, String vorname, int gehalt){
		super(name,vorname,"Angestellter", gehalt);
		this.setUrlaubstage(26);
		this.ausgabe();
	}
}
