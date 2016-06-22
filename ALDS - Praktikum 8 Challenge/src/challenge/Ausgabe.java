package challenge;

import javax.swing.*;
import java.awt.*;

public class Ausgabe
{
    private JFrame      fr_Ausgabe;
    private JScrollPane sp_Ausgabe;
    private JTextArea   ta_Ausgabe;

    public Ausgabe(int breite, int hoehe, String titel)
    {
        // Frame erstellen
        this.fr_Ausgabe=new JFrame();
        fr_Ausgabe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fr_Ausgabe.setTitle(titel);
        fr_Ausgabe.setSize(breite, hoehe);
        fr_Ausgabe.setLocationRelativeTo(null);

        // Komponenten erstellen
        this.ta_Ausgabe=new JTextArea();
        ta_Ausgabe.setEditable(false);
        ta_Ausgabe.setFont(new Font("Monospaced", Font.PLAIN, 12));
        this.sp_Ausgabe=new JScrollPane(ta_Ausgabe);

        // Komponenten im Frame platzieren
        fr_Ausgabe.add(sp_Ausgabe, BorderLayout.CENTER);

        fr_Ausgabe.setVisible(true);
    }

    // Ausgabe im Textfeld
    public void meineAusgabe(String text)
    {
        ta_Ausgabe.setText(text);
        ta_Ausgabe.setCaretPosition(0);
    }
}
