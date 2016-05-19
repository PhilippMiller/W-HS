package aufgabe40;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public StartFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblBitteTreffenSie = new JLabel("Bitte treffen Sie Ihre Wahl - Wie wollen Sie spielen?");
		lblBitteTreffenSie.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBitteTreffenSie.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblBitteTreffenSie, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("White Player vs. Black Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new GDI2MinichessController(new GDI2MinichessGUI(), true, true);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("White Player vs. Black NPC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GDI2MinichessController(new GDI2MinichessGUI(), true, false);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("White NPC vs. Black Player");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GDI2MinichessController(new GDI2MinichessGUI(), false, true);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("White NPC vs. Black NPC");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GDI2MinichessController(new GDI2MinichessGUI(), false, false);
			}
		});
		panel.add(btnNewButton_3);
	}
}
