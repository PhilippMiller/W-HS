import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Spiel implements Comparable<Spiel> {

	private String spielbezeichnung;
	private String spielort;
	private String heimmanschaft;
	private String gastmannschaft;
	private Date datum;
	private Date uhrzeit;

	public Spiel(String spielbezeichnung, String spielort, String heimmannschaft, String gastmannschaft, Date datum,
			Date uhrzeit) {
		this.spielbezeichnung = spielbezeichnung;
		this.spielort = spielort;
		this.heimmanschaft = heimmannschaft;
		this.gastmannschaft = gastmannschaft;
		this.datum = datum;
		this.uhrzeit = uhrzeit;
	}


	public int compareTo(Spiel spiel) {

		long date1 = this.datum.getTime() + this.uhrzeit.getTime();
		long date2 = spiel.datum.getTime() + spiel.uhrzeit.getTime();

		if (date1 > date2)
			return 1;
		else
			return 0;
	}

	// GETTERS
	public String getSpielbezeichnung() {
		return spielbezeichnung;
	}

	public String getSpielort() {
		return spielort;
	}

	public String getHeimmanschaft() {
		return heimmanschaft;
	}

	public String getGastmannschaft() {
		return gastmannschaft;
	}

	public String getDatum() {
		DateFormat df = new SimpleDateFormat("dd.MM.YYYY");
		return df.format(datum);
	}

	public String getUhrzeit() {
		DateFormat df = new SimpleDateFormat("HH:mm");
		return df.format(uhrzeit);
	}

}
