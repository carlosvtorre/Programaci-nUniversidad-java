/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos_practica;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Ciclos_practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        int edad,x,sumawhile,sumafor;
        sumawhile=0;
        sumafor=0;
        x=1;
        while (x<=2){
            System.out.println("introduzca la edad:");
            edad=leer.nextInt();
            sumawhile=sumawhile+edad;
            x++;
           if (edad>=18){
                System.out.println("mayor de edad");
            }
            else {
                System.out.println("menor de edad");
            }
        }
        System.out.println("suma: "+sumawhile);
        for (x=1;x<=2;x=x+1){
            System.out.print("introduzca la edad: ");
            edad=leer.nextInt();
            sumafor=sumafor+edad;
            if (edad<=18){
                System.out.println("mayor de edad");
            }
            else {
                System.out.println("menor de edad");
            }
        }
        System.out.println("suma"+sumafor);
        if (sumawhile>sumafor){
            System.out.println("la suma mayor es la del ciclo while");
        }
        else {
            if(sumafor>sumawhile){
                System.out.println("la suma mayor es la del ciclo for");
            }
            else{
                System.out.println("son iguales");
            }
        }
      
        
    }
    
}
