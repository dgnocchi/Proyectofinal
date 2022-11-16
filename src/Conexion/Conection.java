package Conexion;

import javax.swing.*;
import java.sql.*;

public class Conection {

     Connection con;
    
    
    
    public Connection getConnection(){
    	try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Proyecto_PROG_BD;","Daniel","root");
            
            }
        catch (ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
            }
      return con;
    }
}
