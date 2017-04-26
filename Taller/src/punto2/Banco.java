/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Banco {
    private String codigo;
    private Tipo tipos;
    private ArrayList cuentas = new ArrayList();

    public Banco(String codigo, Tipo tipos) {
        this.codigo = codigo;
        this.tipos = tipos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tipo getTipos() {
        return tipos;
    }

    public void setTipos(Tipo tipos) {
        this.tipos = tipos;
    }
    
    public void añadirCuenta(Cuenta c){
        cuentas.add(c);
    }
    
    public void removerCuenta (Cuenta c){
        cuentas.remove(c);
    }
   
    public Cuenta getCuenta(int index){
        return (Cuenta) cuentas.get(index);
    }
    
    public int getCuentaCuenta(){
        return cuentas.size();
    }

    public ArrayList getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Banco \n " + " Codigo: " + codigo + " Tipo: " + tipos + " Cuentas: " + cuentas + "\n";
    }
    
    
}