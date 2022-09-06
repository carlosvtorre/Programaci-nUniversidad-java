    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_programa;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class CLASES_PROGRAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        cliente cliente1=new cliente();
        pelicula_VENTA pelicula_VENTA1=new pelicula_VENTA();
        pelicula_RENTA pelicula_RENTA1=new pelicula_RENTA();
        
        int respuesta;
        do {
            System.out.println("1...Cliente");  
            System.out.println("2...venta de pelicula");
            System.out.println("3...renta de pelicula");
            System.out.println("4...finalizar");
            do {
            System.out.println("selesccione una opcion: ");
            respuesta=leer.nextInt();    
            }
            while (respuesta>4 || respuesta<1);
            switch (respuesta){
                case 1:cliente1.menu_cliente();break;
                case 2:pelicula_VENTA1.menu_venta();break;
                case 3:pelicula_RENTA1.menu_renta();break;
                
            }
            
        }
        while(respuesta!=4);
    }
    
}
