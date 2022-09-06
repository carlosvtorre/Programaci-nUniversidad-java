/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos_anidados;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Ciclos_anidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        int x,y,edad;
        double compra,pago,cambio;
       for(y=1; y<=6; y++){
           for(x=1; x<=10; x++){
            System.out.print("*");
        }
           System.out.println("");// es para que imprima un espacio en blanco y no en la misma linea las *
       }
       for(x=1; x<=3; x++){
       do{
           System.out.print("introduzca la edad 0/115: ");
           edad=leer.nextInt();
       }
       while (edad<0 || edad>115);
       }
       //leer total de la compra y la cantidad con la que pagaron
       // validar que la cantidad con la que pagaron sea mayor o igual a el total de la compra
        
            System.out.print("introduzca el total de la compra $: ");
            compra=leer.nextDouble();
           
        do {
           System.out.print("cantidad con la que va a pagar: ");
            pago=leer.nextDouble(); 
            
        }
        while(pago<compra);
        cambio=pago-compra;
            System.out.print("El cambio es :"+cambio +" pesos");
        
    }
    
}
