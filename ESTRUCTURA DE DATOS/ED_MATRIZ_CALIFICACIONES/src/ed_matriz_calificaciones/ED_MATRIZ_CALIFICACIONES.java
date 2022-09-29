/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_matriz_calificaciones;

import javax.swing.JOptionPane;
/**
 *
 * @author carlo
 */
public class ED_MATRIZ_CALIFICACIONES {
    static double calificaciones [][]=new double [4][3];
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //captura_calificaciones(calificaciones);
        //imprimir_calificaciones(calificaciones);
        int opcion = 0;
        do{
           try {
                do {                
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú\n"
                + "1.- Capturar calificaciones \n"
                + "2.- Mostrar calificaciones \n"
                + "3.- Promedio del alumno \n"
                + "4.- Promedio general \n"
                + "5.- Obtener calificación \n"
                + "6.- Promedio de Materia\n"
                + "7.- Salir "));
                if (opcion<1 || opcion>7) {
                    letrero("La opcion ingresada no existe.");
                }
            } while (opcion<1 || opcion>7);
            } catch (NumberFormatException e) {
                letrero("Por favor, ingrese una de las opciones disponibles.");
            } 
           switch(opcion){
                case 1:
                    captura_calificaciones(calificaciones);
                    letrero("Calificaciones registradas.");
                    break;
                case 2:
                    imprimir_calificaciones(calificaciones);
                    break;
                case 3:
                    promedioAlumno(calificaciones);
                    break;
                case 4:
                    promedioTotal(calificaciones); 
                    break;
                case 5:
                    obtenerCalificacion(calificaciones); 
                    break;
                case 6:
                    int numMateria = 0;
                    numMateria=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la materia:"));
                    promedioColumna(calificaciones,numMateria);
                    break;
                case 7:
                  System.exit(0);
            }
        }while(opcion !=7);
        
    }
    public static void captura_calificaciones(double matrix[][]){
        for (int fila= 0;fila<matrix.length; fila++ ){
            for(int columna = 0;columna<matrix[0].length; columna++){
               int calificacion = Integer.parseInt(
               JOptionPane.showInputDialog
        ("Ingrese la calificacion"+(columna+1)+"para el alumno "+(fila+1))
               ); 
               matrix [fila][columna]=calificacion;// captura de datos
            }
        }
    }
    
    public static void imprimir_calificaciones(double matrix[][]){
        for (int fila= 0;fila<matrix.length; fila++ ){
            letrero("-Alumno "+(fila+1)+": ");
            for(int columna = 0;columna<matrix[0].length; columna++){
               letrero(" "+matrix[fila][columna]);
            }
            System.out.println("");
        }
    }
    
    public static void letrero(String letrero){
        JOptionPane.showMessageDialog(null, letrero);
    }
    
    public static void promedioAlumno(double matrix [][]){
        double promedio=0;
        int nAlumno=0;
        do {
                try {
                    nAlumno=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
                    if (nAlumno<1 || nAlumno>matrix.length) {
                        letrero("El número del alumno no existe.");
                    }
                } catch (Exception e) {
                    letrero("No se ha ingresado ningún valor.");
                }
            } while (nAlumno<1 || nAlumno>matrix.length);
            for (int i = 0; i < matrix[0].length; i++) {
                promedio=promedio+matrix[nAlumno-1][i];
            }
            promedio=promedio/matrix[0].length;
            letrero("El promedio del alumno "+nAlumno+" es: "+promedio);
    }
    
    public static void promedioTotal(double matrix[][]){
        int promedio;
        double[] promedios= new double[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                promedio=0;
                for (int j = 0; j < matrix[0].length; j++) {
                    promedio=(int) (promedio+matrix[i][j]);
                }
                promedios[i]=promedio/matrix[0].length;
            }
            promedio=0;
            for (int i = 0; i < promedios.length; i++) {
                promedio=(int) (promedio+promedios[i]);
            }
            promedio=promedio/matrix.length;
            letrero("El promedio general es: "+promedio);
    }
    
    public static void obtenerCalificacion(double matrix[][]){
        int nAlumno=0, nCalificacion=0;
        do {  
            try {
                nAlumno=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del alumno: "));
                if (nAlumno<1 || nAlumno>matrix.length) {
                    letrero("El número del alumno no existe. Ingrese nuevamente el número.");
                }
            } catch (Exception e) {
                letrero("No se ha ingresado ningún valor. Por favor, ingrese nuevamente el número del alumno");
            }
        } while (nAlumno<1 || nAlumno>matrix.length);
        do { 
            try {
                nCalificacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la calificacion del alumno: "));
                if (nCalificacion<1 || nCalificacion>matrix[0].length) {
                    letrero("El número de la calificación no existe. Ingrese nuevamente el número.");
                }
            } catch (Exception e) {
                letrero("No se ha ingresado ningún valor. Por favor, ingrese nuevamente el número del alumno");
            }
        } while (nCalificacion<1 || nCalificacion>matrix[0].length);
        letrero("La calificación seleccionada del alumno "+nAlumno+" es: "+String.valueOf(matrix[nAlumno-1][nCalificacion-1]));
    }
    
    public static void promedioColumna(double matrix [][], int num){
        double promedio = 0;
        double suma=0;
            for(int i = 0; i<matrix.length;i++){
                suma = suma +matrix[i][num-1];
            }
            promedio = suma/matrix.length;
            letrero("El promedio de la Materia "+num+" es: "+promedio);
        
        
    }
}
