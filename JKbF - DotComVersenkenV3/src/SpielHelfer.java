import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SpielHelfer {
	private static final String alphabet = "abcdefg";
	private int rasterLänge = 7;
	private int rasterGröße = 49;
	private int[] raster = new int[rasterGröße];
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

	public ArrayList<String> platziereDotCom(int dotComGröße) {
		ArrayList<String> alphaZellen = new ArrayList<String>();
		String temp = null;
		int[] koordinaten = new int[dotComGröße];
		int versuche = 0;
		boolean erfolg = false;
		int ort = 0;

		dotComAnzahl++;
		int inkrement = 1;
		if ((dotComAnzahl % 2) == 1) {
			inkrement = rasterLänge;
		}

		while (!erfolg & versuche++ < 200) {
			ort = (int) (Math.random() * rasterGröße);
			int x = 0;
			while (erfolg && x < dotComGröße) {
				if (raster[ort] == 0) {
					koordinaten[x++] = ort;
					ort += inkrement;
					if (ort >= rasterGröße) {
						erfolg = false;
					}
					if (x > 0 & (ort % rasterLänge == 0)) {
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
		
		while (x < dotComGröße) {
			raster[koordinaten[x]] = 1;
			zeile = (int) (koordinaten[x] / rasterLänge);
			spalte = koordinaten[x] % rasterLänge;
			temp = String.valueOf(alphabet.charAt(spalte));
			
			alphaZellen.add(temp.concat(Integer.toString(zeile)));
			x++;
			System.out.println(" Koordinaten " + x + " = " + alphaZellen.get(x-1));
		}
		return alphaZellen;
	}
}
