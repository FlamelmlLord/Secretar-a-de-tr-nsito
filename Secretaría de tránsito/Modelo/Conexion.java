package Modelo;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Conexion {
   Connection conectar = null;
    String usuario = "root";
    String contrasenia = "12345";
    String bd = "parquetest";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
   public Connection establecerConexion(){
        Connection Conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conn = DriverManager.getConnection(cadena, usuario, contrasenia);           
        }catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Fallo al conectar con la base", "Conexión", 1);
        }
        return Conn;
    }
}
