/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros_revistas;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public abstract class datos_generales {
Scanner leer = new Scanner (System.in);
protected String nombre;
protected String fecha;
protected String autor;
public int menu(String let){
    int opcion;
    System.out.println(let);
    System.out.println("1 registrar");
    System.out.println("2 consultar");
    System.out.println("3 eliminar");
    System.out.println("4 actualizar");
    System.out.println("5 menu principal");
    do{
        System.out.println("seleccione una opcion");
        opcion = leer.nextInt();
    }while(opcion <1 || opcion>5);
    return opcion;       
}  

public void registrar(String let){
    System.out.println(let);
    System.out.println("Nombre: ");
    nombre = leer.nextLine();
    System.out.println("Fecha de publicación: ");
    fecha = leer.nextLine();
    System.out.println("Nombre del autor: ");
    autor = leer.nextLine();
}

public abstract void actualizar();
public abstract void eliminar ();
}
