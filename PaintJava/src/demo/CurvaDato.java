package demo;

import java.awt.geom.Point2D;

public class CurvaDato {
    Point2D[] puntos;

    int grosor;
    boolean segmentado;
    
    public CurvaDato(Point2D[] p, int grosor, boolean segmentado) {
        puntos = p;
        this.grosor = grosor;
        this.segmentado = segmentado;
    }

    public Point2D[] getPuntos() {
        return puntos;
    }

    public void setPuntos(Point2D[] puntos) {
        this.puntos = puntos;
    }
    public Point2D[] moverPtsCurvaArriba(){
        for(Point2D p : puntos){
            p.setLocation(p.getX(), p.getY()-5);
        }
        return puntos;
    }
    public Point2D[] moverPtsCurvaAbajo(){
        for(Point2D p : puntos){
            p.setLocation(p.getX(), p.getY()+5);
        }
        return puntos;
    }
    public Point2D[] moverPtsCurvaIzquierda(){
        for(Point2D p : puntos){
            p.setLocation(p.getX()-5, p.getY());
        }
        return puntos;
    }
    public Point2D[] moverPtsCurvaDerecha(){
        for(Point2D p : puntos){
            p.setLocation(p.getX()+5, p.getY());
        }
        return puntos;
    }
    
    
}
