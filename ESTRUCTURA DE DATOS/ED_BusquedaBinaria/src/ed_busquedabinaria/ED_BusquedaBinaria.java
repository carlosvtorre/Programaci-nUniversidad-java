
package ed_busquedabinaria;

import javax.swing.JOptionPane;

public class ED_BusquedaBinaria {
static int arreglo[]= {1,2,3,4,5,6,7,8,9};
    
    public static void main(String[] args) {
        int buscar=7;
        int pos = busquedaBinaria(arreglo,buscar);
        if(pos == -1){
            letrero("El valor "+buscar+" no se encuentra en el arreglo");
        }
        else{
             letrero("Se encontro el valor "+buscar+" en la posición: "+pos);
        }
    }
   
public static int busquedaBinaria(int array[], int buscar){
        int limiteInferior = 0, limiteSuperior = array.length-1;
        int mitad = (limiteSuperior+limiteInferior+1)/2;
        int sentinela = -1;
    
        while(limiteInferior <= limiteSuperior && (sentinela == -1)){
            if(array[mitad] == buscar){
                return mitad;
            }
            else{
                if(buscar < array[mitad]){
                    limiteSuperior = mitad-1;
                }
                else{
                   limiteInferior = mitad+1; 
                }
                mitad = (limiteInferior+limiteSuperior+1)/2;
            }
        }
        return sentinela;
    }
    public static void letrero(String letrero){
        JOptionPane.showMessageDialog(null, letrero);
    }
    
    
    /*public static int busqueda_Binaria(int datos[], int clave){
        int inferior = 0; // extremo inferior del área de búsqueda
        int superior = datos.length - 1; // extremo superior del área de búsqueda
        int medio = (inferior + superior + 1) / 2; // elemento medio
        int ubicacion = -1; // devuelve el valor; -1 si no lo encontró
        do{
          if (clave == datos[medio]) 
          ubicacion = medio; // la ubicación es el elemento medio actual
          else if (clave < datos[medio]) // el elemento medio es demasiado alto
          superior = medio - 1; // elimina la mitad superior
          else // el elemento medio es demasiado bajo
           inferior = medio + 1; // elimina la mitad inferior

          medio = (inferior + superior + 1) / 2; // recalcula el elemento medio  
        }while((inferior <= superior) && (ubicacion == -1));
        return ubicacion;
    }
    */
    
    
}
