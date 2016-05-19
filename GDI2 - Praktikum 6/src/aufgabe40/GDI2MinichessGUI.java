package aufgabe40;
import java.awt.*;
import java.util.List;
import javax.swing.*;

public class GDI2MinichessGUI 
{
	private JFrame board;       //  Gesamtfenster 
	private JPanel panel;       //  Spielbrett
	private JLabel label;       //  Überschrift
	
	private JButton[][] field;
	
	private Icon whitePawnIcon = new ImageIcon("./bilder/whiteganzklein.png");
	private Icon blackPawnIcon = new ImageIcon("./bilder/blackganzklein.png");

	private GDI2MinichessController controller = null;;

	public GDI2MinichessGUI()
	{
		this.board = new JFrame("Minichess - the ultimate board game");
		this.board.setSize(800,800);
		
		this.board.setLayout(new BorderLayout());
		
		//  Überschrift
		
		this.label = new JLabel("So sieht das Spielfeld aktuell aus:");
		this.label.setFont(new Font(Font.SANS_SERIF,Font.BOLD,28));
		this.label.setHorizontalAlignment(SwingConstants.CENTER);
		this.board.add(this.label,BorderLayout.NORTH);
		
		//  Spielbrett
		
		this.panel = new JPanel();
		this.panel.setLayout(new GridLayout(4,4,5,5));
		this.field = new JButton[4][4];
		for(int row=0; row<4; row++)
		{
			for(int col=0; col<4; col++)
			{
				JButton button = new GDI2MinichessButton(row,col);
				if ((row+col) % 2 == 0)
					button.setBackground(Color.GRAY);
				else
					button.setBackground(Color.LIGHT_GRAY);
				this.field[row][col] = button;
				this.panel.add(button);
			}
		}
		this.board.add(this.panel,BorderLayout.CENTER);
		
		//  Spielfiguren
		
		for(int row=0; row<4; row++)
		{
			for(int col=0; col<4; col++)
			{
				if (row == 0)
					this.field[row][col].setIcon(blackPawnIcon);
				if (row == 3)
					this.field[row][col].setIcon(whitePawnIcon);				
			}
		}
		
		//  Listener registrieren
		
		GDI2MinichessActionListener actionListener = new GDI2MinichessActionListener(this);
		GDI2MinichessKeyListener keyListener = new GDI2MinichessKeyListener(this);

		for(int row=0; row<4; row++)
		{
			for(int col=0; col<4; col++)
			{
				this.field[row][col].addActionListener(actionListener);
				this.field[row][col].addKeyListener(keyListener);
			}
		}
		
		//  GUI anzeigen
		
		this.board.setVisible(true);
	}

	public void showSituation(GDI2MinichessSituation situation) 
	{
		for(int row=0; row<4; row++)
			for(int col=0; col<4; col++)
				if (situation.board[row][col] == 'W')
					this.field[row][col].setIcon(getWhitePawnIcon());
				else if (situation.board[row][col] == 'B')
					this.field[row][col].setIcon(getBlackPawnIcon());
				else
					this.field[row][col].setIcon(null);
	}
	

	public void highlightFromField(GDI2MinichessPosition from) 
	{
		JButton button = this.field[from.getRow()][from.getCol()];  
		button.setBackground(Color.CYAN);
	}

	public void highlightPossibleToFields(List<GDI2MinichessPosition> possibleToFields) 
	{
		for(GDI2MinichessPosition to : possibleToFields)
		{
			JButton button = this.field[to.getRow()][to.getCol()];  
			button.setBackground(Color.PINK);
		}
	}

	public void resetHighlighting() 
	{
		for(int row=0; row<4; row++)
		{
			for(int col=0; col<4; col++)
			{
				JButton button = this.field[row][col];
				if ((col+row) % 2 == 0)
					button.setBackground(Color.GRAY);
				else
					button.setBackground(Color.LIGHT_GRAY);
			}
		}
	}
	
	//  Getter und Setter:
	
	public JFrame getBoard() {
		return board;
	}

	public void setBoard(JFrame board) {
		this.board = board;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JButton[][] getField() {
		return field;
	}

	public void setField(JButton[][] field) {
		this.field = field;
	}

	public Icon getWhitePawnIcon() {
		return whitePawnIcon;
	}

	public void setWhitePawnIcon(Icon whitePawnIcon) {
		this.whitePawnIcon = whitePawnIcon;
	}

	public Icon getBlackPawnIcon() {
		return blackPawnIcon;
	}

	public void setBlackPawnIcon(Icon blackPawnIcon) {
		this.blackPawnIcon = blackPawnIcon;
	}

	public void setController(GDI2MinichessController controller) 
	{
		this.controller = controller;
	}

	public GDI2MinichessController getController() 
	{
		return this.controller;
	}
}
