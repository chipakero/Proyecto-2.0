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
import java.util.Arrays;



public class Carro {
    private Rueda[] ruedas; 
    private int contador;
    private String placa;
    private motor Motor;
    private chasis Chasis;
    

    public Carro(String placa){
        this.placa = placa;
        chasis chss = new chasis("");
        ruedas = new Rueda[4];
        this.contador = 0;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda rs){
        if(this.contador<5){
            this.ruedas [contador]= rs;
            this.contador++;
        }
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public motor getMotor() {
        return Motor;
    }

    public void setMotor(motor Motor) {
        this.Motor = Motor;
    }

    public chasis getChasis() {
        return Chasis;
    }

    public void setChasis(chasis Chasis) {
        this.Chasis = Chasis;
    }

    @Override
    public String toString() {
        return "\n Carro{" + "\n Ruedas=" + "\n Marca rueda 1 " + ruedas[0].getMarca()+ "\n Diametro rueda 1 " + ruedas[0].getDiametro()+"\n Marca rueda 2 " + ruedas[1].getMarca()+ "\n Diametro rueda 2 " + ruedas[1].getDiametro()+ "\n Marca rueda 3 " + ruedas[2].getMarca()+ "\n Diametro rueda 3 " + ruedas[2].getDiametro()+ "\n Marca rueda 4 " + ruedas[3].getMarca()+ "\n Diametro rueda 4 " + ruedas[3].getDiametro()+" \n Placa=" + placa + "\n Motor=" + Motor + "\n Chasis=" + Chasis + '}';
    }

    
    

}    

