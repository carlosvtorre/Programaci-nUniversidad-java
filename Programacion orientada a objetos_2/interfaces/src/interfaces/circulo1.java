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
public class circulo1 implements figuras {
    public double calcular_area(){
        System.out.println("El valor del radio es igual a "+valor1);
        return Math.PI*Math.pow(valor1, 2);
                
    }
    public double calcular_perimetro(){
        System.out.println("El valor del diámetro es igual a "+valor1*2);
        return Math.PI*2*valor1;
    }
 
}
