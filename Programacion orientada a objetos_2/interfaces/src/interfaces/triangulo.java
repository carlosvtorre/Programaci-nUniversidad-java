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
public class triangulo implements figuras{
    public double calcular_area(){
        System.out.println("base: "+valor1);
        System.out.println("altura: "+valor2);
        return valor1*valor2/2;
    }
    public double calcular_perimetro(){
        System.out.println("valor del lado 1: "+valor1);
        System.out.println("valor del lado 2: "+valor2);
        System.out.println("valor del lado 3: "+valor3);
        return valor1+valor2+valor3;
    }
}
