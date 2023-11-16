
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;


   
public class DaoTesoreria extends Conexion{
    
        public boolean Insertar(DtoTesoreria dtoTes){
            
            Connection Conn = establecerConexion();    
            PreparedStatement pst = null;
            String stm = "INSERT INTO revisión_tecno_mecanica VALUES (?,?,?,?,?,?)";
            
        try{
            pst = Conn.prepareStatement(stm);
            pst.setString(1, dtoTes.getRegistroPago());
            pst.setInt(2, dtoTes.getnCuotas());
            pst.setInt(3, dtoTes.getnCuotasPagas());
            pst.setString(4, dtoTes.getFechaPago().toString());
            pst.setInt(5, dtoTes.getMontoCuota());
            pst.setString(6, dtoTes.getEstadoPago());
            pst.setString(7, dtoTes.getnReferencia());
            pst.setString(8, dtoTes.getNumComparendo());
            pst.executeUpdate();
            return true;
            
            }catch (SQLException ex){
                mensaje("Error al registrar el pago", "Insertar");
                return false;
            }
        }

        
// --------------------------------------------------------------------------------------Consultar--------------------------------------------------------------------------------
       
        public boolean Consultar (DtoTesoreria dtoTes){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "SELECT * FROM tesorería where registro_pago= ?";
            ResultSet res;
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1,dtoTes.getRegistroPago());
                res = pst.executeQuery();
                
                if(res.next()){
                    dtoTes.setRegistroPago(res.getString("registro_pago"));
                    dtoTes.setnCuotas(Integer.parseInt(res.getString("n_cuotas")));
                    dtoTes.setnCuotasPagas(Integer.parseInt(res.getString("n_cuotas_pagas")));
                    dtoTes.setFechaPago(LocalDate.parse(res.getString("fecha_pago")));
                    dtoTes.setMontoCuota(res.getInt("monto_cuota"));
                    dtoTes.setEstadoPago(res.getString("estado_pago"));
                    dtoTes.setnReferencia(res.getString("n_referencia_fk"));
                    dtoTes.setNumComparendo(res.getString("nom_comparendo_fk"));
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
       
        public boolean Modificar (DtoTesoreria dtoTes){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "UPDATE tesorería SET n_cuotas=?, n_cuotas_pagas=?, fecha_pago=?, monto_pago=?, estado_pago=? WHERE registro_pago=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setInt(1, dtoTes.getnCuotas());
                pst.setInt(2, dtoTes.getnCuotasPagas());
                pst.setString(3, dtoTes.getFechaPago().toString());
                pst.setInt(4, dtoTes.getMontoCuota());
                pst.execute();
                return true;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la modificacion."+ex);
                mensaje("Error al realizar la modificacion","Modificar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Eliminar--------------------------------------------------------------------------------
        
        public boolean Eliminar (DtoTesoreria dtoTes){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "DELETE FROM tesorería WHERE registro_pago=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoTes.getRegistroPago());
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
