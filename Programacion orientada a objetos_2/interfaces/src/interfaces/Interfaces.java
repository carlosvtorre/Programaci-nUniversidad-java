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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circulo1 circulo = new circulo1();
        triangulo triangulo1 = new triangulo();
        cuadrado cuadrado1 = new cuadrado ();
        double area = circulo.calcular_area();
        System.out.println("area del circula igual a: "+ area);
        System.out.println("--");
        double perimetro = circulo.calcular_perimetro();
        System.out.println("perimetro del circulo igual a: "+perimetro);
        System.out.println("--------------------------------");
        double area_triangulo = triangulo1.calcular_area();
        System.out.println("area de triangulo: "+area_triangulo);
        System.out.println("--");
        double perimetro_triangulo = triangulo1.calcular_perimetro();
        System.out.println("perimetro del triangulo: "+perimetro_triangulo);
        System.out.println("--------------------------------");
        double area_cuadrado = cuadrado1.calcular_area();
        System.out.println("area del cuadrado: "+area_cuadrado);
        System.out.println("--");
        double perimetro_cuadrado = cuadrado1.calcular_perimetro();
        System.out.println("perimetro del cuadrado: "+perimetro_cuadrado);
    }
    
}
