/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class GESTOR_PRINCIPAL extends javax.swing.JFrame {

    /**
     * Creates new form GESTOR_PRINCIPAL
     */
    public GESTOR_PRINCIPAL() {
        initComponents();      
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/Recursos/Tal_cual.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(LabelSaludo.getWidth(), LabelSaludo.getHeight(), Image.SCALE_DEFAULT));
        LabelSaludo.setIcon(fondo1);
        this.repaint();
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelSaludo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuSalir1 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        MenuGestionUsuario = new javax.swing.JMenuItem();
        MenuVehiculo = new javax.swing.JMenuItem();
        MenuImpuesto = new javax.swing.JMenuItem();
        MenuTecno = new javax.swing.JMenuItem();
        MenuCompa = new javax.swing.JMenuItem();
        MenuPago = new javax.swing.JMenuItem();
        MenuMatricula = new javax.swing.JMenuItem();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(141, 153, 174));

        jPanel2.setBackground(new java.awt.Color(237, 242, 244));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SECRETARIA DE TRANSITO DE BOGOTA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BIENVENIDO AL SISTEMA DE GESTOR DE DATOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LabelSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(LabelSaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));

        MenuSalir1.setText("Salir");

        MenuSalir.setText("Salir");
        MenuSalir1.add(MenuSalir);

        jMenuBar1.add(MenuSalir1);

        MenuUsuario.setText("Gestor Datos");

        MenuGestionUsuario.setText("Gestion Usuario");
        MenuGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuGestionUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(MenuGestionUsuario);

        MenuVehiculo.setText("Gestion Vehiculo");
        MenuUsuario.add(MenuVehiculo);

        MenuImpuesto.setText("Gestion Impuesto");
        MenuUsuario.add(MenuImpuesto);

        MenuTecno.setText("Gestion TecnoMecanica");
        MenuUsuario.add(MenuTecno);

        MenuCompa.setText("Gestion Comparendos");
        MenuUsuario.add(MenuCompa);

        MenuPago.setText("Gestion Pagos");
        MenuUsuario.add(MenuPago);

        MenuMatricula.setText("Gestion Matricula");
        MenuUsuario.add(MenuMatricula);

        jMenuBar1.add(MenuUsuario);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuGestionUsuarioActionPerformed
        //new GESTOR_USUARIO().setVisible(true);
    }//GEN-LAST:event_MenuGestionUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSaludo;
    public javax.swing.JMenuItem MenuCompa;
    public javax.swing.JMenuItem MenuGestionUsuario;
    public javax.swing.JMenuItem MenuImpuesto;
    private javax.swing.JMenuItem MenuMatricula;
    public javax.swing.JMenuItem MenuPago;
    public javax.swing.JMenuItem MenuSalir;
    public javax.swing.JMenu MenuSalir1;
    public javax.swing.JMenuItem MenuTecno;
    public javax.swing.JMenu MenuUsuario;
    public javax.swing.JMenuItem MenuVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
