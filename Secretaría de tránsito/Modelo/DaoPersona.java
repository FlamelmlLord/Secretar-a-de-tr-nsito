
package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

// CRUD VISTA PERSONA
    // INSERTAR
public class DaoPersona extends Conexion {
    
        public boolean Insertar (DtoPersona dtoPer){
            
            Connection Conn = establecerConexion();    
            PreparedStatement pst = null;
            String stm = "INSERT INTO persona VALUES (?,?,?,?,?)";
            
        try{
            pst = Conn.prepareStatement(stm);
            pst.setInt(1, dtoPer.getIdentificacion());
            pst.setString(2, dtoPer.getNombre());
            pst.setString(3, dtoPer.getCorreo());
            pst.setString(4, dtoPer.getDireccion());
            pst.setInt(5, dtoPer.getCod_tipo_persona().equals("Conductor") ? 1 : 2 );
            pst.executeUpdate();
            return true;
            
            }catch (SQLException ex){
                
                mensaje("Error al ingresar el usuario", "Ingresar");
                return false;
            }
        }
    

// --------------------------------------------------------------------------------------Consultar--------------------------------------------------------------------------------
         
        public boolean Consultar (DtoPersona dtoPer){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "SELECT * FROM persona where Identificación = ?";
            ResultSet res;
            
            try{
                
                pst = Conn.prepareStatement(stm);
                pst.setInt(1,dtoPer.getIdentificacion());
                res = pst.executeQuery();
                if(res.next()){
                    
                    dtoPer.setIdentificacion(Integer.parseInt(res.getString("Identificacion")));
                    dtoPer.setNombre(res.getString("Nombre"));
                    dtoPer.setCorreo(res.getString("Correo"));
                    dtoPer.setDireccion(res.getString("Direccion"));
                    dtoPer.setCod_tipo_persona(res.getString("Tipo Persona"));
                    mensaje("Busqueda Satisfactorio","");
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
        
        public boolean Modificar (DtoPersona dtoPer){
            
            Connection Conn = establecerConexion();
            PreparedStatement pst = null;
            String stm = "UPDATE persona SET nombre=?,correo_p=?,dirección_p=?,id_tipo_persona=? WHERE Identificación=?";
            try{
                pst = Conn.prepareStatement(stm);
                pst.setString(1, dtoPer.getNombre());
                pst.setInt(2, dtoPer.getCod_tipo_persona().equals("Conductor") ? 1 : 2 );
                pst.setString(3, dtoPer.getCorreo());
                pst.setString(4, dtoPer.getDireccion());
                pst.execute();
                return true;
                
            }catch(SQLException ex){
                System.out.println("Error al realizar la modificacion."+ex);
                mensaje("Error al realizar la modificacion","Modificar");
                return false;
            }
        }


// --------------------------------------------------------------------------------------Eliminar--------------------------------------------------------------------------------
        
        public boolean Eliminar (DtoPersona dtoPer){
            
            Connection Conn= establecerConexion();
            PreparedStatement pst;
            String stm = "DELETE persona WHERE Identifiación=?";
            
            try{
                pst = Conn.prepareStatement(stm);
                pst.setInt(1, dtoPer.getIdentificacion());
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

