/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencia;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Secuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int limite,valor;
        System.out.print("intruduzca el limite de la secuencia: ");
        limite=leer.nextInt();
        while (n2+n1<=limite){
            valor=n1;
            n1=n2;
            n2=valor+n1;
            System.out.println(n2);
        }
        
        
    }
    
}
