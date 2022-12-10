
package ed_ordenamientos;

import java.util.Scanner;

public class ED_Ordenamientos {
static int array[]={7,9,3,2,1,5};
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       OrdenamientoSeleccion seleccion = new OrdenamientoSeleccion();
       OrdenamientoInsercion insercion = new OrdenamientoInsercion();
       OrdenamientoCombinacion combinacion = new OrdenamientoCombinacion();
       int opc = 0;
       do{
           System.out.println("1.-Ordenamiento por selección");
           System.out.println("2.-Ordenamiento por inserción");
           System.out.println("3.-Ordenamiento por combinación");
           System.out.println("4.-salir");
           opc = leer.nextInt();
           switch(opc){
               case 1:
                   seleccion.ordenamiento(array);
                   System.out.println("--------------------------------------");
                   System.out.println("Ordenamiento por selección, Realizado");
                   System.out.println("--------------------------------------");
                   break;
               case 2:
                   insercion.Ordenamiento(array);
                   System.out.println("--------------------------------------");
                   System.out.println("Ordenamiento por inserción, Realizado");
                   System.out.println("--------------------------------------");
                   break;
               case 3:
                    combinacion.ordenamiento(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Ordenamiento por combinación, Realizado");
                    System.out.println("--------------------------------------");
                   break;
               case 4:
                   System.exit(0);
                   break;
               default:
                   System.err.println("Opcion incorrecta, intente de nuevo");
           }
       }while(opc != 4);
       
       
       
       
      
    }
    
}
