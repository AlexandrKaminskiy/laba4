package com.example.laba4.models;

public class Circle extends Ellipse{


    private double radius;

    @Override
    public void setPoints(Point[] points) {
        super.setPoints(points);
        xPoints[3] = xPoints[2] = xPoints[0] + yPoints[1] - yPoints[0];
    }

    public double getRadius() {
        return Math.sqrt(Math.pow((points[1].x - points[0].x), 2) + Math.pow((points[1].y - points[0].y), 2)) / Math.pow(2, 1/2);
    }

}