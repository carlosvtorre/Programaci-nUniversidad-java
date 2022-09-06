/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valormedio;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Valormedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("primer numero: ");
        n1=leer.nextInt();
        System.out.print("segundo numero: ");
        n2=leer.nextInt();
        System.out.print("tercer numero: ");
        n3=leer.nextInt();
        if (n1>n2){
            if(n1>n3){
                if (n2>n3){
                    System.out.println("el numero del valor medio es: "+n2);
                }
                else {
                    System.out.println("el numero de valor medio es: "+n3);
                }
            }
            else{
               System.out.println("el numero de valor medio es: "+n1); 
            }
        }
        else{
            if(n2>n3){
                if(n3>n1){
                    System.out.println("el numero de valor medio es: "+n3);
                }
                else {
                    System.out.println("el numero de valor mediio es: "+n1);
                }
            }
            else{
               System.out.println("el numero del valor medio es: "+n2); 
                
            }
        }
    }
    
}
