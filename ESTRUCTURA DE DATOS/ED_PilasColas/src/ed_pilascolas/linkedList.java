
package ed_pilascolas;

import java.util.LinkedList;

class linkedList {
     private LinkedList <Integer> lista ;
     private int tope;
     
     public linkedList(){
        lista = new  LinkedList();
         tope = 0;
    } 
     
    public boolean esta_vacia(){
        return tope == 0;
        /*if (tope == 0){
            return true;
        }
        else{
            return false;
        }*/
    }
    public void push(int dato){
            lista.add(dato);
            tope++;
        }
    
    public void pop(){
        if(esta_vacia() == true){
            System.out.println("Pila vacia");
        }
        else{
            tope--;
            lista.remove(tope);
        }
    }
    
    public void mostrarPila(){
        for (int i = 0; i < tope; i++) {
            System.out.println(lista.get(i)+"");
        }
    }
    
    }
    
    

    
   


