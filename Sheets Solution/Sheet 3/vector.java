package com.example.point2d;

    import java.util.Scanner;
    public class vector {
        private double x;
        private double y;

        public vector (){
        }

        public  vector (double x, double y){
            this.x = x;
            this.y = y;
            //return x;
        }
        public double getX(){
            return x;
        }
        public double getY(){
            return y;
        }
        public void setX(double x)
        {
            this.x= x;

        }
        public void setY(double y)
        {
            this.y = y;
        }
        public double magnitude()
        {
            return Math.sqrt((x*x) + (y*y));
        }
        public double angle(){
            return Math.atan(y/x);
        }
        public void print(){
            System.out.println(x+"i" + "+" +y+"j");
            System.out.println(Math.atan(y/x));

        }
        public vector addvector(vector v1,vector v2){
            vector result= new vector();
            result.x = v1.x + v2.x;
            result.y = v1.y + v2.y;
            return result;
        }
        public static vector subvector(vector v1,vector v2){
            vector result= new vector();
            result.x = v1.x - v2.x;
            result.y = v1.y - v2.y;
            return result;
        }
        public void read(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter x coordinate ");
            this.setX(sc.nextDouble());
            System.out.println("Please enter y coordinate ");
            this.setY(sc.nextDouble());

        }
    }

