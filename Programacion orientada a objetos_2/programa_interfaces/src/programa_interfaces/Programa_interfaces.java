/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_interfaces;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Programa_interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion;
        do{
        System.out.println("--------------------------------------------");
        System.out.println("Libreria");
        System.out.println("--------------------------------------------");
        System.out.println("seleccione una opción:");
        System.out.println("1.-Libros de Terror ");
        System.out.println("2.-Libros de Matematicas");
        System.out.println("3.-Libros de ciencia ficción");
        System.out.println("4.-Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1 :
                libros_terror libros_terror1 = new libros_terror();
                System.out.println("--------------------------------------------");
                System.err.println("Libros de Terror");
                System.out.println("--------------------------------------------");
                double semana = libros_terror1.vendidos_semana();
                System.out.println("Total de ventas de la semana: "+semana);
                System.out.println("-----");
                double mes = libros_terror1.vendidos_mes();
                System.out.println("Total de ventas del mes: "+mes);
                System.out.println("-----");
                double año = libros_terror1.vendidos_año();
                System.out.println("Total de ventas del año: "+año);
                System.out.println("-----");
                double des = libros_terror1.descuento();
                System.out.println("descuento: "+des);
                System.out.println("--------------------------------------------");
                
                break;
            case 2 : 
                Libros_matematicas Libros_matematicas1 = new Libros_matematicas();
                System.out.println("--------------------------------------------");
                System.err.println("Libros de Matematicas");
                System.out.println("--------------------------------------------");
                double semana2 = Libros_matematicas1.vendidos_semana();
                System.out.println("Total de ventas de la semana: "+semana2);
                System.out.println("-----");
                double mes2 = Libros_matematicas1.vendidos_mes();
                System.out.println("Total de ventas del mes: "+mes2);
                System.out.println("-----");
                double año2 = Libros_matematicas1.vendidos_año();
                System.out.println("Total de ventas del año: "+año2);
                System.out.println("-----");
                double des2 = Libros_matematicas1.descuento();
                System.out.println("descuento: "+des2);
                System.out.println("--------------------------------------------");
                break;
            case 3 :
                libros_ciencia_ficcion libros_ciencia_ficcion1 = new libros_ciencia_ficcion (); 
                System.out.println("--------------------------------------------");
                System.err.println("Libros de Ciencia ficción");
                System.out.println("--------------------------------------------");
                double semana3 = libros_ciencia_ficcion1.vendidos_semana();
                System.out.println("Total de ventas de la semana: "+semana3);
                System.out.println("-----");
                double mes3 = libros_ciencia_ficcion1.vendidos_mes();
                System.out.println("Total de ventas del mes: "+mes3);
                System.out.println("-----");
                double año3 = libros_ciencia_ficcion1.vendidos_año();
                System.out.println("Total de ventas del año: "+año3);
                System.out.println("-----");
                double des3= libros_ciencia_ficcion1.descuento();
                System.out.println("descuento: "+des3);
                System.out.println("--------------------------------------------");
                break;
            case 4 :
                System.exit(0);
                break;
            default:
                System.err.println("dato incorrecto");
                break;
        }
          
        }while(opcion!=4);
    }
    
}
