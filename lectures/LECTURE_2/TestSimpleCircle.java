package LECTURE_2;

/**every file must only have one "public" class. */
public class TestSimpleCircle {
    /** Main method */
    public static void main(String[] args) {
      // Create a circle with radius 1
      SimpleCircle circle1 = new SimpleCircle();//create a new object
      System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
  
      // Create a circle with radius 25
      SimpleCircle circle2 = new SimpleCircle(25);
      System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
  
      // Create a circle with radius 125
      SimpleCircle circle3 = new SimpleCircle(125);
      System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());
  
      // Modify circle radius
      circle2.radius = 100; // or circle2.setRadius(100)
      System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
    }
  }
class SimpleCircle {
    /** The Radius of this circle */
    double radius; // we usually don't initialize a value here
    

    /** Construct a circle object */
    SimpleCircle (){
        /** this line of code is added to make our code more robust
         * against errors.
         */
        radius = 1.0;
    }
    /** Construct a circle object */
    SimpleCircle(double newRadius){ // notice that constructros doesn't have a return type
        radius = newRadius;
        /** here we can add "if condetion" to make sure that the users
         * don't input (-ve) values.
         */
    }
    /** The constructs is a type of methods thats get called
     * dynamically when defining a new object, for example:
     *  Circle myCircle = new Circle(); here the radius = 1 (according to the first constructor)
     * or 
     *  Circle myCircle = new Circle(4); where 4 is the radius 
     */
    /** Return the area of this circle */
    double getArea(){
        // this method clac. the area of the circle
            return radius * radius * Math.PI; // Math.PI = 3.14...
    }

    void setRadius(double newRadius){
        radius = newRadius;//method to set a new radius to the circle 
    }
}
