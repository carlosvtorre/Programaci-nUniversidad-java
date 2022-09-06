/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo_do_while;

import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class CICLO_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int edad,beca,x;
        char grupo;
        String desayunar;
        x=1;
        do {
            System.out.print("introduzca la edad (0...115): ");
            edad=leer.nextInt();
            if (edad<0 && edad>115)
                System.out.println("Error en el rango");
            x=x+1;
        }//el x es para que solo permita introducir 3 veces datos incorrectos y despues ya no 
        while ((edad<0 || edad>115)&& x<=3);// en el ciclo do while la condición es al final y termina en un punto y coma ;
        
        //leer el monto de la baca que recibe un alumno
        //validar que se encuentre entre 500 y 2000
        do{
            System.out.print("introduzca el munto de la beca (500...2000): ");
            beca=leer.nextInt();
            if (beca<500 || beca>2000)
                System.out.println("Error en el dato");
        }
        while (beca<500 || beca>2000);
        
        
        // leer el grupo al que pertenece el alumno validar que sea igual a A,B,C
        leer.nextLine();
        do {
            System.out.print("introduzca el grupo del alumno (A,B): ");
            grupo=leer.nextLine().toUpperCase().charAt(0);
            if (grupo!='A'&& grupo!='B' && grupo!='C')
                System.out.println("error en el dato");
        }
        while (grupo!='A' && grupo!='B' && grupo!='C');
        // leer la respuesta del alumno si desea irse a desayunar
        //validar que sea si,no
        do {
            System.out.print("desea irse a desayunar si/no: ");
            desayunar=leer.nextLine().toUpperCase();
            
            
        }
        while (!(desayunar.equals("SI")|| desayunar.equals("NO")));// (!)operador de negación para convertir un resultado correcto a incorrecto para que salga del ciclo
        
    }
    
}
 