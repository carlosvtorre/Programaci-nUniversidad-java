
package ed_ejerciciosstack;


public class Pila {
    private int array[];//seria linkedlist
    private int tope; 

    public Pila(int tam){
        array = new int [tam];
        tope = 0;
        
    }
    public void modificar(){
        
    }
    
    public void multipop(int n){
        for(int i = 0; i<n ;i++){
         pop();
        }
    }
    
    public boolean esta_llena(){
      if (array.length == tope){
          return true;
      }
      else{
          return false;
      }
    }
    public boolean esta_vacia(){
        return tope == 0;
        
    }
    public void push(int dato){
        if(esta_llena()==true){
            System.out.println("Pila llena");
        }
        else{
            array[tope]=dato;
            tope++;
        }
    }
    public void pop(){
        if(esta_vacia() == true){
            System.out.println("Pila vacia");
        }
        else{
            tope--;
            array[tope]=0;
        }
    }
    public void mostrarPila(){
        for (int i = 0; i < tope; i++) {
            System.out.println(array[i]+"");
        }
        
    }
}
