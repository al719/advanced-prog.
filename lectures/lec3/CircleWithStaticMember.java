/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec3;

/**
 *
 * @author Engrs
 */
public class CircleWithStaticMember {
     double raduis;
    static int numberOfObjects= 0; // number of objects is a static variable shared by all the instances of the class
    
     CircleWithStaticMember (){
        raduis = 1;
        numberOfObjects++;
    }
    /*construct a circle with raduis 1*/
    
    CircleWithStaticMember (double newRaduis){
        raduis = newRaduis;
        numberOfObjects++;
    }
        /*construct a circle with specified raduis*/
     static int getnumberOfObjects(){
        return numberOfObjects; 
        /* if we write here raduis = 5; will give a synatx error bacause the non-static varibles cannot refrenced
         from a static context*/
     }
     double GetArea(){
         return raduis*raduis*Math.PI;
     }
    
    
}
