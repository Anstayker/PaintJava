/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Alan
 */
public class Triangulo extends JPanel{

    private int x0, y0, x1, y1, x2, y2;
   
    private int grosor = 10;
    
    public void drawTriangulo(Graphics g, int x0, int y0, int x1, int y1, int x2, int y2) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        paint((Graphics2D) g);
    }
    
    public void paint(Graphics2D g) {
    super.paint(g);
    dibujar(g,x0,x1,y0,y1);
    dibujar(g,x1,x2,y1,y2);
    dibujar(g,x0,x2,y0,y2);
    }
    
    public void dibujar (Graphics2D g,int x0,int x1,int y0,int y1){
        float Xinc,Yinc,x,y,delta;
        int i;
       if(Math.abs(x1-x0)>=Math.abs(y1-y0)){
          delta=Math.abs(x1-x0);
       }else{
          delta=Math.abs(y1-y0);
       }
       Xinc=(x1-x0)/delta;
       Yinc=(y1-y0)/delta;
       
       x=(float)x0;
       y=(float)y0;

       i=0;
       while(i<=delta){
          x=x+Xinc;
          y=y+Yinc;
          i++;
          g.setStroke(new BasicStroke(grosor));
          g.drawLine(Math.round(x),Math.round(y),Math.round(x), Math.round(y));
        }
    }

    public void setX0(int x1) {
        x0 = x1;
    }

    public void setY0(int y1) {
        y0 = y1;
    }

    public void setX1(int x2) {
        x1 = x2;
    }

    public void setY1(int y2) {
        y1 = y2;
    }
    
    public void setX2(int x3) {
        x2 = x3;
    }
    
    public void setY2(int y3) {
        y2 = y3;
    }

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese x1:");
        int x1 = s.nextInt();
        t1.setX0(x1);
        System.out.println("Ingrese y1: ");
        int y1 = s.nextInt();
        t1.setY0(y1);
        System.out.println("Ingrese x2: ");
        int x2 = s.nextInt();
        t1.setX1(x2);
        System.out.println("Ingrese y2: ");
        int y2 = s.nextInt();
        t1.setY1(y2);
        System.out.println("Ingrese x3: ");
        int x3 = s.nextInt();
        t1.setX2(x3);
        System.out.println("Ingrese y3: ");
        int y3 = s.nextInt();
        t1.setY2(y3);

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo Algoritmo DDA");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(500, 500);
        
        ventana.add(t1);
        ventana.setVisible(true);
    }  
}
