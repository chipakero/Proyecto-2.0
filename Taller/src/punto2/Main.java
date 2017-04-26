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
public class Main {
    public static void main(String[] args) {
              
        
        Cuenta c1 = new Cuenta(12,15.2," 01-02-2015 "," Brian ");
        c1.consignarDinero(2000000);
        c1.retirarDinero(50);
        
        Tipo t2 = new Tipo(" 3.2 ");
        Tipo t3 = new Tipo(" 4 ");
        
        Movimientos mov = new Movimientos(" 12-03-2017 ",150000.00,15,t2);
        Movimientos mov2 = new Movimientos(" 13-03-2017 ",152000.05,16,t3);
        
        c1.añadirMovimietos(mov);
        c1.añadirMovimietos(mov2);
        
        Cuenta c2 = new Cuenta(13,15.45," 15-12-2016 "," Javier ");
        c2.consignarDinero(120);
        c2.retirarDinero(1);
        
        c2.añadirMovimietos(mov);
        c2.añadirMovimietos(mov2);  
        
        Tipo t = new Tipo(" 3.1 ");
        
        Banco b = new Banco(" 5441c ",t);
        b.añadirCuenta(c1);
        b.añadirCuenta(c2);
        
        System.out.println(b.toString()); 
        
    }
    
}
