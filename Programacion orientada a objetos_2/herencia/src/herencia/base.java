/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
// se coloca abstract en el metodo principal para poder hacer el metodo abstracto de eliminar 
// polimorfismo
public abstract class base {
    //son los atributos que heredan la clase alumnos y docentes
    Scanner leer = new Scanner(System.in);
    protected String codigo;
    protected String nombre;
    protected String fecha_nacimiento;
public void registrar(String letrero){
        System.out.print(letrero);
        codigo = leer.nextLine();
        System.out.print("nombre: ");
        nombre = leer.nextLine();
        System.out.print("fecha de nacimiento: ");
        fecha_nacimiento = leer.nextLine();
}
public void consultar(String letrero){
    System.out.println(letrero+codigo);
        
    System.out.println("nombre: "+nombre );
        
    System.out.println("fecha de nacimiento: "+fecha_nacimiento);
         
}
public abstract void actualizar();
public abstract void eliminar();
// polimorfismo colocas abstract antes de void es obligatorio que en las clases 
// que heredan base se cree el metodo eliminar (); si no marca error
public int menu(){
    int opcion;
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
    
        
    
}

