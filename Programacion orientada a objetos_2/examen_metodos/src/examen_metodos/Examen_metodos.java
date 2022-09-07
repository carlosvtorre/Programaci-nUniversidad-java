/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_metodos;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Examen_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int opcion;
        do{
            
            System.out.println("1.- Gasto total (desayuno y comida)");
            System.out.println("2.- Gasto total (desayuno, comida y cena)");
            System.out.println("3.- Presupuesto semanal (dinero gastado en la semana y presupuesto para la semana)");
            System.out.println("4.- Presupuesto semanal (gasto por dia de la semana)");
            System.out.println("5.- Salir");
            System.out.print("seleccione una opción: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese la contidad que gasta en desayuno: ");
                    double gasto1 = leer.nextDouble();
                    System.out.print("Ingrese la cantidad que gasta en comida: ");
                    double gasto2 = leer.nextDouble();
                    double total;
                    total = gasto_total(gasto1,gasto2);
                    System.out.println("El gasto total es: "+ total);
                    break;
                case 2:
                    System.out.print("Ingrese la contidad que gasta en desayuno al dia: ");
                    double desayuno = leer.nextDouble();
                    System.out.print("Ingrese la cantidad que gasta en comida al dia: ");
                    double comida = leer.nextDouble();
                    System.out.print("Ingrese la cantidad que gasta en la cena al dia: ");
                    double cena = leer.nextDouble();
                    double gtotal;
                    gtotal = gasto_total(desayuno,comida,cena);
                    System.out.println("El gasto total es: "+ gtotal);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad de dinero gastado en la semana");
                    double g1 = leer.nextDouble();
                    System.out.println("ingrese el dinero que se tienen para la semana");
                    double p1 = leer.nextDouble();
                    String r;
                    r =  presupuesto_semanal(g1,p1);
                    System.out.println(r);
                    break;
                case 4:
                    System.out.println("Ingrese el gasto del dia lunes: ");
                    double dia1 = leer.nextDouble();
                    System.out.println("Ingrese el gasto del dia Martes: ");
                    double dia2 =leer.nextDouble();
                    System.out.println("Ingrese el gasto del dia Miercoles: ");
                    double dia3 = leer.nextDouble();
                    System.out.println("Ingrese el gasto del dia Jueves: ");
                    double dia4 = leer.nextDouble();
                    System.out.println("Ingrese el gasto del dia Viernes ");
                    double dia5 = leer.nextDouble();
                    System.out.println("Ingrese el gasto del dia Sabado: ");
                    double dia6 = leer.nextDouble();
                    System.out.println("Ingrese el gasto del dia Domingo: ");
                    double dia7 = leer.nextDouble();
                    double gasto_semanal;
                    gasto_semanal = presupuesto_semanal(dia1,dia2,dia3,dia4,dia5,dia6,dia7);
                    System.out.println("El gasto semanal es: "+gasto_semanal);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Dato incorecto ingrase otro número");
            }
        }while(opcion !=5);
    }
    public static double gasto_total(double g1, double g2){
        return g1 + g2 ;
    }
    public static double gasto_total(double n1, double n2, double n3){
        return n1+n2+n3;
    }
    public static String presupuesto_semanal(double gasto, double presupuesto){
        if (presupuesto >= gasto)return "Presupuesto Suficiente";
        else return "No es suficiente el dinero";
            
        
    }
    public static double presupuesto_semanal(double d1, double d2, double d3, double d4, double d5, double d6, double d7){
        return d1+d2+d3+d4+d5+d6+d7;
    }
    
}
