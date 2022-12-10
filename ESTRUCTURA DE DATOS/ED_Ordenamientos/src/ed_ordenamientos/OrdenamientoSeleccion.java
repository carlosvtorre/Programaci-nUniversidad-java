package ed_ordenamientos;


public class OrdenamientoSeleccion {
    
   public void ordenamiento(int datos[] ){
       for (int i = 0; i < datos.length-1; i++) {
           int masPequeño = i;
           for (int indice = i+1; indice < datos.length; indice++) 
               if (datos[indice] < datos[masPequeño])
                   masPequeño = indice;
            
           intercambiar(datos, i, masPequeño);
           imprimirPasada(datos, i+1, masPequeño);
           
       }
   }
   
   private void intercambiar(int[] datos, int primero, int segundo){
       int temporal = datos[primero];
       datos[primero] = datos[segundo];
       datos[segundo] = temporal;
   }
   
   private void imprimirPasada(int[] datos, int pasada, int indice){
       System.out.println("despues de pasada: "+ pasada);
       for (int i = 0; i < indice; i++) {
           System.out.println(" "+datos[i]);
       }
       System.out.println(""+datos[indice]);
       
       for (int i = indice+1; i < datos.length; i++) {
           System.out.println(" "+datos[i]);
       }
       System.out.println("             ");
       
       for (int j = 0; j < pasada; j++) {
           System.out.print("__ ");
           
       }
       System.out.println();
   }
    
    
}
