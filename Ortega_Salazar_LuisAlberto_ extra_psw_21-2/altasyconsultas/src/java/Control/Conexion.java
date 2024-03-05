/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author INSPIRON
 */
import java.sql.*;

public class Conexion {
    public static Connection getConnection(){
        String url, username, password;
        
        url = "jdbc:mysql://localhost/trabajadores";
        username = "root";
        password = "ALBERTO2004";
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Se logro conectar a la base de datos");
            
        }catch(Exception e){
            System.out.println("No se logro conectar a la base de datos");
            System.out.println(e.getMessage());
        }
        return con;    
    }
}
