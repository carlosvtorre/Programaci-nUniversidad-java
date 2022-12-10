
package ed_arbol;


public class ED_Arbol {

    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        
        miArbol.obtenerRoot().insertarHijo(2);
        miArbol.obtenerRoot().insertarHijo(3);
        miArbol.obtenerRoot().obtenerHijos().get(0).insertarHijo(4);
        miArbol.obtenerRoot().obtenerHijos().get(1).insertarHijo(5);
        miArbol.obtenerRoot().obtenerHijos().get(0).insertarHijo(6);
        //miArbol.mostrarRec(miArbol.obtenerRoot().obtenerHijos(), miArbol.obtenerRoot());
        System.out.println("------------------");
       // miArbol.guardarPadres(miArbol.obtenerRoot().obtenerHijos());
    }
    
}
