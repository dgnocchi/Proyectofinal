package Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Personaaa {
	  
	  private PreparedStatement ps;
	  private final Conection CN;
	  private final static String SQL = "INSERT INTO usuario(id_usuario,contraseña,nombre_usuario,mail_usuario)values(?,?,?,?)";
	  private static int usuario = 0;
	  private static String contraseña = null;
	  private String nombre = null;
	  private String mail = null;

	  public Personaaa(int usu, String pwd,String nom, String email){
		  
		this.usuario = usu;
		this.contraseña = pwd;
		this.nombre = nom;
		this.mail = email;
	    ps = null;
	    CN = new Conection();
	  }
	  
	 
	  
	 
	  
	  public int insertar() {
		  try {
				ps = CN.getConnection().prepareStatement(SQL);
				ps.setInt(1, this.usuario);
				ps.setString(2, this.contraseña);
				ps.setString(3, this.nombre);
				ps.setString(4, this.mail);
				int r = ps.executeUpdate();
				if (r > 0) {
					JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
				}else {
					JOptionPane.showMessageDialog(null, "Este usuario ya existe");
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  return 0;
		  }
	  
	  
	  public int autenticar() {
		  try {
			ps = CN.getConnection().prepareStatement(SQL);
			ps.setInt(1, this.usuario);
			ps.setString(2, this.contraseña);
			String query = "SELECT * FROM  Proyecto_PROG_BD WHERE id_rut= '"+usuario+"' and contraseña='"+contraseña+"'";
			ResultSet rs = ps.executeQuery(query);
			
			
			
			
		  } catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	  }
	  
	 
	  public static ResultSet Mostrarserv() {
	    	ResultSet rs =null;
	    	
	    	try {	
	    		Conection CN = new Conection();
	    		Statement st=CN.getConnection().prepareStatement(SQL);
	    		String ver = "SELECT * FROM Proyecto_PROG_BD";
	    		rs=st.executeQuery(ver);
	    	}catch (Exception e){
	    		System.out.print(e);
	    	}
	    	return rs;
		}
}