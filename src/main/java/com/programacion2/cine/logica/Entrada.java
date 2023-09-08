
package com.programacion2.cine.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author DavidRoco
 */

@Entity
public class Entrada implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int nroEntrada;
    @Basic
    private float precioEntradaConDescuento;
    private int nroAsiento;
    private char fila;
    private boolean vendida;
    @ManyToOne
    private Funcion funcion;
    @ManyToOne
    private Descuento descuento;
    
    public Entrada() {
    }

    public Entrada(int nroEntrada, float precioEntradaConDescuento, int nroAsiento, char fila, boolean vendida) {
        this.nroEntrada = nroEntrada;
        this.precioEntradaConDescuento = precioEntradaConDescuento;
        this.nroAsiento = nroAsiento;
        this.fila = fila;
        this.vendida = vendida;
    }

    public int getNroEntrada() {
        return nroEntrada;
    }

    public void setNroEntrada(int nroEntrada) {
        this.nroEntrada = nroEntrada;
    }

    public float getPrecioEntradaConDescuento() {
        return precioEntradaConDescuento;
    }

    public void setPrecioEntradaConDescuento(float precioEntradaConDescuento) {
        this.precioEntradaConDescuento = precioEntradaConDescuento;
    }

    public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public boolean isVendida() {
        return vendida;
    }

    public void setVendida(boolean vendida) {
        this.vendida = vendida;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Entrada{" + "nroEntrada=" + nroEntrada + ", precioEntradaConDescuento=" + precioEntradaConDescuento + ", nroAsiento=" + nroAsiento + ", fila=" + fila + ", vendida=" + vendida + ", funcion=" + funcion + ", descuento=" + descuento + '}';
    }
    
    
            
}
