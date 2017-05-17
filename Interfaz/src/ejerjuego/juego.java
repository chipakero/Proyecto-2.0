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
    private int x,y,p,q,m,k,m1;
    private int secuencia =0, secuencia2=0, secuencia3=0;
    
   
    public NewPanel(){
        addKeyListener(new TAdapter());
        setFocusable(true);

        
        this.time=new Timer(80, this);
        this.time.start();
        this.x = 0;
        this.addMouseListener(this);
       
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
       Image cielo = loadImage("blue_background.png");
       for(int i = 0;i<1500;i+=22){
            g.drawImage(cielo,i,0,null);
          
       }
       Image suelo = loadImage("ground_loop.png");
        for(int i = q+0;i<p+1500;i+=112){
            for(int j = 500;j<1004;j+=68){
               g.drawImage(suelo,i,j,null); 
           }
        }
        
        Image nubes=loadImage("clouds.png");
        for(int i=q+0;i<p+1500;i+=335){
            g.drawImage(nubes,i,0,null);
        }
        Image personaje=loadImage("walking.png");
        g.drawImage(personaje, 0, 366+y, 0+116,366+134+y,secuencia*116, 0, secuencia*116+116, 134, this);
        
      //  Image personaje1=loadImage("standing.png");
      // g.drawImage(personaje1, 300, 366, 300+140, 366+134, secuencia3*140, 0, secuencia3*140+140, 134, this);
        
        Image villano=loadImage("enemy_run.png");
        g.drawImage(villano, x+800, 399+m, x+800+105, 399+101, secuencia2*105, 0, secuencia2*105+105, 101, this);
        
     //   Image jump=loadImage("jump.png");
       // g.drawImage(jump, 500, 358, this);
         //g.drawRect(x+800, 419, 105, 80);
         //g.drawRect(x+800,300,105,21);
      
       
    }
    
    @Override
    public Rectangle getBounds(){
     return new Rectangle(0, 366+y, 116, 134);  
    }

    public void Gameover(){
       Rectangle Heroe= getBounds();
       Rectangle Monster = new Rectangle(x+800, 419+m1, 105, 80);
       Rectangle mato = new Rectangle(x+800,300,105,21);
        
        if(Monster.intersects(Heroe)){
            
            System.out.println("GAME OVER");
            
            time.stop();
        }else if(Heroe.intersects(mato)){
            //Monster.translate(800, 1000);
            
            
            /*Variable m1 para mover el rectangulo hacia abajo Para evitar el Gameover :v*/ m1 += 80;  
            m = 80;
            System.out.println("Mató");
            
        }else{
            
        }
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       //Monster
        if(this.secuencia2==1){
            this.secuencia2=0;
        }else{
            this.secuencia2++;
        }
        // Heroe saltando
        if(this.secuencia3==1){
            this.secuencia3=0;
        }else{
            this.secuencia3++;
        }
        //Heroe caminado
        k+=1;
        
       repaint();
       Gameover();
    
    }
   


    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp= e.getPoint();
        
        if(getBounds().contains(mp)){         
                time.stop(); 
                try {
             Thread.sleep(500);
              time.start();
              System.out.println("Heroe");
         } catch (InterruptedException ex) {
             Logger.getLogger(NewPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
        }     
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

 



    class TAdapter extends KeyAdapter  {

    @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
          int Key= e.getKeyCode();
         if(Key==KeyEvent.VK_RIGHT){
            System.out.println("Derecha");
            if(secuencia==3){
            secuencia=0;
            }
            secuencia++;
            x-=20;
            //condicion
            p+=20;
            //incia
            q-=20;
            
        }
        if(Key==KeyEvent.VK_LEFT){
            System.out.println("Izquierda");
            x+=20;
            p-=20;
            q-=20;
        }
        if(Key==KeyEvent.VK_UP){
            System.out.println("Arriba");
            
            if(y==0){
            y-=120;
            }else{
                        }
            
        }
        if(Key==KeyEvent.VK_DOWN){
            System.out.println("Abajo");
            if(y==-20){
            y+=20;
        }
        }
        
    
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Soltó");
        int Key = e.getKeyCode();
        if(Key==KeyEvent.VK_UP){
        
            y+=120;
        
              
            }
       
          
        }
    }
    
}
