
package com.programacion2.cine.logica;

import java.util.Date;
import java.io.Serializable;
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
public class Pelicula  implements Serializable{

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPelicula;
    @Basic
    private String titulo;
    private String director;
    private String elenco;
    private int duracion;
    private String genero;
    @Temporal(TemporalType.DATE)
    private Date fechaBaja;
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String titulo, String director, String elenco, int duracion, String genero, Date fechaBaja, Date fechaAlta) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.director = director;
        this.elenco = elenco;
        this.duracion = duracion;
        this.genero = genero;
        this.fechaBaja = fechaBaja;
        this.fechaAlta = fechaAlta;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", titulo=" + titulo + ", director=" + director + ", elenco=" + elenco + ", duracion=" + duracion + ", genero=" + genero + ", fechaBaja=" + fechaBaja + ", fechaAlta=" + fechaAlta + '}';
    }
}
