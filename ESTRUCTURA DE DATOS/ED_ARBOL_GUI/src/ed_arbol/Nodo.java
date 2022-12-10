package ed_arbol;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nodo extends JPanel {

    private Nodo padre;
    private LinkedList<Nodo> hijos;
    private JLabel LEtiqueta;
    private JTextField CTCampo;
    private JButton LCambiarImg;

    public Nodo(Nodo getPadre, String getValor) {
        this.padre = getPadre;
        hijos = new LinkedList();
        setLayout(null);
        LEtiqueta = new JLabel();
        CTCampo = new JTextField();
        LCambiarImg = new JButton("Cambiar imagen del nodo");
        LEtiqueta.setBounds(0, 0, 50, 50);
        CTCampo.setBounds(50, 0, 150, 50);
        LCambiarImg.setBounds(200, 0, 200, 50);//x,y,ancho, alto
        add(LEtiqueta);
        add(CTCampo);
        add(LCambiarImg);
        CTCampo.setText(getValor);
        LEtiqueta.setOpaque(true);
        LCambiarImg.setOpaque(true);
        desSeleccionar();
        LEtiqueta.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (Arbol.nodoSeleccionado != null) {
                    Arbol.nodoSeleccionado.desSeleccionar();
                    seleccionar();
                    Arbol.nodoSeleccionado= Nodo.this;

                }
                else{
                    seleccionar();
                    Arbol.nodoSeleccionado= Nodo.this;
                }

            }

        });
        LEtiqueta.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Arbol.nodoSeleccionado.setLocation(e.getX(), e.getX()+50);
                //Nodo.this.revalidate();
                
            }
            

        });
        //revalidate();

    }

    public void seleccionar() {
        LEtiqueta.setBackground(Color.red);

        repaint();
    }

    public void desSeleccionar() {
        LEtiqueta.setBackground(Color.BLUE);
        repaint();
    }

    public void insertarHijo(String getValor, Arbol arbol, int x, int y) {
            Nodo hijo = new Nodo(this, getValor);
            hijos.add(hijo);
            arbol.add(hijo);
            hijo.setBounds(x, y,200, 50);
            Graphics g = arbol.getGraphics();
            g.drawLine(Arbol.nodoSeleccionado.getX(), Arbol.nodoSeleccionado.getY(), hijo.getX(), hijo.getY());
            JOptionPane.showMessageDialog(null, "Ingrese un nombre en el nodo");
            repaint();
        
    }

    public void eliminarHijo(int getIndex) {
        hijos.remove(getIndex);
    }

    public boolean esPadre() {
        return hijos.size() > 0;
    }

    public String mostrar() {
        String res = "Padre: " + obtenerValorPadre() + " | valor: " + CTCampo.getText() + "\n";
        for (int i = 0; i < hijos.size(); i++) {
            Nodo hijo = hijos.get(i);
            res += hijo.mostrar();
        }
        return res;
    }

    public String obtenerValorPadre() {
        String res = "";
        if (padre != null) {
            return padre.CTCampo.getText() + "";
        } else {
            return "Raíz";
        }
    }

    public String obtenerValor() {
        return ((this != null) ? CTCampo.getText() : "");
    }

    public Nodo obtenerPadre() {
        return padre;
    }

    public LinkedList<Nodo> obtenerHijos() {
        return hijos;
    }
    public void repintar(Nodo padre, Arbol arbol){
        Graphics g = arbol.getGraphics();
        for (int i = 0; i < padre.obtenerHijos().size(); i++) {
            Nodo nodo = padre.obtenerHijos().get(i);
            g.drawLine(padre.getX(), padre.getY(), padre.obtenerHijos().get(i).getX(), padre.obtenerHijos().get(i).getY());
            repintar(nodo,arbol);
        }
        repaint();
    }
}


