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
public class chasis {
    private String marca;

    public chasis(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "chasis: (" + "marca:" + marca + ')';
    }

    
    
}
