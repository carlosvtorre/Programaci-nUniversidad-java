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
public class cliente {
   private String nombre;
   private String fecha_inscripcion;
   private String numero_cliente;
   private String membresia;
   private int costo_membresia;
   Scanner leer=new Scanner (System.in);
public void menu_cliente(){
       int opcion;
       do{
           System.out.println("menu Cliente");
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
               case 1: registrar_cliente();break;
               case 2: consultar_cliente();break;
               case 3: actualizar_cliente();break;
               case 4: borrar_cliente();
               
           }
       }
       while(opcion!=5);
   }   
public void registrar_cliente(){
    leer.nextLine();
    System.out.println("nombre del cliente: ");
    nombre=leer.nextLine();
    System.out.println("fecha de inscripción a la tienda: ");
    fecha_inscripcion=leer.nextLine();
    System.out.println("numero de cliente: ");
    numero_cliente=leer.nextLine();
    System.out.println("que membresia tiene basico/premium: ");
    membresia=leer.nextLine();
    System.out.println("costo de la membresia $: ");
    costo_membresia=leer.nextInt();
}
public void consultar_cliente(){
    leer.nextLine();
    System.out.println("nombre del cliente: "+nombre);
    System.out.println("fecha de inscripcion a la tienda: "+fecha_inscripcion);
    System.out.println("numero de cliente: "+numero_cliente);
    System.out.println("que membresia tiene: "+membresia);
    System.out.println("costo de la membresia "+costo_membresia);
}
public void borrar_cliente(){
    char res;
    leer.nextLine();
    do {
         System.out.println("desea borrar los datos del cliente s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         nombre="";
         fecha_inscripcion="";
         numero_cliente="";
         membresia="";
         costo_membresia=0;
     }
 }
public void actualizar_cliente(){
    char res;
    leer.nextLine();
    
   do {
         System.out.println("desea actualizar los datos del cliente s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
         
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         registrar_cliente();
     }
     
 }

}
