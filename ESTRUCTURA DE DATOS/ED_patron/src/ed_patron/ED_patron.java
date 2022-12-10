
package ed_patron;

import javax.swing.JOptionPane;


public class ED_patron {

    public static void main(String[] args) {
        String array[] = new String[8];
        String patron[] = new String [3];
        int s = 0;
        leerPatron(patron);
        for (int i = 0; i < array.length; i++) {
            String g = JOptionPane.showInputDialog("Ingrese una letra");
            array[i] = g;
        }

        for (int i = 0; i < array.length; i++) {
            if (i < (array.length - 2)) {
                if (array[i].equals(patron[0])) {
                    if (array[i + 1].equals(patron[1])) {
                        if (array[i + 2].equals(patron[2])) {
                            s++;
                        }
                    }
                }
            }
        }
        
        if (s >= 1) {
            letrero("El Patron se repite un total de "+s);
        } else {
            letrero("No se encuentra el patron");

        }
        System.out.println("patron");
        mostrarArreglo(patron);
        System.out.println("");
        System.out.println("arreglo");
        mostrarArreglo(array);
        
        
    }
    
    public static void letrero(String letrero){
        JOptionPane.showMessageDialog(null, letrero);
    }
    public static void leerPatron(String arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            int n = i+1;
            String g = JOptionPane.showInputDialog("La letra "+n+" del patron");
            arreglo[i] = g;
        }
    }
    
    public static void mostrarArreglo(String arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+",");
        }
        
    }
    
}
