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

public class trabajadores {
    Scanner leer=new Scanner(System.in);
    private String nombre;
    private String fecha_nacimiento;
    private String puesto;
    private double sueldo;
    private int antiguedad;

    public trabajadores(String nombre, String fecha_nacimiento, String puesto, double sueldo, int antiguedad) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public trabajadores() {
    }
    
    
    
    public void registrar_trabajadores(){
        System.out.println("Nombre del trabajador: ");
        nombre = leer.nextLine();
        System.out.println("Fecha de nacimiento: ");
        fecha_nacimiento = leer.nextLine();
        System.out.println("puesto que desempeña: ");
        puesto = leer.nextLine();
        System.out.println("Ingrese su sueldo diario $: ");
        sueldo = leer.nextDouble();
        System.out.println("Años antigüedad: ");
        antiguedad = leer.nextInt();
    }
    public void consultar_trabajadores(){
        System.out.println("Nombre del trabajador: "+nombre);
       
        System.out.println("Fecha de nacimiento: "+fecha_nacimiento);
        
        System.out.println("puesto que desempeña: "+puesto);
        
        System.out.println("sueldo diario $: "+sueldo);
        
        System.out.println("Años antigüedad: "+antiguedad);
        
    }
    
}
