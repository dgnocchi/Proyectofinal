package Logica;

import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

import Conexion.Conlogin;
import Conexion.Pconlogin;
import Conexion.Personaaa;
import Conexion.Proveedor;

public class Logicaproyecto {
	
	public static void Ninsertar(int usu,String pwd, String nom, String email) {
		Personaaa persona = new Personaaa(usu,pwd,nom,email);
		persona.insertar();
		
	}
    
    public static void Npinsertar(int pusuario,String pcontraseña, String pnombre, String pmail ,int prut,String pservicio) {
		Proveedor persona = new Proveedor(pusuario,pcontraseña,pnombre,pmail,prut,pservicio);
		persona.pinsertar();
		
	}
    

    public static DefaultTableModel Mostrardatos(){
		
		String[] muestra = new String[5];
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("FECHA");
		model.addColumn("IDSERVICIO");
		model.addColumn("NOMBRE");
		model.addColumn("HORARIO");
		model.addColumn("PRECIO");
		
		try {
			ResultSet rs=(ResultSet) Personaaa.Mostrarserv();
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
		
		return model;
		
	}
   	
    
 public static void logincliente(int usu, String pwd){
		
		Conlogin cliente = new Conlogin(usu,pwd);
	}
	
	public static boolean logincliente2(){
	
		boolean loguear= false;
		try {
			ResultSet rs=Conlogin.Usulogin();
			if(rs.next()) {
				loguear = true;
			}
			
		}
		catch (Exception e){
			System.out.print(e);
		}
		return loguear;
		
	}
	
	
	
	
	public static void loginpro(int rutp,String passpro){
		
		Pconlogin proveedor = new Pconlogin(rutp,passpro);
	}
	
	public static boolean loginproveedor(){
		boolean loguear2 = false;
		try {
			ResultSet rs=Pconlogin.Prolog();
			if(rs.next()) {
				loguear2 = true;
			}
			
		}
		catch (Exception e){
			System.out.print(e);
		}
		return loguear2;
		
	}










}
