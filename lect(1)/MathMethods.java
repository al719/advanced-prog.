/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

import java.util.Random;
/**
 *
 * @author 3laa
 */
public class MathMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        final double PI = 3.145;//constant in java 
        int x = 3;
        int y = 4;
        int z =5;
        System.out.print(x*y);// '*' --> multiplication
        System.out.println(x/y);// '/' division
        System.out.println(x+y-z);// addition & sutraction
        System.out.println(x^y);// xor
        System.out.println(x%y);// '%' for reminder
        // remember 5/2 --> int/int [result will be int] 5/2 --> 2
        //5.0/2 --> 5.0 is float so float/int --> result will be float 5.0/2 = 2.5
        System.out.println(5.0/2);
        System.out.println((float)x/y);//tybe casting
        //-------------------------------------------------------
        //Math methods
        System.out.println(Math.abs(z));//absolute value
        System.out.println(Math.exp(1));//returns euler's number 'e'
        System.out.print(Math.sqrt(y));// returns square root
        System.out.println(Math.pow(2, 3));// 2 to the power 3
        System.out.println(Math.acos(.5));// returns 60 degrees or PI/3 radian
        System.out.println(Math.ceil(2.3));//round up to the next number
        System.out.println(Math.floor(2.7));//round down to the previous number
        System.out.println(Math.round(2.4));//normal approximation
        System.out.print(Math.rint(2.9));//like round but returns double value
        System.out.println(Math.random()*10);//Returns a random integer between 0 and 9.
        Random random = new Random();//you must import random library to use this method
        System.out.println(random.nextInt(10));//random value between 0 & 9
    }
}
