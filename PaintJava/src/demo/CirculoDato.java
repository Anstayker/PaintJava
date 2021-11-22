
package demo;

public class CirculoDato {
    int xC, yC;
    int radio;
    
    int grosor;
    boolean segmentado;
    
    public CirculoDato(int r, int xCentro, int yCentro, int grosor, boolean segmentado){
        radio=r;
        xC = xCentro;
        yC = yCentro;
        this.grosor = grosor;
        this.segmentado = segmentado;
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
    
    public int getGrosor() {
        return grosor;
    }

    public boolean isSegmentado() {
        return segmentado;
    }
    
}
