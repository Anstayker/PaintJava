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
public class TrianguloDato {
    private int x1,y1,x2,y2,x3,y3;
    private int vSX, vSY, vDX, vDY, vIX, vIY;

    public TrianguloDato(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        vSX = verticeSuperiorX();
        vSY = verticeSuperiorY();
        vIX = verticeIzquierdoX();
        vIY = verticeIzquierdoY();
        vDX = verticeDerechoX();
        vDY = verticeDerechoY();
    }
    
    public int verticeSuperiorY(){
        if(y1 < y2 && y1 < y3){
            return y1;
        }else{
            if(y2 < y1 && y2 < y3){
                return y2;
            }else{
                return y3;
            }
        }
    }
    public int verticeSuperiorX(){
        if(y1 < y2 && y1 < y3){
            return x1;
        }else{
            if(y2 < y1 && y2 < y3){
                return x2;
            }else{
                return x3;
            }
        }
    }
    public int verticeIzquierdoX(){
        if(x1 == verticeSuperiorX()){
            if(x2 < x3){
                return x2;
            }else{
                return x3;
            }
        }else{
            if(x2 == verticeSuperiorX()){
                if(x1 < x3){
                    return x1;
                }else{
                    return x3;
                }
            }else{
                if(x1 < x2){
                    return x1;
                }else{
                    return x2; 
                }
            }
        }
    }
    public int verticeIzquierdoY(){
        if(x1 == verticeSuperiorX()){
            if(x2 < x3){
                return y2;
            }else{
                return y3;
            }
        }else{
            if(x2 == verticeSuperiorX()){
                if(x1 < x3){
                    return y1;
                }else{
                    return y3;
                }
            }else{
                if(x1 < x2){
                    return y1;
                }else{
                    return y2; 
                }
            }
        }
    }
    public int verticeDerechoX(){
        if(x1 == verticeSuperiorX()){
            if(x2 > x3){
                return x2;
            }else{
                return x3;
            }
        }else{
            if(x2 == verticeSuperiorX()){
                if(x1 > x3){
                    return x1;
                }else{
                    return x3;
                }
            }else{
                if(x1 > x2){
                    return x1;
                }else{
                    return x2;
                }
            }
        }
    }
    public int verticeDerechoY(){
        if(x1 == verticeSuperiorX()){
            if(x2 > x3){
                return y2;
            }else{
                return y3;
            }
        }else{
            if(x2 == verticeSuperiorX()){
                if(x1 > x3){
                    return y1;
                }else{
                    return y3;
                }
            }else{
                if(x1 > x2){
                    return y1;
                }else{
                    return y2;
                }
            }
        }
    }

    public int getvSX() {
        return vSX;
    }

    public int getvSY() {
        return vSY;
    }

    public int getvDX() {
        return vDX;
    }

    public int getvDY() {
        return vDY;
    }

    public int getvIX() {
        return vIX;
    }

    public int getvIY() {
        return vIY;
    }
    
    public void setVerticeSuperiorX(int vsx){
        vSX = vsx;
    }
    public void setVerticeSuperiorY(int vsy){
        vSY = vsy;
    }
    public void setVerticeIzquierdoX(int vix){
        vIX = vix;
    }
    public void setVerticeIzquierdoY(int viy){
        vIY = viy;
    }
    public void setVerticeDerechoX(int vdx){
        vDX = vdx;
    }
    public void setVerticeDerechoY(int vdy){
        vDY = vdy;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }
    
    
}
