/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones_1;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class Exepciones_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1;
        int num1, num2, total;
        try{
        System.out.println("Ingrese un numero entero: ");
        n1=leer.nextInt();
        }catch(Exception e){
            System.err.println("Ingrese un numero entero "+e);
            leer.nextLine();
        }
        System.out.println("dividir entre 0");
        System.out.println("Ingrese el primer número: ");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2=leer.nextInt();
        try{
        total= num1/num2;
        }catch(ArithmeticException ex){
            total=0;
            System.out.println("error "+ex.getMessage());
        }
        System.out.println("resultado: "+total);
    }
    
}
