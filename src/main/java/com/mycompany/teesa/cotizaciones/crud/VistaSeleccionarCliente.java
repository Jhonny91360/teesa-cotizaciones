/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teesa.cotizaciones.crud;

/**
 *
 * @author jhonn
 */
public class VistaSeleccionarCliente extends javax.swing.JFrame {

    /**
     * Creates new form VistaSeleccionarCliente
     */
    
    private final VistaNuevaCotizacion vistaNuevaCotizacion; //referencia a la vista principal
    
    public VistaSeleccionarCliente(VistaNuevaCotizacion vistaNuevaCotizacion) {

        initComponents();
        
         this.vistaNuevaCotizacion = vistaNuevaCotizacion;           //inicializo
         
        this.setLocationRelativeTo(null);
        
        txt_selec_cliente_IdCliente.setEnabled(false); //Para que el id no se pueda editar
        txt_selec_cliente_CelularClientes.setEnabled(false);
        txt_selec_cliente_CiudadClientes.setEnabled(false);
        txt_selec_cliente_ClienteClientes.setEnabled(false);
        txt_selec_cliente_CorreoClientes.setEnabled(false);
        txt_selec_cliente_CorreoOpcionalClientes.setEnabled(false);
        txt_selec_cliente_DireccionClientes.setEnabled(false);
        txt_selec_cliente_FechaClientes.setEnabled(false);
        txt_selec_cliente_NitClientes.setEnabled(false);
        txt_selec_cliente_TelefonoClientes.setEnabled(false);
        txt_selec_cliente_EncargadoClientes.setEnabled(false);
        txt_selec_cliente_CargoClientes.setEnabled(false);
        
        CClientes objetoClientes = new CClientes();
        objetoClientes.MostrarClientes(tb_selec_ListaClientes);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_selec_cliente_NitClientes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_selec_cliente_ClienteClientes = new javax.swing.JTextField();
        txt_selec_cliente_DireccionClientes = new javax.swing.JTextField();
        txt_selec_cliente_CiudadClientes = new javax.swing.JTextField();
        txt_selec_cliente_TelefonoClientes = new javax.swing.JTextField();
        txt_selec_cliente_CelularClientes = new javax.swing.JTextField();
        txt_selec_cliente_CorreoClientes = new javax.swing.JTextField();
        txt_selec_cliente_CorreoOpcionalClientes = new javax.swing.JTextField();
        txt_selec_cliente_FechaClientes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_selec_cliente_IdCliente = new javax.swing.JTextField();
        txt_sel_cliente_buscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_selec_ListaClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_selec_cliente_EncargadoClientes = new javax.swing.JTextField();
        txt_selec_cliente_CargoClientes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Clientes"));

        jLabel1.setText("NIT_CEDULA:");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Ciudad:");

        jLabel5.setText("Telefono_fijo:");

        jLabel6.setText("Numero_celular:");

        jLabel7.setText("Correo:");

        jLabel8.setText("Correo_opcional:");

        jLabel9.setText("Fecha_registro:");

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("ID Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(45, 45, 45))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_selec_cliente_NitClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txt_selec_cliente_CiudadClientes)
                            .addComponent(txt_selec_cliente_DireccionClientes)
                            .addComponent(txt_selec_cliente_TelefonoClientes)
                            .addComponent(txt_selec_cliente_ClienteClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_selec_cliente_CelularClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_selec_cliente_CorreoClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_selec_cliente_CorreoOpcionalClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_selec_cliente_FechaClientes)
                            .addComponent(txt_selec_cliente_IdCliente))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_NitClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_ClienteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_DireccionClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_CiudadClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_TelefonoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_selec_cliente_CelularClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_CorreoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_CorreoOpcionalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_FechaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(131, 131, 131)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        txt_sel_cliente_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sel_cliente_buscarActionPerformed(evt);
            }
        });
        txt_sel_cliente_buscar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txt_sel_cliente_buscarPropertyChange(evt);
            }
        });
        txt_sel_cliente_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sel_cliente_buscarKeyTyped(evt);
            }
        });

        tb_selec_ListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_selec_ListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_selec_ListaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_selec_ListaClientes);

        jLabel11.setText("Buscar");

        jLabel12.setText("Encargado");

        jLabel13.setText("Cargo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(614, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addComponent(txt_sel_cliente_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_selec_cliente_CargoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_selec_cliente_EncargadoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1106, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(432, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sel_cliente_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_EncargadoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_selec_cliente_CargoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(85, 85, 85))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vistaNuevaCotizacion.agregarCliente(txt_selec_cliente_ClienteClientes.getText(),txt_selec_cliente_EncargadoClientes.getText(),txt_selec_cliente_CorreoClientes.getText(),txt_selec_cliente_CargoClientes.getText() ); //Llamo al metodo de  la vista principal que me permite agregar productos la tabla
        this.dispose(); //cerrar ventana
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb_selec_ListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_selec_ListaClientesMouseClicked
        CClientes objetoCliente = new CClientes();
        objetoCliente.seleccionarCliente(tb_selec_ListaClientes, txt_selec_cliente_IdCliente, txt_selec_cliente_NitClientes, txt_selec_cliente_ClienteClientes, txt_selec_cliente_DireccionClientes, txt_selec_cliente_CiudadClientes, txt_selec_cliente_TelefonoClientes, txt_selec_cliente_CelularClientes, txt_selec_cliente_CorreoClientes, txt_selec_cliente_CorreoOpcionalClientes, txt_selec_cliente_FechaClientes, txt_selec_cliente_EncargadoClientes, txt_selec_cliente_CargoClientes);

    }//GEN-LAST:event_tb_selec_ListaClientesMouseClicked

    private void txt_sel_cliente_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sel_cliente_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sel_cliente_buscarActionPerformed

    private void txt_sel_cliente_buscarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txt_sel_cliente_buscarPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_sel_cliente_buscarPropertyChange

    private void txt_sel_cliente_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sel_cliente_buscarKeyTyped
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null,"hola"+txt_sel_prod_producto_buscar.getText());
        CClientes objetoClientes = new CClientes();
        objetoClientes.BuscarClientes(tb_selec_ListaClientes,txt_sel_cliente_buscar.getText());

    }//GEN-LAST:event_txt_sel_cliente_buscarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaSeleccionarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VistaSeleccionarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_selec_ListaClientes;
    private javax.swing.JTextField txt_sel_cliente_buscar;
    private javax.swing.JTextField txt_selec_cliente_CargoClientes;
    private javax.swing.JTextField txt_selec_cliente_CelularClientes;
    private javax.swing.JTextField txt_selec_cliente_CiudadClientes;
    private javax.swing.JTextField txt_selec_cliente_ClienteClientes;
    private javax.swing.JTextField txt_selec_cliente_CorreoClientes;
    private javax.swing.JTextField txt_selec_cliente_CorreoOpcionalClientes;
    private javax.swing.JTextField txt_selec_cliente_DireccionClientes;
    private javax.swing.JTextField txt_selec_cliente_EncargadoClientes;
    private javax.swing.JTextField txt_selec_cliente_FechaClientes;
    private javax.swing.JTextField txt_selec_cliente_IdCliente;
    private javax.swing.JTextField txt_selec_cliente_NitClientes;
    private javax.swing.JTextField txt_selec_cliente_TelefonoClientes;
    // End of variables declaration//GEN-END:variables
}
