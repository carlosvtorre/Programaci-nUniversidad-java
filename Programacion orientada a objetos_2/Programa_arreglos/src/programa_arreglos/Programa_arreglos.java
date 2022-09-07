/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_arreglos;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Programa_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner leer = new Scanner (System.in);
        int numeros,dimension;
        String num;
        // con este ciclo for repetimos la accion 5 veces
        for (int y = 0; y < 5; y++){
        //Con el ciclo do while validamos que el numero este entre 2 y 5 digitos.
        do{
          System.out.println("Ingrese un número con minimo 2 digitos y maximo 5 digitos: ");
          numeros = leer.nextInt();
        // con el metodo  Integer.toString(numeros).length();
        // Obtenemos la dimnesion de digitos de la variable numeros y la guardamos en la variable dimension.
        dimension = Integer.toString(numeros).length();
        if (dimension <2 || dimension >5 ){
            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese un número con los digitos correctos");
            System.out.println("-----------------------------------------------");
            
             
        }
        }while(dimension <2 || dimension >5 );
            int suma = 0;
            for (int i = 0; i < dimension; i++){
            num = String.valueOf(Integer.toString(numeros).charAt(i));
            // hacemos un arreglo con el nombre de cadena 
            // con la cantidad de digitos que queremos que almacene en este caso la dimension del numero
             int cadena[] = new int[dimension];
             cadena[i] = Integer.parseInt(num);
             suma += cadena[i];   
        }
        System.out.println("-----------------------------------------------");
        System.err.println("la suma de los digitos es: "+suma);
        if (suma < 10){
            System.out.println("El resultado de la suma es menor a 10");
        }
        else{
            if (suma == 10){
                System.out.println("El resultado de la suma es igual a 10");
            }
            else {
                System.out.println("El resultado de la suma es mayor a 10");
            }
        }
        System.out.println("-----------------------------------------------");
        }
        
        
      
    }
    
}
