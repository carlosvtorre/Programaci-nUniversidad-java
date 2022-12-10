package Main;


import Producto.DAltaProducto;
import Producto.DBuscarProducto;
import Producto.DBuscarProductos;
import Producto.DMostrarProductos;
import Producto.DOrdenarProductos;
import Producto.Producto;
import java.util.ArrayList;


public class FVentana extends javax.swing.JFrame {
    
    public static ArrayList<Producto> productos;

    public FVentana() {
        initComponents();
        setLocationRelativeTo(null);
        productos = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MProductos = new javax.swing.JMenu();
        MIAltaProducto = new javax.swing.JMenuItem();
        MIMostrarProductos = new javax.swing.JMenuItem();
        MIBuscarProducto = new javax.swing.JMenuItem();
        MIBuscarProductos = new javax.swing.JMenuItem();
        MIOrdenarProductos = new javax.swing.JMenuItem();
        MClientes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BSalir.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        BSalir.setText("Salir");
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });

        MProductos.setText("Productos");

        MIAltaProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MIAltaProducto.setText("Alta Producto");
        MIAltaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIAltaProductoActionPerformed(evt);
            }
        });
        MProductos.add(MIAltaProducto);

        MIMostrarProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        MIMostrarProductos.setText("Mostrar Productos");
        MIMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIMostrarProductosActionPerformed(evt);
            }
        });
        MProductos.add(MIMostrarProductos);

        MIBuscarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        MIBuscarProducto.setText("Buscar Producto");
        MIBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIBuscarProductoActionPerformed(evt);
            }
        });
        MProductos.add(MIBuscarProducto);

        MIBuscarProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        MIBuscarProductos.setText("Buscar Productos");
        MIBuscarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIBuscarProductosActionPerformed(evt);
            }
        });
        MProductos.add(MIBuscarProductos);

        MIOrdenarProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MIOrdenarProductos.setText("Ordenar Productos");
        MIOrdenarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIOrdenarProductosActionPerformed(evt);
            }
        });
        MProductos.add(MIOrdenarProductos);

        jMenuBar1.add(MProductos);

        MClientes.setText("Clientes ");
        jMenuBar1.add(MClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(BSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIAltaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIAltaProductoActionPerformed
        DAltaProducto altaProd = new DAltaProducto(this,true);
    }//GEN-LAST:event_MIAltaProductoActionPerformed

    private void MIBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIBuscarProductoActionPerformed
        DBuscarProducto buscarProd = new DBuscarProducto(this, true);
    }//GEN-LAST:event_MIBuscarProductoActionPerformed

    private void MIMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIMostrarProductosActionPerformed
        DMostrarProductos mostrarProd = new DMostrarProductos(this,true);
    }//GEN-LAST:event_MIMostrarProductosActionPerformed

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BSalirActionPerformed

    private void MIOrdenarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIOrdenarProductosActionPerformed
        DOrdenarProductos ordenarProd = new DOrdenarProductos(this, true);
    }//GEN-LAST:event_MIOrdenarProductosActionPerformed

    private void MIBuscarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIBuscarProductosActionPerformed
        DBuscarProductos buscarProds = new DBuscarProductos(this, true);
    }//GEN-LAST:event_MIBuscarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSalir;
    private javax.swing.JMenu MClientes;
    private javax.swing.JMenuItem MIAltaProducto;
    private javax.swing.JMenuItem MIBuscarProducto;
    private javax.swing.JMenuItem MIBuscarProductos;
    private javax.swing.JMenuItem MIMostrarProductos;
    private javax.swing.JMenuItem MIOrdenarProductos;
    private javax.swing.JMenu MProductos;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
