/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloford;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class CICLOFORD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        int x,valor_inicial,valor_final,incremento;
        System.out.print("valor inicial de la secuencia:");
        valor_inicial=leer.nextInt();
        System.out.print("valor final de la secuencia:");
        valor_final=leer.nextInt();
        System.out.print("incremento de la secuencia:");
        incremento=leer.nextInt();
        for (x=valor_inicial; x<=valor_final; x=x+incremento){
            System.out.println(x);
        }
        // imprimir la siguiente secuencia de numeros
        // 20,18,16....-20
        
       
        
     
               
    }
    
}
