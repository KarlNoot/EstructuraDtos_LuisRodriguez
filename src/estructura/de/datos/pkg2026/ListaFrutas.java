package estructura.de.datos.pkg2026;

import java.util.ArrayList;

public class ListaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <String>lista = new ArrayList<>();
       //add(valor):agregar un elemento
       lista.add("Manzana");
       lista.add("Pera");
       lista.add("Durazno");
       lista.add("Fresa");

       //add(index, valor):agregar un elemento en cualquie posicion 
       lista.add(2,"Kiwi");
       //get(): obtener un elemento segun su indice
       System.out.println("fruta "+ lista.get(2));
       
       //set(): cambiar valor de un elemento
       lista.set(1, "Mango manila");
       // remove () : quita elementos por indice o objeto
       lista.remove(3);
       lista.remove("Pera");
       
       if(lista.contains("Manzana")){
           System.out.println("Si hay Manzanas");
       }else{
           System.out.println("No hay Manzanas");
       }
       
        System.out.println("Hay " + lista.size() + " Frutas");
        System.out.println(lista.isEmpty());
        
        //size() : tamaño del arraylist
        System.out.println("hay " + lista.size() + " frutas");
        
        //empty():  verifica si el array list esta vacio
        System.out.println(lista.isEmpty());
        
        
        for(String fruta : lista){
            System.out.println(fruta);
        }
        
        lista.forEach( (f) -> { System.out.println(f);});
        
        for(int i=0; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //clear() limpia el arraylist
        //lista.clear();
        System.out.println(lista);
       
    }
    
}
