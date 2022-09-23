/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_ciclofor;

/**
 *
 * @author carlo
 */
public class ED_cicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 5;
        for(int i = 0; i<=valor; i++){
            for (int x=0; x<i;x++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        System.out.println("-----------------------------");
        for (int i = 0; i<=valor; i++){
            for(int y =valor; y>i; y--){
                System.out.print("*"); 
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------");
        for(int i = 0; i<=valor; i++){
            
        }
    }
    
}
