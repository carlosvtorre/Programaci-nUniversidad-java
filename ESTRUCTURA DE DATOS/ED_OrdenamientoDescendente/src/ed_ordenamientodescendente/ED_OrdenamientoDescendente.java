
package ed_ordenamientodescendente;


public class ED_OrdenamientoDescendente {
static int array[]={7,9,3,2,1,17};
    
    public static void main(String[] args) {
        ordenarArreglo(array);
        mostrarArreglo(array);
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
                if(arreglo[j] < arreglo[j+1]){ // si arreglo en la pos.actual es menor a pos.siguiente 
                    temp = arreglo[j];//se asigna a temp el valor de arreglo en pos.actual
                    arreglo[j]=arreglo[j+1];// se asigna a arreglo en pos.atual el valor del arreglo en pos.siguiente
                    arreglo[j+1]=temp;// se asigna temp a arreglo en pos.siguiente
                }
            }
        }
    }
    
}
