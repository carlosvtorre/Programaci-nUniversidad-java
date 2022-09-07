/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        int dias_trabajados;
        double sueldo_diario;
        char respuesta;
        System.out.println("nombre del trabajador: ");
        nombre = leer.nextLine();
        System.out.println("dias trabajados: ");
        dias_trabajados = leer.nextInt();
        System.out.println("sueldo por dia $: ");
        sueldo_diario = leer.nextDouble();
        System.out.print("el trabajador tiene otras gratificaciones o descuentos s/n: ");
        do{
            respuesta = leer.next().toUpperCase().charAt(0);
        }while(respuesta != 'S' && respuesta != 'N');
        if (respuesta == 'N'){
            System.out.println("sueldo total $: "+ calcular_sueldo(dias_trabajados,sueldo_diario));
        }
        else{
            System.out.print("introduzca el total de sus gratificaciones: ");
            double gratificaciones = leer.nextDouble();
            System.out.println("el trabajador tiene descuentos: s/n");
            do{
            respuesta = leer.next().toUpperCase().charAt(0);
        }while(respuesta != 'S' && respuesta != 'N');
            if(respuesta == 'N'){
                System.out.println("sueldo total$: "+calcular_sueldo(dias_trabajados,sueldo_diario,gratificaciones));
            }
            else{
                System.out.println("cantidad a descontarle al trabajador : ");
                double descuento = leer.nextDouble();
                System.out.println("sueldo total: "+calcular_sueldo(dias_trabajados,sueldo_diario,gratificaciones,descuento));
            }
            
        }
    }
    public static double calcular_sueldo(int dias,double sueldo){
        return dias*sueldo;
    }
    public static double calcular_sueldo(int dias, double sueldo, double gratificacion){
        return dias*sueldo+gratificacion;
    }
    public static double calcular_sueldo(int dias, double sueldo, double gratificacion,double descuento){
        return dias*sueldo+gratificacion-descuento;
    }
}
