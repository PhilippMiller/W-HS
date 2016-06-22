package challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funktionen {
	public static String quelltextAuslesen(String url) {
		String quelltext = null;
		String inputLine;
		int zeile = 1;

		// URL - Eingabe
		// Ggf. fehlende Teile ("www" oder "http://" werden ergänzt

		if (!url.startsWith("http://"))
			if (!url.startsWith("www."))
				url = "http://www.".concat(url);
			else
				url = "http://".concat(url);

		// Aus dem String wird ein URL-Objekt erstellt
		URL website = null;
		try {
			website = new URL(url);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		// Der Quelltext der Webseite wird ausgelesen

		BufferedReader in = null;

		try {
			in = new BufferedReader(new InputStreamReader(website.openStream()));

			while ((inputLine = in.readLine()) != null) {
				quelltext += (zeile + "\t" + inputLine + "\n");
				zeile++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return quelltext;
	}

	static void hyperlinksSuchen(String quellText) {
		
		String[] lines = quellText.split("\n");
		
		String output = "";
		int lineNumber = 0;
		int hits = 0;
		
		String pattern = "\\<a[^\\>]*\\>(.*?)\\</a\\>";
		Pattern p = Pattern.compile(pattern);
		
		for (String line : lines) {
			lineNumber++;
			Matcher m = p.matcher(line);
			while (m.find()) {
				output += "In Zeile " + lineNumber + " wurde ein Hyperlink ab Position " + m.start() + " bis Position " + m.end() + " gefunden.\n";
				output += m.group() + "\n\n";
				hits++;
			}
		}
		
		output = "Es wurden " + hits + " URL('s) gefunden.\n\n" + output;
		
		if (output.equals("")) {
			output = "Keine URL's in den " + lineNumber + " durchsuchten Zeilen gefunden!";
		}
		
		Ausgabe ausgabe = new Ausgabe(1500, 800, "Ausgabe");
		ausgabe.meineAusgabe(output);
		
	}
}
