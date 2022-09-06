/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo_clases;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Torneo_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo principal
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        equipos equipo1=new equipos();
        entrenadores entrenadores1=new entrenadores();
        jugadores jugadores1=new jugadores();
        
        int respuesta;
        do {
            System.out.println("1...Equipos");  
            System.out.println("2...Jugadores");
            System.out.println("3...Entrenadores");
            System.out.println("4...finalizar");
            do {
            System.out.println("selesccione una opcion: ");
            respuesta=leer.nextInt();    
            }
            while (respuesta>4 || respuesta<1);
            switch (respuesta){
                case 1:equipo1.menu_equipos();break;
                case 2:jugadores1.menu_jugadores();break;
                case 3:entrenadores1.menu_entrenadores();break;
                
            }
            
        }
        while(respuesta!=4);
    }
    
}
