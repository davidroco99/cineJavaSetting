package com.programacion2.cine.logica;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-09-08T17:00:38")
@StaticMetamodel(Pelicula.class)
public class Pelicula_ { 

    public static volatile SingularAttribute<Pelicula, Date> fechaBaja;
    public static volatile SingularAttribute<Pelicula, Date> fechaAlta;
    public static volatile SingularAttribute<Pelicula, String> director;
    public static volatile SingularAttribute<Pelicula, String> elenco;
    public static volatile SingularAttribute<Pelicula, String> genero;
    public static volatile SingularAttribute<Pelicula, String> titulo;
    public static volatile SingularAttribute<Pelicula, Integer> duracion;
    public static volatile SingularAttribute<Pelicula, Integer> idPelicula;

}