package demo;

import java.awt.*;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.*;

public class Cuadrado extends JPanel {

    private int x0, y0, x1, y1;
   
    private int grosor = 10;
    
    public void drawCuadrado(Graphics g, int xInicial, int yInicial, int xFinal, int yFinal) {
        x0 = xInicial;
        y0 = yInicial;
        x1 = xFinal;
        y1 = yFinal;
        paint((Graphics2D) g);
    }
    
    public void paint(Graphics2D g) {
    int xc0 = x0, yc0 = y0 ,xc1 = x1, yc1 = y1;
    super.paint(g);
    dibujar(g,xc0,xc0,yc0,yc1);
    dibujar(g,xc0,xc1,yc0,yc0);
    dibujar(g,xc0,xc1,yc1,yc1);
    dibujar(g,xc1,xc1,yc1,yc0);
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

    public void setX0(int xInicial) {
        x0 = xInicial;
    }

    public void setY0(int yInicial) {
        y0 = yInicial;
    }

    public void setX1(int xFinal) {
        x1 = xFinal;
    }

    public void setY1(int yFinal) {
        y1 = yFinal;
    }

    public static void main(String[] args) {
        Cuadrado c1 = new Cuadrado();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese x inicial");
        int xi = s.nextInt();
        c1.setX0(xi);
        System.out.println("Ingrese y inicial: ");
        int yi = s.nextInt();
        c1.setY0(yi);
        System.out.println("Ingrese x final: ");
        int xf = s.nextInt();
        c1.setX1(xf);
        System.out.println("Ingrese y final: ");
        int yf = s.nextInt();
        c1.setY1(yf);

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo Algoritmo DDA");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(1000, 1000);
        
        ventana.add(c1);
        ventana.setVisible(true);
    }    
}
