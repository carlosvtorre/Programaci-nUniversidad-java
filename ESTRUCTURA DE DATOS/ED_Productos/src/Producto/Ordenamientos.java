package Producto;
import java.util.ArrayList;

public class Ordenamientos {
    //POR CÓDIGO
    public static void ordenamientoCombinacionCodigoProducto(ArrayList<Producto> arreglo, int Tope, boolean opcion){
        ordenarArregloPorCodigo(arreglo, 0, Tope - 1, opcion); 
    }
    
    public static void ordenarArregloPorCodigo(ArrayList<Producto> arreglo, int inferior, int superior, boolean opcion){
        if ((superior - inferior) >= 1){
            int medio1 = (inferior + superior) / 2;
            int medio2 = medio1 + 1;
            ordenarArregloPorCodigo(arreglo, inferior, medio1, opcion);
            ordenarArregloPorCodigo(arreglo, medio2, superior, opcion);
            combinarPorCodigo(arreglo, inferior, medio1, medio2, superior, opcion);
        }
    }
    public static void combinarPorCodigo(ArrayList<Producto> getArray, int getLeft, int getMid1, int getMid2, int getRight, boolean opcion){
        if (opcion) {
            //SI EL BOOLEAN ES VERDADERO, SE ORDENA DEL MODO ASCENDENTE
            int indiceIzq = getLeft; 
            int indiceDer = getMid2; 
            int indiceCombinado = getLeft; 
            Producto[] combinado = new Producto[getArray.size()]; 
            while (indiceIzq <= getMid1 && indiceDer <= getRight){
                if (getArray.get(indiceIzq).getCodigo().compareTo(getArray.get(indiceDer).getCodigo()) <= 0){
                    combinado[indiceCombinado++] = getArray.get(indiceIzq++);
                } else{
                    combinado[indiceCombinado++] = getArray.get(indiceDer++);
                }
            }
            if (indiceIzq == getMid2){
                while (indiceDer <= getRight){
                    combinado[indiceCombinado++] = getArray.get(indiceDer++);
                }
            } else{
                while (indiceIzq <= getMid1){
                    combinado[indiceCombinado++] = getArray.get(indiceIzq++);
                }
            }
            for (int i = getLeft; i <= getRight; i++)
            getArray.set(i, combinado[i]);
        } else {
            //SI NO, SE ORDENA DEL MODO DESCENDENTE
            int indiceIzq = getLeft; 
            int indiceDer = getMid2; 
            int indiceCombinado = getLeft; 
            Producto[] combinado = new Producto[getArray.size()]; 
            while (indiceIzq <= getMid1 && indiceDer <= getRight){
                if (getArray.get(indiceIzq).getCodigo().compareTo(getArray.get(indiceDer).getCodigo()) >= 0){
                    combinado[indiceCombinado++] = getArray.get(indiceIzq++);
                } else{
                    combinado[indiceCombinado++] = getArray.get(indiceDer++);
                }
            }
            if (indiceIzq == getMid2){
                while (indiceDer <= getRight){
                    combinado[indiceCombinado++] = getArray.get(indiceDer++);
                }
            } else{ 
                while (indiceIzq <= getMid1){
                    combinado[indiceCombinado++] = getArray.get(indiceIzq++);
                }
            }
            for (int i = getLeft; i <= getRight; i++)
            getArray.set(i, combinado[i]);
        }
    }
    
  //POR NOMBRE
    public static void ordenamientoBurbujaNombreProducto(ArrayList<Producto> getArray, int getNumProductos, boolean opcion) {
        if (opcion) {
            boolean clean = false;
            while(clean==false){
                boolean changed = false;
                for (int i = 0; i < getNumProductos-1; i++) {
                    if (getArray.get(i).getNombre().compareTo(getArray.get(i+1).getNombre()) > 0) {
                        Producto n;
                        n=getArray.get(i);
                        getArray.set(i, getArray.get(i+1));
                        getArray.set(i+1, n);
                        changed=true;
                    }
                }
                if (changed==false) {
                    clean=true;
                }
            }
        } else {
            boolean clean = false;
            while(clean==false){
                boolean changed = false;
                for (int i = 0; i < getNumProductos-1; i++) {
                    if (getArray.get(i).getNombre().compareTo(getArray.get(i+1).getNombre()) < 0) {
                        Producto n;
                        n=getArray.get(i);
                        getArray.set(i, getArray.get(i+1));
                        getArray.set(i+1, n);
                        changed=true;
                    }
                }
                if (changed==false) {
                    clean=true;
                }
            }
        }
    }
    
  //POR PRECIO
    public static void ordenamientoBurbujaPrecioProducto(ArrayList<Producto> getArray, int getNumProductos, boolean opcion) {
        if (opcion) {
            boolean clean = false;
            while(clean==false){
                boolean changed = false;
                for (int i = 0; i < getNumProductos-1; i++) {
                    if (getArray.get(i).getPrecio() > getArray.get(i+1).getPrecio()) {
                        Producto n;
                        n=getArray.get(i);
                        getArray.set(i, getArray.get(i+1));
                        getArray.set(i+1, n);
                        changed=true;
                    }
                }
                if (changed==false) {
                    clean=true;
                }
            }
        } else {
            boolean clean = false;
            while(clean==false){
                boolean changed = false;
                for (int i = 0; i < getNumProductos-1; i++) {
                    if (getArray.get(i).getPrecio() < getArray.get(i+1).getPrecio()) {
                    Producto n;
                        n=getArray.get(i);
                        getArray.set(i, getArray.get(i+1));
                        getArray.set(i+1, n);
                        changed=true;
                    }
                }
                if (changed==false) {
                    clean=true;
                }
            }
        }
    }
}
