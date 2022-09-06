/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoswitch;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class USOSWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner (System.in);
        int dia_semana;
        System.out.print("Intoduzca dia de la semana con numero:");
        dia_semana=leer.nextInt();
       /* if (dia_semana==1){
            System.out.println("Domingo");
        }
        else {
            if (dia_semana==2){
                System.out.println("Lunes");
            }
            else {
                if (dia_semana==3){
                    System.out.println("Martes");
                }
                else {
                    if (dia_semana==4){
                        System.out.println("Miercoles");
                    }
                    else{
                        if (dia_semana==5){
                            System.out.println("Jueves");
                        }
                        else {
                            if (dia_semana==6){
                                System.out.println("Viernes");
                            }
                            else{
                                if (dia_semana==7){
                                    System.out.println("Sabado");
                                }
                                else {
                                    System.out.println("Error en el dato");
                                }
                            }
                        }
                    }
                }
            }
        }*/
       // el switch solo funciona con enteros int, chart se tiene que poner el numero en '1'
      switch (dia_semana){
          case 1:System.out.println("Domingo");break;
          case 2:System.out.println("Lunes");break;
          case 3:System.out.println("Martes");break;
          case 4:System.out.println("Miercoles");break;
          case 5:System.out.println("Jueves");break;
          case 6:System.out.println("viernes");break;
          case 7:System.out.println("Sabado");break;
          default:System.out.println("Error en el dato");
      } 
      switch (dia_semana){
          case 1: case 3: case 5: case 7:System.out.println("Dia impar");break;
          case 2: case 4: case 6:System.out.println("Dia par");
      }
    }
    
}
