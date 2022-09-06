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
public class entrenadores {
    private String nombre;
    private String equipo;
    private int años_dirigiendo;
    Scanner leer=new Scanner (System.in);
    public void menu_entrenadores(){
       int opcion;
       do{
           System.out.println("menu Entrenadores");
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
               case 1: registrar_entrenadores();break;
               case 2: consultar_entrenadores();break;
               case 3: actualizar_entrenadores();break;
               case 4: borrar_entrenadores();
           }
       }
       while(opcion!=5);
   }
public void registrar_entrenadores (){
    leer.nextLine();
    System.out.println("nombre del entrenador: ");
    nombre=leer.nextLine();
    System.out.println("Equipo al que pertenece: ");
    equipo=leer.nextLine();
    System.out.println("años dirigiendo al equipo: ");
    años_dirigiendo=leer.nextInt();
}
public void consultar_entrenadores (){
    System.out.println("nombre del entrenador: "+nombre);
    System.out.println("Equipo al que pertenece: "+equipo);
    System.out.println("Años dirigiendo: "+años_dirigiendo);
}
public void borrar_entrenadores(){
     char res;
     consultar_entrenadores();
     leer.nextLine();
     do {
         System.out.println("desea borrar los datos del entrenador s/n ?: ");
         res=leer.nextLine().toUpperCase().charAt(0);
     }
     while (res!='S' && res!='N');
     if (res=='S'){
         nombre="";
         equipo="";
          años_dirigiendo=0;
     }
 }
public void actualizar_entrenadores() {
    char res;
   leer.nextLine();
    do{
        System.out.println("desea actualizar los datos del entrenador s/n: ");
        res=leer.nextLine().toUpperCase().charAt(0);
    }while(res!='S' && res!='N');
     if (res=='S'){
         registrar_entrenadores();
     }
}
    
}
