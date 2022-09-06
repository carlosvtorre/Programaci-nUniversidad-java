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
public class jugadores {
    private String codigo_jugador;
    private String nombre;
    private String equipo;
    private String fecha_nacimiento;
    private int numero_playera;
    Scanner leer=new Scanner(System.in);
public void menu_jugadores(){
       int opcion;
       do{
           System.out.println("menu Jugadores");
           System.out.println("1...Registrar");
           System.out.println("2...Consultar");
           System.out.println("3...Actualizar");
           System.out.println("4...Borrar");
           System.out.println("5...regresar al menu principal");
           do {
            System.out.println("seleccione una opción");
            opcion=leer.nextInt();
           }
           while(opcion>5 || opcion<1);
          switch (opcion){
               case 1: registrar_jugadores();break;
               case 2: consultar_jugadores();break;
               case 3: actualizar_jugadores();break;
               case 4: borrar_jugadores();
           }
       }
       while(opcion!=5);
   }    
public void registrar_jugadores(){
    leer.nextLine();
    System.out.println("codigo del jugador: ");
    codigo_jugador=leer.nextLine();
    System.out.println("nombre del jugador: ");
    nombre=leer.nextLine();
    System.out.println("equipo al que pertenece: ");
    equipo=leer.nextLine();
    System.out.println("fecha de nacimiento del jugador: ");
    fecha_nacimiento=leer.nextLine();
    System.out.println("numero de playera: ");
    numero_playera=leer.nextInt();
} 
public void consultar_jugadores(){
    System.out.println("codigo del jugador: "+codigo_jugador);
    System.out.println("nombre del jugador: "+nombre);
    System.out.println("equipo al que pertenece: "+equipo);
    System.out.println("fecha de nacimiento del jugador: "+fecha_nacimiento);
    System.out.println("numero de playera: "+numero_playera);
}
public void borrar_jugadores(){
     char res;
     consultar_jugadores();
     leer.nextLine();
     do {
         System.out.println("desea borrar los datos del jugador s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         codigo_jugador="";
         nombre="";
         equipo="";
         fecha_nacimiento="";
         numero_playera=0;
     }
 }
public void actualizar_jugadores(){
     char res;
     leer.nextLine();
     do {
         System.out.println("desea actualizar los datos del equipo s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         registrar_jugadores();
     }
     
 }
}
