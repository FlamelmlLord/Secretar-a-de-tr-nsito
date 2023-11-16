package Controlador;

import Modelo.DaoTesoreria;
import Modelo.DtoTesoreria;
import Vista.GESTOR_PAGOS;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Controlador_Pagos implements ActionListener{
    
    private DtoTesoreria dtoTes;
    private DaoTesoreria daoTes;
    private GESTOR_PAGOS gestor_Pagos;

    public Controlador_Pagos(){
        this.dtoTes = new DtoTesoreria();
        this.daoTes = new DaoTesoreria();
        this.gestor_Pagos = new GESTOR_PAGOS();
        
        this.gestor_Pagos.BtnInsertarPago.addActionListener(this);
        this.gestor_Pagos.BtnBuscarPago.addActionListener(this);
        this.gestor_Pagos.BtnModificarPago.addActionListener(this);
        this.gestor_Pagos.BtnEliminarPago.addActionListener(this);
        this.gestor_Pagos.BtnRegresarPago.addActionListener(this);
        this.gestor_Pagos.BtnLimpiarPago.addActionListener(this);
    }

    public Controlador_Pagos(DtoTesoreria dtoTes, DaoTesoreria daoTes, GESTOR_PAGOS gestor_Pagos){
        this.dtoTes = dtoTes;
        this.daoTes = daoTes;
        this.gestor_Pagos = gestor_Pagos;
        
        this.gestor_Pagos.BtnInsertarPago.addActionListener(this);
        this.gestor_Pagos.BtnBuscarPago.addActionListener(this);
        this.gestor_Pagos.BtnModificarPago.addActionListener(this);
        this.gestor_Pagos.BtnEliminarPago.addActionListener(this);
        this.gestor_Pagos.BtnRegresarPago.addActionListener(this);
        this.gestor_Pagos.BtnLimpiarPago.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evt){
        
      if(evt.getSource().equals(gestor_Pagos.BtnInsertarPago)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Pagos.BtnBuscarPago)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Pagos.BtnModificarPago)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Pagos.BtnEliminarPago)){
          
           
        }
       
       if(evt.getSource().equals(gestor_Pagos.BtnRegresarPago)){
            
            
        }
       
       if(evt.getSource().equals(gestor_Pagos.BtnLimpiarPago)){
            
            
        }  
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);  
    }
    
    public void limpiar(){
        gestor_Pagos.TxtCedula.setText(null);
        gestor_Pagos.TxtNombre.setText(null);
        gestor_Pagos.TxtPlaca.setText(null);
        gestor_Pagos.TxtRefComparendo.setText(null);
        gestor_Pagos.TxtRefImpuesto.setText(null);
        gestor_Pagos.TxtEstado.setText(null);
        gestor_Pagos.TxtFechaPa.setText("AAAA-MM-DD");
        gestor_Pagos.TxtMonto.setText(null);
        gestor_Pagos.TxtCuotas.setText(null);
    }
}
