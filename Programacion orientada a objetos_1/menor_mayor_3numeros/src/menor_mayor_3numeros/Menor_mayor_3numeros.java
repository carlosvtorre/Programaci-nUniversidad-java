/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menor_mayor_3numeros;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Menor_mayor_3numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        double n1,n2,n3;
        System.out.print("Ingrese el primer numero: ");
        n1=leer.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        n2=leer.nextDouble();
        if (n1==n2){
            System.out.println("el primer y segundo numero son iguales Inserte nuevos numeros");
        }
        else{
           System.out.print("Ingrese el tercer numero: ");
        n3=leer.nextDouble();
        if (n3==n2){
            System.out.println("el segundo y tercer numero son iguales Inserte nuevos numeros");
        }
        else {
            if (n3==n1){
                System.out.println("el tercer y primer numero con iguales Inserte nuevos numeros");
            }
            else{
                if (n1>n2){
                   if (n1>n3){
                       if (n3>n2){
                           System.out.println("El numero "+n1+ " es el mayor"); 
                           System.out.println("El numero "+n2+ " es el menor");
                       }
                       else {
                           System.out.println("El numero "+n1+ " es el mayor");
                           System.out.println("El numero "+n3+ " es el menor");
                       }
                   }
                   else {
                       System.out.println("El numero "+n3+ " es el mayor");
                       System.out.println("el numero "+n2+ " es el menor");
                   }
                }
                else {
                    if(n2>n3){
                        if (n3>n1){
                            System.out.println("El numero "+n2+ " es el mayor");
                            System.out.println("el numero "+n1+ " es el menor");   
                        }
                        else{
                            System.out.println("El numero "+n2+ " es el mayor");
                            System.out.println("El numero "+n3+ " es el menor");
                        }
                    }
                    else {
                        if (n2>n1){
                            System.out.println("El numero "+n3+ " es el mayor");
                            System.out.println("El numero "+n1+ " es el menor");
                        }
                        else {
                            System.out.println("El numero "+n3+ " es el mayor");
                            System.out.println("El numero "+n2+ " es el menor");
                        }
                    }
                }
            }
        }
        }
       
    }
    
}
