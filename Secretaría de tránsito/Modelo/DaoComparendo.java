package Modelo;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class DaoComparendo extends Conexion{
    
        public boolean Insertar(DtoComparendo dtoCom){
            
            Connection Conn = establecerConexion();    
            PreparedStatement pst = null;
            String stm = "INSERT INTO comparendo VALUES (?,?,?,?,?)";
            
        try{
            pst = Conn.prepareStatement(stm);
            pst.setString(1, dtoCom.getNumComparendo());
            pst.setInt(2, dtoCom.getIdentificacion());
            pst.setString(3, dtoCom.getNombre());
            pst.setString(4, dtoCom.getInfraccion());
            pst.setString(5, dtoCom.getFechaInfraccion().toString());
            pst.executeUpdate();
            return true;
            
            }catch (SQLException ex){
                mensaje("Error al resitrar el comparendo", "Insertar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Consultar--------------------------------------------------------------------------------
        
        public boolean Consultar (DtoComparendo dtoCom){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "SELECT * FROM comparendo where num_comparendo = ?";
            ResultSet res;
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1,dtoCom.getNumComparendo());
                res = pst.executeQuery();
                if(res.next()){
                    dtoCom.setNumComparendo(res.getString("num_comparendo"));
                    dtoCom.setIdentificacion(Integer.parseInt(res.getString("identificación")));
                    dtoCom.setNombre(res.getString("nombre"));
                    dtoCom.setInfraccion(res.getString("infracción"));
                    dtoCom.setFechaInfraccion(LocalDate.parse(res.getString("fecha_infrac")));                 
                    mensaje("Busqueda Satisfactoria","");
                    return true;
                }
                return false;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la consulta."+ex);
                mensaje("Error al realizar la consulta","Buscar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Modificar--------------------------------------------------------------------------------
        
        public boolean Modificar (DtoComparendo dtoCom){
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "UPDATE comparendo SET nombre=?,infracción=?,fecha_infrac=? WHERE num_comparendo=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoCom.getNombre());
                pst.setString(2, dtoCom.getInfraccion());
                pst.setString(3, dtoCom.getFechaInfraccion().toString());
                pst.execute();
                return true;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la modificacion."+ex);
                mensaje("Error al realizar la modificacion","Modificar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Eliminar--------------------------------------------------------------------------------
        
        public boolean Eliminar (DtoComparendo dtoCom){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "DELETE FROM comparendo WHERE num_comparendo=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoCom.getNumComparendo());
                pst.execute();
                return true;
                
            }catch (SQLException ex){
                System.out.println("Error al realizar la eliminación."+ex);
                mensaje("Error al realizar la eliminación.","Eliminar");
                return false;
            }
        }
        
        
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg, btn, 1);
    }
}


    

