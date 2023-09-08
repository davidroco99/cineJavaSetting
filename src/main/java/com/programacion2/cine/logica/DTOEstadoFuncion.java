/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.cine.logica;

/**
 *
 * @author DavidRoco
 */
public class DTOEstadoFuncion {
    private String idEstadoFuncion;
    private String nombreEstadoFuncion;

    public DTOEstadoFuncion() {
    }

    public DTOEstadoFuncion(String idEstadoFuncion, String nombreEstadoFuncion) {
        this.idEstadoFuncion = idEstadoFuncion;
        this.nombreEstadoFuncion = nombreEstadoFuncion;
    }

    public String getIdEstadoFuncion() {
        return idEstadoFuncion;
    }

    public void setIdEstadoFuncion(String idEstadoFuncion) {
        this.idEstadoFuncion = idEstadoFuncion;
    }

    public String getNombreEstadoFuncion() {
        return nombreEstadoFuncion;
    }

    public void setNombreEstadoFuncion(String nombreEstadoFuncion) {
        this.nombreEstadoFuncion = nombreEstadoFuncion;
    }

    @Override
    public String toString() {
        return "DTOEstadoFuncion{" + "idEstadoFuncion=" + idEstadoFuncion + ", nombreEstadoFuncion=" + nombreEstadoFuncion + '}';
    }
    
    
            
}
