package aufgabe40;
import java.awt.event.*;

public class GDI2MinichessActionListener implements ActionListener
{
	//  Der ActionListener soll die GUI kennen, um Aktionen auf
	//  der GUI vornehmen zu können! 
	
	GDI2MinichessGUI gui;
	
	//  Im Konstruktur wird die Referenz auf die GUI mitgegeben
	
	public GDI2MinichessActionListener(GDI2MinichessGUI gui) 
	{
		this.gui = gui;
	}

	//  Methode zur Reaktion auf Drücken eines Buttons
	public void actionPerformed(ActionEvent event) 
	{
		GDI2MinichessButton button = (GDI2MinichessButton)(event.getSource());
		GDI2MinichessPosition pos = new GDI2MinichessPosition(button.getRow(), button.getCol());
		this.gui.getController().buttonPressedEvent(pos);
	}
}
