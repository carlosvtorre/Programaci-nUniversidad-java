/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_ciclos;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Programa_ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        String nombre,producto,nuevo;
        int deuda,pago,cambio,x,personas,y,calificacion;
        System.out.print("Introduzca el nombre de la tienda: ");
        nombre=leer.nextLine();
        System.out.print("cuantas personas liquidaran su deuda:");
        personas=leer.nextInt();
        for (x=1; x<=personas; x++){
        System.out.print("Introduzca el total de la deuda en la tienda "+ nombre + ":");
        deuda=leer.nextInt();
        do {
         System.out.print("cantidad con la que cuenta en la tarjeta de credito: ");
            pago=leer.nextInt(); 
        }
        while(pago<deuda);
        cambio=pago-deuda;
            System.out.print("Se desconto "+ deuda +" pesos de su tarjeta, su saldo restante sería de: "+cambio +" pesos");
            System.out.println("");
        }
        leer.nextLine();
        do {
            System.out.print("desea adquirir otro producto si/no: ");
            producto=leer.nextLine().toUpperCase();
            if(producto.equalsIgnoreCase("si")){
                do {
                    System.out.print("que producto desea adquirir pantalon o zapatos: ");
                nuevo=leer.nextLine().toUpperCase();
                if(nuevo.equalsIgnoreCase("pantalon")){
                    System.out.println("su deuda es de 250 pesos");
                }
                else{
                    if (nuevo.equalsIgnoreCase("zapatos")){
                        System.out.println("su deuda es de 500 pesos");
                    }
                }
                }
                while(!(nuevo.equals("ZAPATOS")|| nuevo.equals("PANTALON")));
                
        }
            
        }
        while (!(producto.equals("SI")|| producto.equals("NO")));
        System.out.print("");
        y=1;
        System.out.print("cuantas persona calificaran el servicio: ");
        calificacion=leer.nextInt();
        while(y<=calificacion){
            int cali;
            System.out.print("Ingrese la calificación 1/5: ");
            cali=leer.nextInt();
            if(cali==1){
                System.out.println("servicio horrible");
            }
            else {
                if(cali==2){
                    System.out.println("servicio malo");
                }
                else {
                    if (cali==3){
                        System.out.println("servicio regular");
                    }
                    else {
                        if (cali==4){
                            System.out.println("servicio bueno");
                        }
                        else {
                            if(cali==5){
                                System.out.println("servicio exelente");
                            }
                            else {
                                System.out.println("Error en el dato");
                            }
                        }
                    }
                }
            }
            y++;
        }
    }
    
}
