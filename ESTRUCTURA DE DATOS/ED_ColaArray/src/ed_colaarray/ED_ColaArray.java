
package ed_colaarray;

import javax.swing.JOptionPane;


public class ED_ColaArray {

   
    public static void main(String[] args) {
        Queue cola = new Queue(5);
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú Cola\n"
                + "1.- Agregar a la Cola \n"
                + "2.- Despachar \n"
                + "3.- Mostrar Cola \n"
                + "4.- Salir \n"
                ));
            switch(opcion){
                case 1:
                    int numPush;
                    numPush = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero a la Cola : "));
                    cola.push(numPush);
                    break;
                case 2:
                    cola.pop();
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    letrero("La opcion ingresada no existe.");
                    break;
            }
            
            
            
            
        }while(opcion!=4);
        
    }
    
    public static void letrero(String letrero){
        JOptionPane.showMessageDialog(null, letrero);
    }
    
}
