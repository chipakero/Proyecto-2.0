/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;
/**
 *
 * @author Diego
 */
import java.util.ArrayList;
import java.util.Date;

public class Dia {
    private Date fecha;
    private String nombre;
    private ArrayList <Segmento> segmentos = new ArrayList();

    public Dia(Date fecha, String nombre) {
        this.fecha = fecha;
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList segmentos) {
        this.segmentos = segmentos;
    }
    
    public void añadirSegmento(Segmento seg){
        this.segmentos.add(seg);
    }
    
    public void eliminarSegmento(Segmento seg){
        this.segmentos.remove(seg);
    }

    @Override
    public String toString() {
        return "Dia " + " Fecha: " + fecha + " Nombre: " + nombre + " Segmentos: " + segmentos + "\n";
    }
    
    
}
