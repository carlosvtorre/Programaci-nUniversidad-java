/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_desiciones;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Proyecto_desiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String nombre,tamaño;
        int ventas;
        System.out.print("nombre de la pizzeria: ");
        nombre=leer.nextLine();
        System.out.println("el rango es de 10 a 70");
        System.out.print("cuantas pizzas se vendieron durante el dia: ");
        ventas=leer.nextInt();
        if (ventas>=10 && ventas<=20){
            System.out.println("mala venta");
        }
        else {
            if (ventas>=21 && ventas<=30){
                System.out.println("venta regular");
            }
            else {
                if (ventas>=31 && ventas<=40){
                    System.out.println("venta buena");
                }
                else {
                    if (ventas>=41 && ventas<=70){
                        System.out.println("venta exelente");
                    }
                    else {
                        System.out.println("Error en el dato");
                    }
                }
            }
        }
        leer.nextLine();
        System.out.println("que tamaño de piza se vendio más en el dia 1,2 o 3:");
        tamaño=leer.nextLine();
        if (tamaño.equalsIgnoreCase("uno")|| tamaño.equals("1")){
            System.out.println("la pizza que mas se vendio fue la pizza chica");
}
        else {
            if (tamaño.equalsIgnoreCase("dos")|| tamaño.equals("2")){
                System.out.println("la pizza que mas se vendio fue la mediana");
          }
            else {
                if (tamaño.equalsIgnoreCase("3")|| tamaño.equals("3")){
                    System.out.println("la pizza que mas se vendio fue la grande");
                }
                else {
                    System.out.println("Error en el dato");
                }
              
            }
        }
        System.out.println("la pizeria "+ nombre +" vendio mas pizas del tamaño "+ tamaño +" y en el dia se vendieron un total de  "+ ventas +" pizas");
       
        
         
        
        
            
        
    }
    
}
