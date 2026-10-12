/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos.pkg2026;

/**
 *
 * @author Luisc
 */
public class lol {
    //Atributos
    private long id;
    private String nombre;
    private String sku;
    private String talla;
    private byte pasillo;
    private short lote_año;
    private double precio_unitario;
    private int stokDisponible;
    private Boolean activo;
            
    
    //constructor

    public lol(long id, String nombre, String sku, String talla, byte pasillo, short lote_año, double precio_unitario, int stokDisponible, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.sku = sku;
        this.talla = talla;
        this.pasillo = pasillo;
        this.lote_año = lote_año;
        this.precio_unitario = precio_unitario;
        this.stokDisponible = stokDisponible;
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public byte getPasillo() {
        return pasillo;
    }

    public void setPasillo(byte pasillo) {
        this.pasillo = pasillo;
    }

    public short getLote_año() {
        return lote_año;
    }

    public void setLote_año(short lote_año) {
        this.lote_año = lote_año;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getStokDisponible() {
        return stokDisponible;
    }

    public void setStokDisponible(int stokDisponible) {
        this.stokDisponible = stokDisponible;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }


}    

