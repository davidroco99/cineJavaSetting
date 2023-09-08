
package com.programacion2.cine.logica;

/**
 *
 * @author DavidRoco
 */
public class DTOSala {
    private String nroSala;
    private String cantAsientos;
    private String nombreSala;
    private String filas;
    private String asientosPorFila;

    public DTOSala() {
    }

    public DTOSala(String nroSala, String cantAsientos, String nombreSala, String filas, String asientosPorFila) {
        this.nroSala = nroSala;
        this.cantAsientos = cantAsientos;
        this.nombreSala = nombreSala;
        this.filas = filas;
        this.asientosPorFila = asientosPorFila;
    }

    public String getNroSala() {
        return nroSala;
    }

    public void setNroSala(String nroSala) {
        this.nroSala = nroSala;
    }

    public String getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(String cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public String getFilas() {
        return filas;
    }

    public void setFilas(String filas) {
        this.filas = filas;
    }

    public String getAsientosPorFila() {
        return asientosPorFila;
    }

    public void setAsientosPorFila(String asientosPorFila) {
        this.asientosPorFila = asientosPorFila;
    }

    @Override
    public String toString() {
        return "DTOSala{" + "nroSala=" + nroSala + ", cantAsientos=" + cantAsientos + ", nombreSala=" + nombreSala + ", filas=" + filas + ", asientosPorFila=" + asientosPorFila + '}';
    }
    
    
}
