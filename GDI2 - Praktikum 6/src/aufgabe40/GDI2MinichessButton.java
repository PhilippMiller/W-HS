package aufgabe40;
import javax.swing.*;

@SuppressWarnings("serial")
public class GDI2MinichessButton extends JButton 
{
	//  Jeder Button weiss, an welcher Position (col, row) auf 
	//  dem Spielfeld er sich befindet
	private int row;
	private int col;
	
	//  Konstruktor mit Übergabe der Position des Buttons
	
	public GDI2MinichessButton(int row, int col)
	{
		this.row = row;
		this.col = col;
	}

	//  Getter und Setter:
	
	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}
}
