package ed_ordena_productos;

public class Producto {
    private String codigo_barras;
    private String nombre;
    private double precio;
    private int existencia;

    public Producto(String codigo_barras, String nombre, double precio, int existencia) {
        this.codigo_barras = codigo_barras;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_barras=" + codigo_barras + ", nombre=" + nombre + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
    
    
}
