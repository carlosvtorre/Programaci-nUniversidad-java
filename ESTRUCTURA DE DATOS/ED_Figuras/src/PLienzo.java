
import java.awt.Graphics;
import java.util.ArrayList;


public class PLienzo extends javax.swing.JPanel {
    
    ArrayList <Figura> figuras ;
    
    public PLienzo() {
        initComponents();
        figuras = new ArrayList();
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        for (int i = 0; i < figuras.size(); i++) {
            Figura fig = figuras.get(i);
            fig.draw(g);
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        Figura fig = new Figura(evt.getX(), evt.getY(),50,50);
        figuras.add(fig);
        repaint();
    }//GEN-LAST:event_formMouseClicked

    public void moverFigurasDerecha() {
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).moverDerecha();
        }
        repaint();
    }
    public void moverFigurasIzquierda(){
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).moverIzquierda();
        }
        repaint();
    }
    public void moverFigurasArriba(){
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).moverArriba();
        }
        repaint();
    }
    public void moverFigurasAbajo(){
        for (int i = 0; i < figuras.size(); i++) {
            figuras.get(i).moverAbajo();
        }
        repaint();
    }
    public void eliminarFigura(int n){
        figuras.remove(n-1);
        
        
    }
    // AGREGAR BOTONES PARA MOVER IZQUIERDA, ARRIBA, ABAJO, SPINER PARA SELECCIONAR LA FIGURA, Y ELIMINAR FIGURA ESPICIFICA Y TODOS 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
