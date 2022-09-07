/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1 = -1,n2= -1,suma;
        
        do{
        try {
        System.out.println("primer numero (0....1000): ");
        n1=leer.nextInt();
        }
        catch(Exception error){
            System.err.println("Error en e dato "+error);
            leer.nextLine();
            
        }
        }
        while(n1<0 || n1>1000);
        
        do{
        try{
        System.out.println("Segundo numero (0.....5000): ");
        n2=leer.nextInt();
        
        }
        catch(Exception error){
            System.out.println("Error en el segundo dato"+ error);
            leer.nextLine();
        }
        }
        while(n2<0 || n2>5000);
        suma=n1+n2;
        System.out.println("La suma es igual a: "+suma);
       
        
    }
    
}
