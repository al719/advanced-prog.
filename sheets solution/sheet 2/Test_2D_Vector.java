/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 3laa
 */
public class Test_2D_Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        //we will write some code to test class Vector2D 
        
        //first creating object to make communication channel with Vector2D class
        Vector2D first = new Vector2D();//i can use the constructor which has no parameter
        first.setX(4.0);//should pass value to set "x" ,if not there is an error
        first.setY(3.0);//same for "y"
        // now i give value for ( x,y ) just for first object
        //so, if i use another object should set again values for x,y 
        System.out.println("value for x: "+first.getX());//this code to make sure the value stored in x,y
        System.out.println("value for y: "+first.getY());
        System.out.println("magnitude for first vector: "+first.magnitude());
        System.out.println("angle for first vector: "+first.angle());
        //and to print first vector in two format we should call method print from class 
        first.print();
        //now to add and sub between two vectors ,hence we will create another objcet
        Vector2D second = new Vector2D(6,8);//i used second constructor which need to passed parameters
                                            //so, i'll not use set method cause i already passed x,y by second construct
        first.add(second);// i will add real parts --> x of [first&second] and add imaginary parts also
        //the value of first changed to be first += second
        //but to avoid this problem creat third object 
        Vector2D third = new Vector2D();//without passing values
        //i'll use third object as temporary to store value of methods[add & sub]
        first.sub(second);
        first.print();//i get the previous values for first object
                      //recall: that i do add to  first and sub ,so i get the old values for first
        third.add(first, second);
        third.print();//now i execute add method without changing in any project[first&second] values
        
        
    }
}
