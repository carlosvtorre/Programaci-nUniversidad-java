/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor4;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Mayor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.print("primer numero: ");
        n1=leer.nextInt();
        System.out.print("segundo numero: ");
        n2=leer.nextInt();
        System.out.print("tercer numero: ");
        n3=leer.nextInt();
        System.out.print("cuarto numero: ");
        n4=leer.nextInt();
        System.out.print("el mayor es: ");
        if (n1>n2){
            if (n1>n3){
                if (n1>n4){
                    System.out.println(n1);
                }
                else {
                    System.out.println(n4);
                }
            }
            else {
                if (n3>n4){
                    System.out.println(n3);
                }
                else {
                    System.out.println(n4);
                }
            }
        }
        else {
            if (n2>n3){
                if (n2>n4){
                    System.out.println(n4);
                }
                else {
                    System.out.println(n4);
                }
            }
            else {
                if (n3>n4){
                    System.out.println(n3);
                }
                else {
                    System.out.println(n4);
                }
            }
        }
    }
    
}
