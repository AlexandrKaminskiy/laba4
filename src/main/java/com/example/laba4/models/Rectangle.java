package com.example.laba4.models;


public class Rectangle extends Polygon {

    public Rectangle() {
        this.pointcount = 2;

    }
    @Override
    public void setPoints(Point[] points) {
        if (points[0].x > points[1].x) {
            double temp = points[0].x;
            points[0].x = points[1].x;
            points[1].x = temp;
        }
        if (points[0].y > points[1].y) {
            double temp = points[0].y;
            points[0].y = points[1].y;
            points[1].y = temp;
        }
        xPoints = new double[]{points[0].x, points[0].x, points[1].x, points[1].x};
        yPoints = new double[]{points[0].y, points[1].y, points[1].y, points[0].y};
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
    double area() {
        return (points[1].x - points[0].x) * (points[1].y - points[0].y);
    }



    @Override
    double length() {
        return (points[1].x - points[0].x) * (points[1].y - points[0].y) * 2;
    }
}