package demo;

import java.awt.*;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.*;

public class Cuadrado extends JPanel {

    private int x0, y0, x1, y1;
    private int x2, y2, x3, y3;
    private boolean cuatroPuntosUsados;
   
    private int grosor = 1;
    private boolean segmentar = false;
    
    public void drawCuadrado(Graphics g, int xInicial, int yInicial, int xFinal, int yFinal) {
        x0 = xInicial;
        y0 = yInicial;
        x1 = xFinal;
        y1 = yFinal;
        cuatroPuntosUsados = false;
        paint((Graphics2D) g);
        
    }
    public void drawCuadrado(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        x0 = x1;
        y0 = y1;
        x1 = x2;
        y1 = y2;
        x2 = x3;
        y2 = y3;
        x3 = x4;
        y3 = y4;
        cuatroPuntosUsados = true;
        paint((Graphics2D) g);
    }
    
    public void paint(Graphics2D g) {
        if(!cuatroPuntosUsados){
            int xc0 = x0, yc0 = y0 ,xc1 = x1, yc1 = y1;
            super.paint(g);
            dibujar(g,xc0,xc0,yc0,yc1);
            dibujar(g,xc0,xc1,yc0,yc0);
            dibujar(g,xc0,xc1,yc1,yc1);
            dibujar(g,xc1,xc1,yc1,yc0);
        }else{
            int xc0 = x0;
            int yc0 = y0;
            int xc1 = x1;
            int yc1 = y1;
            int xc2 = x2;
            int yc2 = y2;
            int xc3 = x3;
            int yc3 = y3;            
            super.paint(g);
            dibujar(g, xc0, yc0, xc1, yc1, xc2, yc2, xc3, yc3);
        }
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
       
       g.setStroke(new BasicStroke(grosor));
       boolean dibujarSegmento = true;
       int contadorDeSegmento = 0;
       
       while(i<=delta){
          x=x+Xinc;
          y=y+Yinc;
          i++;

          if (segmentar) {
            if(contadorDeSegmento > 4) {
                dibujarSegmento = false;
            }

            if(contadorDeSegmento >= 12) {
                dibujarSegmento = true;
                contadorDeSegmento = 0;
            }
              contadorDeSegmento++;      
          }
          
           if (dibujarSegmento) {
                g.drawLine(Math.round(x),Math.round(y),Math.round(x), Math.round(y));               
           }
        }
    }
    public void dibujar(Graphics g, int x0,int y0, int x1, int y1, int x2, int y2, int x3, int y3){
        Linea l1 = new Linea();
        Linea l2 = new Linea();
        Linea l3 = new Linea();
        Linea l4 = new Linea();
        l1.drawLinea(g, x0, y0, x1, y1);        
        l2.drawLinea(g, x1, y1, x2, y2);
        l3.drawLinea(g, x2, y2, x3, y3);
        l4.drawLinea(g, x3, y3, x0, y0);

       /** l1.drawLinea(g, 100, 100, 400, 100);        
        l2.drawLinea(g, 400, 100, 400, 400);
        l3.drawLinea(g, 400, 400, 100, 400);
        l4.drawLinea(g, 100, 400, 100, 100);**/
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

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    
    public void setSegmentar(boolean segmentar) {
        this.segmentar = segmentar;
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
