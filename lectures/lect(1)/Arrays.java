/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 3laa
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String[] cars = {"camaro","corvette","tesla","BMW"};
       
        cars[0] = "mustang";//assign 
        System.out.println(cars[0]);
//--------------------------------------------------------------
     //second method
         String[] cars = new String[3];
         
         cars[0] = "camaro";
         cars[1] = "corvette";
         cars[2] = "Tesla";
         
         for (int i = 0; i < cars.length; i++) {
           System.out.println(cars[i]);//println to make break line after each loop
    //-------------------------------------------------------------------------------------
    //              2D arrays in java
           String[][] cars = {
                                {"Camaro","Corvette","Silverado"},
                                {"Mustang","Ranger","F-150"},
                                {"Ferrari","Lambo","Tesla"}
                             };
           
           /*
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		*/
           for(int i=0; i<cars.length; i++) {
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
                        System.out.println();
		}
           
               
        }
    }

