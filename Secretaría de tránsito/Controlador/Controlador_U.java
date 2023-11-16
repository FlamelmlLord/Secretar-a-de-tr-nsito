
package Controlador;

import Modelo.DaoPersona;
import Modelo.DtoPersona;
import Vista.GESTOR_USUARIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_U implements ActionListener {
    
    private DtoPersona dtoPer;
    private DaoPersona daoPer;
    private GESTOR_USUARIO gestor_U;

    public Controlador_U(){
        
        this.dtoPer = new DtoPersona();
        this.daoPer = new DaoPersona();
        this.gestor_U = new GESTOR_USUARIO();
        
        this.gestor_U.BtnInsertarUsu.addActionListener(this);
        this.gestor_U.BtnBuscarUsu.addActionListener(this);
        this.gestor_U.BtnModificarUsu.addActionListener(this);
        this.gestor_U.BtnEliminarUsu.addActionListener(this);
        this.gestor_U.BtnLimpiarUsu.addActionListener(this);
        this.gestor_U.BtnRegresarUsu.addActionListener(this);
    }

    
    public Controlador_U(DtoPersona dtoPer, DaoPersona daoPer, GESTOR_USUARIO gestor_U) {
        
        this.dtoPer = dtoPer;
        this.daoPer = daoPer;
        this.gestor_U = gestor_U;
        
        this.gestor_U.BtnInsertarUsu.addActionListener(this);
        this.gestor_U.BtnBuscarUsu.addActionListener(this);
        this.gestor_U.BtnModificarUsu.addActionListener(this);
        this.gestor_U.BtnEliminarUsu.addActionListener(this);
        this.gestor_U.BtnLimpiarUsu.addActionListener(this);
        this.gestor_U.BtnRegresarUsu.addActionListener(this);   
    }

    
    @Override
    public void actionPerformed(ActionEvent evt){
        
        if(evt.getSource().equals(gestor_U.BtnInsertarUsu)){
            
            dtoPer.setIdentificacion(Integer.parseInt(gestor_U.TxtCedula.getText()));
            dtoPer.setNombre(gestor_U.TxtNombre.getText());
            dtoPer.setCod_tipo_persona(gestor_U.ComboUsuario.getSelectedItem().toString());
            dtoPer.setCorreo(gestor_U.TxtCorreo.getText());
            dtoPer.setDireccion(gestor_U.TxtDireccion.getText());
            
            if(daoPer.Insertar(dtoPer)){
                
                mensaje("Usuario registrado exitosamente...","Insertar!!!");
                
            }else{
                
                mensaje("Usuario no registrado en la BD...","Insertar!!!");
            }
        }
        
        if(evt.getSource().equals(gestor_U.BtnBuscarUsu)){
         
            dtoPer.setIdentificacion(Integer.parseInt(gestor_U.TxtCedula.getText()));
         
            if(daoPer.Consultar(dtoPer)){
                gestor_U.TxtCedula.setText(String.valueOf(dtoPer.getIdentificacion()));
                gestor_U.TxtNombre.setText(dtoPer.getNombre());
                gestor_U.ComboUsuario.setSelectedItem(dtoPer.getCod_tipo_persona());
                gestor_U.TxtCorreo.setText(dtoPer.getCorreo());
                gestor_U.TxtDireccion.setText(dtoPer.getDireccion());
            }else{
                
                mensaje("Usuario no encontrado","Buscar");                 
            }
            
        }
        
        if(evt.getSource().equals(gestor_U.BtnModificarUsu)){
            
            dtoPer.setNombre(gestor_U.TxtNombre.getText());
            dtoPer.setCod_tipo_persona(gestor_U.ComboUsuario.getSelectedItem().toString());
            dtoPer.setCorreo(gestor_U.TxtCorreo.getText());
            dtoPer.setDireccion(gestor_U.TxtDireccion.getText());
            if(daoPer.Modificar(dtoPer)){
                mensaje("Usuario modificado satisfactoriamente", "Modificar");
            }else{
                mensaje("Modificación fallida revise los datos","Modificar");
            }
                
        }
        
        if(evt.getSource().equals(gestor_U.BtnEliminarUsu)){
            dtoPer.setIdentificacion(Integer.parseInt(gestor_U.TxtCedula.getText()));
            if(daoPer.Eliminar(dtoPer)){
                mensaje("Solicitud completada satisfactoriamente", "Eliminar");
            }else{
                mensaje("La solicitud no pudo ser completada","Eliminar");
            }
        }
        
        if(evt.getSource().equals(gestor_U.BtnRegresarUsu)){
            gestor_U.dispose();
        }
        
        if(evt.getSource().equals(gestor_U.BtnLimpiarUsu)){
            limpiar();
        }
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);  
    }
    
    public void limpiar(){
        gestor_U.TxtCedula.setText(null);
        gestor_U.TxtNombre.setText(null);
        gestor_U.ComboUsuario.getSelectedItem().toString();
        gestor_U.TxtCorreo.setText(null);
        gestor_U.TxtDireccion.setText(null);
        
    }
}