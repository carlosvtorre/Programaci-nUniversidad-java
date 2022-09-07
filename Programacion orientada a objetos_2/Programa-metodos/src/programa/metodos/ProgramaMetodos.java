/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.metodos;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class ProgramaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int opc;
        do{
        System.out.println("");
        System.out.println("Seleccione una opción:\n1.- Mayor de 4 números enteros \n2.- Valor medio de 3 números \n3.- Area de un Rectangulo \n4.- Persona mayor o menor de edad  \n5.- Salir");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                int num1,num2,num3,num4,mayor;
                System.out.print("primer numero: ");
                num1=leer.nextInt();
                System.out.print("segundo numero: ");
                num2=leer.nextInt();
                System.out.print("tercer numero: ");
                num3=leer.nextInt();
                System.out.print("cuarto numero: ");
                num4=leer.nextInt();
                mayor= mayor4(num1,num2,num3,num4);
                System.out.println("el mayor es: "+mayor);
        
                break;
                
            case 2:
                double numero1,numero2,numero3,valorM;
                System.out.println("-ingrese el primer Número: ");
                numero1 = leer.nextDouble();
                System.out.println("Ingrese el segundo Número: ");
                numero2 = leer.nextDouble();
                System.out.println("Ingrese el tercer Número: ");
                numero3 = leer.nextDouble();
                valorM = ValorMedio(numero1,numero2,numero3);
                System.out.println("El valor medio es: "+valorM);
               
                break;
                
            case 3:
                double Ba, Al, Area;
                System.out.println("Ingrese la base del Rectangulo: ");
                Ba=leer.nextDouble();
                System.out.println("Ingrese la Altura del Rectangulo: ");
                Al=leer.nextDouble();
                Area = Area_Rectangulo(Ba,Al);
                System.out.println("El Area es: "+Area);
                break;
                
            case 4:
                float edad;
                String status;
                System.out.println("Ingrese su edad: ");
                edad = leer.nextInt();
                status = Persona_Mayor(edad);
                System.out.println(status);
                
                break;
                
            case 5:
                System.exit(0);
            default:
                System.err.println("Dato Incorrecto");
        }
        
    }while(opc!=5);
        
    }
    
    public static int mayor4(int n1, int n2, int n3, int n4){
        
        if (n1>n2){
            if (n1>n3){
                if (n1>n4){
                    return n1;
                }
                else {
                    return n4;
                }
            }
            else {
                if (n3>n4){
                    return n3;
                }
                else {
                    return n4;
                }
            }
        }
        else {
            if (n2>n3){
                if (n2>n4){
                    return n4;
                }
                else {
                    return n4;
                }
            }
            else {
                if (n3>n4){
                    return n3;
                }
                else {
                    return n4;
                }
            }
        }
    }
    
    public static double ValorMedio(double n1, double n2, double n3){
        if (n1>n2){
            if(n1>n3){
                if (n2>n3){
                    return n2;
                }
                else {
                    return n3;
                }
            }
            else{
               return n1; 
            }
        }
        else{
            if(n2>n3){
                if(n3>n1){
                    return n3;
                }
                else {
                    return n1;
                }
            }
            else{
               return n2; 
                
            }
        }
        
    }
    
    public static double Area_Rectangulo(double B, double A){
        return B*A;
    }
    
    public static String Persona_Mayor(float E){
        
        if(E>=18){
            return "Mayor de edad";
        }
        else{
            return "Menor de edad";
        }
        
        
    }
    
}
