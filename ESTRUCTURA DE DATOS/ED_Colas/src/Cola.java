
import java.util.LinkedList;
import javax.swing.JPanel;

public class Cola extends LinkedList<PElemento> {

    public Cola() {

    }

    public void insertar(PElemento elemento) {
        add(elemento);
    }

    public PElemento eliminar() {
        return removeFirst();

    }
    
    public void mostrar (JPanel panel, int x, int y){
        
        for (int i = 0; i < this.size(); i++) {
            PElemento elemento = this.get(i);
            int px =  i * elemento.getWidth();
            elemento.setBounds(px, y, elemento.getWidth(), elemento.getHeight());// elegir dimensiones del elemento 181, 269
            elemento.setVisible(true);
            panel.add(elemento);
            
        }
        panel.repaint();;
        
    }
    
    /*for (int i = 0; i < panel.getComponentCount(); i++){
            panel.remove(get(i));
        }*/
    
}
