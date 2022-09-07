/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros_revistas;

/**
 *
 * @author carlo
 */
public class Revistas extends datos_generales{
    public String giro;
    public String precio;
    public void menu_Revistas (){
    int opc;
      do{
          opc = menu("Menu Revistas");
          switch (opc){
              case 1:
                  registrar_Revistas(); break;
              case 2:
                  consultar_Revistas(); break;
              case 3:
                  eliminar(); break;
              case 4:
                  actualizar(); break;
              case 5:
                  Libros_revistas Libros_revistas1 = new Libros_revistas(); break;
              default:
                  System.err.println("Error en el dato");
          }
      }while(opc !=5);
}
    public void actualizar(){   
        char opc;
        do{
            System.out.println("Desea actualizar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            registrar_Revistas();
        }
    }
    public void eliminar (){
        consultar_Revistas();
        char opc;
        do{
            System.out.println("Desea eliminar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            nombre = "";
            fecha = "";
            autor = "";
            giro = "";
            precio = "";
            
        }
    }
    
    public void registrar_Revistas (){
        leer.nextLine();
         registrar("Registrar libros");
         System.out.println("Giro de la revista: ");
         giro = leer.nextLine();
         System.out.println("Precio:");
         precio = leer.nextLine();
     }
     
     public void consultar_Revistas(){
         System.out.println("Nombre: "+nombre);
         System.out.println("Fecha de publicación: "+fecha);
         System.out.println("Nombre del autor: "+autor );
         System.out.println("Giro de la revista: "+giro);
         System.out.println("Precio:"+precio);
         
     }
}
