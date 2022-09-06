/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.1
 */
package operadores_logicos;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String semestre;
        char grupo;
        int numero_alumnos;
        float promedio_grupal;
        System.out.print("semestre del grupo: ");
        semestre=leer.nextLine();
        /*
        leer el semestre e imprimir en romano
        I
        II
        III
        */
        if (semestre.equalsIgnoreCase("primero")|| semestre.equals("1")){
            System.out.println("I");
        }
        else {
            if (semestre.equalsIgnoreCase("segundo")){
                System.out.println("II");
            }
            else{
            if (semestre.equalsIgnoreCase("tercero")){
                System.out.println("III");
            }
            else {
                System.out.println("error en el semestre");
            }
        }
            
        }
       
        System.out.print("Letra del grupo: ");
        grupo=leer.nextLine().charAt(0);
        /*si el grupo es igual A imprimir grupo 1
        B = grupo 2
        si no es A o B eror en el dato
        */
        if (grupo=='A'||grupo=='a'){
            System.out.println("grupo 1");
        }
        else {
            if(grupo=='B'||grupo=='b'){
                System.out.println("grupo 2");
            }
            else{
                System.out.println("error en el dato");
            }
        }
        System.out.print("Numerio de almnos en el grupo: ");
        numero_alumnos=leer.nextInt();
        //si el numero de alumnos es menor a 1 o mayor a 40 imprimir 
        //error en el dato de lo contrariio imprimir 
        //dato correcto
        
        /* if (numero_alumnos<1 || numero_alumnos>40){
            System.out.println("error en el dato");
        }
        else {
            System.out.println("dato correcto");
        }
      */
        
        if(numero_alumnos>=1 && numero_alumnos<=40){
            System.out.println("dato correcto ");
        }
        else {
            System.out.println("error en el dato ");
        }
        System.out.println("promedio grupal: ");
        promedio_grupal=leer.nextFloat();
        /* si el promedio del grupo se encuentra entre 70 y 80 
        imprimir promedio regular
        si se encuentra entre 81 y 90 imprimir buen promedio
        si se encuentra entre 91 y 99 imprimir muy buen promedio
        si es igual a 100 imprimir excelente promedio
        */
        
        if(promedio_grupal>=70 && promedio_grupal<=80){
            System.out.println("promedio regular");
        }
        else {
            if(promedio_grupal>=81 && promedio_grupal<=90){
                System.out.println("buen promedio");
            }
            else{
                if (promedio_grupal>=91 && promedio_grupal<=99){
                    System.out.println("muy buen promedio");
                }
                else {
                    if (promedio_grupal==100){
                        System.out.println("excelente promedio");
                    }
                    else {
                        System.out.println("error en el dato");
                    }
                }
            }
        }
        
    
    }
    
}
