package Controlador;

import Modelo.DaoImpuesto;
import Modelo.DtoImpuesto;
import Vista.GESTOR_IMPUESTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_Imp implements ActionListener{
    
    private DtoImpuesto dtoImp;
    private DaoImpuesto daoImp;
    private GESTOR_IMPUESTO gestor_Imp;

    public Controlador_Imp(){ 
        this.dtoImp = new DtoImpuesto();
        this.daoImp = new DaoImpuesto();
        this.gestor_Imp = new GESTOR_IMPUESTO();
        
        this.gestor_Imp.BtnInsertarImp.addActionListener(this);
        this.gestor_Imp.BtnBuscarImp.addActionListener(this);
        this.gestor_Imp.BtnModificarImp.addActionListener(this);
        this.gestor_Imp.BtnEliminarImp.addActionListener(this);
        this.gestor_Imp.BtnRegresarImp.addActionListener(this);
        this.gestor_Imp.BtnLimpiarImp.addActionListener(this);
    }
    
    
    public Controlador_Imp(DtoImpuesto dtoImp, DaoImpuesto daoImp, GESTOR_IMPUESTO gestor_Imp) {
        this.dtoImp = dtoImp;
        this.daoImp = daoImp;
        this.gestor_Imp = gestor_Imp;
        
        this.gestor_Imp.BtnInsertarImp.addActionListener(this);
        this.gestor_Imp.BtnBuscarImp.addActionListener(this);
        this.gestor_Imp.BtnModificarImp.addActionListener(this);
        this.gestor_Imp.BtnEliminarImp.addActionListener(this);
        this.gestor_Imp.BtnRegresarImp.addActionListener(this);
        this.gestor_Imp.BtnLimpiarImp.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {

       if(evt.getSource().equals(gestor_Imp.BtnInsertarImp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Imp.BtnBuscarImp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Imp.BtnModificarImp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Imp.BtnEliminarImp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Imp.BtnRegresarImp)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Imp.BtnLimpiarImp)){
            
            
        }
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);  
    }
    
    public void limpiar(){
        gestor_Imp.TxtRefImpuesto.setText(null);
        gestor_Imp.TxtCedula.setText(null);
        gestor_Imp.TxtNombre.setText(null);
        gestor_Imp.TxtPlaca.setText(null);
        gestor_Imp.TxtFechaLim.setText("AAA-MM-DD");
        gestor_Imp.TxtFechaVig.setText("AAAA-MM-DD");
        gestor_Imp.TxtEstado.setText(null);
  
    }
}
