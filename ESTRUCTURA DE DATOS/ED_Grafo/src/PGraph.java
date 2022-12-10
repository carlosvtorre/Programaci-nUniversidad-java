
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PGraph extends javax.swing.JPanel {

    public static ArrayList<Nodo> nodos;
    public static ArrayList<Nodo> vecinos;
    
    public PGraph() {
        initComponents();
        nodos = new ArrayList();
        vecinos = new ArrayList();
    }
    public static ArrayList<Nodo> getNodos() {
        return nodos;
    }
    
    public static ArrayList<Nodo> getVecinos() {
        return vecinos;
    }
    
    
    
    public void dibujarArco(Nodo ini, Nodo fin){
        Graphics g = getGraphics();
        g.drawLine(ini.getX(), ini.getY(), fin.getX(), fin.getY());
        int d = (int) Math.sqrt(Math.pow(fin.getX()-ini.getX(), 2)+ Math.pow(fin.getY()-ini.getY(), 2));
        g.drawString(""+d, (ini.getX()+fin.getX())/2, (ini.getY()+fin.getY())/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //crar un nodo cada que damos clik
        Nodo nodo = new Nodo(evt.getX(),evt.getY(),this);
        add(nodo);
        nodos.add(nodo);
        revalidate();
        JOptionPane.showMessageDialog(null, "Ingrese un nombre en el nodo");
        
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
