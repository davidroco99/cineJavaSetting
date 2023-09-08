
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
public class EstadoFuncion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idEstadoFuncion;
    @Basic
    private String nombreEstadoFunción;

    public EstadoFuncion() {
    }

    public EstadoFuncion(int idEstadoFuncion, String nombreEstadoFunción) {
        this.idEstadoFuncion = idEstadoFuncion;
        this.nombreEstadoFunción = nombreEstadoFunción;
    }

    public int getIdEstadoFuncion() {
        return idEstadoFuncion;
    }

    public void setIdEstadoFuncion(int idEstadoFuncion) {
        this.idEstadoFuncion = idEstadoFuncion;
    }

    public String getNombreEstadoFunción() {
        return nombreEstadoFunción;
    }

    public void setNombreEstadoFunción(String nombreEstadoFunción) {
        this.nombreEstadoFunción = nombreEstadoFunción;
    }

    @Override
    public String toString() {
        return "EstadoFuncion{" + "idEstadoFuncion=" + idEstadoFuncion + ", nombreEstadoFunci\u00f3n=" + nombreEstadoFunción + '}';
    }
    
    
    
}
