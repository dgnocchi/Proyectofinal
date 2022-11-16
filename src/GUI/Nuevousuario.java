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

public class Nuevousuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsercrear;
	private JPasswordField txtPasscrear;
	private JTextField txtNombrecrear;
	private JTextField txtMailcrear;
	private Inicio in;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nuevousuario frame = new Nuevousuario();
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
	public Nuevousuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsercrear = new JTextField();
		txtUsercrear.setBounds(353, 89, 86, 20);
		contentPane.add(txtUsercrear);
		txtUsercrear.setColumns(10);
		
		txtPasscrear = new JPasswordField();
		txtPasscrear.setBounds(150, 155, 103, 20);
		contentPane.add(txtPasscrear);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(144, 253, 63, 23);
		btnCrear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                    
				    if(txtUsercrear.getText().length()==0) {
					JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca usuario", null, 0);
					}
				    else if (txtPasscrear.getText().length()==0)
				    {JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca una contraseña");
				    }
				   
				    else if(txtNombrecrear.getText().length()==0) {
				    	JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca su nombre");
				    }
				    	
				    else if(txtMailcrear.getText().length()==0) {
				    	JOptionPane.showMessageDialog(btnCrear,"Porfavor introduzca su e-mail");
				    	
				    	
				    }
				    
				    else {
				    	
				    		
				    		int usuario = Integer.parseInt( txtUsercrear.getText());
				    		String contraseña = txtPasscrear.getText();
				    		String nombre =txtNombrecrear.getText();
				    		String mail= txtMailcrear.getText();
				   
				    		
							Logicaproyecto.Ninsertar(usuario,contraseña,nombre,mail);
							txtUsercrear.setText("");
							txtPasscrear.setText("");
							txtNombrecrear.setText("");
							txtMailcrear.setText("");
							txtUsercrear.requestFocus();

						 
				    }
				    
			}
		});
		contentPane.add(btnCrear);
		
		JButton btnCancelar = new JButton("Volver");
		btnCancelar.setBounds(300, 253, 81, 23);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				in = new Inicio();
				in.setVisible(true);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setBounds(287, 155, 56, 17);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Registro de cliente");
		lblNewLabel_6.setBounds(189, 11, 154, 20);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_6);
		
		txtMailcrear = new JTextField();
		txtMailcrear.setBounds(150, 89, 86, 20);
		contentPane.add(txtMailcrear);
		txtMailcrear.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(60, 155, 80, 17);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(88, 89, 52, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		txtNombrecrear = new JTextField();
		txtNombrecrear.setBounds(353, 155, 103, 20);
		contentPane.add(txtNombrecrear);
		txtNombrecrear.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("e-mail");
		lblNewLabel_7.setBounds(302, 89, 41, 17);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(39, 48, 440, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 217, 441, 2);
		contentPane.add(separator_1);
	}
}
