package ed_arbol;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import javax.swing.JPanel;

public class Arbol extends JPanel {
    private LinkedList<Nodo> padres;

    private Nodo raiz;
    public static Nodo nodoSeleccionado;
    int botonPresionado = MouseEvent.BUTTON1;

    public Arbol() {
        raiz = new Nodo(null, "Root");
        add(raiz);
        setLayout(null);
        raiz.setBounds(200, 0, 200, 50);
        revalidate();
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1){
                    nodoSeleccionado.insertarHijo("",Arbol.this,e.getX(),e.getY());

                }
                botonPresionado = e.getButton();
                
            }
            

        });
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(botonPresionado==MouseEvent.BUTTON3){
                    Arbol.nodoSeleccionado.setLocation(e.getX(), e.getY());
                }
                
                //Nodo.this.revalidate();
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                raiz.repintar(raiz, Arbol.this);
            }
            
            

        });
        
    }

    public String mostrarArbol() {
        return raiz.mostrar();
    }

    public Nodo obtenerRoot() {
        return raiz;
    }

    public void mostrarRec(LinkedList<Nodo> getHijos, Nodo gePadre) {
        for (int i = 0; i < getHijos.size(); i++) {
            Nodo nodo = getHijos.get(i);
            System.out.println(nodo.obtenerValorPadre()+ ": "+nodo.obtenerValor()   );
            System.out.println("  ");
            mostrarRec(nodo.obtenerHijos(), nodo.obtenerPadre());
        }
    }
    
    public void linea(){
        for (int i = 0; i < nodoSeleccionado.obtenerHijos().size(); i++) {
            Graphics g = getGraphics();
            g.drawLine( nodoSeleccionado.getX(),  nodoSeleccionado.getY(),  nodoSeleccionado.obtenerPadre().getX(),  nodoSeleccionado.obtenerPadre().getY());
            g.drawLine( nodoSeleccionado.getX(),  nodoSeleccionado.getY(),  nodoSeleccionado.obtenerHijos().get(i).getX(), nodoSeleccionado.obtenerHijos().get(i).getY());
            repaint();
        }
    }
    
    
}
