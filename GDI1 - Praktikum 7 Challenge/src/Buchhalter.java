
public class Buchhalter extends Mitarbeiter{
	
	Buchhalter(String name, String vorname, int gehalt) {
		super(name,vorname,"Buchhalter", gehalt);
		this.setFirmenwagen(true);
		this.setUrlaubstage(26);
		this.ausgabe();
	}
}
