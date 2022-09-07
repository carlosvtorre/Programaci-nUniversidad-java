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
public class libros extends datos_generales{
public String numero_paginas;
public String editorial;

    public void menu_libros (){
    int opc;
      do{
          opc = menu("Menu Libros");
          switch (opc){
              case 1:
                  registrar_libros(); break;
              case 2:
                  consultar_libros(); break;
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
            registrar_libros();
        }
    }
    public void eliminar (){
        consultar_libros();
        char opc;
        do{
            System.out.println("Desea eliminar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            nombre = "";
            fecha= "";
            autor = "";
            numero_paginas = "";
            editorial = "";
            
        }
    }
     public void registrar_libros (){
         leer.nextLine();
         registrar("Registrar libros");
         System.out.println("Número de paginas: ");
         numero_paginas = leer.nextLine();
         System.out.println("Nombre de le editorial:");
         editorial = leer.nextLine();
     }
     
     public void consultar_libros(){
         System.out.println("Nombre: "+nombre);
         System.out.println("Fecha de publicación: "+fecha);
         System.out.println("Nombre del autor: "+autor );
         System.out.println("Número de paginas: "+numero_paginas);
         System.out.println("Nombre de le editorial:"+editorial);
         
     }
}
