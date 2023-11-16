
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


public class DaoImpuesto extends Conexion{
    
        public boolean Insertar (DtoImpuesto dtoImp){
            
            Connection Conn = establecerConexion();    
            PreparedStatement pst = null;
            String stm = "INSERT INTO impuesto VALUES (?,?,?,?)";
            
        try{
            pst = Conn.prepareStatement(stm);
            pst.setString(1, dtoImp.getnReferencia());
            pst.setString(2, dtoImp.getFechaLimPago().toString());
            pst.setString(3, dtoImp.getVigencia().toString());
            pst.setString(4, dtoImp.getPlaca());
            pst.executeUpdate();
            return true;
            
            }catch (SQLException ex){
                mensaje("Error al resitrar el impuesto", "Insertar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Consultar--------------------------------------------------------------------------------
        
        public boolean Consultar (DtoImpuesto dtoImp){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "SELECT * FROM impuesto where n_referencia = ?";
            ResultSet res;
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1,dtoImp.getnReferencia());
                res = pst.executeQuery();
                
                if(res.next()){
                    dtoImp.setnReferencia(res.getString("n_referencia"));
                    dtoImp.setFechaLimPago(LocalDate.parse(res.getString("fecha_lim_pago")));
                    dtoImp.setVigencia(LocalDate.parse(res.getString("vigencia")));
                    dtoImp.setPlaca(res.getString("placa_fk"));
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
        
        public boolean Modificar (DtoImpuesto dtoImp){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "UPDATE impuesto SET fecha_lim_pago=? WHERE n_referencia=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoImp.getFechaLimPago().toString());
                pst.execute();
                return true;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la modificacion."+ex);
                mensaje("Error al realizar la modificacion","Modificar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Eliminar--------------------------------------------------------------------------------
        
        public boolean Eliminar (DtoImpuesto dtoImp){
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "DELETE FROM impuesto WHERE n_referencia=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoImp.getnReferencia());
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


    



