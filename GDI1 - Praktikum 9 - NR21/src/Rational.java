import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Rational {

	private double p;
	private double q;
	private double ergebnisP;
	private double ergebnisQ;
	private boolean minus = false;

	public Rational(double p, double q) {
		this.setP(p);
		this.setQ(q);
	}

	public Rational(double p, double q, boolean minus) {
		this(p, q);
		this.setMinus(minus);
	}

	private int ggT(int zahl1, int zahl2) {
		int rest = 0;
		int grosseZahl;
		int kleinereZahl;

		if (zahl1 >= zahl2) {
			grosseZahl = zahl1;
			kleinereZahl = zahl2;
		} else {
			grosseZahl = zahl2;
			kleinereZahl = zahl1;
		}

		while (kleinereZahl != 0) {
			rest = grosseZahl % kleinereZahl;
			grosseZahl = kleinereZahl;
			kleinereZahl = rest;
		}

		return grosseZahl;
	}

	private Rational umrechnung(double ergebnis) {

		boolean minus = false;

		String ergebnisText = Double.toString(ergebnis);
		String ergebnisTextNachKomma = ergebnisText.substring(ergebnisText.indexOf(".") + 1);
		int ergebnisTextLaenge = ergebnisTextNachKomma.length();

		int nenner = (int) Main.potenzen(10, ergebnisTextLaenge);

		double zaehler = ergebnis * nenner;
		if (zaehler < 0) {
			zaehler = Math.abs(zaehler);
			minus = true;
		}

		int teiler = ggT((int) zaehler, nenner);

		zaehler = zaehler / teiler;
		nenner = nenner / teiler;

		setErgebnisP(zaehler);
		setErgebnisQ(nenner);
		return new Rational(ergebnisP, ergebnisQ, minus);
	}

	// (Addition, Subtraktion, Multiplikation und Division)

	// ADD
	public Rational add(Rational zweiteZahl) {

		double ergebnis;
		ergebnis = (getP() / getQ()) + (zweiteZahl.getP() / zweiteZahl.getQ());

		return umrechnung(ergebnis);
	}

	// SUB
	public Rational sub(Rational zweiteZahl) {

		double ergebnis;
		ergebnis = (getP() / getQ()) - (zweiteZahl.getP() / zweiteZahl.getQ());

		return umrechnung(ergebnis);
	}

	// MULTI
	public Rational multi(Rational zweiteZahl) {
  
		double ergebnis;
		ergebnis = (getP() / getQ()) * (zweiteZahl.getP() / zweiteZahl.getQ());

		return umrechnung(ergebnis);
	}

	// DIV
	public Rational div(Rational zweiteZahl) {
 
		double ergebnis;
		ergebnis = (getP() / getQ()) * (zweiteZahl.getQ() / zweiteZahl.getP());

		return umrechnung(ergebnis);
	}

	// PRINT
	public void print() {
		if (minus)
			System.out.println("-(" + (int) getP() + "/" + (int) getQ() + ")");
		else
			System.out.println((int) getP() + "/" + (int) getQ());
	}

	// GETTERS und SETTERS
	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

	public double getQ() {
		return q;
	}

	public void setQ(double q) {
		this.q = q;
	}

	public double getErgebnisP() {
		return ergebnisP;
	}

	public void setErgebnisP(double ergebnisP) {
		this.ergebnisP = ergebnisP;
	}

	public double getErgebnisQ() {
		return ergebnisQ;
	}

	public void setErgebnisQ(double ergebnisQ) {
		this.ergebnisQ = ergebnisQ;
	}

	public boolean isMinus() {
		return minus;
	}

	public void setMinus(boolean minus) {
		this.minus = minus;
	}

}