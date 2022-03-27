package chapters;

import java.sql.Time;
import java.util.Scanner;
/*Objectives For Chapter 9
    ■ To describe objects and classes, and use classes to model objects (§9.2).
    ■ To use UML graphical notation to describe classes and objects (§9.2).
    ■ To demonstrate how to define classes and create objects (§9.3).
    ■ To create objects using constructors (§9.4).
    ■ To access objects via object reference variables (§9.5).
    ■ To define a reference variable using a reference type (§9.5.1).
    ■ To access an object’s data and methods using the object member access
    operator (.) (§9.5.2).
    ■ To define data fields of reference types and assign default values for an
    object’s data fields (§9.5.3).
    ■ To distinguish between object reference variables and primitive data
    type variables (§9.5.4).
    ■ To use the Java library classes Date, Random, and Point2D (§9.6).
    ■ To distinguish between instance and static variables and methods (§9.7).
    ■ To define private data fields with appropriate getter and setter methods
    (§9.8).
    ■ To encapsulate data fields to make classes easy to maintain (§9.9).
    ■ To develop methods with object arguments and differentiate between
    primitive-type arguments and object-type arguments (§9.10).
    ■ To store and process objects in arrays (§9.11).
    ■ To create immutable objects from immutable classes to protect the
    contents of objects (§9.12).
    ■ To determine the scope of variables in the context of a class (§9.13).
    ■ To use the keyword this to refer to the calling object itself (§9.14).
*
*
* */
import java.util.Date;
import java.util.Random;
import javafx.geometry.Point2D;
public class Chapter9 {
    public static void main(String[] args){

        /*
        // Random class Ex.
        Random r1 = new Random(System.currentTimeMillis());//passing time as a seed
        System.out.println(r1.nextDouble());
        */

        // pass by value Vs pass by ref.
//        int[] a = {1,2};
//        swap(a[0],a[1]);//by value!!
//        System.out.println(a[0] +" "+a[1]);
//        swap(a);//pass by ref.
//        System.out.println(a[0] +" "+a[1]);

    }
    public static void swap(int n ,int x){
        int temp = n;
        n = x;
        x = temp;

    }
    public static void swap(int[]a){
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
/*

        1) state of object can be represented by its data fields & the behaviour can be represented by its methods
    *
    *   2) objets of the same data types are defined using class which is a blue-print
    *
    *   3) an object is an instance of the class that two words are interchangeable(متبادلة)
    *
    *   4) notation of method in uml ==>  methodName(parameterName: parameterType): returnType
    *
    *   5) public class : You can put the two classes into one file, but only one class in the file can be a public class.
    *
    *   5.1) the public class must have the same name as the file name
    *
    *   5.2) when we compile file.java which is containing two classes one of them must be public and has the same name of the file the compiler  will generate two file.class
    *
    *   6) the new operator is used to create an object from the constructor: new SimpleCircle()
    *
    *   7) you can test a class by simply adding a main method in the same class.
    *
    *   8) Constructors: must have the same name of the class && has no return data type && invoked using new operator!!
    *
    *   8.1) A class may be defined without constructors. In this case, a public no-arg constructor with
            an empty body is implicitly defined in the class. This constructor, called a default constructor,
            is provided automatically only if no constructors are explicitly defined in the class.

        9)  ClassName objectRefVar; ==> that will be called a variable if we declare it using new operator will be variable that contains a reference to the class object!!

        10) the data field is referred to as an instance variable because it depends on specific instance

        10.1) the methods  are referred to as an instance methods because it can be called by specific instance Vs static methods which is not methods instances

        11) we can create an object without assigning it to variable just using new + constructor in this way is known as an anonymous object.

        12) Null::  the default value of a data field is null for a reference type && used to make the object refer to nothing

        13) local variables inside methods have no default values but data fields have!!

        14) NullPointerException : is a common runtime error. It occurs when you invoke
            a method on a reference variable with a null value. Make sure you assign an object
            reference to the variable before invoking the method through the reference variable

         15) when we declare a variable of reference data types such as classes we give that variable a location of the object that has been created on the memory

         16) garbage collection.:: when assigning two objects to the same reference so one of them will occupy a space on the memory so the Java
            runtime system detects garbage and automatically reclaims the space it occupies.

         17) Tip : If you know that an object is no longer needed, you can explicitly assign null to a reference
                    variable for the object.The JVM will automatically collect the space if the object is
                    not referenced by any reference variable.

         18) Date class : returns the current date by using .toString() && .getTime()==> return milliseconds from 1970

         19) static data fields : If you want all the instances of a class to share data, use static variables (class variables)
             Static variables store values for the variables in a common memory location.
             if one object changes the value of a static variable, all objects of the same class are affected
         20) static methods : can be called without creating an instance of the class

         21) static methods and variables are underlined in UML

         22) constants must be final static variables

         23) static methods ==> can only invoke static methods and access static data field (can't invoke instance methods or access instance data fields

         24) instance methods ===> بتعمل اي حاجه بدون قيود

         25) Design Guide:
                How do you decide whether a variable or a method should be an instance one or a
                static one? A variable or a method that is dependent on a specific instance of the class
                should be an instance variable or method. A variable or a method that is not dependent
                on a specific instance of the class should be a static variable or method

         26) accessibility is default can be called: package-private or package-access.

         27) If a class is not defined as public, it can be accessed only within the same package

         28) Using the modifiers public and private on local variables would cause a compile error.

         29) to prevent creating objects from specific class you can set its constructor to be private

         30) ##data field encapsulation##: is to set the data fields of the class to be private and only can be accessed by methods
             called setters to update data fields (mutator.) && getters to return their values (accessor)

         31) instance of any class is passed to function only be reference

         32)  Arrays are objects in Java (objects are introduced in Chapter 9). The JVM stores the
              objects in an area of memory called the heap, which is used for dynamic memory allocation.

         33)    Note When an array of objects is created using the new operator, each element in the array is
                a reference variable with a default value of null.
         34)   To initialize Array of objects , you can use a loop

         35) For a class to be immutable:
                ■ All data fields must be private.
                ■ There can’t be any mutator methods for data fields.
                ■ No accessor methods can return a reference to a data field that is mutable.

         36) the local variable takes precedence and the class’s variable with the same name is hidden

         37) The keyword this refers to the object itself. It can also be used inside a constructor to
             invoke another constructor of the same class.

         38)  this keyword reference is needed to reference hidden data fields or invoke an overloaded constructor.

         39) setting values to static data fields cannot be done using this but only className.dataField

         40) this statement appear first in the constructor before any other executable statements.

         41) static key word :
               1. static member: general feature for all objects created from the class ,but it saved only once in the memory and all objects points at its location
            *  2. static variable: using as a counter for ex. in the class to know how many objects have been created
            *  3. static method : a method that could be called with no need to an object  "حاجه كدا زى البابلك فانكشنز ف السي "- restriction of using it: static method cannot use non-static data member or call non-static method directly!!
                   to access these non- static members we have to create object from the class
            * 4. static block ==> used to initialize static variables static block has the highest priority vs constructor
            * 5. static class ==> will be seen only if u defined nested classes . but the outer one cannot be static only the inner can be!!,to reach to that inner class we define "theouter.inner obj = new theouter.inner()"



* */