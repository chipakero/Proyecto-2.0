/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;
/**
 *
 * @author Diego
 */
import java.util.Date;


public class Movimientos {
    private String fecha;
    private double balanceAnterior;
    private double cantidad;
    private Tipo tipo;

    public Movimientos(String fecha, double balance, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.balanceAnterior = balance;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
    public double getBalanceAnterior() {
        return balanceAnterior;
    }

    public void setBalanceAnterior(double balance) {
        this.balanceAnterior = balance;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "fecha=" + fecha + ", balanceAnterior=" + balanceAnterior + ", cantidad=" + cantidad + ", tipo=" + tipo + '}';
    }
    
    

}
