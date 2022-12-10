package ed_ordena_productos;

import static ed_ordena_productos.ED_ORDENA_PRODUCTOS.productos;
import javax.swing.JOptionPane;

public class Ordenamientos {
    //Metodo que ordena los productos 
    public static void burbujaNombreProducto(Producto arreglo[], int numProductos) {
        Producto temp = null;
        for (int i = 0; i <= numProductos - 1; i++) {
            for (int j = 0; j <= arreglo.length - 2; j++) {
                if (arreglo[j].getNombre().compareTo(arreglo[j + 1].getNombre())>0) { 
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    
    // metodo que ordena los productos por nombre de manera descendente 
    public static void BurbujaNombreDescendente(Producto [] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j].getNombre().compareTo(array[j+1].getNombre())<0) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    //Ordenamiento de productos por codigo de baras de manera ascendente 
    public static void BurbujaBarraAcendente(Producto[] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j].getCodigo_barras().compareTo(array[j+1].getCodigo_barras())>0) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    //Ordenamiento de productos por codigo de baras de manera descendente 
    public static void BurbujaBarraDescendente(Producto[] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j].getCodigo_barras().compareTo(array[j+1].getCodigo_barras())<0) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    //ordenamiento de productos por precio de manera ascendente
    public static void BurbujaPrecioAscendente(Producto[] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j].getPrecio()>(array[j+1].getPrecio())) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    //ordenamiento de productos por precio de manera descendente 
    public static void BurbujaPrecioDescendente(Producto[] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j].getPrecio()<(array[j+1].getPrecio())) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    //Ordenamientos de productos por existencia de manera ascendente
    public static void BurbujaExistenciaAscendente(Producto[] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j + 1].getExistencia()<(array[j].getExistencia())) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    //Ordenamiento de productos de manera descendente
    public static void BurbujaExistenciaDescendente(Producto[] array, int numProducto){
        Producto temp;
        for (int i = 0; i < numProducto-1; i++) {
            for (int j = 0; j < numProducto-1; j++) {                                                              
                if (array[j + 1].getExistencia()>(array[j].getExistencia())) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
     
    public static void mostrarArreglo(Producto arreglo[], int numProductos){ 
        for (int i = 0; i < numProductos; i++) {
            Producto dato = arreglo[i];
            System.out.println(dato+" ");
        }
    }
    public static void eliminar(Producto arreglo[],int numProductos, int indice){
        for (int i = indice-1; i < numProductos-1; i++) {
            arreglo[i]=arreglo[i+1];
        }
    }
    public static void modificar(Producto arreglo[], int indice){
                    String codigoBarras =JOptionPane.showInputDialog("Ingrese el codigo de barras: ");
                    String nombre =JOptionPane.showInputDialog("Ingrese el nombre: ");
                    double precio =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                    int existencia =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nímero de productos: "));
                    productos[indice-1]= new Producto(codigoBarras,nombre,precio,existencia);
        
    }
    
    
    //inicia el metodo de ordenamiento por combinacion 
    
    //nombre de manera ascendente 
    public  void CombinacionNombreAcendente(Producto arreglo[]){
        ordenarArreglo(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArreglo(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArreglo(datos, inferior, medio1); 
            ordenarArreglo(datos, medio2, superior); 
            
            combinar (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinar(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getNombre().compareTo(datos[indiceDer].getNombre())<0) {//
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
       
    }
    
    //nombre de manera descendente 
    
    public  void CombinacionNombreDescendente(Producto arreglo[]){
        ordenarArregloNombreD(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloNombreD(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloNombreD(datos, inferior, medio1); 
            ordenarArregloNombreD(datos, medio2, superior); 
            
            combinarNombreD (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarNombreD(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getNombre().compareTo(datos[indiceDer].getNombre())>0) {//
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
       
    }
    //barras de manera ascendente
    public  void CombinacionBarrasAscendente(Producto arreglo[]){
        ordenarArregloBarrasA(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloBarrasA(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloBarrasA(datos, inferior, medio1); 
            ordenarArregloBarrasA(datos, medio2, superior); 
            
            combinarBarrasA (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarBarrasA(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getCodigo_barras().compareTo(datos[indiceDer].getCodigo_barras())<0) {//
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
       
    }
    //barras de manera descendente
    public  void CombinacionBarrasDescendente(Producto arreglo[]){
        ordenarArregloBarrasD(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloBarrasD(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloBarrasD(datos, inferior, medio1); 
            ordenarArregloBarrasD(datos, medio2, superior); 
            
            combinarBarrasD (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarBarrasD(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getCodigo_barras().compareTo(datos[indiceDer].getCodigo_barras())>0) {//
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
       
    }
    
    // ordenamiento por precio ascendente
    public  void CombinacionPrecioAscendente(Producto arreglo[]){
        ordenarArregloPrecioA(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloPrecioA(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloPrecioA(datos, inferior, medio1); 
            ordenarArregloPrecioA(datos, medio2, superior); 
            
            combinarPrecioA (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarPrecioA(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getPrecio()<(datos[indiceDer].getPrecio())) {//
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
       
    }
  //ordenamiento por precio descendente 
    public  void CombinacionPrecioDescendente(Producto arreglo[]){
        ordenarArregloPrecioD(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloPrecioD(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloPrecioD(datos, inferior, medio1); 
            ordenarArregloPrecioD(datos, medio2, superior); 
            
            combinarPrecioD (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarPrecioD(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getPrecio()>(datos[indiceDer].getPrecio())) {//
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
       
    }
    
    //ordenamiento por existencia ascendente 
    public  void CombinacionExistenciaAscendente(Producto arreglo[]){
        ordenarArregloExistenciaA(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloExistenciaA(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloExistenciaA(datos, inferior, medio1); 
            ordenarArregloExistenciaA(datos, medio2, superior); 
            
            combinarExistenciaA (datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarExistenciaA(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getExistencia()<(datos[indiceDer].getExistencia())) {//
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
       
    }
    
    //ordenamiento por existencia descendente 
    public  void CombinacionExistenciaDescendente(Producto arreglo[]){
        ordenarArregloExistenciaD(arreglo, 0, arreglo.length - 1);
    }
    private void ordenarArregloExistenciaD(Producto[] datos, int inferior, int superior){
        if  ((superior - inferior) >= 1) {
            int medio1 = (inferior + superior)/2;
            int medio2 = medio1 + 1;
            ordenarArregloExistenciaD(datos, inferior, medio1); 
            ordenarArregloExistenciaD(datos, medio2, superior); 
            
            combinarExistenciaD(datos, inferior, medio1, medio2, superior); 

        }
            
    }
    
    private void combinarExistenciaD(Producto[] datos, int izquierdo, int medio1, int medio2, int derecho){
        int indiceIzq = izquierdo;
        int indiceDer = medio2; 
        int indiceCombinado = izquierdo;
        Producto[] combinado = new Producto[datos.length];
        
        
        while  (indiceIzq <= medio1 && indiceDer <= derecho){
            if (datos[indiceIzq].getExistencia()>(datos[indiceDer].getExistencia())) {//
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
       // 
       
    }
    
    
    
    
}
