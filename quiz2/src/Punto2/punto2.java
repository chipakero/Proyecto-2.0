/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
       Persona p = new Persona("", "") {};
       p.setNombre(JOptionPane.showInputDialog(null,"Enter your fist name"));
       p.setApellido(JOptionPane.showInputDialog(null,"Enter your last name"));
          JOptionPane.showMessageDialog(null,"Hello " + p.getNombre() + " " + p.getApellido());
    }
}
