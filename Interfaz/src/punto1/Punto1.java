/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;
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

public class Punto1 extends JFrame {
    public Punto1(){
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
      Punto1 frame= new Punto1();
      frame.setTitle("TestPaintComponent");
      frame.setSize(2024,1024);
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
    int x1=100;
    int y1=10;
    
    int aux=0;
     Rectangle Carro=this.getBounds();
     Rectangle obstaculo=new Rectangle(200,200,10,10);
    public NewPanel(){
        
        this.time=new Timer(2, this);
        this.time.start();
        this.x = 20;
    
        this.addMouseListener(this);
       
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
       Image fondo = loadImage("fondo.png");
       g.drawImage(fondo,0,0,null);
       
       
  
     
       Image Licor = loadImage("dasfa.gif");
       
      
       
       g.drawImage(Licor,100,10,100+141,10+215,0, 0,141, 256, this);
       g.drawImage(Licor,241,10,241+141,10+215,0, 0, 141, 256, this);
       g.drawImage(Licor,382,10,382+141,10+215,0, 0,148, 256, this);
       g.drawImage(Licor,523,10,523+141,10+215,0, 0,148, 256, this);
       
       g.drawImage(Licor,100,10+215,100+141,440,0, 0,141, 256, this);
       g.drawImage(Licor,241,10+215,241+141,440,0, 0, 141, 256, this);
       g.drawImage(Licor,382,10+215,382+141,440,0, 0,148, 256, this);
       g.drawImage(Licor,523,10+215,523+141,440,0, 0,148, 256, this);

       g.drawImage(Licor,100,440,100+141,655,0, 0,141, 256, this);
       g.drawImage(Licor,241,440,241+141,655,0, 0, 141, 256, this);
       g.drawImage(Licor,382,440,382+141,655,0, 0,148, 256, this);
       g.drawImage(Licor,523,440,523+141,655,0, 0,148, 256, this);
     
          switch(aux){
             case 0:
               g.drawImage(Licor,x1,y1,x1+141,y1+215,141, 0,141 + 141, 256, this);
             break;
             case 1:
               g.drawImage(Licor,x1,y1,x1+141,y1+215, x1+141, x1+x1+141,x1+x1+141,256, this);
             break;
             
          }
       aux=0;
    }
    
    @Override
    public Rectangle getBounds(){

        switch(aux){
             case 0:
              x1=100;
              y1=10;
            break;
            case 1:
              x1=241;
              y1=10;
            break;
            case 2:
              x1=382;
              y1=10;
            break;
            case 3:
              x1=523;
              y1=10;
            break;
             case 4:
              x1=100;
              y1=2255;
            break;
            case 5:
              x1=241;
              y1=225;
            break;
            case 6:
              x1=382;
              y1=225;
            break;
             case 7:
              x1=523;
              y1=225;
            break;
              case 8:
              x1=100;
              y1=440;
            break;
             case 9:
              x1=241;
              y1=440;
            break;
            case 10:
              x1=382;
              y1=440;
            break;
            case 11:
              x1=382;
              y1=440;
            break;
            
            default:   
        }
        return new Rectangle(x1, y1, 141, 256);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        x+=20;   
        repaint();
    }
    
    
 public void checkCollisions(){
     Rectangle rCicle= Carro.getBounds();
     Rectangle rRect= obstaculo.getBounds();
     if(rCicle.intersects(rRect)){
         System.out.println("Colision");
         time.stop();
     }
 }
 
    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp= e.getPoint();
        while(!(getBounds().contains(mp))){         
             aux++;
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
    
}