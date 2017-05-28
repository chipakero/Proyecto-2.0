/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenario;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import paanel.*;
/**
 *
 * @author Diego
 */
public class Escenario extends JFrame{
    public Escenario() {
        add(new NewPanel());
    }
     public static void main(String[] args) {
        Escenario frame = new Escenario();
        frame.setTitle("Ninja Jump");
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
       int choice = JOptionPane.showConfirmDialog(null," Bienvenido a Ninja Jump \n ¿Quieres leer las instrucciones? ");
        if(choice==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null," 1)bla bla bbla \n 2) blbalbalba ");
        }else if(choice==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null," Presiona Enter para Empezar  ");
        }else if(choice==JOptionPane.CANCEL_OPTION){
            frame.setVisible(false);
        }
    }
}
