
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

// CRUD VISTA PERSONA
    // INSERTAR
public class DaoVehiculo extends Conexion{
    
        public boolean Insertar (DtoVehiculo dtoVeh){
            
            Connection Conn = establecerConexion();    
            PreparedStatement pst = null;
            String stm = "INSERT INTO vehículo VALUES (?,?,?,?,?,?,?)";
            
        try{
            pst = Conn.prepareStatement(stm);
            pst.setString(1, dtoVeh.getPlaca());
            pst.setString(2, dtoVeh.getMarca());
            pst.setString(3, dtoVeh.getModelo());
            pst.setString(4, dtoVeh.getTipoVehiculo());
            pst.setString(5, dtoVeh.getColor());
            pst.setInt(6, dtoVeh.getIdentificacion());
            pst.setString(7, dtoVeh.getNombre());
            pst.executeUpdate();
            return true;
            
            }catch (SQLException ex){
                mensaje("Error al ingresar el vehículo asociado a esta placa", "Ingresar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Consultar--------------------------------------------------------------------------------
       
        public boolean Consultar (DtoVehiculo dtoVeh){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "SELECT * FROM vehículo where Placa = ?";
            ResultSet res;
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1,dtoVeh.getPlaca());
                res = pst.executeQuery();
                
                    if(res.next()){
                        dtoVeh.setPlaca(res.getString("placa"));
                        dtoVeh.setMarca(res.getString("marca"));
                        dtoVeh.setModelo(res.getString("modelo"));
                        dtoVeh.setTipoVehiculo(res.getString("tipo_vehiculo"));
                        dtoVeh.setColor(res.getString("color"));
                        dtoVeh.setIdentificacion(Integer.parseInt(res.getString("identificación")));
                        dtoVeh.setNombre(res.getString("nombre"));
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

        public boolean Modificar (DtoVehiculo dtoVeh){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "UPDATE vehículo SET marca=?,modelo=?,tipo_vehiculo=?,color=? WHERE placa=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoVeh.getMarca());
                pst.setString(2, dtoVeh.getModelo());
                pst.setString(3, dtoVeh.getTipoVehiculo());
                pst.setString(4, dtoVeh.getColor());
                pst.execute();
                return true;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la modificacion."+ex);
                mensaje("Error al realizar la modificacion","Modificar");
                return false;
            }
        }
        
        
// --------------------------------------------------------------------------------------Eliminar--------------------------------------------------------------------------------
        
        public boolean Eliminar (DtoVehiculo dtoVeh){
            
            Connection Conn= establecerConexion();
            PreparedStatement pst;
            String stm = "DELETE FROM vehículo WHERE placa=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setInt(1, dtoVeh.getIdentificacion());
                pst.execute();
                return true;
                
            }catch (SQLException ex){
                System.out.println("Error al realizar la eliminación."+ex);
                mensaje("Error al realizar la eliminación.","Eliminar");
                return false;
            }
        }
        
        
        public void mensaje (String msg, String btn){
            
            JOptionPane.showMessageDialog(null, msg, btn, 1);
        }   
}

