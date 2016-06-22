package challenge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Listener f�r die Buttons

public class URLListener implements ActionListener
{
	private EingabeGUI	url;
	
	public URLListener ( EingabeGUI url )
	{
		this.url=url;
	}
	
	public void actionPerformed (ActionEvent event)
	{		
		switch (event.getActionCommand())
		{
			case "AUSF�HREN":
			    url.getFr_URL().dispose();
			    String website = url.getTf_URL().getText();
			    String quelltext = Funktionen.quelltextAuslesen (website);
			    System.out.println(quelltext);	
			    Funktionen.hyperlinksSuchen(quelltext);
			    break;
			case "ZUR�CKSETZEN":
				this.url.getTf_URL().setText(null);
		}
	}	
}