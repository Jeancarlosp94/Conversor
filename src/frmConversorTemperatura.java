import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConversorTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField txtTemperature;
	private JTextField textField_1;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConversorTemperatura frame = new frmConversorTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmConversorTemperatura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 268);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTemperature = new JTextField();
		txtTemperature.setBounds(73, 50, 232, 31);
		txtTemperature.setColumns(10);
		contentPane.add(txtTemperature);
		
		JComboBox cmbTempA = new JComboBox();
		cmbTempA.setModel(new DefaultComboBoxModel(new String[] {"°C", "°F", "K"}));
		cmbTempA.setBounds(319, 50, 53, 32);
		contentPane.add(cmbTempA);
		
		textField_1 = new JTextField();
		textField_1.setBounds(329, 92, 41, 23);
		textField_1.setText("to ");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
				
		JComboBox cmbTempB = new JComboBox();
		cmbTempB.setModel(new DefaultComboBoxModel(new String[] {"°C", "°F", "K"}));
		cmbTempB.setBounds(319, 146, 53, 31);
		contentPane.add(cmbTempB);
		
		txtResult = new JTextField();
		txtResult.setBounds(73, 147, 232, 30);
		txtResult.setEditable(false);
		txtResult.setColumns(10);
		contentPane.add(txtResult);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(txtTemperature.getText());
				switch(cmbTempA.getSelectedIndex()) {
				case 0:
					switch(cmbTempB.getSelectedIndex()){
					case 0:
						temp = temp * 1 ;
						String result = String.valueOf(temp);
						txtResult.setText(result);
						break;
					
					case 1:	
						temp = (temp * 1.8) + 32 ;
						String result2 = String.valueOf(temp);
						txtResult.setText(result2);
						break;
					
					case 2:	
						temp = temp + 273.15 ;
						String result3 = String.valueOf(temp);
						txtResult.setText(result3);
						break;
					}break;
					
				case 1:
					switch(cmbTempB.getSelectedIndex()){
					case 0:
						temp = (temp - 32) * 0.5555 ;
						String result = String.valueOf(temp);
						txtResult.setText(result);
						break;
					case 1:	
						temp = temp * 1 ;
						String result2 = String.valueOf(temp);
						txtResult.setText(result2);
						break;
					case 2:	
						temp = (temp + 459.67 ) * 0.5555  ;
						String result3 = String.valueOf(temp);
						txtResult.setText(result3);
						break;
					}break;
				case 2:
					switch(cmbTempB.getSelectedIndex()){
					case 0:
						temp = temp - 273.15 ;
						String result = String.valueOf(temp);
						txtResult.setText(result);
						break;
					case 1:	
						temp = ((temp - 273.15)*1.8) + 32;
						String result2 = String.valueOf(temp);
						txtResult.setText(result2);
						break;
					case 2:	
						temp = temp * 1 ;
						String result3 = String.valueOf(temp);
						txtResult.setText(result3);
						break;
					}break;
					}
			}
		});
		btnConvertir.setBounds(130, 103, 135, 23);
		contentPane.add(btnConvertir);
	}

}
