/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_switch;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Programa_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        char grupo;
        System.out.print("cual es el grupo del alumno:");
        grupo=leer.nextLine().charAt(0);//grupo=leer.toUpperCase().charAt(0); lee mayusculas y minusculas
        if (grupo=='a'||grupo=='A'){
            System.out.println("primer grupo");
        }
        else {
            if (grupo=='b'||grupo=='B'){
                System.out.println("segundo grupo");
            }
            else {
                if (grupo=='c'||grupo=='C'){
                    System.out.println("tercer grupo");
                }
                else {
                    if (grupo=='d'||grupo=='D'){
                        System.out.println("cuarto grupo");
                    }
                    else {
                        if(grupo=='e'||grupo=='E'){
                            System.out.println("quinto grupo");
                        }
                        else{
                            System.out.println("Error en el dato");
                        }
                    }
                }
            }
        }
        switch (grupo){
            case 'a': case 'A':System.out.println("primer grupo");break;
            case 'b': case 'B':System.out.println("segundo grupo");break;
            case 'c': case 'C':System.out.println("tercer grupo");break;
            case 'd': case 'D':System.out.println("cuarto grupo");break;
            case 'e': case 'E':System.out.println("quinto grupo");break;
            default:System.out.println("Error en el dato");
        }
    }
    
}
