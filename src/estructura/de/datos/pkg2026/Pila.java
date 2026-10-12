/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura.de.datos.pkg2026;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Luisc
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Deque pila0 = new ArrayDeque<>(); //pila de objetos objects
        Deque <String> pila = new ArrayDeque<>(); //pila de string
        
        //push: apilar elemento
        pila.push("Fresa");
        pila.push("Mango");
        pila.push("Manzana");
        pila.push("Mango");
        pila.push("Ciruela");
        pila.push("Tamarindo");
        
        //peek: ver la cima sin retitrarlo
        System.out.println("Cima: "+  pila.peek());
        //pop: desapilar
        System.out.println("retirado:" + pila.pop());
        System.out.println("Nueva cima: " + pila.peek());
        
        System.out.println("--------------  Hay " + pila.size() + "frutas en la pila");
        while(!pila.isEmpty()){ //pila.isEmptry = true
            System.out.println("Procesado: " + pila.pop());
        }
        System.out.println("Ya no hay nada en la pila!!!");
        
    }
}