/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class puestos {
    Scanner leer = new Scanner(System.in);
    private String descripcion_puesto;
    private String area_pertenece;
    private String horario;
    private double sueldo;
    
    //crear los metodos de registrar y consultar puestos 
    // agragar tres constructures 
    // llamar desde el metodo principal

public puestos(String descripcion_puesto, String area_pertenece, String horario, double sueldo){
        this.descripcion_puesto = descripcion_puesto;
        this.area_pertenece = area_pertenece;
        this.horario = horario;
        this.sueldo = sueldo;
}

    public puestos(double sueldo) {
        this.sueldo = sueldo;
    }

    public puestos() {
    }

    public void registrar() {
        System.out.println("Descripción del puesto: ");
        descripcion_puesto = leer.nextLine();
        System.out.println("Area a la que pertenece: ");
        area_pertenece = leer.nextLine();
        System.out.println("horario: ");
        horario = leer.nextLine();
        System.out.println("sueldo: ");
        sueldo = leer.nextDouble();
    }
public void puesto_consulta(){
    System.out.println("Descripción del puesto: "+descripcion_puesto);
    
    System.out.println("Area a la que pertenece: "+area_pertenece);
    
    System.out.println("horario: "+horario);
    
    System.out.println("sueldo: "+sueldo);
    
}
}

