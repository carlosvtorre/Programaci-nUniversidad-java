/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_excepciones;

/**
 *
 * @author carlo
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Programa_excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num;
         boolean excep = false;
        int n1[]=new int[5];
        int total;
        System.err.println("CAPTURA DE ERROR NUMERO 1");
        do{
            excep = false;
        try{
            System.out.print("Ingrese un valor entero: ");
            num=leer.nextInt();
            int cuadrado= num*num;
            System.out.print("El cuadrado de " + num + " es: " + cuadrado);
        }catch(InputMismatchException ex){
            System.err.println("Debe ingresar obligatoriamente un número entero.");
            leer.nextLine();
            excep=true;
        }
        }while (excep);
        System.out.println("");
         System.err.println("CAPTURA DE ERROR NUMERO 2 (Eror de arreglo)");
        
        try{
            System.out.print("Ingrese un numero: ");
            n1[6]=leer.nextInt();
         }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("arreglo fuera de los limites");
            leer.nextLine();
        }
        System.out.println("");
        System.err.println("TERCER CAPTURA DE ERROR (dividir entre cero)");
        System.out.println("Ingrese el primer número: ");
        int num1=leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2=leer.nextInt();
        try{
        total= num1/num2;
        }catch(ArithmeticException ex){
            total=0;
            System.out.println("error "+ex.getMessage());
        }
        System.out.println("resultado: "+total);
    }
    
}
