package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class Loginproveedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtRut;
	private JTextField txtPasspro;
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

	public Loginproveedor() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRut = new JTextField();
		txtRut.setBounds(164, 65, 121, 20);
		contentPane.add(txtRut);
		txtRut.setColumns(10);
		
		txtPasspro = new JTextField();
		txtPasspro.setBounds(164, 114, 121, 20);
		contentPane.add(txtPasspro);
		txtPasspro.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("RUT");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(118, 66, 36, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(65, 115, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Inicio de sesión");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(148, 11, 135, 24);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 45, 373, 9);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(33, 169, 373, 9);
		contentPane.add(separator_1_1);
		
		JButton btnIngresar = new JButton("ingresar");
		btnIngresar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int rut =Integer.parseInt(txtRut.getText());
				String contraseñalp =String.valueOf(txtPasspro.getText());
				
				Logicaproyecto.loginpro(rut, contraseñalp);
				boolean ingresar = Logicaproyecto.logincliente2();
				
				if(ingresar=true) {
					
					dispose();
                    Elegirservicio es = new Elegirservicio();
					es.setVisible(true);
						
				}
				
			}
		});
		btnIngresar.setBounds(90, 197, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				in = new Inicio();
				in.setVisible(true);
			}
		});
		btnVolver.setBounds(257, 197, 89, 23);
		contentPane.add(btnVolver);
	}

}
