/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_linkedlist;

import java.util.LinkedList;

/**
 *
 * @author carlo
 */
public class ED_Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList <Integer> listaSimple = new  LinkedList();
        listaSimple.add(1);
        listaSimple.addFirst(3);
        listaSimple.addLast(10);
        listaSimple.add(1, 27);
        System.out.println(listaSimple);
        int get=listaSimple.get(0);
        System.out.println(get);
        int size = listaSimple.size();
        System.out.println(size);
        listaSimple.set(1, 500);
        System.out.println(listaSimple);
        listaSimple.remove(1);
        System.out.println(listaSimple);
        
       
       
    }
    
}
