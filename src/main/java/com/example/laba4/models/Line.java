package com.example.laba4.models;

public class Line extends OpenFigure{
    public Line() {
        this.pointcount = 2;
    }


    @Override
    public void setPoints(Point[] points) {
        xPoints = new double[2];
        yPoints = new double[2];
        for (int i = 0; i < points.length; i++) {
            xPoints[i] = points[i].x;
            yPoints[i] = points[i].y;
        }
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
}
