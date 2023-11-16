package Controlador;

import Modelo.DaoVehiculo;
import Modelo.DtoVehiculo;
import Vista.GESTOR_VEHICULO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_V implements ActionListener{

    private DtoVehiculo dtoveh;
    private DaoVehiculo daoveh;
    private GESTOR_VEHICULO gestor_V;

    public Controlador_V() {
        this.dtoveh = new DtoVehiculo();
        this.daoveh = new DaoVehiculo();
        this.gestor_V = new GESTOR_VEHICULO();
        
        this.gestor_V.BtnInsertarV.addActionListener(this);
        this.gestor_V.BtnBuscarV.addActionListener(this);
        this.gestor_V.BtnModificarV.addActionListener(this);
        this.gestor_V.BtnEliminarV.addActionListener(this);
        this.gestor_V.BtnRegresarVehi.addActionListener(this);
        this.gestor_V.BtnLimpiarVehi.addActionListener(this);       
    }

    
    public Controlador_V(DtoVehiculo dtoveh, DaoVehiculo daoveh, GESTOR_VEHICULO gestor_V) {
        this.dtoveh = dtoveh;
        this.daoveh = daoveh;
        this.gestor_V = gestor_V;
        
        this.gestor_V.BtnInsertarV.addActionListener(this);
        this.gestor_V.BtnBuscarV.addActionListener(this);
        this.gestor_V.BtnModificarV.addActionListener(this);
        this.gestor_V.BtnEliminarV.addActionListener(this);
        this.gestor_V.BtnRegresarVehi.addActionListener(this);
        this.gestor_V.BtnLimpiarVehi.addActionListener(this);     
    }

    
    @Override
    public void actionPerformed(ActionEvent evt) {
        
       if(evt.getSource().equals(gestor_V.BtnInsertarV)){
            
            
        }
       
       if(evt.getSource().equals(gestor_V.BtnBuscarV)){
            
            
        }
       
       if(evt.getSource().equals(gestor_V.BtnModificarV)){
            
            
        }
       
       if(evt.getSource().equals(gestor_V.BtnEliminarV)){
            
            
        }
       
       if(evt.getSource().equals(gestor_V.BtnRegresarVehi)){
            
            
        }
       
       if(evt.getSource().equals(gestor_V.BtnLimpiarVehi)){
            
            
        }
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);  
    }
    
    public void limpiar(){
        gestor_V.TxtCedula.setText(null);
        gestor_V.TxtNombre.setText(null);
        gestor_V.TxtPlaca.setText(null);
        gestor_V.TxtTipoVehiculo.setText(null);
        gestor_V.TxtColor.setText(null);
        gestor_V.TxtModelo.setText(null);
        gestor_V.TxtMarca.setText(null);
        
    }
}
