package ed_ordenamientos;

public class OrdenamientoInsercion {
    
    public void Ordenamiento(int array[]){
        for (int siguiente = 1; siguiente < array.length; siguiente++) {
            int insercion = array[siguiente];
            int moverElemento = siguiente;
            while(moverElemento > 0 && array[moverElemento - 1]> insercion){
                array[moverElemento] = array[moverElemento-1];
                moverElemento--;
            }
            array[moverElemento] = insercion;
            imprimirPasada(array, siguiente, moverElemento);
        }
    }
    private void imprimirPasada(int[] datos, int pasada, int indice){
       System.out.println("despues de pasada: "+ pasada);
       for (int i = 0; i < indice; i++) {
           System.out.println(""+datos[i]);
       }
       System.out.println(" "+datos[indice]);
       
       for (int i = indice+1; i < datos.length; i++) {
           System.out.println(""+datos[i]);
       }
       System.out.println("            ");
       
       for (int i = 0; i < pasada; i++) {
           System.out.print("__ ");
           
       }
       System.out.println();
    }
    
}
