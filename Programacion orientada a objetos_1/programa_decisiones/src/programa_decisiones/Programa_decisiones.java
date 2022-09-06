/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_decisiones;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Programa_decisiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre,tamaño;
        int ventas;
        System.out.print("nombre de la pizzeria: ");
        nombre=leer.nextLine();
        System.out.print("cuantas pizas se vendieron en el dia: ");
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
        System.out.println("que tamaño se vendio mas 1,2 o 3: ");
        tamaño=leer.nextLine();
    }
    
}
