/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo_clases;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class equipos {
    private String nombre;
    private String localidad;
    private String fecha_fundacion;
    private int numero_campeonatos;
    Scanner leer=new Scanner (System.in);
   public void menu_equipos(){
       int opcion;
       do{
           System.out.println("menu Equipos");
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
               case 1: registrar_equipos();break;
               case 2: consultar_equipos();break;
               case 3: actualizar_equipos();break;
               case 4: borrar_equipos();
           }
       }
       while(opcion!=5);
   } 
 public void registrar_equipos(){
     leer.nextLine();
     System.out.println("nombre del equipo: ");
     nombre=leer.nextLine();
     System.out.println("localidad: ");
     localidad=leer.nextLine();
     System.out.println("fecha de fundación: ");
     fecha_fundacion=leer.nextLine();
     System.out.println("numero de campeonatos: ");
     numero_campeonatos=leer.nextInt();
     
 }
 public void consultar_equipos(){
     System.out.println("nombre equipos: "+nombre);
     System.out.println("localidad: "+localidad);
     System.out.println("fecha de fundación: "+fecha_fundacion);
     System.out.println("numero de campeonatos: "+numero_campeonatos);
 }
 public void borrar_equipos(){
     char res;
     consultar_equipos();
     leer.nextLine();
     do {
         System.out.println("desea borrar los datos del equipo s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         nombre="";
         localidad="";
         fecha_fundacion="";
         numero_campeonatos=0;
     }
 }
 public void actualizar_equipos(){
     char res;
     leer.nextLine();
     do {
         System.out.println("desea actualizar los datos del equipo s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         registrar_equipos();
     }
     
 }
     
    
    
}
