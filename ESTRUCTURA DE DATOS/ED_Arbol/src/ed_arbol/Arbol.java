
package ed_arbol;

import java.util.LinkedList;

public class Arbol {
    private Nodo raiz;
    private LinkedList<Nodo> padres;
    public Arbol(){
        raiz = new Nodo (null, 1);
    }
    
    public String mostrarArbol(){
        return raiz.mostrar();
    }
    public Nodo obtenerRoot(){
        return raiz;
    }
    public void mostrarRec(LinkedList<Nodo> hijos, Nodo padre){
        for (int i = 0; i < hijos.size(); i++) {
            Nodo nodo = hijos.get(i);
            System.out.println(nodo.obtenerValorPadre());
            System.out.println("  "+nodo.obtenerValor());
            mostrarRec(nodo.obtenerHijos(), nodo.obtenerPadre());
        }
    }
    public void guardarPadres(LinkedList <Nodo> hijos){
        for (int i = 0; i < hijos.size(); i++) { 
            Nodo nodo = hijos.get(i);
            if(nodo.esPadre()==true){
                padres.add(hijos.get(i));
                System.out.println(hijos.get(i));
            }
            else{
                System.out.println(hijos.get(i)+" No es padre");
            }
        }
        
    }
}
