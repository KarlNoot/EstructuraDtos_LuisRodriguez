/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura.de.datos.pkg2026;

/**
 *
 * @author Luisc
 */
public class BoletoAvion {
    
    // Atributos
    private long numeroTicket;
    private int codigoReserva;
    private int asientoFila;
    private char asientoLetra;
    private float distanciaKm;
    private float altitud;
    private float pesoEquipajeKg;
    private float precioBoleto;
    private boolean incluyeEquipajeMano;
            
    // Constructor
    public BoletoAvion(long numeroTicket, int codigoReserva, int asientoFila, char asientoLetra, 
                       float distanciaKm, float altitud, float pesoEquipajeKg, 
                       float precioBoleto, boolean incluyeEquipajeMano) {
        this.numeroTicket = numeroTicket;
        this.codigoReserva = codigoReserva;
        this.asientoFila = asientoFila;
        this.asientoLetra = asientoLetra;
        this.distanciaKm = distanciaKm;
        this.altitud = altitud;
        this.pesoEquipajeKg = pesoEquipajeKg;
        this.precioBoleto = precioBoleto;
        this.incluyeEquipajeMano = incluyeEquipajeMano;
    }

    // Getters y Setters
    public long getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(long numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public int getAsientoFila() {
        return asientoFila;
    }

    public void setAsientoFila(int asientoFila) {
        this.asientoFila = asientoFila;
    }

    public char getAsientoLetra() {
        return asientoLetra;
    }

    public void setAsientoLetra(char asientoLetra) {
        this.asientoLetra = asientoLetra;
    }

    public float getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(float distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public float getAltitud() {
        return altitud;
    }

    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }

    public float getPesoEquipajeKg() {
        return pesoEquipajeKg;
    }

    public void setPesoEquipajeKg(float pesoEquipajeKg) {
        this.pesoEquipajeKg = pesoEquipajeKg;
    }

    public float getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(float precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public boolean isIncluyeEquipajeMano() {
        return incluyeEquipajeMano;
    }

    public void setIncluyeEquipajeMano(boolean incluyeEquipajeMano) {
        this.incluyeEquipajeMano = incluyeEquipajeMano;
    }
}
