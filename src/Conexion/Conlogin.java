package Conexion;

import java.sql.ResultSet;
import java.sql.Statement;

public class Conlogin {
	  
	  private final Conection CN;
	  private static int usuariol = 0;
	  private static String contraseñal = null;

	  public Conlogin(int usul, String pwdl){
		  
		this.usuariol = usul;
		this.contraseñal = pwdl;
	    CN = new Conection();
	  }
		public static ResultSet Usulogin() {
	    	ResultSet rs =null;
	    	
	    	try {	
	    		Conection CN = new Conection();
	    		String SQL="";
	    		Statement st=  CN.getConnection().prepareStatement(SQL);
	    		String ver= "SELECT * FROM usuario WHERE usuario='"+usuariol+"' and contraseña='"+contraseñal+"'";
	    		System.out.print(ver);
	    		rs= st.executeQuery(ver);
	    		
	    	}
	    	catch (Exception e){
	    		
	    		System.out.print(e);
	    	}
	    	return rs;
		}
}
