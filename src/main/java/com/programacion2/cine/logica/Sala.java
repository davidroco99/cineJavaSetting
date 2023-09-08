
package com.programacion2.cine.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DavidRoco
 */
@Entity
public class Sala implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int nroSala;
    @Basic
    private int cantAsientos;
    private String nombreSala;
    private String filas;
    private int asientosPorFila;

    public Sala() {
    }

    public Sala(int nroSala, int cantAsientos, String nombreSala, String filas, int asientosPorFila) {
        this.nroSala = nroSala;
        this.cantAsientos = cantAsientos;
        this.nombreSala = nombreSala;
        this.filas = filas;
        this.asientosPorFila = asientosPorFila;
    }

    public int getNroSala() {
        return nroSala;
    }

    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
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

    public int getAsientosPorFila() {
        return asientosPorFila;
    }

    public void setAsientosPorFila(int asientosPorFila) {
        this.asientosPorFila = asientosPorFila;
    }

    @Override
    public String toString() {
        return "Sala{" + "nroSala=" + nroSala + ", cantAsientos=" + cantAsientos + ", nombreSala=" + nombreSala + ", filas=" + filas + ", asientosPorFila=" + asientosPorFila + '}';
    }
    
    
    
    
}
