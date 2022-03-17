/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;



/**
 *
 * @author 3laa
 */
public class Vector2D {

    private double x;
    private double y;
    Vector2D(){};
    Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    double getX(){
        return x;
    };
    double getY(){
        return y;
    };
    void setX(double x){
        this.x = x;
    }
    void setY(double y){
        this.y = y;
    }
    double magnitude(){
       return Math.sqrt((x*x)+(y*y));
    }
    double angle(){
        return Math.atan(y/x);
    }
    void print(){
        System.out.println("coordinates format "+x+"i + " + y + "j");
        System.out.println("polar format: " +this.magnitude() + "[" + this.angle() +"]" );
    }
    public Vector2D add(Vector2D otherVector){
        
        this.setX(this.getX()+otherVector.getX()); 
        this.setY(this.getY()+otherVector.getY());
        return this;
       /*
       if i write this previous code means that the access object first values will change 
       simply ---> X = X + y --> this means that i'll change value of X in each time i execute this code
       but the object which is passed not change
       and to avoid changes that may happen to access object we can declare temporary object in add method scope 
       and return it
       */
    }
    public Vector2D add(Vector2D first,Vector2D second){
        /*
        if user care about objects values ,he/she should create temporary object to store value of 
        addition or subtraction of two object
        */
        this.setX(first.getX()+second.getX()); 
        this.setY(first.getY()+second.getY());
        return this;
    }
    
    Vector2D sub(Vector2D otherVector){
       /*
        if user don't care about changing values of his/her access object 
        he/she can use this method
        */
       this.setX(this.getX()-otherVector.getX()); 
       this.setY(this.getY()-otherVector.getY());
       return this;
    }
    public Vector2D sub(Vector2D first,Vector2D second){
        
        this.setX(first.getX()-second.getX()); 
        this.setY(first.getY()-second.getY());
        return this;
    }
}

