package Producto;
import Main.FVentana;
import javax.swing.table.DefaultTableModel;

public class Busquedas {
    public static int buscarProducto(Object Atributo, String producto){
        boolean found = false;
        int posicion = 0;
        if (Atributo.equals("Código")) {
            for (; posicion < FVentana.productos.size(); posicion++) {
                if (FVentana.productos.get(posicion).getCodigo().equals(producto)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                return posicion;
            } else {
                return -1;
            }
        } else {
            if (Atributo.equals("Nombre")) {
                for (; posicion < FVentana.productos.size(); posicion++) {
                    if (FVentana.productos.get(posicion).getNombre().equals(producto)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    return posicion;
                } else {
                    return -1;
                }
            } else {
                for (; posicion < FVentana.productos.size(); posicion++) {
                    if (FVentana.productos.get(posicion).getPrecio() == Integer.parseInt(producto)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    return posicion;
                } else {
                    return -1;
                }
            }
        }
    }
    
    public static int buscarProductos(Object Atributo, String producto, DefaultTableModel tablero){
        int num = 0;
        if (Atributo.equals("Código")) {
            for (int i = 0; i < FVentana.productos.size(); i++) {
                if (FVentana.productos.get(i).getCodigo().contains(producto)) {
                    tablero.addRow(FVentana.productos.get(i).obtenerProducto());
                    num++;
                }
            }
        } else {
            if (Atributo.equals("Nombre")) {
                for (int i = 0; i < FVentana.productos.size(); i++) {
                    if (FVentana.productos.get(i).getNombre().toUpperCase().contains(producto.toUpperCase())) {
                        tablero.addRow(FVentana.productos.get(i).obtenerProducto());
                        num++;
                    }
                }
            } else {
                 for (int i = 0; i < FVentana.productos.size(); i++) {
                    if (FVentana.productos.get(i).getPrecio() == Double.parseDouble(producto)) {
                        tablero.addRow(FVentana.productos.get(i).obtenerProducto());
                        num++;
                    }
                }
            }
        }
        return num;
    }
}
