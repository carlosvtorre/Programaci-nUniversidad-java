package ed_ordena_productos;

import javax.swing.JOptionPane;

public class ED_ORDENA_PRODUCTOS {
static Producto[] productos;
static int numProductos;
    public static void main(String[] args) {
        Ordenamientos combinacion = new Ordenamientos();
        productos = new Producto[3];
        numProductos= 0;
        int opcion = -1;
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción:\n "
                    + "1-Insertar Producto.\n"
                    + "2-Mostrar arreglo de producto\n"
                    + "3-Eliminar\n"
                    + "4-Modificar\n"
                    + "5-Ordenar por barras/Ascendente\n"
                    + "6-Ordenar por barras/Descendente\n"
                    + "7-Ordenar por nombre/Ascendente\n"
                    + "8-Ordernar por nombre/Descendente\n"
                    + "9-Ordenar por precio/Ascendente\n"
                    + "10-Ordenar por precio/Descendente\n"
                    + "11-Ordenar por Existencia/Ascendente\n"
                    + "12-Ordenar por Existencia/Descendente\n"
                    + "13-Ordenamiento por combinacion/nombre_Ascendente\n"
                    + "14-Ordenamiento por combinacion/nombre_Descendente\n"
                    + "15-Ordenamiento por combinacion/Barras_Ascendente\n"
                    + "16-Ordenamiento por combinacion/Barras_Descendente\n"
                    + "17-Ordenamiento por combinacion/Precio_Ascendente\n"
                    + "18-Ordenamiento por combinacion/Precio_Descendente\n"
                    + "19-Ordenamiento por combinacion/Existencia_Ascendente\n"
                    + "20-Ordenamiento por combinacion/Existencia_Descendente\n"
                    + "21-Salir\n"));
            switch(opcion){
                case 1:
                    String codigoBarras =JOptionPane.showInputDialog("Ingrese el codigo de barras: ");
                    String nombre =JOptionPane.showInputDialog("Ingrese el nombre: ");
                    double precio =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio: "));
                    int existencia =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nímero de productos: "));
                    productos[numProductos]=new Producto(codigoBarras,nombre,precio,existencia);
                    numProductos++;
                    break;
                case 2: 
                    Ordenamientos.mostrarArreglo(productos,numProductos);
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del producto que desea Eliminar: "));
                    Ordenamientos.eliminar(productos, numProductos, indiceEliminar);
                    numProductos--;
                    break;
                case 4:
                    int indiceModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del producto que desea Modificar: "));
                    Ordenamientos.modificar(productos, indiceModificar);
                    break;
                case 5:
                    Ordenamientos.BurbujaBarraAcendente(productos, numProductos);
                    break;
                case 6:
                    Ordenamientos.BurbujaBarraDescendente(productos, numProductos);
                    break;
                case 7:
                    Ordenamientos.burbujaNombreProducto(productos,numProductos);
                    break;
                case 8:
                    Ordenamientos.BurbujaNombreDescendente(productos, numProductos);
                    break;
                case 9:
                    Ordenamientos.BurbujaPrecioAscendente(productos, numProductos);
                    break;
                case 10:
                    Ordenamientos.BurbujaPrecioDescendente(productos, numProductos);
                    break;
                case 11:
                    Ordenamientos.BurbujaExistenciaAscendente(productos, numProductos);
                    break;
                case 12:
                    Ordenamientos.BurbujaExistenciaDescendente(productos, numProductos);
                    break;
                case 13:
                    combinacion.CombinacionNombreAcendente(productos);
                    break;
                case 14:
                    combinacion.CombinacionNombreDescendente(productos);
                    break;
                case 15:
                    combinacion.CombinacionBarrasAscendente(productos);
                    break;
                case 16:
                    combinacion.CombinacionBarrasDescendente(productos);
                    break;
                case 17:
                    combinacion.CombinacionPrecioAscendente(productos);
                    break;
                case 18:
                    combinacion.CombinacionPrecioDescendente(productos);
                    break;
                    case 19:
                    combinacion.CombinacionExistenciaAscendente(productos);
                    break;
                case 20:
                    combinacion.CombinacionExistenciaDescendente(productos);
                    break;
                case 21:
                    System.exit(0);
                    
            }

        } while (opcion != 21);
    }

}
