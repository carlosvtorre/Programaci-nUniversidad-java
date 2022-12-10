
package Producto;

import Main.FVentana;
import javax.swing.JOptionPane;


public class DBuscarProducto extends javax.swing.JDialog {

    
    public DBuscarProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CTCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CTNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CTPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BModificar = new javax.swing.JButton();
        CBAtributos = new javax.swing.JComboBox<>();
        BEliminar = new javax.swing.JButton();
        CTBuscar = new javax.swing.JTextField();
        BBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setText("Buscar producto por:");

        BModificar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BModificarActionPerformed(evt);
            }
        });

        CBAtributos.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        CBAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nombre", "Precio" }));

        BEliminar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BEliminar.setText("Eliminar");
        BEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEliminarMouseClicked(evt);
            }
        });

        BBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        BBuscar.setText("Buscar");
        BBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CTCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                            .addComponent(CTNombre)
                                            .addComponent(CTPrecio)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BModificar)
                        .addGap(68, 68, 68)
                        .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BModificar)
                    .addComponent(BEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BModificarActionPerformed
        Object atributo = CBAtributos.getSelectedItem();
        String elemento = CTBuscar.getText();
        int posicion = Busquedas.buscarProducto(atributo, elemento);
        FVentana.productos.get(posicion).setCodigo(CTCodigo.getText());
        FVentana.productos.get(posicion).setNombre(CTNombre.getText());
        FVentana.productos.get(posicion).setPrecio(Double.parseDouble(CTPrecio.getText()));
        CTCodigo.setText("");
        CTNombre.setText("");
        CTPrecio.setText("");
        JOptionPane.showMessageDialog(null, "Datos actualizados exitosamente", "Datos actualizados", 1);
        
    }//GEN-LAST:event_BModificarActionPerformed

    private void BEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEliminarMouseClicked
        Object atributo = CBAtributos.getSelectedItem();
        String producto = CTBuscar.getText();
        int posicion = Busquedas.buscarProducto(atributo, producto);
        FVentana.productos.remove(posicion);
        CTCodigo.setText("");
        CTNombre.setText("");
        CTPrecio.setText("");
        JOptionPane.showMessageDialog(null, "Producto eliminado.", "Producto eliminado", 1);
         
    }//GEN-LAST:event_BEliminarMouseClicked

    private void BBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBuscarMouseClicked
        Object atributo = CBAtributos.getSelectedItem();
        String producto = CTBuscar.getText();
        int posicion = Busquedas.buscarProducto(atributo, producto);
        if (posicion >= 0) {
            CTCodigo.setText(String.valueOf(FVentana.productos.get(posicion).getCodigo()));
            CTNombre.setText(String.valueOf(FVentana.productos.get(posicion).getNombre()));
            CTPrecio.setText(String.valueOf(FVentana.productos.get(posicion).getPrecio()));
        } else{
            CTCodigo.setText("");
            CTNombre.setText("");
            CTPrecio.setText("");
            JOptionPane.showMessageDialog(null, "El producto no existe.", "Producto inválido.", 2);
        }
    }//GEN-LAST:event_BBuscarMouseClicked

    
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
            java.util.logging.Logger.getLogger(DBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DBuscarProducto dialog = new DBuscarProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBuscar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BModificar;
    private javax.swing.JComboBox<String> CBAtributos;
    private javax.swing.JTextField CTBuscar;
    private javax.swing.JTextField CTCodigo;
    private javax.swing.JTextField CTNombre;
    private javax.swing.JTextField CTPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
