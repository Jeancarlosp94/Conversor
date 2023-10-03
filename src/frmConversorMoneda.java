import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConversorMoneda extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidadCambiar;
	private JTextField textField_1;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConversorMoneda frame = new frmConversorMoneda();
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
	public frmConversorMoneda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidadCambiar = new JTextField();
		txtCantidadCambiar.setBounds(44, 44, 239, 28);
		txtCantidadCambiar.setColumns(10);
		contentPane.add(txtCantidadCambiar);
		
		JComboBox cmbDivisaB = new JComboBox();
		cmbDivisaB.setModel(new DefaultComboBoxModel(new String[] {"USD Dólares", "€ Euro", "£ Libras esterlinas", "¥ Yen japones", "₩ Won surcoreano"}));
		cmbDivisaB.setBounds(327, 178, 60, 28);
		contentPane.add(cmbDivisaB);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(327, 112, 60, 23);
		textField_1.setText("to ");
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		txtResult = new JTextField();
		txtResult.setBounds(44, 178, 239, 28);
		txtResult.setEditable(false);
		txtResult.setColumns(10);
		contentPane.add(txtResult);
		
		JComboBox cmbDivisaA = new JComboBox();
		cmbDivisaA.setModel(new DefaultComboBoxModel(new String[] {"USD Dólares", "€ Euro", "£ Libras esterlinas", "¥ Yen japones", "₩ Won surcoreano"}));
		cmbDivisaA.setBounds(327, 47, 60, 22);
		contentPane.add(cmbDivisaA);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cantidad = Double.parseDouble(txtCantidadCambiar.getText());
				switch(cmbDivisaA.getSelectedIndex()) {
				case 0:
					switch(cmbDivisaB.getSelectedIndex()){
					case 0:
						cantidad = cantidad * 1 ;
						String result = String.valueOf(cantidad);
						txtResult.setText(result);
						break;
					
					case 1:	
						cantidad = cantidad * 0.94965 ;
						String result2 = String.valueOf(cantidad);
						txtResult.setText(result2);
						break;
					
					case 2:	
						cantidad = cantidad * 0.823 ;
						String result3 = String.valueOf(cantidad);
						txtResult.setText(result3);
						break;
						
					case 3:	
						cantidad = cantidad * 149.749 ;
						String result4 = String.valueOf(cantidad);
						txtResult.setText(result4);
						break;	
						
					case 4:	
						cantidad = cantidad * 1354.11 ;
						String result5 = String.valueOf(cantidad);
						txtResult.setText(result5);
						break;		
					}break;
					
				case 1:
					switch(cmbDivisaB.getSelectedIndex()){
					case 0:
						cantidad = cantidad * 1.05286 ;
						String result = String.valueOf(cantidad);
						txtResult.setText(result);
						break;
					
					case 1:	
						cantidad = cantidad *  1 ;
						String result2 = String.valueOf(cantidad);
						txtResult.setText(result2);
						break;
					
					case 2:	
						cantidad = cantidad * 0.86656 ;
						String result3 = String.valueOf(cantidad);
						txtResult.setText(result3);
						break;
						
					case 3:	
						cantidad = cantidad * 157.675 ;
						String result4 = String.valueOf(cantidad);
						txtResult.setText(result4);
						break;	
						
					case 4:	
						cantidad = cantidad * 1425.69 ;
						String result5 = String.valueOf(cantidad);
						txtResult.setText(result5);
						break;
					}break;
					
				case 2:
					switch(cmbDivisaB.getSelectedIndex()){
					case 0:
					cantidad = cantidad * 1.21488;
					String result = String.valueOf(cantidad);
					txtResult.setText(result);
					break;
				
					case 1:	
					cantidad = cantidad * 1.15378 ;
					String result2 = String.valueOf(cantidad);
					txtResult.setText(result2);
					break;
				
					case 2:	
					cantidad = cantidad * 1 ;
					String result3 = String.valueOf(cantidad);
					txtResult.setText(result3);
					break;
					
					case 3:	
					cantidad = cantidad * 181.935 ;
					String result4 = String.valueOf(cantidad);
					txtResult.setText(result4);
					break;	
					
					case 4:	
					cantidad = cantidad * 1645.08 ;
					String result5 = String.valueOf(cantidad);
					txtResult.setText(result5);
					break;
				}break;
				
				case 3:
					switch(cmbDivisaB.getSelectedIndex()){
					case 0:
					cantidad = cantidad * 0.00668 ;
					String result = String.valueOf(cantidad);
					txtResult.setText(result);
					break;
				
					case 1:	
					cantidad = cantidad * 0.00634 ;
					String result2 = String.valueOf(cantidad);
					txtResult.setText(result2);
					break;
				
					case 2:	
					cantidad = cantidad * 0.0055 ;
					String result3 = String.valueOf(cantidad);
					txtResult.setText(result3);
					break;
					
					case 3:	
					cantidad = cantidad * 1 ;
					String result4 = String.valueOf(cantidad);
					txtResult.setText(result4);
					break;	
					
					case 4:	
					cantidad = cantidad * 9.04145 ;
					String result5 = String.valueOf(cantidad);
					txtResult.setText(result5);
					break;
				}break;
				
				case 4:
					switch(cmbDivisaB.getSelectedIndex()){
					case 0:
					cantidad = cantidad * 0.00074 ;
					String result = String.valueOf(cantidad);
					txtResult.setText(result);
					break;
				
					case 1:	
					cantidad = cantidad * 0.0007 ;
					String result2 = String.valueOf(cantidad);
					txtResult.setText(result2);
					break;
				
					case 2:	
					cantidad = cantidad * 0.00061 ;
					String result3 = String.valueOf(cantidad);
					txtResult.setText(result3);
					break;
					
					case 3:	
					cantidad = cantidad * 0.11045 ;
					String result4 = String.valueOf(cantidad);
					txtResult.setText(result4);
					break;	
					
					case 4:	
					cantidad = cantidad * 1 ;
					String result5 = String.valueOf(cantidad);
					txtResult.setText(result5);
					break;
				}break;
				}
			}
		});
		btnConvertir.setBounds(100, 112, 126, 24);
		contentPane.add(btnConvertir);
}
}
