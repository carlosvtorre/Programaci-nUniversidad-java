/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenciclos1;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Examenciclos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int x,edad;
        double compra,saldo;
       for (x=1; x<=3; x++){
           do {
               System.out.print("Introduzca su edad 18/60: ");
               edad=leer.nextInt();
           }
           while (edad<18 || edad>60);
           
           do{
               System.out.print("introduzca la cantidad de su compra 1/5000:");
           compra=leer.nextDouble();
           }
           while (compra<1 || compra>5000);
           
           do{
               System.out.print("Introduzca la cantidad de saldo con la que cuenta: ");
               saldo=leer.nextDouble();
           }
           while(saldo<100 || saldo>2000);
       } 
    }
    
}
