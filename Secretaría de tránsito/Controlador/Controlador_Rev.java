package Controlador;

import Modelo.DaoRevision;
import Modelo.DtoRevision;
import Vista.GESTOR_TECNOMECANICA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_Rev implements ActionListener{

    private DtoRevision dtoRev;
    private DaoRevision daoRev;
    private GESTOR_TECNOMECANICA gestor_Rev;

    public Controlador_Rev(){
        this.dtoRev = new DtoRevision();
        this.daoRev = new DaoRevision();
        this.gestor_Rev = new GESTOR_TECNOMECANICA();
        
        this.gestor_Rev.BtnInsertarTec.addActionListener(this);
        this.gestor_Rev.BtnBuscarTec.addActionListener(this);
        this.gestor_Rev.BtnModificarTec.addActionListener(this);
        this.gestor_Rev.BtnEliminarTec.addActionListener(this);
        this.gestor_Rev.BtnRegresarTec.addActionListener(this);
        this.gestor_Rev.BtnLimpiarTec.addActionListener(this);
    }

    
    public Controlador_Rev(DtoRevision dtoRev, DaoRevision daoRev, GESTOR_TECNOMECANICA gestor_Rev){
        this.dtoRev = dtoRev;
        this.daoRev = daoRev;
        this.gestor_Rev = gestor_Rev;
        
        this.gestor_Rev.BtnInsertarTec.addActionListener(this);
        this.gestor_Rev.BtnBuscarTec.addActionListener(this);
        this.gestor_Rev.BtnModificarTec.addActionListener(this);
        this.gestor_Rev.BtnEliminarTec.addActionListener(this);
        this.gestor_Rev.BtnRegresarTec.addActionListener(this);
        this.gestor_Rev.BtnLimpiarTec.addActionListener(this);
    }
    
   
    @Override
    public void actionPerformed(ActionEvent evt) {
        
        if(evt.getSource().equals(gestor_Rev.BtnInsertarTec)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Rev.BtnBuscarTec)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Rev.BtnModificarTec)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Rev.BtnEliminarTec)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Rev.BtnRegresarTec)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Rev.BtnLimpiarTec)){
            
            
        }
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);  
    }
    
    public void limpiar(){
        gestor_Rev.TxtReftecno.setText(null);
        gestor_Rev.TxtCedula.setText(null);
        gestor_Rev.TxtNombre.setText(null);
        gestor_Rev.TxtPlaca.setText(null);
        gestor_Rev.ComboCDA.getSelectedItem().toString();
        gestor_Rev.TxtFechaVigencia.setText("AAAA-MM-DD");
        gestor_Rev.TxtEstado.setText(null);
        
    }
}
