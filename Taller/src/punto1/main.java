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
import java.util.ArrayList;


public class main {

   
    public static void main(String[] args) {
    
              
        Rueda r = new Rueda(15,"WW");
        Rueda r2 = new Rueda(15,"WW");
        Rueda r3 = new Rueda(15,"Michellin");
        Rueda r4 = new Rueda(15,"Michelin");
        
        chasis ch = new chasis("CHASIS");          
        chasis ch2 = new chasis("Chasisin");
                
        motor m1 = new motor("motroex", 886);
        motor m2 = new motor("motroex23", 889);
         
        Carro c1 = new Carro("MLY-775");
        Carro c2 = new Carro("JKJ-118");
                
        c1.setMotor(m2);
        c2.setMotor(m1);
        
        c1.setChasis(ch2);
        c1.setChasis(ch); 
        
        c1.setRuedas(r);
        c1.setRuedas(r2);
        c1.setRuedas(r3);
        c1.setRuedas(r4);
               
        Persona p1 = new Persona();
        p1.añadirCarro(c1);
        
        
        System.out.println(p1.toString());
    }
    
}
