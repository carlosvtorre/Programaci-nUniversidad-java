/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        do{
            System.out.println("1...calcular hipotenusa");
            System.out.println("2...calcular promedio");
            System.out.println("3....Visualizar situzción academica");
            System.out.println("4....salir");
            
            opcion=leer_numero_entero("seleeccione una opcion: ",1,4,true);
            switch (opcion){
                case 1:
                double c1=leer_numero_decimal("Valor del cateto 1 (1,100): ",1,100,true);
                double c2=leer_numero_decimal("Valor del cateto 2 (1,100): ",1,100,true);
                double hip=hipotenusa(c1,c2);
                    System.out.println("La hipotenusa es igual a: "+hip);
                break;
                
                case 2:
                   double cal1 = leer_numero_decimal("introduzca la primera calificación",0,100,true);
                   double cal2 = leer_numero_decimal("introduzca la segunda calificación",0,100,true);
                   double cal3 = leer_numero_decimal("introduzca la tercera calificación",0,100,true);
                   double prom = promedio(cal1,cal2,cal3);
                    System.out.println("El  promedio es :"+prom);
                    break;
                case 3: 
                    prom = leer_numero_decimal("proporcione el promedio del alumno",0,100,true);
                    String sit = cal(prom);
                    System.out.println("La situación academica del alumno es  "+sit);
            }
            
        }while(opcion!=4);
        
        
        

        
    }
    
    public static double leer_numero_decimal(String letrero,double inferior,double superior, boolean error){
        double numero;
        do{ 
            System.out.println(letrero);
            numero=leer.nextDouble();
            if ((numero<inferior || numero>superior) && error==true){
                System.out.println("Error en el rango, los vlores deben de estar entre "+ inferior + "y"+ superior);
            }
        }while(numero<inferior || numero>superior);
        return numero;
    }
    
    public static int leer_numero_entero(String letrero,int inferior,int superior, boolean error){
        int numero;
        do{ 
            System.out.println(letrero);
            numero=leer.nextInt();
            if ((numero<inferior || numero>superior) && error==true){
                System.out.println("Error en el rango, los vlores deben de estar entre "+ inferior + "y"+ superior);
            }
        }while(numero<inferior || numero>superior);
        return numero;
    }
    
    
    
    
    
    
    // codificar un metodo que calcule el promedio de calificación 
    // se tiene 3 calificaciones parciales 
    // el metodo debe de regresar  como valor el promedio
    public static double promedio(double cal1, double cal2, double cal3){
       return (cal1+cal2+cal3)/3;
    }
    
    //codificar un metodo que regrese como valor un letrero 
    // que puede ser "aprobado " o Reprobado 
    // teniendo como parametro de entrada el promedio 
    public static String cal(double pr){
       
       if(pr >=70) return "aprobado";
       else  return "reprobado";
        
    }
    
    
    
    public static double hipotenusa(double cateto1, double cateto2){
        return Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        
        
    } 
    
    /*public static double hipotenusa(double cateto1, double cateto2){
        double hip;
        //Math.sqrt es para sacar la raiz 
        //Maht.pow para elevar al cuadrado
        hip=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        return hip;
        
    } 
    
    public static void hipotenusa(double cateto1, double cateto2){
        double hipotenusa;
        //Math.sqrt es para sacar la raiz 
        //Maht.pow para elevar al cuadrado
        hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        System.out.println("La raiz cuadrada es igual a: "+hipotenusa);
    } 
    
     public static void hipotenusa(){
        Scanner leer=new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;
        System.out.println("Ingrese el valor del cateto adyacente: ");
        cateto1=leer.nextDouble();
        System.out.println("Ingrese el valor del cateto opuesto: ");
        cateto2=leer.nextDouble();
        //Math.sqrt es para sacar la raiz 
        //Maht.pow para elevar al cuadrado
        hipotenusa=Math.sqrt(Math.pow(cateto2,2)+Math.pow(cateto2,2));
        System.out.println("La raiz cuadrada es igual a: "+hipotenusa);
    } */
    
   
    
}
