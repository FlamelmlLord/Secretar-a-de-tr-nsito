package Controlador;

import Modelo.Conexion;
import Vista.GESTOR_PRINCIPAL;
import Vista.LOGIN;
import Vista.VistaConductor;
import Vista.VistaPropietario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controlador_L implements ActionListener {
    
   private Controlador_P ContrlPrinc;
   private LOGIN login;

    public Controlador_L(){
        
        this.ContrlPrinc = new Controlador_P();
        this.login = new LOGIN();
        
        this.login.BtnIngresarL.addActionListener(this);
        this.login.BtnConsultaL.addActionListener(this);
        login.setVisible(true);
    }

   

    @Override
   public void actionPerformed(ActionEvent evt) {
       
        if(evt.getSource().equals(login.BtnIngresarL)){
          
            try {
                
                Conexion Conn = new Conexion();
                Conn.establecerConexion();
                String user= login.TxtUsuario.getText();
                String pass= String.valueOf(login.TxtContrasenia.getPassword());
                Statement st = Conn.establecerConexion().createStatement();
                String sql = "SELECT * FROM funcionario WHERE id_funcionario ='"+user+"' AND contrasenia_f = '"+pass+"'";
                ResultSet rs = st.executeQuery(sql);

                    if (rs.next()){
                        
                        GESTOR_PRINCIPAL PRINCIPAL = new GESTOR_PRINCIPAL();                        
                        PRINCIPAL.setVisible(true);
                        mensaje("Bienvenido" ,"INGRESAR");
                    }
            }catch(SQLException e){
                
                mensaje("Error Usuario o conexion con BD", "INGRESAR");
            }
        }
      
      
      
       if(evt.getSource().equals(login.BtnConsultaL)){
          
            try {
                
                Conexion Conn = new Conexion();
                String docu= login.TxtIdentificacion.getText();
                String placa= login.TxtPlaca.getText();
                String sql;

                    if (placa.isEmpty()){
                        
                        sql = "SELECT persona.identificación, persona.nombre, tipo_de_persona.`id_tipo_persona_fk` FROM persona JOIN tipo_de_persona ON persona.identificación = tipo_de_persona.identificación_fk WHERE identificación = '"+docu+"';";
                    
                    }else{

                        sql = "SELECT persona_vehículo.identificación_fk, persona_vehículo.placa_fk, tipo_de_persona.`id_tipo_persona_fk` FROM persona_vehículo JOIN tipo_de_persona ON persona_vehículo.identificación_fk = tipo_de_persona.identificación_fk WHERE persona_vehículo.identificación_fk = '"+docu+"' AND persona_vehículo.placa_fk = '"+placa+"';";
                    
                    }
                    Statement st = Conn.establecerConexion().createStatement();    
                    ResultSet rs = st.executeQuery(sql);

                    if (rs.next()){

                        int idTipoMonigote = rs.getInt("id_tipo_persona_fk");
                            
                        if (idTipoMonigote == 1){

                            VistaConductor vCond = new VistaConductor();
                            vCond.setVisible(true);
                            mensaje("Bienvenido", "CONSULTAR");
                        }else if (idTipoMonigote ==2){

                            VistaPropietario vProp = new VistaPropietario();
                            vProp.setVisible(true);
                            mensaje("Bienvenido", "CONSULTAR");
                            
                        }
                    }
            }catch(SQLException e){
                
                System.out.println("SQLState: " + e.getSQLState());
                System.out.println("Error Code: " + e.getErrorCode());
                e.printStackTrace();
                mensaje("Error Usuario o conexion con BD", "INGRESAR");
            }
      
        }
    }
    
    public void mensaje(String ms, String Btn){
        JOptionPane.showMessageDialog(null, ms, Btn, 1);   
    }
}
