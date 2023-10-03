import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConversorMedidas extends JFrame {

	private JPanel contentPane;
	private JTextField txtDistanciaA;
	private JTextField txtDistanciaB;
	private JTextField txtTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConversorMedidas frame = new frmConversorMedidas();
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
	public frmConversorMedidas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDistanciaA = new JTextField();
		txtDistanciaA.addKeyListener(new KeyAdapter() {
		
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

			    boolean numeros = key >= 48 && key <= 57;
			        
			    if (!numeros)
			    {
			        e.consume();
			    }

			    if (txtDistanciaA.getText().trim().length() == 10) {
			        e.consume();
			    }
			}
		});
		txtDistanciaA.setBounds(21, 51, 262, 31);
		contentPane.add(txtDistanciaA);
		txtDistanciaA.setColumns(10);
		
		JComboBox cmbDistanciaA = new JComboBox();
		cmbDistanciaA.setModel(new DefaultComboBoxModel(new String[] {"km", "mts", "millas"}));
		cmbDistanciaA.setBounds(293, 52, 51, 28);
		contentPane.add(cmbDistanciaA);
		
		JComboBox cmbDistanciaB = new JComboBox();
		cmbDistanciaB.setModel(new DefaultComboBoxModel(new String[] {"km", "mts", "millas"}));
		cmbDistanciaB.setBounds(293, 150, 51, 28);
		contentPane.add(cmbDistanciaB);
		
		txtDistanciaB = new JTextField();
		txtDistanciaB.setEditable(false);
		txtDistanciaB.setBounds(21, 149, 262, 31);
		contentPane.add(txtDistanciaB);
		txtDistanciaB.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double distancia = Double.parseDouble(txtDistanciaA.getText());
				switch(cmbDistanciaA.getSelectedIndex()) {
				case 0:
					switch(cmbDistanciaB.getSelectedIndex()){
					case 0:
						distancia = distancia * 1 ;
						String result = String.valueOf(distancia);
						txtDistanciaB.setText(result);
						break;
					
					case 1:	
						distancia = distancia * 1000 ;
						String result2 = String.valueOf(distancia);
						txtDistanciaB.setText(result2);
						break;
					
					case 2:	
						distancia = distancia / 1.609 ;
						String result3 = String.valueOf(distancia);
						txtDistanciaB.setText(result3);
						break;
					}break;
					
				case 1:
					switch(cmbDistanciaB.getSelectedIndex()){
					case 0:
						distancia = distancia / 1000 ;
						String result = String.valueOf(distancia);
						txtDistanciaB.setText(result);
						break;
					case 1:	
						distancia = distancia * 1 ;
						String result2 = String.valueOf(distancia);
						txtDistanciaB.setText(result2);
						break;
					case 2:	
						distancia = distancia * 0.000621371 ;
						String result3 = String.valueOf(distancia);
						txtDistanciaB.setText(result3);
						break;
					}break;
				case 2:
					switch(cmbDistanciaB.getSelectedIndex()){
					case 0:
						distancia = distancia * 1.609 ;
						String result = String.valueOf(distancia);
						txtDistanciaB.setText(result);
						break;
					case 1:	
						distancia = distancia * 1609.34 ;
						String result2 = String.valueOf(distancia);
						txtDistanciaB.setText(result2);
						break;
					case 2:	
						distancia = distancia / 1 ;
						String result3 = String.valueOf(distancia);
						txtDistanciaB.setText(result3);
						break;
					}break;
					}
				
			}			
		});
		btnConvertir.setBounds(111, 103, 89, 23);
		contentPane.add(btnConvertir);
		
		txtTo = new JTextField();
		txtTo.setEditable(false);
		txtTo.setText("to ");
		txtTo.setBounds(293, 104, 51, 21);
		contentPane.add(txtTo);
		txtTo.setColumns(10);
		
	
	}
}
