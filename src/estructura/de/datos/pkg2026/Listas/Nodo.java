/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos.pkg2026.Listas;

public class Nodo {
    String valor;
    Nodo siguiente;
    
    public Nodo (String v){
    
        this.valor = v;
        this.siguiente = null;
    }
    
    public Nodo (String v, Nodo sig){
        this.valor = v;
        this.siguiente = sig;
    
    }
    
    
    
    
}
