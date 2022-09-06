/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package censo;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class Censo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre_pais;
        double hombres,mujeres,total_de_poblacion;
        double por_hombre,por_mujer,por_ingles,por_español,personas_español,personas_ingles;
        System.out.print("nombre del pais: ");
        nombre_pais=leer.nextLine();
        System.out.print("número de Mujeres ");
        mujeres=leer.nextDouble();
        System.out.print("número de Hombres ");
        hombres=leer.nextDouble();
        total_de_poblacion=hombres+mujeres;
        System.out.println("total de poblacion: "+total_de_poblacion);
        por_hombre=hombres/total_de_poblacion*100;
        System.out.println("porcentaje de hombres:"+por_hombre);
        por_mujer=mujeres/total_de_poblacion*100;
        System.out.println("porcentaje de mujeres:"+por_mujer);
        System.out.print("porcentaje de personas que hablan Ingles: ");
        por_ingles=leer.nextDouble();
        System.out.print("porcentaje ded pernonas que hablan español: ");
        por_español=leer.nextDouble();
        personas_ingles=total_de_poblacion/100*por_español;
        System.out.println("personas que hablan ingles: "+personas_ingles);
        personas_español=total_de_poblacion/100*por_ingles;
        System.out.println("personas que hablan español: "+personas_español);
    }
    
}
