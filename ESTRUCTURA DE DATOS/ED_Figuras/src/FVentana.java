
public class FVentana extends javax.swing.JFrame {

    
    public FVentana() {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PCanvas = new PLienzo();
        BMoveDerecha = new javax.swing.JButton();
        BMoveIzquierda = new javax.swing.JButton();
        BMoverArriba = new javax.swing.JButton();
        BMoverAbajo = new javax.swing.JButton();
        SEliminar = new javax.swing.JSpinner();
        BEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PCanvasLayout = new javax.swing.GroupLayout(PCanvas);
        PCanvas.setLayout(PCanvasLayout);
        PCanvasLayout.setHorizontalGroup(
            PCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PCanvasLayout.setVerticalGroup(
            PCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );

        BMoveDerecha.setText("Derecha");
        BMoveDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMoveDerechaMouseClicked(evt);
            }
        });

        BMoveIzquierda.setText("Izquierda");
        BMoveIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMoveIzquierdaMouseClicked(evt);
            }
        });

        BMoverArriba.setText("Arriba");
        BMoverArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMoverArribaMouseClicked(evt);
            }
        });

        BMoverAbajo.setText("Abajo");
        BMoverAbajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMoverAbajoMouseClicked(evt);
            }
        });

        SEliminar.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        BEliminar.setText("Eliminar");
        BEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BEliminarMouseClicked(evt);
            }
        });
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BMoverAbajo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BMoveIzquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMoverArriba)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BMoveDerecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                .addComponent(BEliminar)
                .addGap(62, 62, 62)
                .addComponent(SEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BMoveDerecha)
                                    .addComponent(BMoveIzquierda)
                                    .addComponent(SEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BMoverArriba)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BMoverAbajo)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BEliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BMoveDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMoveDerechaMouseClicked
        PCanvas.moverFigurasDerecha();
    }//GEN-LAST:event_BMoveDerechaMouseClicked

    private void BMoveIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMoveIzquierdaMouseClicked
        PCanvas.moverFigurasIzquierda();
    }//GEN-LAST:event_BMoveIzquierdaMouseClicked

    private void BMoverArribaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMoverArribaMouseClicked
        PCanvas.moverFigurasArriba();
    }//GEN-LAST:event_BMoverArribaMouseClicked

    private void BMoverAbajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMoverAbajoMouseClicked
        PCanvas.moverFigurasAbajo();
    }//GEN-LAST:event_BMoverAbajoMouseClicked

    private void BEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BEliminarMouseClicked
        int NumEliminar= (Integer)SEliminar.getValue();
        PCanvas.eliminarFigura(NumEliminar);
        PCanvas.repaint();
        
    }//GEN-LAST:event_BEliminarMouseClicked

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BEliminarActionPerformed

    
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
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BMoveDerecha;
    private javax.swing.JButton BMoveIzquierda;
    private javax.swing.JButton BMoverAbajo;
    private javax.swing.JButton BMoverArriba;
    private PLienzo PCanvas;
    private javax.swing.JSpinner SEliminar;
    // End of variables declaration//GEN-END:variables
}
