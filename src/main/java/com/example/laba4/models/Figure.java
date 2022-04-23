package com.example.laba4.models;

public abstract class Figure {
    Point[] points;
    double[] xPoints;
    double[] yPoints;
    public int pointcount;
    abstract public void setPoints(Point[] points);
    abstract public double[] getXPoints();
    abstract public double[] getYPoints();
    abstract double length();


    public int getPointcount() {
        return pointcount;
    }

}
