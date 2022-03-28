package com.example.point2d;
import javafx.geometry.Point2D;
public class Test_2DLine {
    public static void main(String[] args) {

        TwoDLine  l1 = new TwoDLine(3,4,5,7); // intialize l1 according to passed points
        l1.print();
        System.out.println("-----------------------------------------------------------------------------");
        vector v1 = new vector(5,2);
        Point2D p1 = new Point2D(3,4);
        TwoDLine l2 =  new TwoDLine(p1, v1); // intialize l1 according to passed objects
        l2.print();

    }
}
