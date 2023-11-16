package Controlador;

import Vista.GESTOR_PRINCIPAL;
import Vista.GESTOR_USUARIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_P implements ActionListener{
    private GESTOR_PRINCIPAL gestor_P;
    private GESTOR_USUARIO gestor_U;
    private Controlador_U control_u;
    private Controlador_V control_v;
    private Controlador_Rev control_rev;
    private Controlador_Ma control_ma;
    private Controlador_Pagos control_pagos;
    private Controlador_Imp control_imp;
    private Controlador_Comp control_comp;

    
    public Controlador_P(){
        
        this.gestor_P = new GESTOR_PRINCIPAL();
        this.gestor_U = new GESTOR_USUARIO();        
        this.control_u = new Controlador_U();
        this.control_v = new Controlador_V();
        this.control_rev = new Controlador_Rev();
        this.control_ma = new Controlador_Ma();
        this.control_pagos = new Controlador_Pagos();
        this.control_imp = new Controlador_Imp();
        this.control_comp = new Controlador_Comp();

        
        gestor_P.MenuGestionUsuario.addActionListener(this);
        gestor_P.MenuSalir.addActionListener(this);
    }

    public Controlador_P(GESTOR_PRINCIPAL gestor_P, Controlador_U control_u, Controlador_V control_v, Controlador_Rev control_rev, Controlador_Ma control_ma, Controlador_Pagos control_pagos, Controlador_Imp control_imp, Controlador_Comp control_comp) {
        this.gestor_P = gestor_P;
        this.gestor_U = gestor_U;
        this.control_u = control_u;
        this.control_v = control_v;
        this.control_rev = control_rev;
        this.control_ma = control_ma;
        this.control_pagos = control_pagos;
        this.control_imp = control_imp;
        this.control_comp = control_comp;
        
        gestor_P.MenuGestionUsuario.addActionListener(this);
        gestor_P.MenuSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
    
        if(evt.getSource().equals(gestor_P.MenuGestionUsuario)){ 
            //Controlador_U control_u = new Controlador_U();
            gestor_U.setVisible(true);  
        }
        if(evt.getSource().equals(gestor_P.MenuSalir)){
            System.exit(0);
        }
    }   
}
