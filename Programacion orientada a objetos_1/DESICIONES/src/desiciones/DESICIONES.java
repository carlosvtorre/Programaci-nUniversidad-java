 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desiciones;
import java.util.Scanner;
/**
 *
 * @author carlo
 */  
public class DESICIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre_alumno;
        int edad,semestre;
        double promedio,ingreso_familiar,excede,beca;
        System.out.print("Nombre del alumno: ");
        nombre_alumno=leer.nextLine();
        System.out.print("Edad del alumno: ");
        edad=leer.nextInt();
        //se imprime sei el alumno es mayor o menor de edad
        if (edad>=18){
            System.out.println("mayor de edad");
        }
        else {
            System.out.println("menor de edad");
        } 
        System.out.print("semestre que cursa actualmente:");
        semestre=leer.nextInt();
        //imprimir si el alumno es de nuevo ingreso o
        //si es un alumno previamente ingresado
        if (semestre>=2){
            System.out.println("alumno previamente ingresado");
        }
        else {
            System.out.println("alumno de nuevo ingreso");
        }
        System.out.print("promedio en programación: ");
        promedio=leer.nextDouble();
        //imprimir si el alumno aprobo o reprobo cinsiderando 
        //que 70 como calificacion minima para aprobar
        if (promedio>=70){
            System.out.println("aprobado");
        }
        else{
            System.out.println("reprobado");
        }
        System.out.print("ingreso mensual de la familia $");
        ingreso_familiar=leer.nextDouble();
        /*ddeterminar si el alumno es acreedor a una beca
        para ser acredor el ingreso de la familia el mes 
        debe ser menor o igual a $6,000
        imprimir en caso de que no sea acredor por cuanto se pasa del limite
        por ejemplo si el ingreso es de $9,500 imprimir que se excede por$3,500
        imprimir en caso de que si sea acredor de cuanto seria la beca 
        considerando que sera lo que falta para los 6,000 por elemplosi el ingreso es 
        de $4,500 la beca sera de $1,500
        */
        if (ingreso_familiar<=6000){
            System.out.println("acredor de beca");
            beca=6000-ingreso_familiar;
            System.out.println("la deca es de: "+beca);
        }
        else {
            System.out.println("no acredor de beca");
            excede=ingreso_familiar-6000;
            System.out.println("se excede por: "+excede);
        }
    }
    
}
