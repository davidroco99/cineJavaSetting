package com.programacion2.cine.logica;

/**
 *
 * @author DavidRoco
 */

import java.util.ArrayList;
import java.util.List;
import com.programacion2.cine.persistencia.ControladoraPersistencia;
import com.programacion2.cine.persistencia.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraLogica {
    private static ControladoraLogica instance = null;
    
    
    public ControladoraLogica() {
    }
    public static ControladoraLogica getInstance() {
        if (instance == null) {
            instance = new ControladoraLogica();
        }
        return instance;
    }

    public void agregarSala(DTOSala dtoSala) {
        Sala sala = new Sala();
        sala.setNombreSala(dtoSala.getNombreSala());
        sala.setCantAsientos(Integer.parseInt(dtoSala.getCantAsientos()));
        sala.setFilas(dtoSala.getFilas());
        sala.setAsientosPorFila(Integer.parseInt(dtoSala.getAsientosPorFila()));
        
       
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarSala(sala);
        
    }

    public void agregarDescuento(DTODescuento dtoDescuento) {
        Descuento descuento = new Descuento();
        
        descuento.setNombreDescuento(dtoDescuento.getNombreDescuento());
        descuento.setPorcentajeDescuento(Float.parseFloat(dtoDescuento.getPorcentajeDescuento()));
        descuento.setFechaAltaDescuento(dtoDescuento.getFechaAlta());
        descuento.setFechaBajaDescuento(dtoDescuento.getFechaBaja());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarDescuento(descuento);
        
    }
    
    public void agregarEstadoFuncion(DTOEstadoFuncion dtoEstado) {
        EstadoFuncion estado = new EstadoFuncion();
        estado.setNombreEstadoFunción(dtoEstado.getNombreEstadoFuncion());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.guardarEstadoFuncion(estado);
    }
    
    public List<DTOSala> traerSalas() {
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       List <Sala> listSala = persistencia.buscarSalas();
       ArrayList <DTOSala> listaDTOSala;
       listaDTOSala = new ArrayList<>();
       int index = 0;
       //relleno la lista de DTOSala       
       for (Sala sala: listSala){
           DTOSala dtoSala = new DTOSala();
           
           String nroSala = String.valueOf(sala.getNroSala());
           dtoSala.setNroSala(nroSala);
           
           String cantidadAsientos = String.valueOf(sala.getCantAsientos());
           dtoSala.setCantAsientos(cantidadAsientos);
           
           String nombreSala = String.valueOf(sala.getNombreSala());
           dtoSala.setNombreSala(nombreSala);
           
           String filas = String.valueOf(sala.getFilas());
           dtoSala.setFilas(filas);
           
           String asientosPorFila = String.valueOf(sala.getAsientosPorFila());
           dtoSala.setAsientosPorFila(asientosPorFila);
           
           listaDTOSala.add(index, dtoSala);
           index += 1;
       } 
        
       return listaDTOSala;
    }

    public List<DTODescuento> traerDescuentos() {
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       List <Descuento> listDescuentos = persistencia.buscarDescuentos();
       ArrayList <DTODescuento> listaDTODescuentos;
       listaDTODescuentos = new ArrayList<>();
       int index = 0;
       //relleno la lista de DTODescuento       
       for (Descuento descuento: listDescuentos){
           DTODescuento dtoDescuento = new DTODescuento();
                     
           String nroDescuento = String.valueOf(descuento.getIdDescuento());
           dtoDescuento.setIdDescuento(nroDescuento);
           
           String nombreDescuento = String.valueOf(descuento.getNombreDescuento());
           dtoDescuento.setNombreDescuento(nombreDescuento);
           
           String porcentajeDescuento = String.valueOf(descuento.getPorcentajeDescuento());
           dtoDescuento.setPorcentajeDescuento(porcentajeDescuento);
           
           dtoDescuento.setFechaAlta(descuento.getFechaAltaDescuento());
           
           dtoDescuento.setFechaBaja(descuento.getFechaBajaDescuento());
           
           listaDTODescuentos.add(index, dtoDescuento);
           index += 1;
       } 
        
       return listaDTODescuentos; 
    }
    
    
    public List<DTOEstadoFuncion> traerEstadosFuncion() {
        
       ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       
       List <EstadoFuncion> listaEstados = persistencia.buscarEstados();
       ArrayList <DTOEstadoFuncion> listaDTOEstado;
       
       listaDTOEstado = new ArrayList<>();
       
       int index = 0;
       //relleno la lista de DTODescuento       
       
       for (EstadoFuncion estado: listaEstados){
           
           DTOEstadoFuncion dtoEstado = new DTOEstadoFuncion();
                     
           String idEstadoFuncion = String.valueOf(estado.getIdEstadoFuncion());
           dtoEstado.setIdEstadoFuncion(idEstadoFuncion);
           
           String nombreEstado = String.valueOf(estado.getNombreEstadoFunción());
           dtoEstado.setNombreEstadoFuncion(nombreEstado);
                      
           listaDTOEstado.add(index,dtoEstado);
           index += 1;
       } 
        
       return listaDTOEstado; 
        
    }

    
    public DTOSala buscarSala(int nroSala) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        Sala sala = persistencia.buscar(nroSala);
                
        DTOSala dtoSala = new DTOSala();
        
        String nroSala1 = String.valueOf(sala.getNroSala());
        dtoSala.setNroSala(nroSala1);
           
        String cantidadAsientos = String.valueOf(sala.getCantAsientos());
        dtoSala.setCantAsientos(cantidadAsientos);
           
        String nombreSala = String.valueOf(sala.getNombreSala());
        dtoSala.setNombreSala(nombreSala);
          
        String filas = String.valueOf(sala.getFilas());
        dtoSala.setFilas(filas);
           
        String asientosPorFila = String.valueOf(sala.getAsientosPorFila());
        dtoSala.setAsientosPorFila(asientosPorFila);
           
        return dtoSala;
    }
    
    public DTODescuento buscarDescuento(int nroDescuento) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
       
        Descuento descuento = persistencia.buscarDescuento(nroDescuento);
        
        DTODescuento dtoDescuento = new DTODescuento();
            
        String nroDescuento1 = String.valueOf(descuento.getIdDescuento());
        dtoDescuento.setIdDescuento(nroDescuento1);
           
        String nombreDescuento = String.valueOf(descuento.getNombreDescuento());
        dtoDescuento.setNombreDescuento(nombreDescuento);
           
        String porcentajeDescuento = String.valueOf(descuento.getPorcentajeDescuento());
        dtoDescuento.setPorcentajeDescuento(porcentajeDescuento);
           
        dtoDescuento.setFechaAlta(descuento.getFechaAltaDescuento());
        dtoDescuento.setFechaBaja(descuento.getFechaBajaDescuento());
           
               
    return dtoDescuento; 
    }

     public DTOEstadoFuncion buscarEstadoFuncion(int idEstado) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        
        EstadoFuncion estado = persistencia.buscarEstadoFuncion(idEstado);
        DTOEstadoFuncion dtoestado = new DTOEstadoFuncion();
        
        String idEstadoFuncion = String.valueOf(estado.getIdEstadoFuncion());
        dtoestado.setIdEstadoFuncion(idEstadoFuncion);
        
        
        String nombreEstado = String.valueOf(estado.getNombreEstadoFunción());
        dtoestado.setNombreEstadoFuncion(nombreEstado);
        
        return dtoestado;
        
    }
    
    
    public void editarSala(DTOSala dtoSala) {
        Sala sala = new Sala();
        
        int nroSala = Integer.parseInt(dtoSala.getNroSala());
        sala.setNroSala(nroSala);
           
        int cantidadAsientos = Integer.parseInt(dtoSala.getCantAsientos());
        sala.setCantAsientos(cantidadAsientos);
           
        String nombreSala = String.valueOf(dtoSala.getNombreSala());
        sala.setNombreSala(nombreSala);
          
        String filas = String.valueOf(dtoSala.getFilas());
        sala.setFilas(filas);
           
        int asientosPorFila = Integer.parseInt(dtoSala.getAsientosPorFila());
        sala.setAsientosPorFila(asientosPorFila);
        
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarSala(sala);
    }

    public void editarDescuento(DTODescuento dtoDescuento) throws Exception {
        Descuento descuento = new Descuento();
        
        descuento.setIdDescuento(Integer.parseInt(dtoDescuento.getIdDescuento()));
        descuento.setNombreDescuento(dtoDescuento.getNombreDescuento());
        descuento.setPorcentajeDescuento(Float.parseFloat(dtoDescuento.getPorcentajeDescuento()));
        descuento.setFechaAltaDescuento(dtoDescuento.getFechaAlta());
        descuento.setFechaBajaDescuento(dtoDescuento.getFechaBaja());
        
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarDescuento(descuento);
        
    }

    public void editarEstadoFuncion(DTOEstadoFuncion dtoEstado) {
        EstadoFuncion estado = new EstadoFuncion();
        
        estado.setIdEstadoFuncion(Integer.parseInt(dtoEstado.getIdEstadoFuncion()));
        estado.setNombreEstadoFunción(dtoEstado.getNombreEstadoFuncion());
                
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.editarFuncion(estado);
    }
    
    
    public void borrarSala(int nroSala) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarSala(nroSala);
    }

    public void borrarDescuento(int nroDescuento) {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        persistencia.borrarDescuento(nroDescuento);
    }
    
    public void borrarEstadoFuncion(int idEstadoFuncion)  {
        ControladoraPersistencia persistencia = ControladoraPersistencia.getInstance();
        try {
            persistencia.borrarEstadoFuncion(idEstadoFuncion);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
    
}
