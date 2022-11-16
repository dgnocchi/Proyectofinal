package Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Proveedor {
	 
	  private PreparedStatement ps;
	  private final Conection CN;
	  private final String SQL = "INSERT INTO proveedor(id_rut,nombre_proveedor,contraseña,mail_proveedor,fk_id_usuario,fk_nombre_servicio)values(?,?,?,?,?,?)";
	  private int pusuario = 0;
	  private String pcontraseña = null;
	  private String pnombre = null;
	  private String pmail = null;
      private int prut=0;
      private String pservicio=null;


     public Proveedor(int pusu, String ppwd,String pnom, String pemail,int prt,String pserv){
	  
	 this.pusuario = pusu;
	 this.pcontraseña = ppwd;
	 this.pnombre = pnom;
	 this.pmail = pemail;
     this.prut= prt;
     this.pservicio= pserv;		 
	 ps = null;
     CN = new Conection();
  }
  
 
  public int pinsertar() {
	  try {
			ps = CN.getConnection().prepareStatement(SQL);
			ps.setInt(1, this.prut);
			ps.setString(2, this.pnombre);
			ps.setString(3, this.pcontraseña);
			ps.setString(4, this.pmail);
			ps.setInt(5, this.pusuario);
			ps.setString(6, this.pservicio);
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
		ps.setInt(1, this.prut);
		ps.setString(2, this.pcontraseña);
		String query = "SELECT * FROM  Proyecto_PROG_BD WHERE id_rut= '"+prut+"' and contraseña='"+pcontraseña+"'";
		ResultSet rs = ps.executeQuery(query);
		
		
		
		
	  } catch (Exception e) {
		e.printStackTrace();
	}
	return 0;
	
  }
  
}