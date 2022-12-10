
package ed_busquedalineal;

import javax.swing.JOptionPane;

public class ED_BusquedaLineal {
static int arreglo[]= {34,56,2,10,77,51,93,30,5,52};
    
    public static void main(String[] args) {
        int vBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar: "));
        int pos = busquedaLineal(vBuscar);
        if(pos== -1){
            letrero("El valor "+vBuscar+" no se encuentra en el arreglo");
        }
        else{
            letrero("Se encontro el valor "+vBuscar+" en la posición: "+pos);
        }
    }
    public static int busquedaLineal(int valor){
        int centinela = -1;
        for (int i = 0; i<arreglo.length; i++){
            int actual = arreglo[i];
            if(actual==valor){
               centinela = i;
               break; //salir del ciclo
            }
        }
        return centinela;
    }
    
    
    
    public static void letrero(String letrero){
        JOptionPane.showMessageDialog(null, letrero);
    }
}
