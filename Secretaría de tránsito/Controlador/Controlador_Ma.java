package Controlador;

import Modelo.DaoMatricula;
import Modelo.DtoMatricula;
import Vista.GESTOR_MATRICULA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador_Ma implements ActionListener{

    private DtoMatricula dtoMatri;
    private DaoMatricula daoMatri;
    private GESTOR_MATRICULA gestor_Ma;

    public Controlador_Ma(){
        this.dtoMatri = new DtoMatricula();
        this.daoMatri = new DaoMatricula();
        this.gestor_Ma = new GESTOR_MATRICULA();
        
        this.gestor_Ma.BtnInsertarMat.addActionListener(this);
        this.gestor_Ma.BtnBuscarMat.addActionListener(this);
        this.gestor_Ma.BtnModificarMat.addActionListener(this);
        this.gestor_Ma.BtnEliminarMat.addActionListener(this);
        this.gestor_Ma.BtnRegresarMat.addActionListener(this);
        this.gestor_Ma.BtnLimpiarMat.addActionListener(this);
    }

    public Controlador_Ma(DtoMatricula dtoMatri, DaoMatricula daoMatri, GESTOR_MATRICULA gestor_Ma){
        this.dtoMatri = dtoMatri;
        this.daoMatri = daoMatri;
        this.gestor_Ma = gestor_Ma;
        
        this.gestor_Ma.BtnInsertarMat.addActionListener(this);
        this.gestor_Ma.BtnBuscarMat.addActionListener(this);
        this.gestor_Ma.BtnModificarMat.addActionListener(this);
        this.gestor_Ma.BtnEliminarMat.addActionListener(this);
        this.gestor_Ma.BtnRegresarMat.addActionListener(this);
        this.gestor_Ma.BtnLimpiarMat.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
    public void mensaje(String msg, String btn){
        
        JOptionPane.showMessageDialog(null, msg,btn,1);
    }
    
    public void limpiar(){
        gestor_Ma.TxtIdTraspaso.setText(null);
        gestor_Ma.TxtNombrePA.setText(null);
        gestor_Ma.TxtNombrePN.setText(null);
        gestor_Ma.TxtLugarT.setText(null);
        gestor_Ma.TxtFechaTras.setText("AAAA-MM-DD");
        gestor_Ma.TxtTipoMatricula.setText(null);
    }
}
