
public class Nodo extends javax.swing.JPanel {
    public static Nodo nodoTemp;
    PGraph grafo;
    int tope;
    public Nodo(int x, int y,PGraph grafo) {
        initComponents();
        setBounds(x, y, 218, 39);
        this.grafo = grafo;
        tope = 0;
       
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
        LImg = new javax.swing.JLabel();

        CTDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTDatoActionPerformed(evt);
            }
        });

        LImg.setBackground(new java.awt.Color(102, 102, 255));
        LImg.setOpaque(true);
        LImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LImgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(LImg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(CTDato, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CTDato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(LImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CTDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTDatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTDatoActionPerformed

    private void LImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LImgMouseClicked
        if(nodoTemp==null){
            nodoTemp = this;
        }
        else{
            grafo.dibujarArco(nodoTemp, this);
            PGraph.vecinos.add(nodoTemp);
            PGraph.vecinos.add(this);
            nodoTemp = null;
            ListaAdyacencia lista = new ListaAdyacencia(PGraph.getNodos(), PGraph.getVecinos());
        }
    }//GEN-LAST:event_LImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CTDato;
    private javax.swing.JLabel LImg;
    // End of variables declaration//GEN-END:variables
}
