/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Kevin
 */
public class CuadradoDato {
    int x0,x1,x2,x3,y0,y1,y2,y3;

    public CuadradoDato(int x0, int x1, int y0, int y1) {
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
    }
    public CuadradoDato(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3){
        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y0 = y0;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public int getX0() {
        return x0;
    }

    public int getX1() {
        return x1;
    }

    public int getY0() {
        return y0;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }
    

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
    
    
}
