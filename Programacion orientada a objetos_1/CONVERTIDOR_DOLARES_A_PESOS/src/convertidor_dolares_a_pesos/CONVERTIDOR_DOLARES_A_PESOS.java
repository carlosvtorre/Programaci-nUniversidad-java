/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor_dolares_a_pesos;
import java.util.Scanner;//impotar la clase scanner
/**
 *
 * @author carlo
 */
public class CONVERTIDOR_DOLARES_A_PESOS {//inicia la clase principal del proyecto 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//inicia el metodo principal del proyecto 
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);//creando objeto de lectura llamado leer
        double cantidad_de_dolares,valor_de_dolar_en_pesos,total;//declarando 3 variables de tipo numerico con decimales
        System.out.print("cantidad de dolares que desea convertir:");//se imprime un letrero 
        cantidad_de_dolares=leer .nextDouble();//leer variable cantidad de dolares
        System.out.print("tipo de cambio del dolar a pesos MXN:");//se imprime un letro 
        valor_de_dolar_en_pesos=leer .nextDouble();//leer variable valor de dolar en pesos
        total=cantidad_de_dolares*valor_de_dolar_en_pesos;//calcular cantidad en pesos
        System.out.print("total en pesos: "+total);//se imprime el resultado
    }
    
}
