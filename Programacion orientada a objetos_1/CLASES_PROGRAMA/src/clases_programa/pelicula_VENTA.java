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
public class pelicula_VENTA {
    private String nombre_peli;
    private String fecha_estreno;
    private String director;
    private String actores;
    private int precio;
    Scanner leer=new Scanner (System.in);
public void menu_venta(){
       int opcion;
       do{
           System.out.println("menu Venta");
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
               case 1: registrar_venta();break;
               case 2: consultar_venta();break;
               case 3: actualizar_venta();break;
               case 4: borrar_venta();
           }
       }
       while(opcion!=5);

   }    
public void registrar_venta(){
    leer.nextLine();
    System.out.println("nombre de la pelicula: ");
    nombre_peli=leer.nextLine();
    System.out.println("fecha de estreno de la pelicula: ");
    fecha_estreno=leer.nextLine();
    System.out.println("director de la pelicula: ");
    director=leer.nextLine();
    System.out.println("actores principales: ");
    actores=leer.nextLine();
    System.out.println("precio de la pelicula: ");
    precio=leer.nextInt();
    
}
public void consultar_venta(){
    System.out.println("nombre de la pelicula: "+nombre_peli);
    System.out.println("fecha de estreno de la pelicula: "+fecha_estreno);
    System.out.println("director de la pelicula: "+director);
    System.out.println("actores principales: "+actores);
    System.out.println("precio de la pelicula: "+precio);
}
public void borrar_venta(){
     char res;
     leer.nextLine();
     do {
         System.out.println("desea borrar los datos de la venta s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         nombre_peli="";
         fecha_estreno="";
         director="";
         actores="";
         precio=0;
     }
 }
public void actualizar_venta(){
    char res;
    leer.nextLine();
     do {
         System.out.println("desea actualizar los datos de la venta s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         registrar_venta();
         
     }
     
 }

    
}
