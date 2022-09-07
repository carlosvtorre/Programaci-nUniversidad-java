/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_herencia_polimorfismo;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Program_herencia_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion;
        do{
        
        System.out.println("seleccione una opción:");
        System.out.println("1.-Dama ");
        System.out.println("2.-Caballero");
        System.out.println("3.-Infantil");
        System.out.println("4.-Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1 :
                dama dama1 = new dama();
                dama1.menu_dama();
                break;
            case 2 : 
                caballeros caballeros1 = new caballeros();
                caballeros1.menu_caballero();
                break;
            case 3 :
                infantil infantil1 = new infantil (); 
                infantil1.menu_infantil();
                break;
            case 4 :
                System.exit(0);
                break;
            default:
                System.err.println("dato incorrecto");
                break;
        }
          
        }while(opcion!=4);
    }
    
}
