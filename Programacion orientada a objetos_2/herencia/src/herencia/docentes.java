/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author carlo
 */
public class docentes extends base{
    
    private String especialidad;
    private int horas_semanales;
    
    
  public void registrar_docentes(){
      leer.nextLine();
      registrar("código del docente: ");
        System.out.print("Especialidad: ");
        especialidad = leer.nextLine();
        System.out.print("Número de horas a la semana de clases: ");
        horas_semanales = leer.nextInt();
        
    } 
  public void consultar_docente(){
      consultar("código del docente: ");
        System.out.println("Especialidad: "+especialidad);
        
        System.out.println("Número de horas a la semana de clases: "+horas_semanales );
        
      
  }
  public void eliminar(){
        consultar_docente();
        char opc;
        do{
            System.out.println("Desea eliminar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            codigo = "";
            nombre = "";
            fecha_nacimiento = "";
            especialidad = "";
            horas_semanales = 0;
        }
    }
  public void actualizar(){
      char opc;
        do{
            System.out.println("Desea actualizar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            registrar_docentes();
        }
  }
  public void menu_docentes(){
      int opc;
      do{
          opc = menu();
          switch (opc){
              case 1:
                  registrar_docentes(); break;
              case 2:
                  consultar_docente(); break;
              case 3:
                  eliminar(); break;
              case 4:
                  actualizar(); break;
              case 5:
                  Herencia Herencia1 = new Herencia(); break;
              default:
                  System.err.println("Error en el dato");
          }
      }while(opc !=5);
  }
}
