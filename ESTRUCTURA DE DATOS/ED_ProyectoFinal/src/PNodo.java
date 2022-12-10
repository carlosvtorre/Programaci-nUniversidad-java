
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;


public class PNodo extends javax.swing.JPanel {
PGraph arbol; 
private Nodo padre;
private LinkedList<Nodo> hijos;
    public PNodo(int x, int y,PGraph arbol) {
        initComponents();
        setBounds(x, y, 281, 116);
        this.arbol = arbol;
    }
    public String getDato() {
        return CTDato.getText();
    }

    public void setDato(String dato) {
        this.CTDato.setText(dato);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CTDato = new javax.swing.JTextField();
        LCambiarImg = new javax.swing.JLabel();
        LColor = new javax.swing.JLabel();

        CTDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTDatoActionPerformed(evt);
            }
        });

        LCambiarImg.setBackground(new java.awt.Color(255, 102, 102));
        LCambiarImg.setText("Cambiar Imagen del nodo");
        LCambiarImg.setOpaque(true);
        LCambiarImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LCambiarImgMouseClicked(evt);
            }
        });

        LColor.setBackground(new java.awt.Color(51, 51, 255));
        LColor.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LCambiarImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LColor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CTDato, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CTDato, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(LColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LCambiarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CTDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTDatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTDatoActionPerformed

    private void LCambiarImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCambiarImgMouseClicked
        JFileChooser selector  = new JFileChooser();
        int n = selector.showOpenDialog(this);//muestra el dialogo d apertura
        if(n == JFileChooser.APPROVE_OPTION){
            System.out.println("ruta: "+selector.getSelectedFile().getPath());
            ImageIcon img = new ImageIcon(selector.getSelectedFile().getPath());
            LColor.setIcon(img);
        }
    }//GEN-LAST:event_LCambiarImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CTDato;
    private javax.swing.JLabel LCambiarImg;
    private javax.swing.JLabel LColor;
    // End of variables declaration//GEN-END:variables
}
