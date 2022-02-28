/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;//to be available for using Scanner class
/**
 *
 * @author 3laa
 */
public class inputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("my name is alaa");//make sure 'S' in system is capital
                                              //you can use System.out.print("");
                                              //in c++ --> cout<<"my name is alaa"<<endl;
        System.out.println("What's your name? ");
        Scanner scanner = new Scanner(System.in);//creating object from class "Scanner"
                                                 //Scanner(class name like data tybe) scanner(object like variable)= new(key word used to create new object) Scanner(name of class)
                                                 //make sure scanner is included with code --> import java.util.Scanner;
       // now you can use object scanner for example scanner.nextint --> is used when user insert integer number
       String name = scanner.next();// getting the name from user and storing it inside variable name
       scanner.next();
       System.out.println("How old are you?");// ask for his/her age
       int age = scanner.nextInt();//getting age and storing it inside variable age
                                   // you can notice that object scanner is used for the second time and it'sn't limited for using it
       System.out.println("your name is "+name);//print your name and using concatenation "+" for join two strings with each other and not only for strings
       System.out.println("you are "+ age+" years old");
    }
}
