package ed_ordenamientos;

public class OrdenamientoCombinacion {
    public void ordenamiento(int[] datos){
        ordenarArreglo(datos, 0, datos.length - 1);
    }
    private void ordenarArreglo(int[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            
            System.out.printf("division: %s%n",subarregloString(datos, inferior, superior));
            System.out.printf(" %s%n",subarregloString(datos, inferior, medio1));
            System.out.printf(" %s%n%n",subarregloString(datos, medio2, superior));
            
            ordenarArreglo(datos, inferior, medio1); 
            ordenarArreglo(datos, medio2, superior); 
            
            combinar (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinar(int[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        int[] combinado = new int[datos.length];
        
        System.out.printf("combinacion: %s%n",subarregloString(datos, izquierdo, medio1));
        System.out.printf(" %s%n",subarregloString(datos, medio2, derecho));
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq] <= datos[indiceDer]) {
                combinado[indiceCombinado++] = datos[indiceIzq++]; 

            }
            else{
                combinado[indiceCombinado++] = datos[indiceDer++];
            }
        }
        if (indiceIzq == medio2) {
            while (indiceDer <= derecho){
                combinado[indiceCombinado++] = datos[indiceDer++];
            }
        }
        else{
            while (indiceIzq <= medio1){
                combinado[indiceCombinado++] = datos[indiceIzq++];
            }
        }
        
       for (int i = izquierdo; i <= derecho; i++) 
           datos[i] = combinado[i]; 
       
       System.out.printf(" %s%n%n",subarregloString(datos, izquierdo, derecho));
    }
    
    private String subarregloString(int[] datos, int inferior, int superior){
        StringBuilder temporal = new StringBuilder();
        for (int i = 0; i<inferior; i++)
            temporal.append("  ");
        
        for (int i = inferior; i <= superior; i++)
            temporal.append(" " + datos[i]);
        
        return temporal.toString();
    }
    
    
}
