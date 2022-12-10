
package ed_ordenamientoburbuja;

import javax.swing.JOptionPane;


public class ED_OrdenamientoBurbuja {
static int array[]={7,9,3,2,1,17};
  
    public static void main(String[] args) {
      int num[]= new int[5];
      //ordenarArreglo(array);  
      //mostrarArreglo(array);
      leerArreglo(num);
      ordenarArreglo(num);
      mostrarArreglo(num);
      
        
    }
    
    public static void leerArreglo(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++){
           int dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número: ")); 
           arreglo[i]= dato;
        }
        
    }
    
    public static void mostrarArreglo(int arreglo[]){ 
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]+"");
        }
        
    }
    
    public static void ordenarArreglo(int arreglo[]){
        int temp = 0;
        for (int i = 0; i <= arreglo.length-1; i++) { //6
            for (int j = 0; j <= arreglo.length-2; j++) {//5
                if(arreglo[j]>arreglo[j+1]){ // si arreglo en la pos.actual es mayor a pos.siguiente 
                    temp = arreglo[j];//se asigna a temp el valor de arreglo en pos.actual
                    arreglo[j]=arreglo[j+1];// se asigna a arreglo en pos.atual el valor del arreglo en pos.siguiente
                    arreglo[j+1]=temp;// se asigna temp a arreglo en pos.siguiente
                }
            }
        }
    }
    
}
