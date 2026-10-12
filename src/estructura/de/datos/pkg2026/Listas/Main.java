/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos.pkg2026.Listas;

/**
 *
 * @author Luisc
 */
public class Main {
    public static void main(String[] args){
        
        
        ListaEnlazada listaAlumnos = new ListaEnlazada();
            System.out.println("Tamaño " + listaAlumnos.cantidadNodos());
            
            
            listaAlumnos.mostrarLista();
    
            String nodoJuanito= "Juanito";
            String nodoMaria= "Maria";
            String nodoLupita= "Lupita";
            String nodoCarlos= "Carlos";
            
            listaAlumnos.agregarInicio(nodoJuanito);
            listaAlumnos.agregarInicio("Maria");
            listaAlumnos.agregarFinal(nodoLupita);
            listaAlumnos.agregarFinal("Carlos");

            
            
            System.out.println("Tamaño " + listaAlumnos.cantidadNodos());
            listaAlumnos.mostrarLista();
    }
    
}
