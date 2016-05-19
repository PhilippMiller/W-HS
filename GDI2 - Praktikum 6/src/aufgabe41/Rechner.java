package aufgabe41;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;

public class Rechner extends JFrame {

	
	private JPanel contentPane;
	private JTextField number1;
	private JTextField number2;
	private JTextField ergebnis;
	protected Frame frame;
	/**
	 * Create the frame.
	 */
	public Rechner() {
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 385);
		
		frame = this;
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmClose);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mntmInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Made by Philipp Miller", "Information", JOptionPane.OK_OPTION);
			}
		});
		mnHelp.add(mntmInfo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTaschenrechner = new JLabel("Taschenrechner");
		lblTaschenrechner.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTaschenrechner, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblZahl = new JLabel("Zahl 1:");
		lblZahl.setBounds(33, 30, 46, 14);
		panel.add(lblZahl);
		
		JLabel lblZahl_1 = new JLabel("Zahl 2:");
		lblZahl_1.setBounds(33, 55, 46, 14);
		panel.add(lblZahl_1);
		
		number1 = new JTextField();
		number1.setBounds(89, 27, 143, 20);
		panel.add(number1);
		number1.setColumns(10);
		
		number2 = new JTextField();
		number2.setBounds(89, 52, 143, 20);
		panel.add(number2);
		number2.setColumns(10);
		
		JLabel lblErgebnis = new JLabel("Ergebnis:");
		lblErgebnis.setBounds(33, 139, 64, 14);
		panel.add(lblErgebnis);
		
		ergebnis = new JTextField();
		ergebnis.setEditable(false);
		ergebnis.setBounds(122, 136, 110, 20);
		panel.add(ergebnis);
		ergebnis.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (number1.getText().equals(""))
						number1.setText("0");
					if (number2.getText().equals(""))
						number2.setText("0");
					
					double nummer1 = Double.parseDouble(number1.getText());
					double nummer2 = Double.parseDouble(number2.getText());
					
					double solution = nummer1 + nummer2;
					DecimalFormat df = new DecimalFormat("#0.0000");
					ergebnis.setText(df.format(solution));
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Bitte nur Zahlen angeben...", "Error", JOptionPane.OK_OPTION);
				}
			}
		});
		button.setBounds(25, 195, 50, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (number1.getText().equals(""))
						number1.setText("0");
					if (number2.getText().equals(""))
						number2.setText("0");
					
					double nummer1 = Double.parseDouble(number1.getText());
					double nummer2 = Double.parseDouble(number2.getText());
					
					double solution = nummer1 - nummer2;
					DecimalFormat df = new DecimalFormat("#0.0000");
					ergebnis.setText(df.format(solution));
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Bitte nur Zahlen angeben...", "Error", JOptionPane.OK_OPTION);
				}
			}
		});
		button_1.setBounds(85, 195, 50, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (number1.getText().equals(""))
						number1.setText("0");
					if (number2.getText().equals(""))
						number2.setText("0");
					
					double nummer1 = Double.parseDouble(number1.getText());
					double nummer2 = Double.parseDouble(number2.getText());
					
					double solution = nummer1 * nummer2;
					DecimalFormat df = new DecimalFormat("#0.0000");
					ergebnis.setText(df.format(solution));
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Bitte nur Zahlen angeben...", "Error", JOptionPane.OK_OPTION);
				}
			}
		});
		button_2.setBounds(145, 195, 50, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (number1.getText().equals(""))
						number1.setText("0");
					if (number2.getText().equals(""))
						number2.setText("0");
					
					double nummer1 = Double.parseDouble(number1.getText());
					double nummer2 = Double.parseDouble(number2.getText());
					
					if (nummer2 != 0) {
						double solution = nummer1 / nummer2;
						DecimalFormat df = new DecimalFormat("#0.0000");
						ergebnis.setText(df.format(solution));
					} else {
						number2.setText("");
						JOptionPane.showMessageDialog(frame, "Teilen durch 0 nicht möglich!", "Error", JOptionPane.OK_OPTION);
					}
					
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Bitte nur Zahlen angeben...", "Error", JOptionPane.OK_OPTION);
				}
			}
		});
		button_3.setBounds(205, 195, 50, 23);
		panel.add(button_3);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1.setText("");
				number2.setText("");
				ergebnis.setText("");
			}
		});
		btnNewButton.setBounds(85, 250, 110, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblTaschenrechner, panel, lblZahl, lblZahl_1, number1, number2, lblErgebnis, button, button_1, button_2, button_3, btnNewButton, panel_1, ergebnis}));
	}
}
