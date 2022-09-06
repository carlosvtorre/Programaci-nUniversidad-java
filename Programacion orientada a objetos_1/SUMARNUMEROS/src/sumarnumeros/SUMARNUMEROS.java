/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//leer 2 numeros, sumarlos e imprimir el resultado
package sumarnumeros;// NOMBRE DEL PROYECTO

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class SUMARNUMEROS {//Inicia la clase principal

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//inicia el metodo principal
        // TODO code application logic here
        Scanner Leer=new Scanner(System.in);//crear un objeto llamado leer para la lectura de las variables
        int numero1, numero2, suma;//se declara 3 variables que almacenan numeros enteros
        System.out.print("Introduzca el primer numero  ");//imprime un letrero 
        numero1=Leer.nextInt();//leer la variable numero1
        System.out.print("Introduzca el segundo numero ");//imprime un letrero 
        numero2=Leer.nextInt();//leer la variable numero2
        suma=numero1+numero2;//calcular la suma de los 2 numeros
        System.out.println("la suma de los 2 numeros es igual a: "+suma);//se imprime un letrero y el resultado de la suma
    }//esta lllave cierra el metodo principal
    
}//cierra la clase principal
