
package ed_recursividad;



public class ED_Recursividad {

    
    public static void main(String[] args) {
        //contar(1);
        //restar(100);
        /*System.out.println("factorial de menor a mayor ");
        factorial(5);
        System.out.println("-------------------------------");
        System.out.println("Factorial de 5");
        int factorial =fact (5);
        System.out.println(factorial); */
       
        System.out.println("Secuencia fibonacci con ciclo for");
        int num = 10;
        for (int i = 0; i<num; i++){
            int f =fibonacci(i);
            System.out.println(f);
        }
        System.out.println("--------------------------------------");
        System.out.println("fibonacci de 5");
        secuenciaFibonacci(5,1,1);
       
    }

    public static void contar(int valor){
        if (valor<=100){
            System.out.println(valor);
            valor++;
            contar(valor);
        }
    }
    
    public static void restar(int valor){
        //if para parar la recursividad 
        if (valor>=1){
            System.out.println(valor);
            valor--;
            // se llama a la así mismo 
            restar(valor);
        }
    }
    
    public static void factorial(int valor){
        int f = 0;
        if(valor>=1){
            f= valor * (valor-1);
            System.out.println(f);
            valor--;
            factorial(valor);
        }
    }
    
    public static int fact(int valor){
       if(valor>1){
        return valor * fact(valor-1);
        }
        else{
            return 1;
        }
        
    }
    
    public static int fibonacci(int valor){
        if (valor >=2){
            return fibonacci(valor-1)+fibonacci(valor-2);
        }
        else{
            return 1;
        }
        
    }
    
     public static void secuenciaFibonacci(int numero, int serie, int suma){
      if (suma<=numero){
          System.out.println(suma);
          suma=suma+serie;
          serie=suma-serie;
          secuenciaFibonacci(numero, serie, suma);
      }
    }
    
    
}
