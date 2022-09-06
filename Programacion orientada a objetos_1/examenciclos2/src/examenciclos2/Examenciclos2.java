/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenciclos2;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Examenciclos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int x,grupo;
        for(x=1; x<=4; x++){
        do {
            System.out.print("Introduzca la cantidad de alumnos del grupo 10/40: ");
            grupo=leer.nextInt();
            
        }
        while (grupo<10 || grupo>40);
        if (grupo<=20){
                System.out.println("Grupo pequeño");
            }
            else {
                System.out.println("Grupo Aceptable");
            }
        }
    }
    
}
