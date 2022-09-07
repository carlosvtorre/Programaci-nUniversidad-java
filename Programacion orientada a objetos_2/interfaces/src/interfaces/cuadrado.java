/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author carlo
 */
public class cuadrado implements figuras {
    public double calcular_area(){
        System.out.println("El lado es: "+valor1);
        return valor1*valor1;
    }
    public double calcular_perimetro(){
        System.out.println("El valor de los lados es : "+valor1);
        return valor1*4;
    }
}
