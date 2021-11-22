package demo;

import javax.swing.*;
import java.awt.*;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Bezier extends JPanel {
    
    private static int grosor = 1;
    private static boolean segmentar = false;
    
    public double drawBezier(Graphics2D g2, Point2D p0, Point2D p1, Point2D p2, Point2D p3) {
        GeneralPath path = new GeneralPath();
        double result = plotBezier(path, p0, p1, p2, p3, 0, 0.0);
        g2.draw(path);
        return result;
    }
    
    public double drawBezier(Graphics2D g2, Point2D p[], double displacement) {
        return plotBezier(g2, p, displacement, false);
    }
    
    public double drawBezier(Graphics2D g2, Point2D p[]) {
        return drawBezier(g2, p, 1.0);
    }
    
    private static double plotBezier(GeneralPath path, Point2D p0, Point2D p1,
                                     Point2D p2, Point2D p3, int depth, double displacement) {
        double result;

        double l01 = distance(p0, p1);
        double l12 = distance(p1, p2);
        double l23 = distance(p2, p3);
        double l03 = distance(p0, p3);
        double flatness = (l01 + l12 + l23) / l03;

        if ((depth > 12) || (flatness <= 1.001)) {
            Point2D vO = normalize(orthogonal(subtract(p3, p0)), displacement);
            if (path.getCurrentPoint() == null) { // if this is the 1st point
                Point2D p0P = add(p0, vO);
                path.moveTo(p0P.getX(), p0P.getY());
            }
            Point2D p3P = add(p3, vO);
            path.lineTo(p3P.getX(), p3P.getY());
            result = l03;
        } else {

            Point2D q0 = midPoint(p0, p1);
            Point2D q1 = midPoint(p1, p2);
            Point2D q2 = midPoint(p2, p3);

            Point2D r0 = midPoint(q0, q1);
            Point2D r1 = midPoint(q1, q2);

            Point2D s = midPoint(r0, r1);

            result = plotBezier(path, p0, q0, r0, s, depth + 1, displacement);

            result += plotBezier(path, s, r1, q2, p3, depth + 1, displacement);
        }
        return result;
    }
    
        private static double plotBezier(GeneralPath path, Point2D points[], int depth, double displacement) {
        int len = points.length, idx, jdx;
        double result;

        double outer_distance = 0;
        for (idx = 1; idx < len; idx++) {
            outer_distance += distance(points[idx - 1], points[idx]);
        }
        double inner_distance = distance(points[0], points[len - 1]);
        double flatness = outer_distance / inner_distance;

        if ((depth > 12) || (flatness <= 1.001)) {
            Point2D p0 = points[0], pN = points[len - 1];
            Point2D vO = normalize(orthogonal(subtract(pN, p0)), displacement);
            if (path.getCurrentPoint() == null) {
                Point2D p0P = add(p0, vO);
                path.moveTo(p0P.getX(), p0P.getY());
            }
            Point2D pNP = add(pN, vO);
            path.lineTo(pNP.getX(), pNP.getY());
            result = inner_distance;
        } else {

            Point2D[][] nthOrderPoints = new Point2D[len - 1][];
            for (idx = 0; idx < len - 1; idx++) {
                nthOrderPoints[idx] = new Point2D[len - 1 - idx];
                for (jdx = 0; jdx < len - 1 - idx; jdx++) {
                    if (idx == 0) {
                        nthOrderPoints[idx][jdx] = midPoint(points[jdx], points[jdx + 1]);
                    } else {
                        nthOrderPoints[idx][jdx] = midPoint(nthOrderPoints[idx - 1][jdx],
                                nthOrderPoints[idx - 1][jdx + 1]);
                    }
                }
            }

            Point2D[] leftPoints = new Point2D[len];
            leftPoints[0] = points[0];
            for (idx = 0; idx < len - 1; idx++) {
                leftPoints[idx + 1] = nthOrderPoints[idx][0];
            }

            result = plotBezier(path, leftPoints, depth + 1, displacement);

            Point2D[] rightPoints = new Point2D[len];
            for (idx = 0; idx < len - 1; idx++) {
                rightPoints[idx] = nthOrderPoints[len - 2 - idx][idx];
            }
            rightPoints[idx] = points[len - 1];

            result += plotBezier(path, rightPoints, depth + 1, displacement);
        }
        return result;
    }
    
    private static double plotBezier(Graphics2D g2, Point2D p[], double displacement, boolean fillFlag) {
        double result;
        GeneralPath path = new GeneralPath();
        if (p.length == 4) {
            result = plotBezier(path, p[0], p[1], p[2], p[3], 0, displacement);
        } else {
            result = plotBezier(path, p, 0, displacement);
        }
        if (fillFlag) {
            g2.fill(path);
        } else {
            if (segmentar) 
                g2.setStroke(new BasicStroke(grosor, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,0, new float[]{9}, 0));
            else
                g2.setStroke(new BasicStroke(grosor));
            g2.draw(path);
        }
        return result;
    }

    public static double distance(Point2D pA, Point2D pB) {
        return pA.distance(pB);
    }

    public static Point2D normalize(Point2D p, double length) {
        return multiply(normalize(p), length);
    }

    public static Point2D normalize(Point2D p) {
        Point2D result = p;
        double length = length(p);
        if (length >= 0.001) {
            result = divide(p, length);
        }
        return result;
    }

    public static Point2D orthogonal(Point2D p) {
        return new Point2D.Double(-p.getY(), p.getX());
    }

    public static Point2D subtract(Point2D pA, Point2D pB) {
        return new Point2D.Double(pA.getX() - pB.getX(), pA.getY() - pB.getY());
    }

    public static Point2D add(Point2D pA, Point2D pB) {
        return new Point2D.Double(pA.getX() + pB.getX(), pA.getY() + pB.getY());
    }

    public static Point2D midPoint(Point2D pA, Point2D pB) {
        return lerp(pA, pB, 0.5);
    }

    public static Point2D midPoint(Rectangle2D r) {
        return center(r);
    }

    public static Point2D multiply(Point2D p, double s) {
        return new Point2D.Double(p.getX() * s, p.getY() * s);
    }

    public static Point2D multiply(Point2D p, double x, double y) {
        return new Point2D.Double(p.getX() * x, p.getY() * y);
    }

    public static Point2D multiply(double s, Point2D p) {
        return new Point2D.Double(p.getX() * s, p.getY() * s);
    }

    public static Point2D multiply(Point2D p1, Point2D p2) {
        return multiply(p1, p2.getX(), p2.getY());
    }

    public static double length(Point2D p) {
        return Math.hypot(p.getX(), p.getY());
    }

    public static Point2D divide(Point2D p, double s) {
        return new Point2D.Double(p.getX() / s, p.getY() / s);
    }

    public static Point2D divide(Point2D p, double x, double y) {
        return new Point2D.Double(p.getX() / x, p.getY() / y);
    }

    public static int lerp(int a, int b, double t) {
        return (int) lerp((double) a, (double) b, t);
    }

    public static double lerp(double a, double b, double t) {
        return ((1.0 - t) * a) + (t * b);
    }

    public static Double lerp(Double a, Double b, Double t) {
        return ((1.0 - t) * a) + (t * b);
    }

    public static Point2D lerp(Point2D pA, Point2D pB, double t) {
        return new Point2D.Double(lerp(pA.getX(), pB.getX(), t), lerp(pA.getY(), pB.getY(), t));
    }

    public static Point2D center(Rectangle2D r) {
        return new Point2D.Double(r.getCenterX(), r.getCenterY());
    }
 
    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }
    
    public void setSegmentar(boolean segmentar) {
        this.segmentar = segmentar;
    }
    
}
