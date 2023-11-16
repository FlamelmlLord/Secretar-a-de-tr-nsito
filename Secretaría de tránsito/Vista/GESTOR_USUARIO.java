package Vista;

public class GESTOR_USUARIO extends javax.swing.JFrame {

    public GESTOR_USUARIO() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BtnRegresarUsu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnInsertarUsu = new javax.swing.JButton();
        BtnBuscarUsu = new javax.swing.JButton();
        BtnModificarUsu = new javax.swing.JButton();
        BtnEliminarUsu = new javax.swing.JButton();
        BtnLimpiarUsu = new javax.swing.JButton();
        BtnTablaUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        ComboUsuario = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField3.setText("jTextField1");

        jTextField5.setText("jTextField1");

        jPanel1.setBackground(new java.awt.Color(141, 153, 174));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(217, 4, 41));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FUNCIONARIO");

        BtnRegresarUsu.setBackground(new java.awt.Color(43, 45, 66));
        BtnRegresarUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnRegresarUsu.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarUsu.setText("REGRESAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BtnRegresarUsu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(BtnRegresarUsu)
                .addGap(111, 111, 111))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 482));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("GESTOR DE DATOS DEL TRANSITO DE BOGOTA ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 6, -1, -1));

        BtnInsertarUsu.setBackground(new java.awt.Color(43, 45, 66));
        BtnInsertarUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnInsertarUsu.setForeground(new java.awt.Color(255, 255, 255));
        BtnInsertarUsu.setText("INSERTAR");
        jPanel1.add(BtnInsertarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 95, 104, 45));

        BtnBuscarUsu.setBackground(new java.awt.Color(43, 45, 66));
        BtnBuscarUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnBuscarUsu.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscarUsu.setText("BUSCAR");
        jPanel1.add(BtnBuscarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 183, 104, 45));

        BtnModificarUsu.setBackground(new java.awt.Color(43, 45, 66));
        BtnModificarUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnModificarUsu.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarUsu.setText("MODIFICAR");
        jPanel1.add(BtnModificarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 268, 104, 45));

        BtnEliminarUsu.setBackground(new java.awt.Color(43, 45, 66));
        BtnEliminarUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnEliminarUsu.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarUsu.setText("ELIMINAR");
        jPanel1.add(BtnEliminarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 347, 104, 45));

        BtnLimpiarUsu.setBackground(new java.awt.Color(43, 45, 66));
        BtnLimpiarUsu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnLimpiarUsu.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiarUsu.setText("LIMPIAR");
        jPanel1.add(BtnLimpiarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 442, -1, -1));

        BtnTablaUsuario.setBackground(new java.awt.Color(43, 45, 66));
        BtnTablaUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnTablaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnTablaUsuario.setText("GENERAR TABLA USUARIO");
        jPanel1.add(BtnTablaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CEDULA :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 98, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 145, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TIPO DE USUARIO :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CORREO :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DIRECCION :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));
        jPanel1.add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 95, 340, -1));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 142, 340, -1));
        jPanel1.add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 340, -1));
        jPanel1.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 340, -1));

        ComboUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Propietario", "Conductor" }));
        jPanel1.add(ComboUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnBuscarUsu;
    public javax.swing.JButton BtnEliminarUsu;
    public javax.swing.JButton BtnInsertarUsu;
    public javax.swing.JButton BtnLimpiarUsu;
    public javax.swing.JButton BtnModificarUsu;
    public javax.swing.JButton BtnRegresarUsu;
    public javax.swing.JButton BtnTablaUsuario;
    public javax.swing.JComboBox<String> ComboUsuario;
    public javax.swing.JTextField TxtCedula;
    public javax.swing.JTextField TxtCorreo;
    public javax.swing.JTextField TxtDireccion;
    public javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
