package aufgabe40;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GDI2MinichessKeyListener implements KeyListener 
{
	//  Der ActionListener soll die GUI kennen, um Aktionen auf
	//  der GUI vornehmen zu können! 
	
	GDI2MinichessGUI gui;
	
	//  Im Konstruktur wird die Referenz auf die GUI mitgegeben
	
	public GDI2MinichessKeyListener(GDI2MinichessGUI gui)
	{
		this.gui = gui;
	}
	
	//  Methode zur Reaktion auf Drücken einer Taste
	
	public void keyPressed(KeyEvent event) 
	{
		if (event.getKeyCode() == 27)
		{
			this.gui.getController().escKeyPressedEvent();
		}
	}
	
	public void keyReleased(KeyEvent e) 
	{
		// TODO Auto-generated method stub
	}

	public void keyTyped(KeyEvent e) 
	{
		// TODO Auto-generated method stub
	}

}
