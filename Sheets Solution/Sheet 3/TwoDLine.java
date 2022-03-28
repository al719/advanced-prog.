package com.example.point2d;

import javafx.geometry.Point2D;


public class TwoDLine {
    Point2D p1;
    vector v1;
    public TwoDLine(Point2D p1 , vector v1){
        this.p1 = p1;
        this.v1 = v1;
    }
    public TwoDLine(double p1_x, double p1_y, double v1_x, double v1_y){
        this.v1 = new vector(v1_x,v1_y);
       this.p1 = new Point2D(p1_x,p1_y);
    }
    public void print(){
        System.out.println("x1 is " +p1.getX());
        System.out.println("y1 is " +p1.getY());
        System.out.println("x2 is " +p1.getX());
        System.out.println("y2 is " +p1.getY());
        System.out.println("The direction of vector is :" + v1.magnitude());
    }
}
