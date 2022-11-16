package Conexion;

import java.sql.ResultSet;
import java.sql.Statement;


public class Pconlogin {

	

	  private static int rut = 0;
	  private static String contraseñalp = null;

	  public Pconlogin(int rutp, String Passpro){
		  
		this.rut = rutp;
		this.contraseñalp = Passpro;
	    new Conection();
	  }
		public static ResultSet Prolog() {
	    	ResultSet rs =null;
	    	
	    	try {	
	    		Conection CN = new Conection();
	    		String SQL="";
	    		Statement st= CN.getConnection().prepareStatement(SQL);
	    		String mos = "SELECT * FROM proveedor WHERE id_rut='"+rut+"' and contraseña='"+contraseñalp+"'";
	    		System.out.print(mos);
	    		rs= st.executeQuery(mos);
	    		
	    	}
	    	catch (Exception e){
	    		
	    		System.out.print(e);
	    	}
	    	return rs;
		}
}
