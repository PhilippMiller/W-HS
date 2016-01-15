
public class Windgeschwindigkeit {

	private int kmh;
	private float knoten;
	private int beaufortskala;
	private boolean windstill;
	private boolean orkan;

	public Windgeschwindigkeit(int kmh) {
		this.kmh = kmh;
		knoten = berechneKnoten(kmh);
		beaufortskala = berechneBeaufortskala(kmh);
		erkenneWindAufkommen(kmh);

	}

	private float berechneKnoten(int kmh) {
		return kmh / 1.852f;
	}

	private int berechneBeaufortskala(int kmh) {
		double b = Math.pow((kmh/3.01), 1/1.5);

		if (b >= 12) {
			return 12;
		} else {
			return (int)Math.round(b);
		}
	}

	private void erkenneWindAufkommen(int kmh) {
		if (kmh <= 2) {
			windstill = true;
			orkan = false;
		} else if (kmh >= 120) {
			windstill = false;
			orkan = true;
		} else {
			windstill = false;
			orkan = false;
		}
		
	}
	
	public void printData(){
		System.out.println("Die Windgeschwindigkeit in KM pro Stunde ist: " + kmh);
		System.out.println("Die Windgeschwindigkeit in Seemeilen pro Stunde ist: " + knoten);
		System.out.println("Die Windgeschwindigkeit in Beaufort ist: " + beaufortskala);
		System.out.println("Eine Windgeschwindigkeit von " + kmh + " km / h gilt als Windstill: "+windstill);
		System.out.println("Eine Windgeschwindigkeit von " + kmh + " km / h gilt als Orkan: "+orkan);
		System.out.println();
	}

}
