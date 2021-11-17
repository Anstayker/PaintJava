package demo;

import javax.swing.*;
import java.awt.*;

import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Bezier extends JPanel {
    
    public double drawBezier(Graphics2D g2, Point2D p0, Point2D p1, Point2D p2, Point2D p3) {
        GeneralPath path = new GeneralPath();
        double result = plotBezier(path, p0, p1, p2, p3, 0, 0.0);
        g2.draw(path);
        return result;
    }
 
     /**
     * Draw a Bezier curve
     *
     * @param g2           the Graphics2D to draw to
     * @param p            control points
     * @param displacement right/left to draw a line parallel to the Bezier
     * @return the length of the Bezier curve
     */
    
    public double drawBezier(Graphics2D g2, Point2D p[], double displacement) {
        return plotBezier(g2, p, displacement, false);
    }
    
     /**
     * Draw a Bezier curve
     *
     * @param g2  the Graphics2D to draw to
     * @param p control points
     * @return the length of the Bezier curve
     */
    public double drawBezier(Graphics2D g2, Point2D p[]) {
        return drawBezier(g2, p, 0.0);
    }
    
    private static double plotBezier(GeneralPath path, Point2D p0, Point2D p1,
                                     Point2D p2, Point2D p3, int depth, double displacement) {
        double result;

        // calculate flatness to determine if we need to recurse...
        double l01 = distance(p0, p1);
        double l12 = distance(p1, p2);
        double l23 = distance(p2, p3);
        double l03 = distance(p0, p3);
        double flatness = (l01 + l12 + l23) / l03;

        // depth prevents stack overflow
        // (I picked 12 because 2^12 = 2048 is larger than most monitors ;-)
        // the flatness comparison value is somewhat arbitrary.
        // (I just kept moving it closer to 1 until I got good results. ;-)
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
            // first order midpoints
            Point2D q0 = midPoint(p0, p1);
            Point2D q1 = midPoint(p1, p2);
            Point2D q2 = midPoint(p2, p3);

            // second order midpoints
            Point2D r0 = midPoint(q0, q1);
            Point2D r1 = midPoint(q1, q2);

            // third order midPoint
            Point2D s = midPoint(r0, r1);

            // draw left side Bezier
            result = plotBezier(path, p0, q0, r0, s, depth + 1, displacement);
            // draw right side Bezier
            result += plotBezier(path, s, r1, q2, p3, depth + 1, displacement);
        }
        return result;
    }
    
        private static double plotBezier(GeneralPath path, Point2D points[], int depth, double displacement) {
        int len = points.length, idx, jdx;
        double result;

        // calculate flatness to determine if we need to recurse...
        double outer_distance = 0;
        for (idx = 1; idx < len; idx++) {
            outer_distance += distance(points[idx - 1], points[idx]);
        }
        double inner_distance = distance(points[0], points[len - 1]);
        double flatness = outer_distance / inner_distance;

        // depth prevents stack overflow
        // (I picked 12 because 2^12 = 2048 is larger than most monitors ;-)
        // the flatness comparison value is somewhat arbitrary.
        // (I just kept moving it closer to 1 until I got good results. ;-)
        if ((depth > 12) || (flatness <= 1.001)) {
            Point2D p0 = points[0], pN = points[len - 1];
            Point2D vO = normalize(orthogonal(subtract(pN, p0)), displacement);
            if (path.getCurrentPoint() == null) { // if this is the 1st point
                Point2D p0P = add(p0, vO);
                path.moveTo(p0P.getX(), p0P.getY());
            }
            Point2D pNP = add(pN, vO);
            path.lineTo(pNP.getX(), pNP.getY());
            result = inner_distance;
        } else {
            // calculate (len - 1) order of points
            // (zero'th order are the input points)
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

            // collect left points
            Point2D[] leftPoints = new Point2D[len];
            leftPoints[0] = points[0];
            for (idx = 0; idx < len - 1; idx++) {
                leftPoints[idx + 1] = nthOrderPoints[idx][0];
            }
            // draw left side Bezier
            result = plotBezier(path, leftPoints, depth + 1, displacement);

            // collect right points
            Point2D[] rightPoints = new Point2D[len];
            for (idx = 0; idx < len - 1; idx++) {
                rightPoints[idx] = nthOrderPoints[len - 2 - idx][idx];
            }
            rightPoints[idx] = points[len - 1];

            // draw right side Bezier
            result += plotBezier(path, rightPoints, depth + 1, displacement);
        }
        return result;
    }
    
    private static double plotBezier(Graphics2D g2, Point2D p[], double displacement, boolean fillFlag) {
        double result;
        GeneralPath path = new GeneralPath();
        if (p.length == 4) { // draw cubic bezier?
            result = plotBezier(path, p[0], p[1], p[2], p[3], 0, displacement);
        } else { // (nope)
            result = plotBezier(path, p, 0, displacement);
        }
        if (fillFlag) {
            g2.fill(path);
        } else {
            g2.draw(path);
        }
        return result;
    }

    
    /**
     * calculate the distance between two points
     *
     * @param pA the first point
     * @param pB the second point
     * @return the distance between the two points
     */

    public static double distance(Point2D pA, Point2D pB) {
        return pA.distance(pB);
    }

    /**
     * normalize a point (vector) to a length
     *
     * @param p      the point (vector)
     * @param length the length to normalize to
     * @return the normalized point (vector)
     */
    public static Point2D normalize(Point2D p, double length) {
        return multiply(normalize(p), length);
    }

    /**
     * normalize a point (vector)
     *
     * @param p the point (vector)
     * @return the normalized point (vector)
     */
    public static Point2D normalize(Point2D p) {
        Point2D result = p;
        double length = length(p);
        if (length >= 0.001) {
            result = divide(p, length);
        }
        return result;
    }

    /**
     * @param p the point
     * @return the point orthogonal to this one (relative to {0, 0})
     */
    public static Point2D orthogonal(Point2D p) {
        return new Point2D.Double(-p.getY(), p.getX());
    }

    /**
     * subtract two points
     *
     * @param pA the first point
     * @param pB the second point
     * @return the difference of the two points
     */
    public static Point2D subtract(Point2D pA, Point2D pB) {
        return new Point2D.Double(pA.getX() - pB.getX(), pA.getY() - pB.getY());
    }

    /**
     * add two points
     *
     * @param pA the first point
     * @param pB the second point
     * @return the sum of the two points
     */
    public static Point2D add(Point2D pA, Point2D pB) {
        return new Point2D.Double(pA.getX() + pB.getX(), pA.getY() + pB.getY());
    }

    /**
     * calculate the midpoint between two points
     *
     * @param pA the first point
     * @param pB the second point
     * @return the midpoint between the two points
     */

    public static Point2D midPoint(Point2D pA, Point2D pB) {
        return lerp(pA, pB, 0.5);
    }

    /**
     * calculate the midpoint of the rectangle
     *
     * @param r the rectangle
     * @return the midpoint of the rectangle
     */
    public static Point2D midPoint(Rectangle2D r) {
        return center(r);
    }

    /**
     * multiply a point times a scalar
     *
     * @param p the point
     * @param s the scalar
     * @return the point multiplied by the scalar
     */
    public static Point2D multiply(Point2D p, double s) {
        return new Point2D.Double(p.getX() * s, p.getY() * s);
    }

    /**
     * multiply a point times two scalar
     *
     * @param p the point
     * @param x the X scalar
     * @param y the Y scalar
     * @return the point multiplied by the two scalars
     */
    public static Point2D multiply(Point2D p, double x, double y) {
        return new Point2D.Double(p.getX() * x, p.getY() * y);
    }

    /**
     * multiply a scalar times a point
     *
     * @param s the scalar
     * @param p the point
     * @return the point multiplied by the scalar
     */
    // (again just so parameter order doesn't matter...)
    public static Point2D multiply(double s, Point2D p) {
        return new Point2D.Double(p.getX() * s, p.getY() * s);
    }

    /**
     * multiply a point times a point
     *
     * @param p1 the first point
     * @param p2 the second point
     * @return the first point multiplied by the second
     */
    public static Point2D multiply(Point2D p1, Point2D p2) {
        return multiply(p1, p2.getX(), p2.getY());
    }

    /**
     * calculate the length of a point (vector)
     *
     * @param p the point (vector)
     * @return the length of the point (vector)
     */
    public static double length(Point2D p) {
        return Math.hypot(p.getX(), p.getY());
    }

    /**
     * divide a point by a scalar
     *
     * @param p the point
     * @param s the scalar
     * @return the point divided by the scalar
     */
    public static Point2D divide(Point2D p, double s) {
        return new Point2D.Double(p.getX() / s, p.getY() / s);
    }

    /**
     * divide a point by two scalars
     *
     * @param p the point
     * @param x the X scalar
     * @param y the Y scalar
     * @return the point divided by the scalar
     */
    public static Point2D divide(Point2D p, double x, double y) {
        return new Point2D.Double(p.getX() / x, p.getY() / y);
    }

    /**
     * calculate the linear interpolation between two integers
     *
     * @param a the first number
     * @param b the second number
     * @param t the fraction (between 0 and 1)
     * @return the linear interpolation between a and b for t
     */
    public static int lerp(int a, int b, double t) {
        return (int) lerp((double) a, (double) b, t);
    }

    /**
     * calculate the linear interpolation between two doubles
     *
     * @param a the first number
     * @param b the second number
     * @param t the fraction (between 0 and 1)
     * @return the linear interpolation between a and b for t
     */
    public static double lerp(double a, double b, double t) {
        return ((1.0 - t) * a) + (t * b);
    }

    /**
     * calculate the linear interpolation between two Doubles
     *
     * @param a the first number
     * @param b the second number
     * @param t the fraction (between 0 and 1)
     * @return the linear interpolation between a and b for t
     */
    public static Double lerp(Double a, Double b, Double t) {
        return ((1.0 - t) * a) + (t * b);
    }

    /**
     * calculate the linear interpolation between two points
     *
     * @param pA the first point
     * @param pB the second point
     * @param t  the fraction (between 0 and 1)
     * @return the linear interpolation between a and b for t
     */
    public static Point2D lerp(Point2D pA, Point2D pB, double t) {
        return new Point2D.Double(lerp(pA.getX(), pB.getX(), t), lerp(pA.getY(), pB.getY(), t));
    }

    /**
     * calculate the center of the rectangle
     *
     * @param r the rectangle
     * @return the center of the rectangle
     */
    public static Point2D center(Rectangle2D r) {
        return new Point2D.Double(r.getCenterX(), r.getCenterY());
    }
    
}
