/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Punto2 extends JFrame {
    public Punto2(){
    add(new NewPanel());
}
/**
 *
 * @author Diego
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Punto2 frame= new Punto2();    
      frame.setTitle("TestPaintComponent");
      frame.setSize(1240,600);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }  
}
class NewPanel extends JPanel implements ActionListener, MouseListener{
    private Timer time;

    private int x;
    private int y;
    private int secuencia =0;
    private String[] palabra1={"P","R","O","G","R","A","M","A","C","I","O","N"};
    private String[] palabra2={"H","E","R","E","N","C","I","A"};
    private String[] palabra3={"P","O","L","M","O","R","F","I","S","M","O"};
    private String[] palabra4={"A","B","S","T","R","A","C","T","A"};
    private String[] palabra5={"E","X","C","E","P","C","I","O","N"};
    private String[] palabra6={"I","M","P","L","E","M","E","N","T","A","C","I","O","N"};

    public NewPanel(){
        
        this.time=new Timer(500, this);
        this.time.start();
        this.x = 20;
    
        this.addMouseListener(this);
       
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
       Image fondo0= loadImage("blanco.jpg");
       g.drawImage(fondo0 , 0, 0, null);
       Image fondo = loadImage("Abecedario.jpg");
       g.drawImage(fondo,0,0,null);
     
       
      g.fillRect(420, 300, 200, 20);
       g.fillRect(430, 50, 20, 250);
       g.fillRect(430, 50, 180, 10);
       g.fillRect(560, 50, 5, 50);
       g.drawOval(545, 100, 35, 55); 

    }
    
    @Override
    public Rectangle getBounds(){
        return new Rectangle(0,0,56,70);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    repaint();
    }
 
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
   
    public Image loadImage(String imageName){
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
}