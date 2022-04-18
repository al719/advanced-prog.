import javafx.geometry.Point2D;
import java.lang.Comparable;
import java.util.Arrays;

interface Moveable {
    void move(double dx, double dy);
}

abstract class Shape {

    private Point2D start;

    public Shape(Point2D start) {
        this.start = start;
    }

    public final Point2D getStart() {
        return start;
    }

    public final void setStart(Point2D p) {
        start = p;
    }

    public abstract void draw();
}

class Diamond extends Shape implements Moveable, Comparable<Diamond> {

    private double l, w;

    public Diamond(Point2D start, double l, double w) {
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
        System.out.println("Drawing Diamond");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("width = " + this.w);
    }

    @Override
    public void move(double dx, double dy) {
        setStart(getStart().add(dx, dy));
    }

    @Override
    public int compareTo(Diamond o) {
        // Assume comparison is based on starting point.
        // Compare the x-coordinate first:
        if (this.getStart().getX() > o.getStart().getX()) {
            return 1;
        } else if (this.getStart().getX() < o.getStart().getX()) {
            return -1;
        } else {
            // If both have the same x, compare the y-coordinate:
            if (this.getStart().getY() > o.getStart().getY()) {
                return 1;
            } else if (this.getStart().getY() < o.getStart().getY()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}

public class Lab5Pb4_5 {
    public static void main(String[] args) {
        // Test main Diamond Properties
        Diamond d1 = new Diamond(Point2D.ZERO, 10, 5);
        d1.draw();
        System.out.println("___________________");
        d1.move(1, 1);
        d1.draw();
        System.out.println("___________________");
        Diamond d2 = new Diamond(Point2D.ZERO, 1, 1);
        System.out.println("Compare Output: " + d1.compareTo(d2));
        System.out.println("___________________");

        // --------------------------------------------
        // Create array of Moveables
        Moveable[] mvs = new Moveable[3];
        // Create Diamond objects
        mvs[0] = new Diamond(new Point2D(3, 4), 6, 2);
        mvs[1] = new Diamond(new Point2D(1, 2), 12, 3);
        mvs[2] = new Diamond(new Point2D(3, 2), 1, 5);

        // Move each Diamond
        for (Moveable mv : mvs) {
            mv.move(1, 1);
        }

        // Draw all diamonds
        for (Moveable mv : mvs) {
            // Typecast to Shape or Diamond
            ((Shape) mv).draw();
            System.out.println("___________________");
        }

        // Depends on the implementation of CompareTo.
        System.out.println("______Sorting______");
        Arrays.sort(mvs);

        // Draw all diamonds
        for (Moveable mv : mvs) {
            // Typecast to Shape or Diamond
            ((Diamond) mv).draw();
            System.out.println("___________________");
        }

    }
}
