/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_año_gasto_camion;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Proyecto_año_gasto_camion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre;
        double año_nacimiento,año_actual,edad,gasto_camion,gasto_semana_en_camion,gasto_comida,comida;
        int dias_que_fue_al_tec;
        byte mes_actual,mes_nacimiento;
        System.out.print("nombre del estudiante: ");
        nombre=leer.nextLine();
        System.out.print("año de nacimiento: ");
        año_nacimiento=leer.nextDouble();
        System.out.print("mes de nacimiento en numero: ");
        mes_nacimiento=leer.nextByte();
        System.out.print("año actual: ");
        año_actual=leer.nextDouble();
        System.out.print("mes actual en numero: ");
        mes_actual=leer.nextByte();
        System.out.print("cuanto gasta en camion al dia para llegar a la escuela y de regreso a casa: ");
        gasto_camion=leer.nextDouble();
        System.out.print("dias que fue al tec: ");
        dias_que_fue_al_tec=leer.nextInt();
        System.out.print("cuanto gasto en comida en la escuela esta semana: ");
        gasto_comida=leer.nextDouble();
        comida=gasto_comida/dias_que_fue_al_tec;
        gasto_semana_en_camion=gasto_camion*dias_que_fue_al_tec;
        System.out.println("el estudiante " +nombre+ " gasto "+gasto_semana_en_camion +" en camion en esta semana");
        System.out.println("el estudiante " +nombre+ " gasto "+comida + "al dia en comida");
        edad=año_actual-año_nacimiento;
        if (edad==18){
            if (mes_actual>=mes_nacimiento){
                int mayor_de_edad_desde_hace;
                mayor_de_edad_desde_hace=mes_actual-mes_nacimiento;
                System.out.println("el estudiante "+nombre+ " tiene "+edad+ "años de edad");
                System.out.println("mayor de edad desde hace "+mayor_de_edad_desde_hace +"mes/meses");
            }
            else {
                int hace_falta;
                hace_falta=mes_nacimiento-mes_actual;
                System.out.println("el estudiante "+ nombre);
                System.out.println("es menor de edad");
                System.out.println("te hace falta "+hace_falta +" mes/meses para ser mayor");
            }
        }
        else {
            if (edad>18){
                System.out.println("el estudiante " +nombre+ " tiene " +edad +" años de edad");
                System.out.println("es mayor de edad");
            }
            else{
                System.out.println("el estudiante "+nombre+" tiene "+ edad +"años de edad");
                System.out.println("es menor de edad");
            }
        }
        
        
    }
    
}
