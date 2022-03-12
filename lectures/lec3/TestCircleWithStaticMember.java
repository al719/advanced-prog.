/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec3;

/**
 *
 * @author Engrs
 */
public class TestCircleWithStaticMember {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Before creating objects");
        System.out.println("The number of Circles object is " + CircleWithStaticMember.numberOfObjects);
         
        CircleWithStaticMember c1 = new CircleWithStaticMember();
        System.out.println("\n After creating c1");
        System.out.println("c1: raduis (" + c1.raduis +") and number of Circle objects (" + c1.numberOfObjects + ")");
        
        
        CircleWithStaticMember c2 = new CircleWithStaticMember(5);
         
        
        //Modify c1
        c1.raduis = 9;
        
        //Display c1 and c2 After c2 was created
        System.out.println("/n After craeting c2 and modify c1");
        System.out.println("Before creating objects");
        System.out.println("c1: raduis (" + c1.raduis +") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c1: raduis (" + c2.raduis +") and number of Circle objects (" +CircleWithStaticMember.numberOfObjects + ")");


        
        
        
//        CircleWithStaticMember c1 =  new CircleWithStaticMember(5);
        
    }
    
}


