
package Producto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DBuscarProductos extends javax.swing.JDialog {
DefaultTableModel tablero;
    public DBuscarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tablero = (DefaultTableModel) TProductos.getModel();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CTBuscar = new javax.swing.JTextField();
        BBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TProductos = new javax.swing.JTable();
        LBuscarProductos = new javax.swing.JLabel();
        CBAtributos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        BBuscar.setText("Buscar");
        BBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BBuscarMouseClicked(evt);
            }
        });

        TProductos.setBackground(new java.awt.Color(248, 248, 250));
        TProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TProductos.setForeground(new java.awt.Color(51, 51, 51));
        TProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TProductos.setRowHeight(25);
        TProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TProductos);

        LBuscarProductos.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        LBuscarProductos.setText("BUSCAR PRODUCTOS");

        CBAtributos.setFont(new java.awt.Font("Arial Narrow", 1, 12)); // NOI18N
        CBAtributos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nombre", "Precio" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(CBAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(LBuscarProductos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBuscarProductos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CTBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BBuscarMouseClicked
        if (CTBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un producto", "Campo vacío", 2);
        } else {
            int nFilas = tablero.getRowCount();
            for (int i = nFilas-1; i >= 0; i--) {
                tablero.removeRow(i);
            }
            Object atributo = CBAtributos.getSelectedItem();
            String filtro = CTBuscar.getText();
            int matches = Busquedas.buscarProductos(atributo, filtro, tablero);
            if (matches == 0) {
                JOptionPane.showMessageDialog(null, "Sin Resultados", "Sin coincidencias", 1); 
            }
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
            java.util.logging.Logger.getLogger(DBuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DBuscarProductos dialog = new DBuscarProductos(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> CBAtributos;
    private javax.swing.JTextField CTBuscar;
    private javax.swing.JLabel LBuscarProductos;
    private javax.swing.JTable TProductos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
