package program_herencia_polimorfismo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
public class infantil extends base {
    public void menu_infantil (){
    int opc;
      do{
          opc = menu("Menu calzado infantil");
          switch (opc){
              case 1:
                  registrar_infantil(); break;
              case 2:
                  consultar_infantil(); break;
              case 3:
                  eliminar(); break;
              case 4:
                  actualizar(); break;
              case 5:
                  Program_herencia_polimorfismo Program_herencia_polimorfismo1 = new Program_herencia_polimorfismo(); break;
              default:
                  System.err.println("Error en el dato");
          }
      }while(opc !=5);
}

public void registrar_infantil (){
    leer.nextLine();
    registrar("calzado infantil");
}
public void consultar_infantil(){
    consultar();
}
public void eliminar(){
    consultar_infantil();
        char opc;
        do{
            System.out.println("Desea eliminar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            tipo = "";
            talla= "";
            marca = "";
            color = "";
            
        }
}
public void actualizar(){
    char opc;
        do{
            System.out.println("Desea actualizar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            registrar_infantil();
        }
}
}
