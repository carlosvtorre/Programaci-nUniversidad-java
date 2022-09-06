/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispositivo;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class DISPOSITIVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String dispositivo_movil;
        double memoria_total,memoria_ocupada,memoria_libre,precio_venta,descuento_10,descuento;
        System.out.print("nombre del dispositivo movil: ");
        dispositivo_movil=leer.nextLine();
        System.out.print("capacidad de memoria: ");
        memoria_total=leer.nextDouble();
        System.out.print("memoria ocupada: ");
        memoria_ocupada=leer.nextDouble();
        System.out.print("precio de venta: ");
        precio_venta=leer.nextDouble();
        memoria_libre=memoria_total-memoria_ocupada;
        System.out.println("memoria libre:"+memoria_libre);
        descuento_10=precio_venta/10*9;
        descuento=precio_venta/10;
        System.out.println("descuento de 10 porciento: "+descuento);
        System.out.println("nuevo precio con descuento: "+descuento_10);
        
        
        
    }
    
}
