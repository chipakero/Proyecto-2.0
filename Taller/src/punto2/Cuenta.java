/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Diego
 */

public class Cuenta {
    private int numeroCuenta;
    private double balanceActual;
    private String fecha;
    private String nombreCliente;
    private ArrayList movimientos = new ArrayList();

    public Cuenta(int numeroCuenta, double balanceActual, String fecha, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.balanceActual = balanceActual;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        ArrayList <Movimientos> mov = new ArrayList<>();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getBalanceActual() {
        return balanceActual;
    }

    public void setBalanceActual(double balanceActual) {
        this.balanceActual = balanceActual;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList movimientos) {
        this.movimientos = movimientos;
    }
    
    public void añadirMovimietos(Movimientos m){
        movimientos.add(m);
    }
    
    public void removerMovimientos (Movimientos m){
        movimientos.remove(m);
    }
   
    public Movimientos getMovimietos(int index){
        return (Movimientos) movimientos.get(index);
    }
    
    public int getCuentaMovimientos(){
        return movimientos.size();
    }
    public double consignarDinero(double valor){
        double saldo=0;
        saldo+=valor;
        return saldo;
    }
    
    public double retirarDinero(double valor){
        double saldo=100;
        saldo-=valor;
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", balanceActual=" + balanceActual + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", movimientos=" + movimientos + '}';
    }
    
    
}