package challenge;

import javax.swing.*;

import java.awt.*;

// GUI um die URL einzugeben

public class EingabeGUI
{
	private JFrame			fr_URL;
	private JPanel			pl_Daten;
	private JLabel			lbl_URL;
	private JTextField	    tf_URL;
	private JButton			btn_Ausfuehren;
	private JButton			btn_Leeren;
	
	public EingabeGUI ()
	{
		this.fr_URL=new JFrame();
		fr_URL.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		fr_URL.setLayout(new BorderLayout());
		
		fr_URL.setSize(420, 150);
		fr_URL.setLocationRelativeTo(null);
		
		this.pl_Daten=new JPanel();
		pl_Daten.setLayout(new GridLayout(2, 2, 10, 10));
		
		// Komponenten erstellen
		
		this.lbl_URL=new JLabel("URL der Website:");
		this.tf_URL=new JTextField();
		
		this.btn_Ausfuehren=new JButton("AUSFÜHREN");
		this.btn_Leeren=new JButton("ZURÜCKSETZEN");
				
		// Komponenten im Panel platzieren
		
		pl_Daten.add(lbl_URL);
		pl_Daten.add(tf_URL);
		pl_Daten.add(btn_Ausfuehren);
		pl_Daten.add(btn_Leeren);
		
		// Panel im Frame platzieren (mit Abstand)
		
		fr_URL.add(new JPanel().add(new JLabel("     ")), BorderLayout.NORTH);
		fr_URL.add(new JPanel().add(new JLabel("     ")), BorderLayout.WEST);
		fr_URL.add(pl_Daten, BorderLayout.CENTER);
		fr_URL.add(new JPanel().add(new JLabel("     ")), BorderLayout.EAST);
		fr_URL.add(new JPanel().add(new JLabel("     ")), BorderLayout.SOUTH);
		
		fr_URL.setVisible(true);
		
		// Aktionen für die Buttons
		
		btn_Ausfuehren.addActionListener(new URLListener(this));;
		btn_Leeren.addActionListener(new URLListener(this));
	}

	public JFrame getFr_URL ()
	{
		return fr_URL;
	}

	public void setFr_URL (JFrame fr_URL)
	{
		this.fr_URL=fr_URL;
	}

	public JPanel getPl_Daten ()
	{
		return pl_Daten;
	}

	public void setPl_Daten (JPanel pl_Daten)
	{
		this.pl_Daten=pl_Daten;
	}

	public JLabel getLbl_URL ()
	{
		return lbl_URL;
	}

	public void setLbl_URL (JLabel lbl_URL)
	{
		this.lbl_URL=lbl_URL;
	}

	public JTextField getTf_URL ()
	{
		return tf_URL;
	}

	public void setTf_URL (JTextField tf_URL)
	{
		this.tf_URL=tf_URL;
	}	

	public JButton getBtn_Ausfuehren ()
	{
		return btn_Ausfuehren;
	}

	public void setBtn_Ausfuehren (JButton btn_Ausfuehren)
	{
		this.btn_Ausfuehren=btn_Ausfuehren;
	}

	public JButton getBtn_Leeren ()
	{
		return btn_Leeren;
	}

	public void setBtn_Leeren (JButton btn_Leeren)
	{
		this.btn_Leeren=btn_Leeren;
	}
}