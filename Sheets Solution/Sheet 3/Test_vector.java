package com.example.point2d;

public class Test_vector {
    public static void main(String[] args) {
        vector v1 = new vector(7,9);
        vector v2 = new vector(3,4);
        vector v3 = new vector();

        System.out.println(v1.magnitude());
        v1.print(); // print vector in (X i + Y j) form
        System.out.println(v1.angle());
        vector.subvector(v1,v2);  // static method so we call it with class name
        System.out.println(vector.subvector(v1,v2).getX());
        System.out.println(vector.subvector(v1,v2).getY());
        v3.read(); // get value of v3 from user
        v3.print();// print value of v3 n (X i + Y j) form and it's angle
        //System.out.println(v3.magnitude());


    }

    }

