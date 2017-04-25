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
public class motor {
    private String marca;
    private int cab_fuerza;

    public motor() {
        this.marca = "";
        this.cab_fuerza = 0;
    }

    public motor(String marca, int cab_fuerza) {
        this.marca = marca;
        this.cab_fuerza = cab_fuerza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCab_fuerza() {
        return cab_fuerza;
    }

    public void setCab_fuerza(int cab_fuerza) {
        this.cab_fuerza = cab_fuerza;
    }

    @Override
    public String toString() {
        return "motor(" + "marca:" + marca + ", cab_fuerza:" + cab_fuerza+ ')';
    }

    
    
}
