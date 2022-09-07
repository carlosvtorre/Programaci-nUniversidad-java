/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        //trabajadores trabajador1=new trabajadores("carlos","11 de febrero del 2002","programador",400,1);
        //trabajadores trabajador2=new trabajadores();
        //trabajador1.registrar_trabajadores();
        //trabajador1.consultar_trabajadores();
        
        puestos puesto1 = new puestos("programador","informatica","12-8pm",12000);
        puesto1.puesto_consulta();
        System.out.println("");
        puestos puesto2 = new puestos();
        puesto2.puesto_consulta();
        System.out.println("");
        puestos puesto3 = new puestos(12233);
        puesto3.puesto_consulta();
        
        
    }
    
}
