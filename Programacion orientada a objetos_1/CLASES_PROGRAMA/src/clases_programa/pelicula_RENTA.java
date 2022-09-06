/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_programa;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class pelicula_RENTA {
    private String nombre_peli;
    private int precio_dia;
    private int precio_semana;
    private int precio_mes;
    private String tiempo;
    Scanner leer=new Scanner(System.in);
public void menu_renta(){
       int opcion;
       do{
           System.out.println("menu Renta");
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
               case 1: registrar_renta();break;
               case 2: consultar_renta();break;
               case 3: actualizar_renta();break;
               case 4: borrar_renta();
           }
       }
       while(opcion!=5);
   }    
public void registrar_renta(){
    leer.nextLine();
    System.out.println("nombre de la  pelicula: ");
    nombre_peli=leer.nextLine();
    System.out.println("precio por dia de renta: ");
    precio_dia=leer.nextInt();
    System.out.println("precio por semana de renta: ");
    precio_semana=leer.nextInt();
    System.out.println("precio por mes de renta: ");
    precio_mes=leer.nextInt();
    System.out.println("durante cuento tiempo rentara la pelicula: ");
    tiempo=leer.nextLine();
    
}
public void consultar_renta(){
    System.out.println("nombre de la pelicula: "+nombre_peli); 
    System.out.println("precio por dia de renta: "+precio_dia);
    System.out.println("precio por semana de renta: "+precio_semana);
    System.out.println("precio por mes de renta: "+precio_mes);
    System.out.println("durante cuanto tiempo rentara la pelicula: "+tiempo);
}
public void borrar_renta(){
     char res;
     leer.nextLine();
     do {
         System.out.println("desea borrar los datos de la pelicula en renta s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         nombre_peli="";
         precio_dia=0;
         precio_semana=0;
         precio_mes=0;
         tiempo="";
     }
 }
public void actualizar_renta(){
     char res;
     leer.nextLine();
     do {
         System.out.println("desea actualizar los datos de la renta s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         registrar_renta();
     }
     
 }
    
}
