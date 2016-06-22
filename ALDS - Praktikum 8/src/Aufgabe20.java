import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe20 {
	
	public static void main(String[] args) {
		regExZumWarmwerden("abrakadabrasimsalabim", "ab");
	}
	
	static void regExZumWarmwerden(String suchText, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(suchText);
		
		System.out.println("Vorkommen von '" + pattern + "' in '" + suchText + "':");
		while (m.find()) {
			System.out.println("Pattern befindet sich an Position:\t" + m.start() + " bis " + m.end());
		}
	}

}
