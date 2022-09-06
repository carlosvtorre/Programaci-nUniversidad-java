/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_conversiones;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Proyecto_conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String nombre_gym,dias_semana,precio_mes,tiempo_meses;
        int dias;
        float precio;
        double mes_total,tiempo,gasto_por_dia,dias_mes;
        System.out.print("nombre del gym: ");
        nombre_gym=leer.nextLine();
        System.out.print("dias a la semana que va al gym: ");
        dias_semana=leer.nextLine();
        System.out.print("mensualidad del gym: ");
        precio_mes=leer.nextLine();
        System.out.print("cuantos meses lleva entrenando en el gym: ");
        tiempo_meses=leer.nextLine();
        dias=Integer.parseInt(dias_semana);
        precio=Float.parseFloat(precio_mes);
        tiempo=Double.parseDouble(tiempo_meses);
        mes_total=precio*tiempo;
        dias_mes=dias*4;
        gasto_por_dia=precio/dias_mes;
        System.out.println("gasto total en el gym "+nombre_gym+" por los meses que ha entrenado: "+mes_total+" pesos");
        System.out.print("el gasto por dia en el gym "+nombre_gym+" es: "+gasto_por_dia+" pesos");
        
    }
    
}
