import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JComboBox cmbMenuPrincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenuPrincipal frame = new frmMenuPrincipal();
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
	public frmMenuPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cmbMenuPrincipal = new JComboBox();
		cmbMenuPrincipal.setBounds(72, 29, 200, 33);
		cmbMenuPrincipal.setModel(new DefaultComboBoxModel(new String[] {"Conversor de moneda", "Conversor de temperatura", "Conversor de unidad de medicion"}));
		contentPane.add(cmbMenuPrincipal);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(cmbMenuPrincipal.getSelectedIndex()){
					case 0:
						frmConversorMoneda conversorMoneda = new frmConversorMoneda();
						conversorMoneda.setVisible(true);
						break;
					
					case 1:
						frmConversorTemperatura conversorTemperatura = new frmConversorTemperatura();
						conversorTemperatura.setVisible(true);
						break;				
					case 2:
						frmConversorMedidas conversorMedidas = new frmConversorMedidas();
						conversorMedidas.setVisible(true);
						break;
					
				}
				
			}
		});
		btnIngresar.setBounds(282, 34, 89, 23);
		contentPane.add(btnIngresar);
	}
}
