/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura.de.datos.pkg2026;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Luisc
 */
public class MiFila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //cola OXXO instanciada e inicializada
        Queue <String> colaOXXO = new LinkedList<>();
        
        colaOXXO.offer("Maria");
        colaOXXO.offer("Luis");
        colaOXXO.offer("Juan");
        colaOXXO.offer("Pedro");
        colaOXXO.offer("Ana");
        
        //peed: muestra el siguiente en la cola
        System.out.println(colaOXXO);
        System.out.println(colaOXXO.peek());
        //poll: Saca el siguiente en la cola
        System.out.println(colaOXXO);
        System.out.println("Atendido: " + colaOXXO.poll());
        
        //size : canridad de elementos en la cola
        System.out.println(colaOXXO);
        System.out.println("quedan: " + colaOXXO.size());
        
        //isEmpty: verifica si la cola esta vacia
        System.out.println("esta vacia? " + colaOXXO.isEmpty());
        System.out.println(colaOXXO);
        
        
       

        
        
    }
    
}
