/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * public private protected 
 * @author carlo
 */
public class alumnos extends base{
    // extends es para heredar a base
    private String carrera;
    private int semestre;
    
  
    public void registrar_alumnos(){
        leer.nextLine();
        registrar("código del alumno: ");
        System.out.print("carrera: ");
        carrera = leer.nextLine();
        System.out.print("semestre: ");
        semestre = leer.nextInt();
    }
    public void consultar_alumnos(){
        consultar("código del alumno: ");
        System.out.println("carrera: "+carrera);
        
        System.out.println("semestre: "+semestre);
         
    }
    public void eliminar(){
        consultar_alumnos();
        char opc;
        do{
            System.out.println("Desea eliminar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            codigo = "";
            nombre = "";
            fecha_nacimiento = "";
            carrera = "";
            semestre = 0;
        }
    }
    public void actualizar(){
        char opc;
        do{
            System.out.println("Desea actualizar los datos s/n");
            opc = leer.next().toUpperCase().charAt(0);
        }while(opc!='S' && opc!='N');
        if(opc == 'S'){
            registrar_alumnos();
        }
    }
    public void menu_alumnos(){
         int op;
        do{
        
        op = menu();
        switch (op){
            case 1 :
                registrar_alumnos();
                
                break;
            case 2 : 
                consultar_alumnos();
                break;
            case 3 :
                eliminar();
                break;
            case 4:
                actualizar(); 
                break;
            case 5:
                Herencia Herencia1 = new Herencia(); 
                break;
            default:
                System.err.println("dato incorrecto");
                break;
        }
          
        }while(op!=5);
    }
}
