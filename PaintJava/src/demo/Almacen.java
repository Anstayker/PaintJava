
package demo;
import java.util.ArrayList;
/**
 *
 * @author Kevin
 */
public class Almacen {
    private ArrayList<LineaDato> lineasAlm;
    private ArrayList<CirculoDato> circulosAlm;
    private ArrayList<CuadradoDato> cuadradosAlm;
    private ArrayList<CurvaDato> curvaAlm;
    private ArrayList<TrianguloDato> triangulosAlm;
    
    public Almacen(){
        lineasAlm = new ArrayList<>();
        circulosAlm = new ArrayList<>();
        cuadradosAlm = new ArrayList<>();
        curvaAlm = new ArrayList<>();
        triangulosAlm = new ArrayList<>();
    }

    public ArrayList<LineaDato> getLineasAlm() {
        return lineasAlm;
    }

    public ArrayList<CirculoDato> getCirculosAlm() {
        return circulosAlm;
    }

    public ArrayList<CuadradoDato> getCuadradosAlm() {
        return cuadradosAlm;
    }

    public ArrayList<CurvaDato> getCurvaAlm() {
        return curvaAlm;
    }

    public ArrayList<TrianguloDato> getTriangulosAlm() {
        return triangulosAlm;
    }
    
    
}
