/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;
/**
 *
 * @author Diego
 */
public class Rueda {
    private int diametro;
    private String marca;

    public Rueda(int diametro, String marca) {
        this.diametro = diametro;
        this.marca = marca;
    }
   
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Rueda{" + "diametro=" + diametro + ", marca=" + marca + '}';
    }

       

}
