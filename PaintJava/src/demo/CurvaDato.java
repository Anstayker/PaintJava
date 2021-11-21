/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.geom.Point2D;

/**
 *
 * @author Kevin
 */
public class CurvaDato {
    Point2D[] puntos;
    
    public CurvaDato(Point2D[] p){
        puntos = p;
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
