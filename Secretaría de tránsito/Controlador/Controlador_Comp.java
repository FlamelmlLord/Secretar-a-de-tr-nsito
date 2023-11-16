package Controlador;

import Modelo.DaoComparendo;
import Modelo.DtoComparendo;
import Vista.GESTOR_COMPARENDOS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_Comp implements ActionListener{

    private DtoComparendo dtocomp;
    private DaoComparendo daocomp;
    private GESTOR_COMPARENDOS gestor_comp;

    public Controlador_Comp(){
        this.dtocomp = new DtoComparendo();
        this.daocomp = new DaoComparendo();
        this.gestor_comp = new GESTOR_COMPARENDOS();
        
        this.gestor_comp.BtnInsertarComp.addActionListener(this);
        this.gestor_comp.BtnBuscarComp.addActionListener(this);
        this.gestor_comp.BtnModificarComp.addActionListener(this);
        this.gestor_comp.BtnEliminarComp.addActionListener(this);
        this.gestor_comp.BtnRegresarComp.addActionListener(this);
        this.gestor_comp.BtnLimpiarComp.addActionListener(this);
    }
       
    
    public Controlador_Comp(DtoComparendo dtocomp, DaoComparendo daocomp, GESTOR_COMPARENDOS gestor_comp){
        this.dtocomp = dtocomp;
        this.daocomp = daocomp;
        this.gestor_comp = gestor_comp;
        
        this.gestor_comp.BtnInsertarComp.addActionListener(this);
        this.gestor_comp.BtnBuscarComp.addActionListener(this);
        this.gestor_comp.BtnModificarComp.addActionListener(this);
        this.gestor_comp.BtnEliminarComp.addActionListener(this);
        this.gestor_comp.BtnRegresarComp.addActionListener(this);
        this.gestor_comp.BtnLimpiarComp.addActionListener(this);
    }
     
    
    @Override
    public void actionPerformed(ActionEvent evt) {

     if(evt.getSource().equals(gestor_comp.BtnInsertarComp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_comp.BtnBuscarComp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_comp.BtnModificarComp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_comp.BtnEliminarComp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_comp.BtnRegresarComp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_comp.BtnLimpiarComp)){
            
            
        }   
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);  
    }
    
     public void limpiar(){
        gestor_comp.TxtRefComparendo.setText(null);
        gestor_comp.TxtCedula.setText(null);
        gestor_comp.TxtNombre.setText(null);
        gestor_comp.TxtPlaca.setText(null);
        gestor_comp.ComboInfraccion.getSelectedItem().toString();
        gestor_comp.TxtFechaInf.setText("AAA-MM-DD");
        gestor_comp.TxtFechaPa.setText("AAAA-MM-DD");
        gestor_comp.TxtEstado.setText(null);
  
    }
}
