/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerjuego;

/**
 *
 * @author Diego
 */
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;


public class juego extends JFrame  {
    public juego(){
    add(new NewPanel());
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      juego frame= new juego();
      frame.setTitle("juego");
      frame.setSize(1024,1000);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);    
    }  

   
}
class NewPanel extends JPanel implements ActionListener, MouseListener{
    private Timer time;
    private int x,y,p,q;
    private int secuencia =0;
    public NewPanel(){
        addKeyListener(new TAdapter());
        setFocusable(true);

        
        this.time=new Timer(500, this);
        this.time.start();
        this.x = 20;
        this.addMouseListener(this);
       
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
       Image cielo = loadImage("blue_background.png");
       for(int i = q-1000;i<p+2000;i+=22){
           g.drawImage(cielo,i,0,null);
       }
       Image suelo = loadImage("ground_loop.png");
        for(int i = q-1000;i<p+2000;i+=112){
            for(int j = 500;j<1004;j+=68)
           g.drawImage(suelo,i,j,null);
       }
        Image nubes=loadImage("clouds.png");
        for(int i=q-1000;i<p+1500;i+=335){
            g.drawImage(nubes,i,0,null);
        }
        Image personaje=loadImage("walking.png");
        g.drawImage(personaje, 500, 366+y, 500+115,366+134+y,secuencia*115, 0, secuencia*115+115, 134, this);
   System.out.println(".");
    }
    
    @Override
    public Rectangle getBounds(){
        return new Rectangle(x+6,100,100,70);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        if(this.secuencia==3){
            this.secuencia=0;
        }else
            this.secuencia++;

        repaint();
       
    }
  
   


    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp= e.getPoint();
        if(getBounds().contains(mp)){         
                time.stop(); 
                try {
             Thread.sleep(500);
              time.start();
         } catch (InterruptedException ex) {
             Logger.getLogger(NewPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        System.out.println("click");
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

 



    class TAdapter extends KeyAdapter{

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
          int Key= e.getKeyCode();
         if(Key==KeyEvent.VK_RIGHT){
            System.out.println("Derecha");
            x-=20;
            p+=20;
            q-=20;
        }
        if(Key==KeyEvent.VK_LEFT){
            System.out.println("Izquierda");
            x+=20;
            p-=20;
            q+=20;
        }
        if(Key==KeyEvent.VK_UP){
            System.out.println("Arriba");
            y-=20;
        }
        if(Key==KeyEvent.VK_DOWN){
            System.out.println("Abajo");
            y+=20;
        }
        
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Soltó");
    }
    
}
}