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
public class LineaDato {
    int x0,x1,y0,y1;
    int xInit0, yInit0, xInit1, yInit1;
    
    public LineaDato(int x0, int x1, int y0, int y1){
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
        xInit0 = x0;
        xInit1 = x1;
        yInit0 = y0;
        yInit1 = y1;
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

    public int getxInit0() {
        return xInit0;
    }

    public int getyInit0() {
        return yInit0;
    }

    public int getxInit1() {
        return xInit1;
    }

    public int getyInit1() {
        return yInit1;
    }
    
    
}
