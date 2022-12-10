
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Figura {
    private int x,y,w,h;
    private ImageIcon imagen;

    public Figura(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.imagen = new ImageIcon(getClass().getResource("Recursos/OIP.jpg"));
    }
    
    public void draw(Graphics g){
        g.drawImage(imagen.getImage(), x, y, w, h, null);
    }
    public void moverDerecha(){
        x+=10;
    }
    public void moverIzquierda (){
        x-= 10;
    }
    public void moverArriba(){
        y-=10;
    }
    public void moverAbajo(){
        y+=10;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
    
}
