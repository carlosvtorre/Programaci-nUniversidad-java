/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_interfaces;

/**
 *
 * @author carlo
 */
public class Libros_matematicas implements libros{
    public double vendidos_semana(){
        System.out.println("Libros vendidos en una semana: "+15);
        System.out.println("precio del libro: "+libro2);
        return libro2*15;
    }
    
    public double vendidos_mes(){
        
        System.out.println("Libros vendidos en un mes: "+60);
        System.out.println("precio del libro: "+libro2);
        return libro2*60;
       
        
    }
    public double vendidos_año(){
        
        System.out.println("Libros vendidos en un año: "+500);
        System.out.println("precio del libro: "+libro2);
        return libro2*500;
       
        
    }
    
    public double descuento(){
        
        System.out.println("Descuento de 10%");
        System.out.println("precio del libro: "+libro2);
        return (libro2/100)*10;
       
        
    }
}
