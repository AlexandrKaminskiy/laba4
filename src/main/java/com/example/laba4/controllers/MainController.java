package com.example.laba4.controllers;

import com.example.laba4.models.*;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;

import java.util.ArrayList;


public class MainController {
    private ArrayList<Point> pointsList;
    interface Drawing {
        void draw();
    }

    private Drawing drawing;
    private Figure figure;
    private boolean isPossibleToDraw;
    private int counter;
    GraphicsContext gtx;

    @FXML
    private Canvas canvas;

    @FXML
    private Button drawRectangleButton;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    void pickColor(ActionEvent event) {
        gtx.setFill(colorPicker.getValue());
        gtx.setStroke(colorPicker.getValue());
    }

    @FXML
    void mindPointOnCanvas(MouseEvent event) {
//        gtx.setFill(Color.rgb());
        if (isPossibleToDraw) {
            pointsList.add(new Point(event.getX(), event.getY()));
            counter++;
            if (counter >= figure.getPointcount()) {
                Point[] points = new Point[pointsList.size()];

                for (int i = 0; i < points.length; i++) {
                    points[i] = pointsList.get(i);
                }
                figure.setPoints(points);
                isPossibleToDraw = false;
                counter = 0;
                draw();
            }

        }
    }

    @FXML
    void onClickLine(ActionEvent event) {
        pointsList.clear();
        counter = 0;
        isPossibleToDraw = true;
        figure = new Line();
        drawing = () -> {
            gtx.strokePolyline(figure.getXPoints(), figure.getYPoints(), 2);
        };

    }

    @FXML
    void onClickEllipse(ActionEvent event) {
        pointsList.clear();
        counter = 0;

        isPossibleToDraw = true;
        figure = new Ellipse();
        drawing = () -> {
            gtx.fillOval(figure.getXPoints()[0],
                    figure.getYPoints()[0],
                    figure.getXPoints()[2] - figure.getXPoints()[0],
                    figure.getYPoints()[2] - figure.getYPoints()[0]);
        };
    }

    @FXML
    void onClickCircle(ActionEvent event) {
        pointsList.clear();
        counter = 0;
        isPossibleToDraw = true;
        figure = new Circle();
        drawing = () -> {
            gtx.fillOval(figure.getXPoints()[0],
                    figure.getYPoints()[0],
                    figure.getXPoints()[2] - figure.getXPoints()[0],
                    figure.getYPoints()[2] - figure.getYPoints()[0]);
        };
    }

    @FXML
    void drawArbitary(MouseEvent event) {
        pointsList.clear();
        counter = 0;
        isPossibleToDraw = false;
        gtx.fillOval(event.getX(), event.getY(), 3, 3);
    }

    @FXML
    void onClickTriangle(ActionEvent event) {
        pointsList.clear();
        counter = 0;
        isPossibleToDraw = true;
        figure = new Triangle();
        drawing = () -> {
            gtx.fillPolygon(figure.getXPoints(), figure.getYPoints(), 3);
        };
    }

    @FXML
    void onClickRectangle(ActionEvent event) {
        pointsList.clear();
        counter = 0;
        isPossibleToDraw = true;
        figure = new Rectangle();
        drawing = () -> {
            gtx.fillPolygon(figure.getXPoints(), figure.getYPoints(), 4);
        };

    }

    @FXML
    void onClickSquare(ActionEvent event) {
        pointsList.clear();
        counter = 0;
        isPossibleToDraw = true;
        figure = new Square();
        drawing = () -> {
            gtx.fillPolygon(figure.getXPoints(), figure.getYPoints(), 4);
        };
    }

    void draw() {
        drawing.draw();
    }
    @FXML
    void initialize() {
        gtx = canvas.getGraphicsContext2D();
        pointsList = new ArrayList<>();
        isPossibleToDraw = false;

        //draw();
    }

}
