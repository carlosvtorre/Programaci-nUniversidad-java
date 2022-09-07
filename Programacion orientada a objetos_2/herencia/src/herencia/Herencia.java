/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion;
        do{
        
        System.out.println("seleccione una opción:");
        System.out.println("1.-Alumnos");
        System.out.println("2.-Docentes");
        System.out.println("3.-Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1 :
                alumnos alumno1 = new alumnos();
                alumno1.menu_alumnos();
                break;
            case 2 : 
                docentes docente1 = new docentes();
                docente1.menu_docentes();
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
