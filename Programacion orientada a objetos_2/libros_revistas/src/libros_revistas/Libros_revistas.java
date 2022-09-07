/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros_revistas;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Libros_revistas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion;
        do{
        
        System.out.println("seleccione una opción:");
        System.out.println("1.-Libros ");
        System.out.println("2.-Revistas");
        System.out.println("3.-Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1 :
                libros libros1 = new libros();
                libros1.menu_libros();
                break;
            case 2 : 
                Revistas Revistas1 = new Revistas();
                Revistas1.menu_Revistas();
                break;
            case 3 :
                System.exit(0);
                break;
            default:
                System.err.println("dato incorrecto");
                break;
        }
          
        }while(opcion!=3);
    }
    
}
