/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author USER
 */
public class GESTOR_PAGOS extends javax.swing.JFrame {

    /**
     * Creates new form GESTOR_PAGOS
     */
    public GESTOR_PAGOS() {
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
        BtnRegresarPago = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnInsertarPago = new javax.swing.JButton();
        BtnBuscarPago = new javax.swing.JButton();
        BtnModificarPago = new javax.swing.JButton();
        BtnEliminarPago = new javax.swing.JButton();
        BtnLimpiarPago = new javax.swing.JButton();
        BtnGenerarPago = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtPlaca = new javax.swing.JTextField();
        TxtRefComparendo = new javax.swing.JTextField();
        TxtCuotas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtRefImpuesto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtFechaPa = new javax.swing.JTextField();
        TxtEstado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtMonto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(141, 153, 174));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(217, 4, 41));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FUNCIONARIO");

        BtnRegresarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnRegresarPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnRegresarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarPago.setText("REGRESAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BtnRegresarPago))
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
                .addComponent(BtnRegresarPago)
                .addGap(111, 111, 111))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 482));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("GESTOR DE DATOS DEL TRANSITO DE BOGOTA ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 6, -1, -1));

        BtnInsertarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnInsertarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnInsertarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnInsertarPago.setText("INSERTAR");
        jPanel1.add(BtnInsertarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 95, 104, 45));

        BtnBuscarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnBuscarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnBuscarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscarPago.setText("BUSCAR");
        jPanel1.add(BtnBuscarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 183, 104, 45));

        BtnModificarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnModificarPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnModificarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarPago.setText("MODIFICAR");
        jPanel1.add(BtnModificarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 268, 104, 45));

        BtnEliminarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnEliminarPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnEliminarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminarPago.setText("ELIMINAR");
        jPanel1.add(BtnEliminarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 347, 104, 45));

        BtnLimpiarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnLimpiarPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnLimpiarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnLimpiarPago.setText("LIMPIAR");
        jPanel1.add(BtnLimpiarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 442, -1, -1));

        BtnGenerarPago.setBackground(new java.awt.Color(43, 45, 66));
        BtnGenerarPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnGenerarPago.setForeground(new java.awt.Color(255, 255, 255));
        BtnGenerarPago.setText("GENERAR TABLA HISTORIAL PAGOS");
        jPanel1.add(BtnGenerarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PAGOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CEDULA  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PLACA :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("REF COMPARENDO :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("FECHA PAGO :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CUOTAS :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));
        jPanel1.add(TxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 300, -1));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 300, -1));
        jPanel1.add(TxtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 300, -1));
        jPanel1.add(TxtRefComparendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, -1));
        jPanel1.add(TxtCuotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 300, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("REF IMPUESTO:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));
        jPanel1.add(TxtRefImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 300, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ESTADO PAGO :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));
        jPanel1.add(TxtFechaPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 300, -1));
        jPanel1.add(TxtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 300, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("MONTO :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));
        jPanel1.add(TxtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 300, -1));

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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnBuscarPago;
    public javax.swing.JButton BtnEliminarPago;
    public javax.swing.JButton BtnGenerarPago;
    public javax.swing.JButton BtnInsertarPago;
    public javax.swing.JButton BtnLimpiarPago;
    public javax.swing.JButton BtnModificarPago;
    public javax.swing.JButton BtnRegresarPago;
    public javax.swing.JTextField TxtCedula;
    public javax.swing.JTextField TxtCuotas;
    public javax.swing.JTextField TxtEstado;
    public javax.swing.JTextField TxtFechaPa;
    public javax.swing.JTextField TxtMonto;
    public javax.swing.JTextField TxtNombre;
    public javax.swing.JTextField TxtPlaca;
    public javax.swing.JTextField TxtRefComparendo;
    public javax.swing.JTextField TxtRefImpuesto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
