import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

	private static Connection myConnection;
	private static Statement myStatement;

	public static void main(String[] args) {
		System.out.println(connect("localhost", "3306", "root", ""));
		System.out.println(dbAnlegen());
		System.out.println(tabelleAnlegen());
		System.out.println(datenEingeben());
		System.out.println(spielplan());
	}

	public static String connect(String ipAdresse, String port, String benutzerName, String passwort) {
		System.out.println("Verbindung wird hergestellt...");
		try {
			myConnection = DriverManager.getConnection("jdbc:mysql://" + ipAdresse + ":" + port + "/", benutzerName,
					passwort);
		} catch (Exception e) {
			return e.getMessage() + "\nFehler beim herstellen der Verbindung!";
		}
		return "Verbunden!";
	}

	public static String dbAnlegen() {
		try {
			if (myConnection != null)
				myStatement = myConnection.createStatement();
			else
				throw new SQLException("Noch keine Verbindung zur Datenbank hergestellt!");
			String sqlCommand = "DROP DATABASE IF EXISTS em2016";
			myStatement.executeUpdate(sqlCommand);
			sqlCommand = "CREATE DATABASE em2016";
			myStatement.executeUpdate(sqlCommand);
			return "Die Datenbank wurde neu aufgesetzt!";
		} catch (Exception e) {
			return e.getMessage() + "\nFehler beim erstellen der Datenbank!";
		}
	}

	public static String tabelleAnlegen() {
		try {
			if (myConnection != null)
				myStatement = myConnection.createStatement();
			else
				throw new SQLException("Noch keine Verbindung zur Datenbank hergestellt!");

			String sqlCommand = "USE em2016";
			myStatement.executeQuery(sqlCommand);

			sqlCommand = "DROP TABLE IF EXISTS spiele";
			myStatement.executeUpdate(sqlCommand);

			sqlCommand = "CREATE TABLE spiele (" + "spieleid INT(10) NOT NULL AUTO_INCREMENT,"
					+ "spielbezeichnung VARCHAR(20) NULL DEFAULT NULL," + "spielort VARCHAR(20) NULL DEFAULT NULL,"
					+ "datumuhrzeit DATETIME NULL DEFAULT NULL," + "heimmannschaft VARCHAR(20) NULL DEFAULT NULL,"
					+ "gastmannschaft VARCHAR(20) NULL DEFAULT NULL," + "PRIMARY KEY (spieleid)" + ")";
			myStatement.executeUpdate(sqlCommand);
			return "Tabelle wurde erfolgreich erstellt!";
		} catch (Exception e) {
			return e.getMessage() + "\nEs konnte keine Tabelle erstellt werden!";
		}
	}

	public static String datenEingeben() {
		String[][] strings;
		try {
			BufferedReader br1 = new BufferedReader(
					new FileReader(new File(System.getProperty("user.dir") + "/data/spiele_test.txt")));
			BufferedReader br2 = new BufferedReader(
					new FileReader(new File(System.getProperty("user.dir") + "/data/spiele_test.txt")));
			String line;

			int count;
			for (count = 0; br2.readLine() != null; count++)
				;

			strings = new String[count][];
			for (int i = 0; (line = br1.readLine()) != null; i++) {
				line = line.replaceAll("endOfLine", "");
				strings[i] = line.split("\\;");
			}
		} catch (Exception e) {
			return (e.getMessage() + "\nFehler beim lesen der Datei!");
		}

		try {
			if (myConnection != null)
				myStatement = myConnection.createStatement();
			else
				throw new SQLException("Noch keine Verbindung zur Datenbank hergestellt!");

			String sqlCommand;
			for (int i = 0; i < strings.length; i++) {
				sqlCommand = "INSERT INTO spiele (spielbezeichnung,spielort,datumuhrzeit,heimmannschaft,gastmannschaft) VALUES (\""
						+ strings[i][1] + "\",\"" + // Spielbezeichnung
						strings[i][2] + "\",\"" + // Spielort
						strings[i][3] + "\",\"" + // datumuhrzeit
						strings[i][4] + "\",\"" + // Heimmannschaft
						strings[i][5] + // Gastmannschaft
						"\")";
				myStatement.executeUpdate(sqlCommand);
			}
		} catch (Exception e) {
			return e.getMessage() + "\nFehler beim Eintragen in die Datenbank!";
		}

		return "Tabelle 'spiele' erfolgreich mit Einträgen gefüllt.";

	}

	public static String spielplan() {
		try {
			if (myConnection != null)
				myStatement = myConnection.createStatement();
			else
				throw new SQLException("Noch keine Verbindung zur Datenbank hergestellt!");

			String sqlCommand = "SELECT * FROM spiele";
			ResultSet rs = myStatement.executeQuery(sqlCommand);

			String gleichs = "";
			for (int i = 0; i <= 135; i++) {
				gleichs += "=";
			}

			String result = gleichs + "\n"
					+ "Gruppe\t\tDatum\t\tAnstoss\t\tHeimmannschaft\t\t-\t\tGastmannschaft\t\t\tSpielort\n" + gleichs
					+ "\n";

			ArrayList<Spiel> spiele = new ArrayList<Spiel>();

			while (rs.next()) {
				String spielbezeichnung = rs.getString("spielbezeichnung");
				String spielort = rs.getString("spielort");
				Date date = rs.getDate("datumuhrzeit");
				Date uhrzeit_date = rs.getTime("datumuhrzeit");
				String heimmannschaft = rs.getString("heimmannschaft");
				String gastmannschaft = rs.getString("gastmannschaft");

				if (heimmannschaft.length() < 8)
					heimmannschaft += "\t";
				if (heimmannschaft.length() < 16)
					heimmannschaft += "\t";

				if (gastmannschaft.length() < 8)
					gastmannschaft += "\t";
				if (gastmannschaft.length() < 16)
					gastmannschaft += "\t";

				DateFormat tf = new SimpleDateFormat("HH:mm");
				String uhrzeit = tf.format(uhrzeit_date);

				DateFormat df = new SimpleDateFormat("dd.MM.YYYY");
				String datum = df.format(date);

				spiele.add(new Spiel(spielbezeichnung, spielort, heimmannschaft, gastmannschaft, date, uhrzeit_date));
			}

			System.out.println(bubbleSort(spiele));

			for (Spiel spiel : spiele) {
				result += spiel.getSpielbezeichnung() + "\t" + spiel.getDatum() + "\t" + spiel.getUhrzeit() + "\t\t"
						+ spiel.getHeimmanschaft() + "\t-\t\t" + spiel.getGastmannschaft() + "\t\t"
						+ spiel.getSpielort() + "\n";
			}

			return result;
		} catch (Exception e) {
			return e.getMessage()
					+ "\nFehler beim Auslesen der DatenBank Tabelle 'spiele' / beim Erstellen des Spielplans!";
		}
	}

	public static String bubbleSort(ArrayList<Spiel> spiele) {
		Spiel temp = null;
		for (int a = 1; a < spiele.size(); a++) {
			for (int b = 0; b < spiele.size() - a; b++) {
				if (spiele.get(b).compareTo(spiele.get(b + 1)) > 0) {
					temp = spiele.get(b);
					;
					spiele.set(b, spiele.get(b + 1));
					spiele.set(b + 1, temp);
				}
			}
		}
		return "Sortierung abgeschlossen!";
	}
}
