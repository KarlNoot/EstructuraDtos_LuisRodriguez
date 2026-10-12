/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura.de.datos.pkg2026.PUNTODEVENTA;

/**
 *
 * @author Luisc
 */
public class Productos {
    
    private String nombre;
    private String marca;
    private double  precio;
    private int stock;
    
    public Productos(){
    }

    public Productos(String nombre, String marca, double precio, int stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
    return "Producto {" +
           "nombre=" + nombre +
           ", marca=" + marca +
           ", precio=" + precio +
           ", stock=" + stock +
           "}";
}

    
    
}
