
package Producto;

import Main.FVentana;
import javax.swing.JOptionPane;


public class DOrdenarProductos extends javax.swing.JDialog {

    
    public DOrdenarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBNombre = new javax.swing.JComboBox<>();
        CBCodigo = new javax.swing.JComboBox<>();
        CBPrecio = new javax.swing.JComboBox<>();
        BOrdenarNombre = new javax.swing.JButton();
        BOrdenarCodigo = new javax.swing.JButton();
        BOrdenarPrecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel1.setText("Ordenamiento");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel3.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel4.setText("Precio:");

        CBNombre.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        CBNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        CBNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNombreActionPerformed(evt);
            }
        });

        CBCodigo.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        CBCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));

        CBPrecio.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        CBPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));

        BOrdenarNombre.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        BOrdenarNombre.setText("Ordenar ");
        BOrdenarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOrdenarNombreActionPerformed(evt);
            }
        });

        BOrdenarCodigo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        BOrdenarCodigo.setText("Ordenar");
        BOrdenarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOrdenarCodigoActionPerformed(evt);
            }
        });

        BOrdenarPrecio.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        BOrdenarPrecio.setText("Ordenar");
        BOrdenarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOrdenarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BOrdenarNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BOrdenarCodigo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(BOrdenarPrecio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CBNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOrdenarNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BOrdenarCodigo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOrdenarPrecio)
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBNombreActionPerformed

    private void BOrdenarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOrdenarNombreActionPerformed
        int opcion = CBNombre.getSelectedIndex();
        switch(opcion){
            case 0:
                Ordenamientos.ordenamientoBurbujaNombreProducto(FVentana.productos, FVentana.productos.size(), true);
                JOptionPane.showMessageDialog(null, "Los productos se han ordenado por NOMBRE en orden ASCENDENTE", "Productos ordenados", 1);
                break;
            case 1:
                Ordenamientos.ordenamientoBurbujaNombreProducto(FVentana.productos, FVentana.productos.size(), false);
                JOptionPane.showMessageDialog(null, "Los productos se han ordenado por NOMBRE en orden DESCENDENTE", "Productos ordenados", 1);
                break;
        }
    }//GEN-LAST:event_BOrdenarNombreActionPerformed

    private void BOrdenarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOrdenarCodigoActionPerformed
        int opcion = CBCodigo.getSelectedIndex();
        switch(opcion){
            case 0:
                Ordenamientos.ordenamientoCombinacionCodigoProducto(FVentana.productos, FVentana.productos.size(), true);
                JOptionPane.showMessageDialog(null, "Los productos se han ordenado por CÓDIGO en orden ASCENDENTE", "Productos ordenados", 1);
                break;
            case 1:
                Ordenamientos.ordenamientoCombinacionCodigoProducto(FVentana.productos, FVentana.productos.size(), false);
                JOptionPane.showMessageDialog(null, "Los productos se han ordenado por CÓDIGO en orden DESCENDENTE", "Productos ordenados", 1);
                break;
        }
    }//GEN-LAST:event_BOrdenarCodigoActionPerformed

    private void BOrdenarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOrdenarPrecioActionPerformed
        int opcion = CBPrecio.getSelectedIndex();
        switch(opcion){
            case 0:
                Ordenamientos.ordenamientoBurbujaPrecioProducto(FVentana.productos, FVentana.productos.size(), true);
                JOptionPane.showMessageDialog(null, "Los productos se han ordenado por PRECIO en orden ASCENDENTE", "Productos ordenados", 1);
                break;
            case 1:
                Ordenamientos.ordenamientoBurbujaPrecioProducto(FVentana.productos, FVentana.productos.size(), false);
                JOptionPane.showMessageDialog(null, "Los productos se han ordenado por PRECIO en orden DESCENDENTE", "Productos ordenados", 1);
                break;
        }
    }//GEN-LAST:event_BOrdenarPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(DOrdenarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DOrdenarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DOrdenarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DOrdenarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DOrdenarProductos dialog = new DOrdenarProductos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BOrdenarCodigo;
    private javax.swing.JButton BOrdenarNombre;
    private javax.swing.JButton BOrdenarPrecio;
    private javax.swing.JComboBox<String> CBCodigo;
    private javax.swing.JComboBox<String> CBNombre;
    private javax.swing.JComboBox<String> CBPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
