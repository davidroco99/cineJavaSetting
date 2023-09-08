
package com.programacion2.cine.logica;

import java.util.Date;

/**
 *
 * @author DavidRoco
 */
public class DTODescuento {
    private String idDescuento;
    private String nombreDescuento;
    private String porcentajeDescuento;
    private Date fechaAlta = new Date();
    private Date fechaBaja = new Date();

    public DTODescuento() {
    }

    public DTODescuento(String idDescuento, String nombreDescuento, String porcentajeDescuento) {
        this.idDescuento = idDescuento;
        this.nombreDescuento = nombreDescuento;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(String idDescuento) {
        this.idDescuento = idDescuento;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public void setNombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    public String getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(String porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "DTODescuento{" + "idDescuento=" + idDescuento + ", nombreDescuento=" + nombreDescuento + ", porcentajeDescuento=" + porcentajeDescuento + ", fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }

    
}
