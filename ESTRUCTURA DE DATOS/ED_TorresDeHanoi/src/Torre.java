
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;



public class Torre {
    private Disco array[];//seria linkedlist
    private int tope; 
    private int x,y,w,h;

    public Torre(int tam, int x, int y){
        array = new Disco [tam];
        tope = 0;
        this.x = x;
        this.y = y;
        this.w = 50;
        this.h = 300;
        
    }
    
    public void insertar(Disco disco){
        if (push(disco)){
            disco.setX(x-(disco.getW()/2)+(w/2));
            disco.setY((y+h)-(tope*disco.getH()));
        }
    }
    
    public boolean validar(Disco disco){
      if (esta_vacia()) {
            return true;
        } else {
            if (disco.getValor() > array[tope-1].getValor()) {
                return false;
            } else {
                return true;
            }
        }
        
    }
    public Disco Pop2(){
        Disco fuera = null;
        if (esta_vacia()==true) {
            JOptionPane.showMessageDialog(null, "La pila se encuentra vacía", "Pila vacía", 2);
        } else {
            fuera = array[tope-1];
        }
        return fuera;
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
    public boolean push(Disco dato){//toma el objeto de la clase disco
        if(esta_llena()==true){
            JOptionPane.showMessageDialog(null,"Pila llena");
            return false;
            
        }
        else{
            array[tope]=dato;
            tope++;
            return true;
        }
    }
    public Disco pop(){
        Disco eliminado=null;
        if(esta_vacia() == true){
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        else{
            tope--;
            eliminado = array[tope];
            array[tope]=null;
        }
        return eliminado;
    }
    public void dibujarTorre(Graphics g){
        g.setColor(new Color(102,51,0));
        g.fillRect(x, y, w, h);
        for (int i = 0; i < tope; i++) {
            array[i].dibujarDisco(g);
        }
    }
    
}
