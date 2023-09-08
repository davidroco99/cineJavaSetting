
package com.programacion2.cine.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DavidRoco
 */
@Entity
public class Funcion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idFuncion;
    private int horario;
    @Basic
    private int cantidadEntradasVendidas;
    private float precioEntradas;
    private float cantidadRecaudada;
    @ManyToOne
    private Pelicula pelicula;
    @ManyToOne
    private Sala sala;
    @ManyToOne
    private EstadoFuncion estado;
    @Temporal(TemporalType.DATE)
    private Date fecha;
   
    public Funcion() {
    }

    public Funcion(int idFuncion, int horario, Date fecha, int cantidadEntradasVendidas, float precioEntradas, float cantidadRecaudada, Pelicula pelicula, Sala sala, EstadoFuncion estado) {
        this.idFuncion = idFuncion;
        this.horario = horario;
        this.fecha = fecha;
        this.cantidadEntradasVendidas = cantidadEntradasVendidas;
        this.precioEntradas = precioEntradas;
        this.cantidadRecaudada = cantidadRecaudada;
        this.pelicula = pelicula;
        this.sala = sala;
        this.estado = estado;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidadEntradasVendidas() {
        return cantidadEntradasVendidas;
    }

    public void setCantidadEntradasVendidas(int cantidadEntradasVendidas) {
        this.cantidadEntradasVendidas = cantidadEntradasVendidas;
    }

    public float getPrecioEntradas() {
        return precioEntradas;
    }

    public void setPrecioEntradas(float precioEntradas) {
        this.precioEntradas = precioEntradas;
    }

    public float getCantidadRecaudada() {
        return cantidadRecaudada;
    }

    public void setCantidadRecaudada(float cantidadRecaudada) {
        this.cantidadRecaudada = cantidadRecaudada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public EstadoFuncion getEstado() {
        return estado;
    }

    public void setEstado(EstadoFuncion estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Funcion{" + "idFuncion=" + idFuncion + ", horario=" + horario + ", cantidadEntradasVendidas=" + cantidadEntradasVendidas + ", precioEntradas=" + precioEntradas + ", cantidadRecaudada=" + cantidadRecaudada + ", pelicula=" + pelicula + ", sala=" + sala + ", estado=" + estado + ", fecha=" + fecha + '}';
    }
    
    
}
