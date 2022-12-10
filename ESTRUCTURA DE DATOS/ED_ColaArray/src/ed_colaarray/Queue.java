
package ed_colaarray;

import javax.swing.JOptionPane;

public class Queue {
    private int array[];
    private int tope;

    public Queue(int tam) {
        array = new int [tam];
        tope = 0;
    }
    
    public boolean esta_llena(){ // función para ver si la cola esta llena 
      if (array.length == tope){
          return true;
      }
      else{
          return false;
      }
    }
    
    public boolean esta_vacia(){ // si tope es igual a cero returna true 
        return tope == 0;
    }
    
    public void push(int dato){
        if(esta_llena()==true){// Si la funcion esta llena es igual a true envia mensaje de cola llena
            letrero("Cola llena");
        }
        else{
            array[tope]=dato;
            tope++;
        }
    }
    public void pop(){
        if(esta_vacia() == true){
            letrero("Cola vacia");
        }
        else{
            int numEliminado;// se almacena en esta variable el valor del numero que va a salir 
            numEliminado = array[0];// que es la posición 0 del array 
            for (int i = 0; i < tope; i++) { // el ciclo se ejecuta hasta antes de llegar al tope 
                array[i] = array[i+1];// en esta parte se recorren los valores a una pocision menos de la original
            }
            tope--;
            letrero("El número que salío de la Cola es: "+numEliminado);
        }
    }
    
    
    public void mostrarCola(){ 
        System.out.println("-------------------------------------");
        for (int i = 0; i < tope; i++) {
            System.out.println(array[i]+"");
        }
        
    }
    
    public void letrero(String let){
        JOptionPane.showMessageDialog(null, let);
    }
    
    
    
}
