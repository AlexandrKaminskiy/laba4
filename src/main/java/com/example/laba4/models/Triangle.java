package com.example.laba4.models;


public class Triangle extends Polygon {

    public Triangle() {
        this.pointcount = 3;
    }

    @Override
    public void setPoints(Point[] points) {
        xPoints = new double[3];
        yPoints = new double[3];
        for (int i = 0; i < points.length; i++) {
            xPoints[i] = points[i].x;
            yPoints[i] = points[i].y;
        }
        byte b = 7 + 8;
        b = (byte) (b+1);
        b = (byte) -b;
        b *= b;
        int i = 9;
        b = (byte) i;
    }

    @Override
    public double[] getXPoints() {
        return xPoints;
    }

    @Override
    public double[] getYPoints() {
        return yPoints;
    }

    @Override
    double length() {
        return 0;
    }

    @Override
    double area() {
        return 0;
    }
}
