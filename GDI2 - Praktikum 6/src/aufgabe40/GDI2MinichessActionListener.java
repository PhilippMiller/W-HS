package aufgabe40;
import java.awt.event.*;

public class GDI2MinichessActionListener implements ActionListener
{
	//  Der ActionListener soll die GUI kennen, um Aktionen auf
	//  der GUI vornehmen zu k�nnen! 
	
	GDI2MinichessGUI gui;
	
	//  Im Konstruktur wird die Referenz auf die GUI mitgegeben
	
	public GDI2MinichessActionListener(GDI2MinichessGUI gui) 
	{
		this.gui = gui;
	}

	//  Methode zur Reaktion auf Dr�cken eines Buttons
	public void actionPerformed(ActionEvent event) 
	{
		GDI2MinichessButton button = (GDI2MinichessButton)(event.getSource());
		GDI2MinichessPosition pos = new GDI2MinichessPosition(button.getRow(), button.getCol());
		this.gui.getController().buttonPressedEvent(pos);
	}
}
