/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_herencia_polimorfismo;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public abstract class base {
    Scanner leer = new Scanner (System.in);
    
protected String tipo;
protected String talla;
protected String marca;
protected String color;

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

public void registrar (String letrero){
    System.out.println(letrero);
    System.out.println("Tipo de calzado: ");
    tipo = leer.nextLine();
    System.out.println("Talla del calzado: ");
    talla = leer.nextLine();
    System.out.println("Marca del calzado: ");
    marca = leer.nextLine ();
    System.out.println("Color del calzado: ");
    color = leer.nextLine();
}
public void consultar(){
    System.out.println("Tipo de calzado: "+tipo);
    System.out.println("Talla del calzado: "+talla);
    System.out.println("Marca del calzado: "+marca);
    System.out.println("Color del calzado: "+color);
    
}
public abstract void actualizar();
public abstract void eliminar();
}
