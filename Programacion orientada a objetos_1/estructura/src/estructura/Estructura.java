/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num1,num2,suma,x;
        x=1;
        while(x<=3){
           do{ System.out.println("Ingrese el primer numero: ");
        num1=leer.nextInt();
           }while(num1<1 || num1>10);
        System.out.println("Ingresee el segundo numero: ");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("la suma es: "+suma);
        if (num1>num2){
            System.out.println("el mayor es: "+num1);
        }
        else{
            if(num2>num1){
                System.out.println("el mayor es: "+num2);
            }
            else{
                System.out.println("numeros iguales");
            }
        }
        x++;
        }
        
    }
    
}
