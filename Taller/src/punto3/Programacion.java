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

public class Programacion {
    private ArrayList <Sala> salas = new ArrayList();

    public Programacion() {
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
     public void añadirSala(Sala salas){
        this.salas.add(salas);
    }
    
    public void eliminarSala(Sala salas){
        this.salas.remove(salas);
    }

    @Override
    public String toString() {
        return "Programacion: " + " Salas " + salas + "\n";
    }

}