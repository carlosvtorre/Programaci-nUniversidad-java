 
import java.awt.Color;
import java.awt.Graphics;


public class Disco {
    private int x,y,w,h,valor;
    private Color color;

    public Disco(int x, int y, int valor) {
        this.x = x;
        this.y = y;
        this.w = 100+valor*3;
        this.h = 30;
        this.valor = valor;
        float r = (float) Math.random();
        float g = (float) Math.random();
        float b = (float) Math.random();
        this.color = new Color(r, g, b);
    }
    
    public void dibujarDisco(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, w, h);//dibujamos el rectangulo
        g.setColor(Color.WHITE);
        g.drawString(valor+"", x+w/2-5, y+20);
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
