import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.SimpleFormatter;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class ChallengeBMI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldSize;
	private JTextField textFieldWeight;
	protected JTextField textFieldBMI;
	protected JTextField textFieldFettheit;
	protected JRadioButton rdbtnMnnlich;
	protected JRadioButton rdbtnWeiblich;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChallengeBMI frame = new ChallengeBMI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected static JFrame frame;

	/**
	 * Create the frame.
	 */
	public ChallengeBMI() {
		setTitle("BMI Rechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		frame = this;
		
		JLabel lblBmiRechner = new JLabel("BMI Rechner");
		lblBmiRechner.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblBmiRechner, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblGeschlecht = new JLabel("Geschlecht:");
		panel_1.add(lblGeschlecht);
		
		ButtonGroup buttonGrp = new ButtonGroup();
		
		rdbtnMnnlich = new JRadioButton("M\u00E4nnlich");
		rdbtnMnnlich.setSelected(true);
		panel_1.add(rdbtnMnnlich);
		
		rdbtnWeiblich = new JRadioButton("Weiblich");
		panel_1.add(rdbtnWeiblich);
		
		buttonGrp.add(rdbtnMnnlich);
		buttonGrp.add(rdbtnWeiblich);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JLabel lblGreInCm = new JLabel("Gr\u00F6\u00DFe in cm:");
		lblGreInCm.setBounds(10, 40, 113, 14);
		panel_2.add(lblGreInCm);
		
		textFieldSize = new JTextField();
		textFieldSize.setBounds(133, 37, 131, 20);
		panel_2.add(textFieldSize);
		textFieldSize.setColumns(10);
		
		JLabel lblGewichtInKg = new JLabel("Gewicht in kg:");
		lblGewichtInKg.setBounds(10, 68, 113, 14);
		panel_2.add(lblGewichtInKg);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setBounds(133, 65, 131, 20);
		panel_2.add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JLabel lblIhrBmiLiegt = new JLabel("Ihr BMI liegt bei:");
		lblIhrBmiLiegt.setBounds(10, 127, 113, 14);
		panel_2.add(lblIhrBmiLiegt);
		
		textFieldBMI = new JTextField();
		textFieldBMI.setBackground(UIManager.getColor("Button.disabledShadow"));
		textFieldBMI.setEditable(false);
		textFieldBMI.setBounds(133, 124, 131, 20);
		panel_2.add(textFieldBMI);
		textFieldBMI.setColumns(10);
		
		JLabel lblIhreKategorie = new JLabel("Ihre Kategorie:");
		lblIhreKategorie.setBounds(10, 152, 113, 14);
		panel_2.add(lblIhreKategorie);
		
		textFieldFettheit = new JTextField();
		textFieldFettheit.setBackground(UIManager.getColor("Button.disabledShadow"));
		textFieldFettheit.setEditable(false);
		textFieldFettheit.setBounds(133, 149, 131, 20);
		panel_2.add(textFieldFettheit);
		textFieldFettheit.setColumns(10);
		panel_2.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblGreInCm, textFieldSize, lblGewichtInKg, textFieldWeight}));
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_1, lblGeschlecht, rdbtnMnnlich, rdbtnWeiblich, panel_2, lblGreInCm, textFieldSize, lblGewichtInKg, textFieldWeight}));
		
		JButton btnBerechnen = new JButton("BMI berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldBMI.setText("");
				textFieldFettheit.setText("");
				textFieldFettheit.setBackground(new Color(255, 255, 255));
				
				if (!textFieldSize.getText().equals("") && !textFieldWeight.getText().equals("")) {
					try {
					int size = Integer.parseInt(textFieldSize.getText());
					int weight = Integer.parseInt(textFieldWeight.getText());
					
					if (size < 0 || weight < 0)
						throw new Exception();	
					
					System.out.println(size);
					System.out.println(weight);
					rechner(size, weight);
					
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(frame, "Bitte nur Zahlen eingeben!", "Error", JOptionPane.ERROR_MESSAGE);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(frame, "Bitte nur positive Werte eingeben!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(frame, "Bitte Werte angeben!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		contentPane.add(btnBerechnen, BorderLayout.SOUTH);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblBmiRechner, panel, panel_1, lblGeschlecht, rdbtnMnnlich, rdbtnWeiblich, panel_2, lblGreInCm, textFieldSize, lblGewichtInKg, textFieldWeight, btnBerechnen}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblBmiRechner, panel, panel_1, lblGeschlecht, rdbtnMnnlich, rdbtnWeiblich, panel_2, lblGreInCm, textFieldSize, lblGewichtInKg, textFieldWeight, btnBerechnen}));
	}

	private void rechner(int size, int weight) {
		float sizeInMeter = size / 100.0f;
		float bmi = weight / (sizeInMeter * sizeInMeter);
		if (rdbtnMnnlich.isSelected()) {
			if (bmi < 20) {
				insertBMI(bmi, "Untergewicht");
			} else if (bmi < 25) {
				insertBMI(bmi, "Normalgewicht");
			} else if (bmi < 30) {
				insertBMI(bmi, "Übergewicht");
			} else if (bmi < 35) {
				insertBMI(bmi, "Starkes Übergewicht (Adipositas Grad I)");
			} else if (bmi < 40) {
				insertBMI(bmi, "Adipositas Grad II");
			} else {
				insertBMI(bmi, "Adipositas Grad III");
			}
		} else {
			if (bmi < 19) {
				insertBMI(bmi, "Untergewicht");
			} else if (bmi < 24) {
				insertBMI(bmi, "Normalgewicht");
			} else if (bmi < 30) {
				insertBMI(bmi, "Übergewicht");
			} else if (bmi < 35) {
				insertBMI(bmi, "Starkes Übergewicht (Adipositas Grad I)");
			} else if (bmi < 40) {
				insertBMI(bmi, "Adipositas Grad II");
			} else {
				insertBMI(bmi, "Adipositas Grad III");
			}
		}
	}
	
	private void insertBMI(float bmi, String kategorie) {
		DecimalFormat df = new DecimalFormat("#0.00");
		textFieldBMI.setText(df.format(bmi));
		textFieldFettheit.setText(kategorie);
		
		switch(kategorie) {
		case "Untergewicht":
			textFieldFettheit.setBackground(Color.CYAN);
			break;
		case "Normalgewicht":
			textFieldFettheit.setBackground(Color.GREEN);
			break;
		case "Übergewicht":
			textFieldFettheit.setBackground(Color.YELLOW);
			break;
		case "Starkes Übergewicht (Adipositas Grad I)":
			textFieldFettheit.setBackground(Color.YELLOW);
			break;
		case "Adipositas Grad II":
			textFieldFettheit.setBackground(Color.PINK);
			break;
		case "Adipositas Grad III":
			textFieldFettheit.setBackground(Color.RED);
			break;
		}
	}
}
