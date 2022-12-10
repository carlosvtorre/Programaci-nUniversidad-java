package ed_pilascolas;

public class Stack {
    private int array[];//seria linkedlist
    private int tope; 

    public Stack(int tam){
        array = new int [tam];
        tope = 0;
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
        /*if (tope == 0){
            return true;
        }
        else{
            return false;
        }*/
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
