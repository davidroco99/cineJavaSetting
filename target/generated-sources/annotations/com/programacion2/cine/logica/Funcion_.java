package com.programacion2.cine.logica;

import com.programacion2.cine.logica.EstadoFuncion;
import com.programacion2.cine.logica.Pelicula;
import com.programacion2.cine.logica.Sala;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-09-08T17:00:38")
@StaticMetamodel(Funcion.class)
public class Funcion_ { 

    public static volatile SingularAttribute<Funcion, Date> fecha;
    public static volatile SingularAttribute<Funcion, EstadoFuncion> estado;
    public static volatile SingularAttribute<Funcion, Pelicula> pelicula;
    public static volatile SingularAttribute<Funcion, Integer> horario;
    public static volatile SingularAttribute<Funcion, Float> cantidadRecaudada;
    public static volatile SingularAttribute<Funcion, Integer> cantidadEntradasVendidas;
    public static volatile SingularAttribute<Funcion, Sala> sala;
    public static volatile SingularAttribute<Funcion, Integer> idFuncion;
    public static volatile SingularAttribute<Funcion, Float> precioEntradas;

}