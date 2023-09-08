
package com.programacion2.cine.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DavidRoco
 */
@Entity
public class Descuento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDescuento;
    @Basic
    private String nombreDescuento;
    private float porcentajeDescuento;
    @Temporal(TemporalType.DATE)
    private Date fechaBajaDescuento;
    @Temporal(TemporalType.DATE)
    private Date fechaAltaDescuento;
    
    public Descuento() {
    }

    public Descuento(int idDescuento, Date fechaBajaDescuento, Date fechaAltaDescuento, String nombreDescuento, float porcentajeDescuento) {
        this.idDescuento = idDescuento;
        this.fechaBajaDescuento = fechaBajaDescuento;
        this.fechaAltaDescuento = fechaAltaDescuento;
        this.nombreDescuento = nombreDescuento;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public Date getFechaBajaDescuento() {
        return fechaBajaDescuento;
    }

    public void setFechaBajaDescuento(Date fechaBajaDescuento) {
        this.fechaBajaDescuento = fechaBajaDescuento;
    }

    public Date getFechaAltaDescuento() {
        return fechaAltaDescuento;
    }

    public void setFechaAltaDescuento(Date fechaAltaDescuento) {
        this.fechaAltaDescuento = fechaAltaDescuento;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Descuento{" + "idDescuento=" + idDescuento + ", nombreDescuento=" + nombreDescuento + ", porcentajeDescuento=" + porcentajeDescuento + ", fechaBajaDescuento=" + fechaBajaDescuento + ", fechaAltaDescuento=" + fechaAltaDescuento + '}';
    }
    
    
}
