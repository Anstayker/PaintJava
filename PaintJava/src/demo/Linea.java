package demo;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Alan
 */
public class Linea extends JPanel {

    private int x0, y0, x1, y1;

    private int grosor = 1;
    private boolean segmentar = false;
    
    public void drawLinea(Graphics g, int xInicial,int yInicial,int xFinal,int yFinal) {
        x0 = xInicial;
        y0 = yInicial;
        x1 = xFinal;
        y1 = yFinal;
        paint((Graphics2D) g);
    }

    
    public void paint(Graphics2D g) {
        super.paint(g);
       float Xinc,Yinc,x,y,delta;
       int i;
       if(Math.abs(x1-x0)>=Math.abs(y1-y0)){
          delta=Math.abs(x1-x0);
       }else{
          delta=Math.abs(y1-y0);
       }
       Xinc=(x1-x0)/delta;//el valor a aumentar en x
       Yinc=(y1-y0)/delta;//el valor a aumentar en y
       
       x=(float)x0;
       y=(float)y0;

       i=0;
       g.setStroke(new BasicStroke(grosor));
       boolean dibujarSegmento = true;
       int contadorDeSegmento = 0;
       
       while(i<=delta){
          //setPixel(roundf(x),roundf(y));
          x=x+Xinc;
          y=y+Yinc;
          i++;
          
          if(contadorDeSegmento > 4) {
              dibujarSegmento = false;
          }
        
          if(contadorDeSegmento >= 12) {
              dibujarSegmento = true;
              contadorDeSegmento = 0;
          }
            contadorDeSegmento++;
          
          if (dibujarSegmento) {
             g.drawLine( Math.round(x),Math.round(y),Math.round(x), Math.round(y));
          }
          
          
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
        Linea l1 = new Linea();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese x inicial");
        int xi = s.nextInt();
        l1.setX0(xi);
        System.out.println("Ingrese y inicial: ");
        int yi = s.nextInt();
        l1.setY0(yi);
        System.out.println("Ingrese x final: ");
        int xf = s.nextInt();
        l1.setX1(xf);
        System.out.println("Ingrese y final: ");
        int yf = s.nextInt();
        l1.setY1(yf);

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo Algoritmo DDA");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(500, 500);

        ventana.add(l1);
        ventana.setVisible(true);

    }
}