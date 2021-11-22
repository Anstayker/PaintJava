package demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Mouse implements MouseListener, MouseMotionListener{
   
    private int mouseX;
    private int mouseY;
    
    private ArrayList<Integer> coordenadasX = new ArrayList<>();
    private ArrayList<Integer> coordenadasY = new ArrayList<>();
    
    private String figura = "";
    private Graphics graphics;
    private Graphics imageGraphics;
    private Color currentColor;
    private int grosor;
    private boolean segmentado;
    
    private Almacen almacen = new Almacen();
    
    @Override
    public void mouseClicked(MouseEvent event) {
       int mouseX = event.getX();
       int mouseY = event.getY();
       System.out.println(mouseX + " " + mouseY);
       switch(figura) {
           case "Linea":
               coordenadasX.add(mouseX);
               coordenadasY.add(mouseY);
               graphics.fillOval(mouseX, mouseY, 5, 5);
               if (coordenadasX.size() == 2 && coordenadasY.size() == 2) {
                    Linea linea = new Linea();
                    int xInicial = coordenadasX.get(0);
                    int yInicial = coordenadasY.get(0);
                    int xFinal = coordenadasX.get(1);
                    int yFinal = coordenadasY.get(1);
                    
                    currentColor = graphics.getColor();
                    graphics.setColor(Color.WHITE);
                    graphics.fillOval(xInicial, yInicial, 5, 5);
                    graphics.fillOval(xFinal, yFinal, 5, 5);
                    graphics.setColor(currentColor);
                    
                    linea.setGrosor(grosor);
                    linea.setSegmentar(segmentado);
                    linea.drawLinea(graphics, xInicial, yInicial, xFinal, yFinal);
                    almacen.getLineasAlm().add(new LineaDato(xInicial, xFinal, yInicial, yFinal));
                    linea.drawLinea(imageGraphics, xInicial, yInicial, xFinal, yFinal);
                    coordenadasX.clear();
                    coordenadasY.clear();
               }
               break;
           case "Cuadrado":
               coordenadasX.add(mouseX);
               coordenadasY.add(mouseY);
               graphics.fillOval(mouseX, mouseY, 5, 5);
               if (coordenadasX.size() == 2 && coordenadasY.size() == 2) {
                    Cuadrado cuadrado = new Cuadrado();
                    int xInicial = coordenadasX.get(0);
                    int yInicial = coordenadasY.get(0);
                    int xFinal = coordenadasX.get(1);
                    int yFinal = coordenadasY.get(1);
                    
                    currentColor = graphics.getColor();
                    graphics.setColor(Color.WHITE);
                    graphics.fillOval(xInicial, yInicial, 5, 5);
                    graphics.fillOval(xFinal, yFinal, 5, 5);
                    graphics.setColor(currentColor);
                    
                    cuadrado.setGrosor(grosor);
                    cuadrado.setSegmentar(segmentado);
                    cuadrado.drawCuadrado(graphics, xInicial, yInicial, xFinal, yFinal);
                    almacen.getCuadradosAlm().add(new CuadradoDato(xInicial, xFinal, yInicial, yFinal));
                    cuadrado.drawCuadrado(imageGraphics, xInicial, yInicial, xFinal, yFinal);
                    coordenadasX.clear();
                    coordenadasY.clear();
               }
               break;
           case "Triangulo":
               coordenadasX.add(mouseX);
               coordenadasY.add(mouseY);
               graphics.fillOval(mouseX, mouseY, 5, 5);
               if (coordenadasX.size() == 3 && coordenadasY.size() == 3) {
                    Triangulo triangulo = new Triangulo();

                    int x0 = coordenadasX.get(0);
                    int y0 = coordenadasY.get(0);
                    int x1 = coordenadasX.get(1);
                    int y1 = coordenadasY.get(1);
                    int x2 = coordenadasX.get(2);
                    int y2 = coordenadasY.get(2);
                    
                    currentColor = graphics.getColor();
                    graphics.setColor(Color.WHITE);
                    graphics.fillOval(x0, y0, 5, 5);
                    graphics.fillOval(x1, y1, 5, 5);
                    graphics.fillOval(x2, y2, 5, 5);
                    graphics.setColor(currentColor);
                    
                    triangulo.setGrosor(grosor);
                    triangulo.setSegmentar(segmentado);
                    triangulo.drawTriangulo(graphics, x0, y0, x1, y1, x2, y2);
                    almacen.getTriangulosAlm().add(new TrianguloDato(x0, y0, x1, y1, x2, y2)); 
                    triangulo.drawTriangulo(imageGraphics, x0, y0, x1, y1, x2, y2);
                    coordenadasX.clear();
                    coordenadasY.clear();
               }
               break;
           case "Circulo":
               coordenadasX.add(mouseX);
               coordenadasY.add(mouseY);
               graphics.fillOval(mouseX, mouseY, 5, 5);
               if (coordenadasX.size() == 2 && coordenadasY.size() == 2) {
                    Circunferencia circulo = new Circunferencia();
                    int xCentro = coordenadasX.get(0);
                    int yCentro = coordenadasY.get(0);
                    int xFinal = coordenadasX.get(1);
                    int yFinal = coordenadasY.get(1);
                    double radio = Math.hypot(xCentro - xFinal, yCentro - yFinal);
                    
                    currentColor = graphics.getColor();
                    graphics.setColor(Color.WHITE);
                    graphics.fillOval(xCentro, yCentro, 5, 5);
                    graphics.fillOval(xFinal, yFinal, 5, 5);
                    graphics.setColor(currentColor);
                    
                    circulo.setGrosor(grosor);
                    circulo.setSegmentar(segmentado);
                    circulo.drawCirculo(graphics, xCentro, yCentro, (int) radio);
                    almacen.getCirculosAlm().add(new CirculoDato((int)radio, xCentro, yCentro));
                    circulo.drawCirculo(imageGraphics, yCentro, yCentro, yFinal);
                    coordenadasX.clear();
                    coordenadasY.clear();
               }
               break;
           case "Curva":
               if (SwingUtilities.isLeftMouseButton(event)) {
               coordenadasX.add(mouseX);
               coordenadasY.add(mouseY);
               graphics.fillOval(mouseX, mouseY, 5, 5);
               }
               if (coordenadasX.size() >= 2 && coordenadasY.size() >= 2) {
                    
                    if (SwingUtilities.isRightMouseButton(event)) {
                        
                    Point2D[] points = new Point2D[coordenadasX.size()];
                   
                    for (int i = 0; i < points.length; i++) {
                       points[i] = new Point2D.Double(coordenadasX.get(i), coordenadasY.get(i));
                       
                        currentColor = graphics.getColor();
                        graphics.setColor(Color.WHITE);
                        graphics.fillOval(coordenadasX.get(i), coordenadasY.get(i), 5, 5);
                        graphics.setColor(currentColor); 
                       
                    }
                        
                        Bezier curva = new Bezier();
                        curva.setGrosor(grosor);
                        curva.setSegmentar(segmentado);
                         curva.drawBezier((Graphics2D) graphics, points);
                         curva.drawBezier((Graphics2D) imageGraphics, points);
                         almacen.getCurvaAlm().add(new CurvaDato(points));
                         coordenadasX.clear();
                         coordenadasY.clear();
                        System.out.println("Click derecho");
                    }                  
               }

               break;
           default:
               break;
       }

     }

     @Override
     public void mouseEntered(MouseEvent event) { }

     @Override
     public void mouseExited(MouseEvent event) { }

     @Override
     public void mousePressed(MouseEvent event) { }

     @Override
     public void mouseReleased(MouseEvent event) { }

     @Override
     public void mouseDragged(MouseEvent event) { }
     
     @Override
     public void mouseMoved(MouseEvent event) { }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
 
    public void setImageGraphics(Graphics graphics) {
        this.imageGraphics = graphics;
    }
    public Almacen getAlmacen(){
        return almacen;
    }
    
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    
    public void setSegmentar(boolean segmentado) {
        this.segmentado = segmentado;
    }
    
}
