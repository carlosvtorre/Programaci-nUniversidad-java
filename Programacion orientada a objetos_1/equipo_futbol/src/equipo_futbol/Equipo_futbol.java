/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo_futbol;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Equipo_futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre_equipo,ganados,empatados,perdidos,punto_s;
        int ganados1;
        float empatados1;
        double perdidos1,puntos,puntosg,total_puntos,porcentaje;
        System.out.print("Nombre del equipo: ");
        nombre_equipo=leer.nextLine();
        System.out.print("Partidos ganados: ");
        ganados=leer.nextLine();
        System.out.print("Partidos empatados: ");
        empatados=leer.nextLine();
        System.out.print("Partidos perdidos: ");
        perdidos=leer.nextLine();
        ganados1=Integer.parseInt(ganados);
        empatados1=Float.parseFloat(empatados);
        perdidos1=Double.parseDouble(perdidos);
        puntosg=ganados1*3;
        puntos=puntosg+empatados1;
        punto_s=String.valueOf(puntos);
        total_puntos=(ganados1+empatados1+perdidos1)*3;
        porcentaje=puntos/total_puntos*100;
       System.out.println("El equipo "+nombre_equipo + " ha ganado "+ganados+ " partidos,empatado "+empatados+ " partidos y perdidos "+perdidos+ " actualmente tiene "+puntos+ " puntos");
        System.out.println("de "+total_puntos+" puntos totales tiene el "+porcentaje+"% de puntos obtenidos");
    }    
        
    
}
