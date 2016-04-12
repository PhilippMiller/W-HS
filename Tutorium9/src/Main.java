import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		int breite = 20;
		int tiefe = 30;
		double dieGrosseSchachtel =  43.7901185;
		
		double innereSchachteln = 0;
		double volumen = 0;
		
		double optimaleKante_X = 0;
		double optimalesVolumen = 0;
		
		for (double i = 0.000001; i < (breite / 2 - 0.000001); i += 0.000001) {
			volumen = (breite - 2 * i) * (tiefe - 2 * i) * i;
			
			if ( innereSchachteln < volumen / dieGrosseSchachtel) {
				innereSchachteln = volumen / dieGrosseSchachtel;
				optimaleKante_X = i;
				optimalesVolumen = volumen;
			}
		}
		
		DecimalFormat d = new DecimalFormat("#.##");
		
		System.out.println("Welchen Wert hat die optimale Kantenlänge x?\n" + d.format(optimaleKante_X) + " cm");
        System.out.println("Welches Volumen hat dann die große Schachtel?\n" + d.format(optimalesVolumen) + " cm³");
        System.out.println("Wie viele kleine Schachteln passen in die große Schachtel?\n" + (int)innereSchachteln + " Schachteln");
		

	}

}
