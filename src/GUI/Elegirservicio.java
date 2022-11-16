package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;

import Logica.Logicaproyecto;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Elegirservicio extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTable JTmuestra;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Elegirservicio frame = new Elegirservicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Elegirservicio() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Gnocchi");
		lblNewLabel_3.setFont(new Font("Brush Script MT", Font.PLAIN, 29));
		lblNewLabel_3.setBounds(424, 11, 85, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("CORP");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(434, 45, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(44, 133, 220, 239);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(333, 133, 235, 239);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(638, 133, 226, 239);
		contentPane.add(panel_2);
		
		JButton btnCargarservicios = new JButton("Actualizar");
		btnCargarservicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Mostrarservicios();
			}
		});
		btnCargarservicios.setBounds(77, 425, 89, 23);
		contentPane.add(btnCargarservicios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 477, 804, 212);
		contentPane.add(scrollPane);
		
		JTmuestra = new JTable();
		scrollPane.setViewportView(JTmuestra);
		this.JTmuestra.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(77, 58, 152, 41);
		contentPane.add(lblNewLabel);
		
		JButton btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmUser = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmUser,"Confirma si quieres salir","login Systems",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
						}
			}
		});
		btnExit.setBounds(198, 425, 89, 23);
		contentPane.add(btnExit);
	}
	
	public void Mostrarservicios() {

		String[] muestra = new String[5];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("FECHA");
		model.addColumn("IDSERVICIO");
		model.addColumn("NOMBRE");
		model.addColumn("HORARIO");
		model.addColumn("PRECIO");
		
		JTmuestra.setModel(model);
		
		try {
			ResultSet rs=(ResultSet) Logicaproyecto.Mostrardatos();
			while(rs.next()) {
				muestra[0]=rs.getString(1);
				muestra[1]=rs.getString(2);
				muestra[2]=rs.getString(3);
				muestra[3]=rs.getString(4);
				muestra[4]=rs.getString(5);
				model.addRow(muestra);
			}
			
		}
		catch (Exception e){
			System.out.print(e);
		}
		
		return;
		
	}
}
