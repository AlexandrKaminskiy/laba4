package com.example.laba4.models;


public class Square extends Rectangle{
    @Override
    public void setPoints(Point[] points) {
        super.setPoints(points);
        xPoints[3] = xPoints[2] = xPoints[0] + yPoints[1] - yPoints[0];
    }
}
