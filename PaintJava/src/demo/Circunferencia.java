package demo;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Circunferencia extends JPanel {
    private int radio,xC,yC;

    private int grosor = 1;
    private boolean segmentar = false;
    
    public void drawCirculo(Graphics g, int centroX, int centroY, int radio) {
        xC = centroX;
        yC = centroY;
        this.radio = radio;
        paint((Graphics2D) g);
    }

    public void paint (Graphics2D g){
    super.paint (g);
    double x1,y1;
    double angulo = 0;
    
    g.setStroke(new BasicStroke(grosor));
    boolean dibujarSegmento = true;
    int contadorDeSegmento = 0;
    
    while (angulo<6.8){
        x1 = xC + this.radio * (float)Math.cos(angulo);
        y1 = yC + this.radio * (float)Math.sin(angulo);

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
            g.drawRect((int)x1, (int)y1, 0, 0);            
        }
        angulo = angulo + 0.005;
        }
    }
    public void setXC (int x){
        xC = x;
    }
    public void setYC (int y){
        yC = y;  
    }
    public void setRadio (int r){
        radio = r;  
    }
    
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }    
    
    public void setSegmentar(boolean segmentar) {
        this.segmentar = segmentar;
    }
    
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese x central:");
        int xi = scanner.nextInt();
        c1.setXC(xi);
        System.out.println("Ingrese y central:");
        int yi = scanner.nextInt();
        c1.setYC(yi);
        
        System.out.println("Ingrese radio:");
        int radio = scanner.nextInt();
        c1.setRadio(radio);

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Dibujo Algoritmo DDA");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.WHITE);
        ventana.setSize(1000, 1000);
        
        ventana.add(c1);
        ventana.setVisible(true);
    }
    
}
