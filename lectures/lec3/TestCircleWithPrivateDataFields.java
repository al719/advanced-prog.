/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec3;

/**
 *
 * @author Engrs
 */
public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
    // create a circle with raduis 5
    CircleWithPrivateDataFields myCircle  = new CircleWithPrivateDataFields(5.0);
    System.out.println(" The Area of the circle of raduis " + myCircle.getRadius() + " is " + myCircle.getArea());
    
    //Increase myCirle's radius by 10%
    myCircle.setRadius(myCircle.getRadius()*1.1);
    System.out.println(" The Area of the circle of raduis " + myCircle.getRadius() + " is " + myCircle.getArea());
    System.out.println(" The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects() );

}
}