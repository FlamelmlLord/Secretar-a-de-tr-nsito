
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

   
public class DaoRevision extends Conexion{
    
        public boolean Insertar(DtoRevision dtoRev){
            
            Connection Conn = establecerConexion();    
            PreparedStatement pst = null;
            String stm = "INSERT INTO revisión_tecno_mecanica VALUES (?,?,?,?,?,?)";
            
        try{
            pst = Conn.prepareStatement(stm);
            pst.setString(1, dtoRev.getRevisión());
            pst.setString(2, dtoRev.getFechaExp().toString());
            pst.setString(3, dtoRev.getCda());
            pst.setString(4, dtoRev.getResultado());
            pst.setInt(5, dtoRev.getValMulta());
            pst.setString(6, dtoRev.getPlaca());
            pst.executeUpdate();
            return true;
            
            }catch (SQLException ex){
                mensaje("Error al registrar la revisión tecno-mecanica", "Insertar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Consultar--------------------------------------------------------------------------------
        
        public boolean Consultar (DtoRevision dtoRev){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "SELECT * FROM revisión_tecno_mecanica where revisión = ?";
            ResultSet res;
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1,dtoRev.getRevisión());
                res = pst.executeQuery();
                if(res.next()){
                    dtoRev.setRevisión(res.getString("revisión"));
                    dtoRev.setFechaExp(LocalDate.parse(res.getString("fecha_exp")));
                    dtoRev.setCda(res.getString("CDA"));
                    dtoRev.setResultado(res.getString("resultado"));
                    dtoRev.setValMulta(res.getInt("val_multa"));
                    dtoRev.setPlaca(res.getString("placa_fk"));
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
       
        public boolean Modificar (DtoRevision dtoRev){
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "UPDATE revisión_tecno_mecanica SET CDA=?, resultado=?, val_multa=? WHERE revisión=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoRev.getCda());
                pst.setString(2, dtoRev.getResultado());
                pst.setInt(3, dtoRev.getValMulta());
                pst.execute();
                return true;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la modificacion."+ex);
                mensaje("Error al realizar la modificacion","Modificar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Eliminar--------------------------------------------------------------------------------
        
        public boolean Eliminar (DtoRevision dtoRev){
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "DELETE FROM revisión_tecno_mecanica WHERE n_referencia=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoRev.getRevisión());
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

