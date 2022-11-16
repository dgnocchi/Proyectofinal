package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Window;
import javax.swing.JSeparator;

public class Inicio extends JFrame {

	
	private JPanel contentPane;
	private JFrame frmExit;
    private Loginuser lu;
	private Loginproveedor lp;
	private Nuevousuario nu;
	private Nuevoproveedor np;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio()  {
		initialize();
	}
	
	private void initialize() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login ususario");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				lu = new Loginuser();
				lu.setVisible(true);
			}
		});
		btnNewButton.setBounds(50, 89, 154, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Gnocchi");
		lblNewLabel.setFont(new Font("Brush Script MT", Font.PLAIN, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		lblNewLabel.setBounds(178, 11, 85, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Login proveedor");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				 lp = new Loginproveedor();
				 lp.setVisible(true);
			}
		});
		
		btnNewButton_1.setBounds(230, 89, 154, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Registrar usuario");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				nu = new Nuevousuario();
				nu.setVisible(true);
			}
		});
		
		btnNewButton_2.setBounds(50, 144, 154, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Registro proveedor");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				np = new Nuevoproveedor();
				np.setVisible(true);
			}
		});
		
		btnNewButton_3.setBounds(230, 144, 154, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("CORP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(194, 46, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(52, 71, 332, 7);
		contentPane.add(separator);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmExit = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmExit,"Confirma si quieres salir","login Systems",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
						}
			}
		});
		btnSalir.setBounds(174, 215, 89, 23);
		contentPane.add(btnSalir);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(50, 197, 332, 7);
		contentPane.add(separator_1);
	}
}
