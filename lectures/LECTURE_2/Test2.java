package LECTURE_2;


/** Java assigns no default value to a local variable 
inside a method. */

public class Test2 {
    public static void main(String[] args) {
        int x; // x has no default value
        String y; // y has no default value
        System.out.println("x is " + x); //Compile error: variable not initialized
        System.out.println("y is " + y); //Compile error: variable not initialized
        }
        
}
