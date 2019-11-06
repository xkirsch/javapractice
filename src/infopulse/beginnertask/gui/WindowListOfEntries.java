package infopulse.beginnertask.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowListOfEntries {

	private JFrame frame;
	private JTextField ModelNameTextField;
	private JTextField SpeedTextField;
	private JTextField YearOfManufactureTextField;
	private JLabel lblAddNewVehicle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowListOfEntries window = new WindowListOfEntries();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowListOfEntries() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Model name");
		lblNewLabel.setBounds(108, 78, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		ModelNameTextField = new JTextField();
		ModelNameTextField.setBounds(261, 75, 86, 20);
		frame.getContentPane().add(ModelNameTextField);
		ModelNameTextField.setColumns(10);
		
		JLabel lblSpeed = new JLabel("Year of manufacture");
		lblSpeed.setBounds(108, 144, 132, 14);
		frame.getContentPane().add(lblSpeed);
		
		SpeedTextField = new JTextField();
		SpeedTextField.setColumns(10);
		SpeedTextField.setBounds(261, 106, 86, 20);
		frame.getContentPane().add(SpeedTextField);
		
		JLabel label = new JLabel("Speed");
		label.setBounds(108, 109, 46, 14);
		frame.getContentPane().add(label);
		
		YearOfManufactureTextField = new JTextField();
		YearOfManufactureTextField.setColumns(10);
		YearOfManufactureTextField.setBounds(261, 141, 86, 20);
		frame.getContentPane().add(YearOfManufactureTextField);
		
		lblAddNewVehicle = new JLabel("Add new vehicle");
		lblAddNewVehicle.setBounds(163, 36, 111, 14);
		frame.getContentPane().add(lblAddNewVehicle);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirm.setBounds(163, 193, 89, 23);
		frame.getContentPane().add(btnConfirm);
	}
}
