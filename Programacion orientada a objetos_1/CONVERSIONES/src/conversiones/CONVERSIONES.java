/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String numero1,numero2,s;
        int n1,n2,suma;
        System.out.print("primer numero: ");
        numero1=leer.nextLine();
        System.out.print("segundo numero: ");
        numero2=leer.nextLine();
        n1=Integer.parseInt(numero1);
        n2=Integer.parseInt(numero2);
        suma=n1+n2;
        s=String.valueOf(suma);
        s=Integer.toString(suma);
        System.out.println("la suma es: "+s.charAt(1));
        System.out.println("El resultado de la suma tiene "+s.length());
    }
    
}
