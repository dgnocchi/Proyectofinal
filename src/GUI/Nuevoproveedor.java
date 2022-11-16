package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Logica.Logicaproyecto;

public class Nuevoproveedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtPusercrear;
	private JPasswordField txtPcontracrear;
	private JTextField txtPnombrecrear;
	private JTextField txtPmailcrear;
	private JTextField txtRutcrear;
	private JTextField txtServiciocrear;
	private Inicio in;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nuevoproveedor frame = new Nuevoproveedor();
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
	public Nuevoproveedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 158, 52, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(261, 87, 80, 17);
		contentPane.add(lblNewLabel_1);
		
		txtPusercrear = new JTextField();
		txtPusercrear.setBounds(110, 158, 86, 20);
		contentPane.add(txtPusercrear);
		txtPusercrear.setColumns(10);
		
		txtPcontracrear = new JPasswordField();
		txtPcontracrear.setBounds(357, 87, 86, 20);
		contentPane.add(txtPcontracrear);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    
			
				
				    if(txtPusercrear.getText().length()==0) {
					JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca usuario", null, 0);
					}
				    else if (txtPcontracrear.getText().length()==0){
				    JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca una contraseña");
				    }
				    else if(txtPnombrecrear.getText().length()==0) {
				    JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca su nombre");
				    }
				    else if(txtPmailcrear.getText().length()==0) {
				    JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca su e-mail");
				    }
				    else if(txtRutcrear.getText().length()==0) {
				    	JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca su Rut");
				    }
				    else if(txtServiciocrear.getText().length()==0) {
				    	JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca su Servicio");
				    }
				    
				    
				    
				    
				    else {
				    	
				    		
				    		int pusuario = Integer.parseInt(txtPusercrear.getText());
				    		String pcontraseña = txtPcontracrear.getText();
				    		String pnombre =txtPnombrecrear.getText();
				    		String pmail= txtPmailcrear.getText();
				            int  prut=Integer.parseInt (txtRutcrear.getText());
				            String pservicio=txtServiciocrear.getText();
				    		
							Logicaproyecto.Npinsertar(pusuario,pcontraseña,pnombre,pmail,prut,pservicio);
							txtPusercrear.setText("");
							txtPcontracrear.setText("");
							txtPnombrecrear.setText("");
							txtPmailcrear.setText("");
							txtPusercrear.requestFocus();
                            txtRutcrear.setText("");
						    txtServiciocrear.setText("");
				    }
				    
			}
		});
		btnCrear.setBounds(165, 295, 63, 23);
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Volver");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				in = new Inicio();
				in.setVisible(true);
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(271, 295, 81, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(285, 158, 56, 17);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Registro de proveedor");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(165, 11, 182, 20);
		contentPane.add(lblNewLabel_6);
		
		txtPnombrecrear = new JTextField();
		txtPnombrecrear.setBounds(357, 158, 86, 20);
		contentPane.add(txtPnombrecrear);
		txtPnombrecrear.setColumns(10);
		
		txtPmailcrear = new JTextField();
		txtPmailcrear.setBounds(110, 223, 86, 20);
		contentPane.add(txtPmailcrear);
		txtPmailcrear.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("e-mail");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(47, 223, 41, 17);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rut");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(63, 87, 25, 17);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Servicio");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(288, 223, 53, 17);
		contentPane.add(lblNewLabel_2_2);
		
		txtRutcrear = new JTextField();
		txtRutcrear.setColumns(10);
		txtRutcrear.setBounds(110, 87, 86, 20);
		contentPane.add(txtRutcrear);
		
		txtServiciocrear = new JTextField();
		txtServiciocrear.setColumns(10);
		txtServiciocrear.setBounds(357, 223, 86, 20);
		contentPane.add(txtServiciocrear);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(36, 54, 441, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(36, 272, 441, 2);
		contentPane.add(separator_3);
	}

}
