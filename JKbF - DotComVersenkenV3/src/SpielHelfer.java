import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SpielHelfer {
	private static final String alphabet = "abcdefg";
	private int rasterL�nge = 7;
	private int rasterGr��e = 49;
	private int[] raster = new int[rasterGr��e];
	private int dotComAnzahl = 0;

	public String getBenutzereingabe(String prompt) {
		String eingabeZeile = null;
		System.out.println(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			eingabeZeile = is.readLine();
			if (eingabeZeile.length() == 0)
				return null;
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
		return eingabeZeile.toLowerCase();
	}

	public ArrayList<String> platziereDotCom(int dotComGr��e) {
		ArrayList<String> alphaZellen = new ArrayList<String>();
		String temp = null;
		int[] koordinaten = new int[dotComGr��e];
		int versuche = 0;
		boolean erfolg = false;
		int ort = 0;

		dotComAnzahl++;
		int inkrement = 1;
		if ((dotComAnzahl % 2) == 1) {
			inkrement = rasterL�nge;
		}

		while (!erfolg & versuche++ < 200) {
			ort = (int) (Math.random() * rasterGr��e);
			int x = 0;
			while (erfolg && x < dotComGr��e) {
				if (raster[ort] == 0) {
					koordinaten[x++] = ort;
					ort += inkrement;
					if (ort >= rasterGr��e) {
						erfolg = false;
					}
					if (x > 0 & (ort % rasterL�nge == 0)) {
						erfolg = false;
					}
				} else {
					erfolg = false;
				}
			}

		}
		int x = 0;
		int zeile = 0;
		int spalte = 0;
		
		while (x < dotComGr��e) {
			raster[koordinaten[x]] = 1;
			zeile = (int) (koordinaten[x] / rasterL�nge);
			spalte = koordinaten[x] % rasterL�nge;
			temp = String.valueOf(alphabet.charAt(spalte));
			
			alphaZellen.add(temp.concat(Integer.toString(zeile)));
			x++;
			System.out.println(" Koordinaten " + x + " = " + alphaZellen.get(x-1));
		}
		return alphaZellen;
	}
}
