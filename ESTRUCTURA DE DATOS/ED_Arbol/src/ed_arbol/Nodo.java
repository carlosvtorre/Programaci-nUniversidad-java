
package ed_arbol;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Nodo {
    private Nodo padre;
    private int valor;
    private LinkedList <Nodo> hijos;
    
    public Nodo(Nodo padre, int valor){
        this.padre = padre;
        this.valor = valor;
        hijos = new LinkedList<>();
    }
    
    public void insertarHijo(int valor){
        if (hijos.size() <= 1){
            Nodo hijo = new Nodo(this, valor);
            hijos.add(hijo);
        }
        else{
            JOptionPane.showMessageDialog(null, "No puede insertar más de 2 hijos");
        
        }
        
    }
    
    public void eliminarHijo(int posicion){
        hijos.remove(posicion);
    }
    
    public boolean esPadre(){
        return hijos.size()>0;
    }
    
    public String mostrar(){
        String res = "padre:"+obtenerValorPadre()+" valor"+valor+"\n";
        for (int i = 0; i < hijos.size(); i++) {
            Nodo hijo = hijos.get(i);
            res += hijo.mostrar();
        }
        return res;
    }
    public String obtenerValorPadre(){
        String res="";
        if(padre != null){
            return padre.valor+"";
        }else{
            return "Raiz";
        }
    }
    
    public int obtenerValor(){
        return ((this!=null)?valor:0);
    }
    
    public Nodo obtenerPadre(){
        return padre;
    }
    public LinkedList<Nodo> obtenerHijos(){
        return hijos;
    }
}
