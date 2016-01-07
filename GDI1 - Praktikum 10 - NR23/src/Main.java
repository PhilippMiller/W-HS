import java.util.Properties;

public class Main {

	public static void main(String args[]) {

		String betriebssystem = "os.name";
		String benutzer = "user.name";
		String javaVersion = "java.version";
		String verzeichnis = "java.class.path";

		Properties prop = System.getProperties();

		String gesamtAusgabe = "Der Benutzer " + prop.getProperty(benutzer)
				+ " arbeitet auf einem Computer mit dem Betriebssystem\n" + prop.getProperty(betriebssystem)
				+ " und der Java Version " + prop.getProperty(javaVersion) + " aktuell im Verzeichnis\n" + prop.getProperty(verzeichnis) + ".";
		System.out.println(gesamtAusgabe);

	}

}
