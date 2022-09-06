/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presupuesto;
import java.util.Scanner;
/**
 *
 * @author carloar
 */
public class PRESUPUESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        double cantidad_de_dinero,costo_desayuno,dinero_sobrante;
        System.out.print("cantidad de dinero: ");
        cantidad_de_dinero=leer .nextDouble();
        System.out.print("costo del desayuno: ");
        costo_desayuno=leer .nextDouble();
        dinero_sobrante=cantidad_de_dinero-costo_desayuno;
        System.out.print("dinero sobrante:"+dinero_sobrante);
    }
    
}
