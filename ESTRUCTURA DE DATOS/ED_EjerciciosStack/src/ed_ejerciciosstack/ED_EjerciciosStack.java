
package ed_ejerciciosstack;

import java.util.Stack;
import java.util.Scanner;
public class ED_EjerciciosStack {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Stack pila = new Stack();
        Pila pilaMultipop = new Pila (5);
        
        int opcion = 0;
        do{
                System.out.println("Menú\n"
                + "1.- Leer n cantidad de números e imprimirlos de manera inversa \n"
                + "2.- MultiPop \n"
                + "3.- Ejercicio 3 \n"
                + "4.- Salir ");
                    opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    String dato;
                    System.out.println("ingrese la cantidad de caracteres a leer: ");
                    int numDatos = leer.nextInt();
                    leer.nextLine();
                    for(int i=0; i< numDatos ; i++){
                        System.out.println("ingrese el caracter: ");
                        dato = leer.nextLine();
                        pila.push(dato);
                        
                        
                    }
                    System.out.println("----------------------------");
                    while (pila.empty() == false){
                        System.out.println(pila.pop());
                    }
                    
                      
                    break;
                case 2:
                    System.out.println("pila con 5 numeros");
                    pilaMultipop.push(1);
                    pilaMultipop.push(2);
                    pilaMultipop.push(3);
                    pilaMultipop.push(4);
                    pilaMultipop.push(5);
                    System.out.println("----------------------------");
                    pilaMultipop.mostrarPila();
                    System.out.println("----------------------------");
                    System.out.println("multipop que elimina 3 números de la pila");
                    pilaMultipop.multipop(3);
                    pilaMultipop.mostrarPila();
                    
                    
                    break;
                case 3:
                    pilaMultipop.push(5);
                    pilaMultipop.push(16);
                    pilaMultipop.push(8);
                    pilaMultipop.push(22);
                    pilaMultipop.mostrarPila();
                    System.out.println("----");
                    pilaMultipop.modificar();
                    pilaMultipop.mostrarPila();
                    
                    
                    
                   
                    break;

                case 4:
                  System.exit(0);
            }
        }while(opcion !=4);
        
        
        
    }
    
    public void pilaMultipop(int n){
        
    }
    
    
    
}
