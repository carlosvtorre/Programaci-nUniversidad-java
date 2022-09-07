/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_interfaces;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class libros_terror implements libros{
    Scanner leer=new Scanner(System.in);
    
    public double vendidos_semana(){
        System.out.println("Libros vendidos en una semana: "+15);
        System.out.println("precio del libro: "+libro1);
        return libro1*15;
    }
    
    public double vendidos_mes(){
        
        System.out.println("Libros vendidos en un mes: "+60);
        System.out.println("precio del libro: "+libro1);
        return libro1*60;
       
        
    }
    public double vendidos_año(){
        
        System.out.println("Libros vendidos en un año: "+500);
        System.out.println("precio del libro: "+libro1);
        return libro1*500;
       
        
    }
    
    public double descuento(){
        
        System.out.println("Descuento de 10%");
        System.out.println("precio del libro: "+libro1);
        return (libro1/100)*10;
       
        
    }
    
    
}
