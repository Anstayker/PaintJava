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
public class CirculoDato {
    int xC, yC;
    int radio;
    
    public CirculoDato(int r, int xCentro, int yCentro){
        radio=r;
        xC = xCentro;
        yC = yCentro;
    }

    public int getRadio() {
        return radio;
    }

    public int getxC() {
        return xC;
    }

    public int getyC() {
        return yC;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setxC(int xC) {
        this.xC = xC;
    }

    public void setyC(int yC) {
        this.yC = yC;
    }
    
    
}
