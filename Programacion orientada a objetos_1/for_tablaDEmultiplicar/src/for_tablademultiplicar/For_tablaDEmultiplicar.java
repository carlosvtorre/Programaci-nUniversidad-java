/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package for_tablademultiplicar;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class For_tablaDEmultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        double x,multiplicar,valor_inicial,valor_final,resultado;
        System.out.print("Introduzca el valor por el que se va a multiplicar:");
        multiplicar=leer.nextInt();
        System.out.print("Introduzca el valor inicial de la tabla:");
        valor_inicial=leer.nextInt();
        System.out.print("Introduzca el valor final por el que se va a multiplicar:");
        valor_final=leer.nextInt();
        for (x=valor_inicial;x<=valor_final;x=x+1){
            resultado=x*multiplicar; 
            System.out.println(multiplicar+ " x " + x + " = " +resultado);
        }
        
    }
    
}
