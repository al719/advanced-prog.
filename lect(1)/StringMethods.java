/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author 3laa
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        String name = "Alaa Salah";
        System.out.println(name.toUpperCase());// make all characters of string to be capital
        System.out.println(name.toLowerCase());// make all characters of string to be Small
        System.out.println(name.length());// length of string
        System.out.println(name.charAt(6));// find character at the index(6) of String
        System.out.println(name.trim());//trim space around[before-start] the String
        System.out.println(name.concat(" haredy"));//to concatenate two strings and simply we can use '+'
        System.out.println(name.substring(4));//drop all characters before index 4
        System.out.println(name.substring(0, 5));//substring(begin index,end index)--> print 
                                                 // print only letters between [0,5]and drop the rest
        System.out.println(name.indexOf('S'));//find the index for a letter in the string
        System.out.println(name.equals("Alaa Salah"));//returns true or false if two strings are equal
                                                      //it is case sensitive
        System.out.println(name.equalsIgnoreCase("alaa salah"));//case insensitive
        System.out.println(name.compareTo("Alaa Salah"));//compare two strings if they are same returns 0
                                                         // if not returns integer [greater or less] than 0
                                                         //it depends on the order of alphabet
                                                         //case sensitive
        System.out.println(name.compareToIgnoreCase("alaa salah"));//case in sensitive
        System.out.println(name.startsWith("Alaa"));//boolean -> true if string start with the input prefix
                                                    //case sensitive
        System.out.println(name.startsWith("Sal", 5));//Tests if the substring of this string beginning at 
                                                      //the specified index starts with the specified prefix.
        
    }
}
