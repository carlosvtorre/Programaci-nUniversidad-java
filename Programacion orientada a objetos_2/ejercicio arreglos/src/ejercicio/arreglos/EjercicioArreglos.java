/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.arreglos;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class EjercicioArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int x,longitud, suma,resultado, cuadrado;
        suma = 0;
         
        System.out.println("Ingrese la cantidad de numeros que quiere leer: ");
        longitud = leer.nextInt();
        int numeros[] = new int[longitud];
        for (x=0; x<longitud; x++){
            //System.out.println("Ingrese los numeros: ");
            numeros[x] = (int)(Math.random()*100);//leer.nextInt();
            double signo = Math.random()*10;
            if (signo>5)numeros[x]=numeros[x]*-1;
            
        }
        
        
       x=0;
       suma = 0;
       int positivo,negativo,cero;
       positivo = 0;
       negativo = 0;
       cero = 0;
        while(x<numeros.length){
            System.out.print(numeros[x]+" ");
            cuadrado = numeros[x]*numeros[x];
            if(numeros[x]>0){
                System.out.println("POSITIVO,El cuadrado del numero es: "+ Math.pow(numeros[x], 2));
                positivo++;
            }
            else{
                if(numeros[x]<0){
                    System.out.println("NEGATIVO,El cuadrado del numero es: "+ numeros[x]*numeros[x]);
                    negativo++;
                }
                else{
                    System.err.println("CERO, El cuadrado del numero es: "+ cuadrado);
                    cero++;
                }
            }
            suma += numeros[x];
            x = x+1;
        }
        System.out.println("La suma de los números es: "+suma);
        System.out.println("números positivos: "+positivo);
        System.out.println("Números negativos: "+negativo);
        System.out.println("Números cero: "+cero);
        
       
    }
    
}
