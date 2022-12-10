import java.util.ArrayList;
public class ListaAdyacencia {
 
    ArrayList<Nodo>[] conexiones;
    ArrayList<Nodo> nodos;
    ArrayList<Nodo> vecinos;
    
  

    public ListaAdyacencia(ArrayList<Nodo> nodos, ArrayList<Nodo> vecinos) {
        conexiones = new ArrayList[nodos.size()]; 
        this.nodos = nodos;
        this.vecinos = vecinos;
        generarLineas();
        conectar();
    }
    
    public void generarLineas() {
        for (int i = 0; i < conexiones.length; i++) {
            conexiones[i] = new ArrayList();
            conexiones[i].add(this.nodos.get(i)); 
        }
    }
    
    public void conectar(){
        for (int i = 0; i < vecinos.size(); i+=2) { 
            for (int j = 0; j < conexiones.length; j++) {
                if (vecinos.get(i).equals(conexiones[j].get(0))) { 
                    if (isConected(conexiones[j], vecinos.get(i+1)) == false) { 
                        conexiones[j].add(vecinos.get(i+1)); 
                        for (int x = 0; x < conexiones.length; x++) { 
                            if (conexiones[x].get(0).equals(vecinos.get(i+1))) { 
                                conexiones[x].add(conexiones[j].get(0));
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }
        listaAdyacencia();
    }
    
    public boolean isConected(ArrayList<Nodo> conexiones, Nodo nodo){ 
        boolean conected = false;
        for (int i = 1; i < conexiones.size(); i++) {
            if (conexiones.get(i).equals(nodo)) { 
                conected = true; 
                break;
            }
        }
        return conected; 
        
    }
    
    public void listaAdyacencia(){
        System.out.println("Lista de Adyacencia");
        for (int i = 0; i < conexiones.length; i++) {
            System.out.print("Conexiones de "+conexiones[i].get(0).getDato()+":");
            for (int j = 0; j < conexiones[i].size(); j++) {
                System.out.print(" | ");
                System.out.print(conexiones[i].get(j).getDato());
            }
            System.out.println("");
        }
        System.out.println("");
    }

   public ArrayList[] getConexiones() {
        return conexiones;
    }
    
    
}
