/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;//numbre del proyecto


import java.util.Scanner;//importar la clase de escaner
public class AREACIRCULO {//inicia la clase principal del proyecto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//inicia el metodo principal de la clase
        // TODO code application logic here
       Scanner leer=new Scanner (System.in);//crreando un objeto de lectura llamado leer
       double area,radio;// declara dos variables de tipo numerico con decimales
       System.out.print("Intruduzca el valor del radio:");//se imprime un letrero
       radio=leer.nextDouble();//leer la variable radio
       area=Math.PI*radio*radio;//calcular area del circulo
       System.out.println("area del circuloes igual a  "+area);//imprime el resultado
       
    }//termina el metodo principal
    
}//termina la clase principal
