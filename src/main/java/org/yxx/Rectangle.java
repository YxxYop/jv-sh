package org.yxx;

public class Rectangle {

    public double xMin;
    public double xMax;
    public double yMin;
    public double yMax;

    public Rectangle(double xMin, double xMax, double yMin, double yMax) {

        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }

    public boolean contains(double x, double y) {
        return x >= xMin && x <= xMax && y >= yMin && y <= yMax;
    }
}
