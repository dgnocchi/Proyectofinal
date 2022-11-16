package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import GUI.Elegirservicio;
import Logica.Logicaproyecto;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginuser extends JFrame {

	private JPanel contentPane;
	private JTextField TXTUser;
	private JPasswordField TXTPassword;
	private Elegirservicio es;
	private Inicio in;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginproveedor frame = new Loginproveedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Loginuser() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblusername = new JLabel("Usuario");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblusername.setBounds(42, 69, 66, 14);
		contentPane.add(lblusername);
		
		JLabel lblpassword = new JLabel("Contraseña");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblpassword.setBounds(42, 114, 89, 14);
		contentPane.add(lblpassword);
		
		TXTUser = new JTextField();
		TXTUser.setBounds(149, 66, 230, 20);
		contentPane.add(TXTUser);
		TXTUser.setColumns(10);
		
		JButton btnLogincliente = new JButton("Ingresar");
		btnLogincliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogincliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				int usuario =Integer.parseInt(TXTUser.getText());
				String contraseñalp =String.valueOf(TXTPassword.getPassword());
				
				Logicaproyecto.logincliente(usuario, contraseñalp);
				boolean loguear =Logicaproyecto.logincliente2();
				
				if(loguear=true) {
					
					
					Elegirservicio es = new Elegirservicio();
					es.setVisible(true);
					dispose();
			
					
				}
				
				
			}
		});
		btnLogincliente.setBounds(116, 202, 89, 23);
		contentPane.add(btnLogincliente);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(42, 172, 373, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(42, 46, 373, 9);
		contentPane.add(separator_1);
		
		TXTPassword = new JPasswordField();
		TXTPassword.setBounds(149, 113, 230, 20);
		contentPane.add(TXTPassword);
		
		JLabel lblNewLabel = new JLabel("Inicio de sesión");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(182, 11, 135, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				in = new Inicio();
				in.setVisible(true);
			}
		});
		btnVolver.setBounds(263, 202, 89, 23);
		contentPane.add(btnVolver);
	}
}
