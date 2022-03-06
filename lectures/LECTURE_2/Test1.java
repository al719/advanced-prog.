package LECTURE_2;


/**The default value of a data field is null for a 
reference type, 0 for a numeric type, false for a 
boolean type, and '\u0000' for a char type. 
However, Java assigns no default value to a local 
variable inside a method. */



public class Test1 {
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("name? " + student.name); 
        System.out.println("age? " + student.age); 
        System.out.println("isScienceMajor? " + student.isScienceMajor); 
        System.out.println("gender? " + student.gender); 
    }
}


class Student {
    String name; // name has default value null
    int age; // age has default value 0
    boolean isScienceMajor; // isScienceMajo has default value false
    char gender; // c has default value '\u0000'
}
