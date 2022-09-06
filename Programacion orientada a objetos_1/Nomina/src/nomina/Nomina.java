 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Nomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre;//variable que lee letras
        int dias_trabajados;//lee dias numeros enteros (int)
        double sueldo_diario, sueldo_total;//variable que lee numeros con decimales (double)
        
        System.out.print("nombre del trabajador:");
         nombre=leer.nextLine();//para leer la variable string (nextLine)
         
        System.out.print("dias trabajados:");
         dias_trabajados=leer.nextInt();//para leer datos con la variable (int)
         
        System.out.print("sueldo por dia $ ");  
         sueldo_diario=leer.nextDouble();//para leer datos con la variable(double)
         
        sueldo_total=dias_trabajados*sueldo_diario;
        System.out.println("sueldo total:" +sueldo_total);
        System.out.print(nombre+ " trabajo:"+dias_trabajados+" dias de la semana con en sueldo diario de "+sueldo_diario+ " por lo tanto su sueldo semanal es de " +sueldo_total);
                     
        
    }
    
}
