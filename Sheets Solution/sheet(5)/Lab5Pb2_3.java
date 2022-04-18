import java.util.ArrayList;
import javafx.geometry.Point2D;

abstract class Shape {

    private Point2D start;

    public Shape(Point2D start) {
        this.start = start;
    }

    public final Point2D getStart() {
        return start;
    }

    public abstract void draw();
}

class Line extends Shape {

    private Point2D end;

    public Line(Point2D start, Point2D end) {
        super(start);
        this.end = end;
    }

    public final Point2D getEnd() {
        return end;
    }

    @Override
    public final void draw() {
        System.out.println("Drawing Line");
        System.out.println("Start " + this.getStart());
        System.out.println("End " + this.end);
    }
}

class Rectangle extends Shape {

    private double l, w;

    public Rectangle(Point2D start, double l, double w) {
        super(start);
        this.l = l;
        this.w = w;
    }

    public final double getLength() {
        return l;
    }

    public final double getWidth() {
        return w;
    }

    @Override
    public final void draw() {
        System.out.println("Drawing Rectangle");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("Width = " + this.w);
    }
}

class Ellipse extends Shape {

    private double l, w;

    public Ellipse(Point2D start, double l, double w) {
        super(start);
        this.l = l;
        this.w = w;
    }

    public final double getLength() {
        return l;
    }

    public final double getWidth() {
        return w;
    }

    @Override
    public final void draw() {
        System.out.println("Drawing Ellipse");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("width = " + this.w);
    }
}

class Canvas {
    private ArrayList<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    // Didn't specify how a shape can be identified.
    // So we will use the object reference value.
    // Return true if the shape is found and removed.
    public boolean removeShape(Shape s) {
        if (shapes.contains(s)) {
            shapes.remove(s);
            return true;
        }
        return false;
    }

    public Shape getShape(Point2D p) {
        double distance, minDistance = Double.MAX_VALUE;
        Shape closestShape = null;

        for (Shape s : shapes) {
            distance = s.getStart().distance(p);
            if (distance < minDistance) {
                minDistance = distance;
                closestShape = s;
            }
        }
        return closestShape;
    }

    public void drawAll() {
        for (Shape s : shapes)
            s.draw();
    }

}

public class Lab5Pb2_3 {
    public static void main(String[] args) {
        Canvas c = new Canvas();
        Shape[] shapes = {
                new Line(new Point2D(0, 0), new Point2D(5, 5)),
                new Line(new Point2D(-2, -2), new Point2D(5, 5)),
                new Line(new Point2D(-2, 0), new Point2D(0, 2)),
                new Rectangle(new Point2D(0, 0), 5, 5),
                new Rectangle(new Point2D(1, 1), 3, 2.5),
                new Rectangle(new Point2D(-1, 3), 2, 2),
                new Ellipse(new Point2D(0, 0), 5, 3.5),
                new Ellipse(new Point2D(2, 3), 3, 7),
                new Ellipse(new Point2D(10, 10), 3, 3.5)
            };
        for(Shape s: shapes){
            c.addShape(s);
        }

        // Will not remove, same values but different address.
        System.out.println(c.removeShape(new Line(new Point2D(0, 0), new Point2D(5, 5))));
        // Will remove, same address.
        System.out.println(c.removeShape(shapes[0]));

        c.getShape(new Point2D(2.5, 2.5)).draw();

        c.drawAll();
    }
}
