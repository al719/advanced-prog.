package chapters;

import javax.xml.bind.annotation.XmlType;

/*Objectives CHAPTER10
    ■ To apply class abstraction to develop software
    ■ To explore the differences between the procedural paradigm and
        object-oriented paradigm
    ■ To discover the relationships between classes
-----------------------------------------------------------------------------
    ■ To design programs using the object-oriented paradigm
    ■ To create objects for primitive values using the wrapper classes (Byte,
        Short, Integer, Long, Float, Double, Character, and Boolean)
    ■ To simplify programming using automatic conversion between
        primitive types and wrapper class types
    ■ To use the BigInteger and BigDecimal classes for computing very
        large numbers with arbitrary precisions
    ■ To use the String class to process immutable strings
    ■ To use the StringBuilder and StringBuffer classes to process
        mutable strings

* */
public class Chapter10 {

    public static void main(String[]args){
        System.out.println("السلام عليكم :)");
        System.out.println("لا تنسوني من صالح دعائكم");
        StackOfInteger st = new StackOfInteger();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.getSize());
        while (!st.isEmpty()){
            System.out.println(st.peek());//4,3,2,1
            st.pop();
        }
        System.out.println(st.getSize());





//      Interned Strings Ex.
//        String s = new String("ahmed");
//        String s2 = new String("ahmed");
//        System.out.println(s==s2);//(false)they are not the same
//        String n1 = "a";
//        String n2 = "a";
//        System.out.println(n1==n2);// (true)they are pointing to the same location

        String s1 = "Welcome to Java";
        String s2 = s1.replace("o", "abc");
        System.out.println(s1);
        System.out.println(s2);

//        what is the output?
//        System.out.println("Hi, ABC, good".matches("ABC "));
//        System.out.println("Hi, ABC, good".matches(".*ABC.*"));
//        System.out.println("A,B;C".replaceAll(",;", "#"));
//        System.out.println("A,B;C".replaceAll("[,;]", "#"));
//        String[] tokens = "A,B;C".split("[,;]");
//        for (int i = 0; i < tokens.length; i++)
//            System.out.print(tokens[i] + " ");
//        Split methods ex.
//        String[] tokens = "Java#HTML#Perl".split("#");
//        for (int i = 0; i < tokens.length; i++)
//            System.out.print(tokens[i] + " ");Java HTML Perl


//        java.math.BigInteger x = new java.math.BigInteger("3");
//        java.math.BigInteger y = new java.math.BigInteger("7");
//        java.math.BigInteger z = x.add(y);
//        System.out.println("x is " + x);3
//        System.out.println("y is " + y);7
//        System.out.println("z is " + z);10

//         Integer x = 3 + new Integer(5);// autoboxing
//         System.out.println(x);
//         Integer x = 3;//autoboxing
//         Double x = 3;//error can be fixed by 3.0 || Double.valueOf(3)
//         Double x = 3.0;//auto
//         int x = new Integer(3); unboxing
//         int x = new Integer(3) + new Integer(4); unboxing

//        Double x = 3.5;
//        System.out.println(x.intValue());//3
//        System.out.println(x.compareTo(4.5));//-1
    }
}

class Student{
    private String name;
    private int age;
    private String email;
    private String id;
    private Course[] takenCourses; // many relationship
    private static int top;
    // let's say capacity  = 6
    private int capacity;
    public Student(){
        this("none","none","none",0);
        this.capacity = 6;
        this.takenCourses = new Course[capacity];
        Student.top = -1;

    }
    public Student(String name,String email , String id , int age){
        this.name = name;
        this.id = id;
        this.age = age;
        this.email = email;
        this.capacity = 6;
        this.takenCourses = new Course[capacity];
        this.top = -1;
    }
    public void addCourse(Course c){
        top++;
        if(top < capacity){
            takenCourses[top] = c;
        }
        else{
            System.out.println("Can't add more courses!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Course[] getTakenCourses(){
        return  takenCourses;
    }

}
class Course{
    // Each course should have list of registered  students 5->60
    // Each course could only have one member 1
    //
    private String id,name;
    private Student[] registeredStudents;
    private FacultyMember teacher;
    private static int top;
    private int capacity;// max 60 students!!
    public Course(){
        this("OOP","CSE211",new FacultyMember());
        Course.top = -1;
        this.capacity = 60;
    }
    public Course(String name ,String id , FacultyMember teacher ){
        Course.top = -1;
        this.name = name;
        this.id = id;
        this.teacher = teacher;
        this.capacity = 60;
    }
    public void addStudent(Student s){
        top++;
        if(top < capacity){
            registeredStudents[top] = s;
        }
        else{
            System.out.println("No available sections!!");
        }
    }
    private int getTop(){return top;}
    public boolean checkCourseToOpen(){
        return (getTop() < 5) ? false:true;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getRegisteredStudents() {
        return registeredStudents;
    }

    public FacultyMember getTeacher() {
        return teacher;
    }

    public void setTeacher(FacultyMember teacher) {
        this.teacher = teacher;
    }
}
class FacultyMember{
    // Each member should have list of Courses [0->3]
    private int capacity;
    private Course[] TaughtCourses;
    public FacultyMember(){
        this.capacity = 3;
        this.TaughtCourses = new Course[capacity];
    }
    public void addCourse(){
        System.out.println("Added");
    }

}
class StackOfInteger{
    private int[] elements;
    private static int top;
    private int capacity;
    private final static int DEFAULT_CAPACITY =16;
    static {
        top = -1;
    }
    public StackOfInteger(){
        this.capacity = DEFAULT_CAPACITY;
        this.elements = new int[capacity];
    }
    public StackOfInteger(int capacity){
        this.capacity = capacity;
        this.elements = new int[capacity];

    }
    public boolean isEmpty(){
        return (top == -1)? true:false;
    }

    public int peek(){
        return elements[top];
    }
    public void push(int element){
        StackOfInteger.top++;
        if(top < capacity){
            this.elements[top] = element;
        }
        else{
            System.out.println("Full!!");
        }
    }
    public void pop(){
        top--;
    }
    public int getSize(){
        return top+1;
    }
}
/*Main Points::
    1) Class Abstraction and Encapsulation:
        Class abstraction is the separation of class implementation from the use of a class.
        The details of implementation are encapsulated and hidden from the user. This is
        known as class encapsulation.

    2) procedural paradigm VS The object-oriented paradigm:
        The procedural paradigm: focuses on designing methods
        The object-oriented paradigm: couples data and methods together into objects
        Software design using the object-oriented paradigm focuses on objects and operations on objects.

    3) Class Relationships:
        3.1) association, (has a) .. Relationship
        3.2) aggregation, (has a) .. Relationship
        3.3) composition. (part of) .. Relationship
        3.4) inheritance (IS a) .. Relationship
    3'') Association
            ■ User borrows a book
            ■ User add_item to shopping cart
        ○ Aggregation
            ■ Department has employees
        ○ Composition
            ■ Car has an engine / wheels
            ■ University has departments
        ○ Generalization (Inheritance)
            ■ Circle is a shape
            ■ Bicycle is a vehicle
    4) multiplicity: which is placed at the
        side of the class to specify how many of the class’s objects are involved in the relationship in UML.

    5) The association relations are implemented using data fields and methods in classes.

    6) UML for Association relationship(solid line) ==>   [Student](5-60)------------------(*)[Courses](0-3)--------------------(1)[FacultyMember]
        How to read it ?!
        1) Each student could register for many courses(*)
        2) Each course should hae al least 5 students to open and max 60 students
        3) Each facultyMember could teach from 0-3 courses at a time!
        4) Each course could have been taught by only one FacultyMember (1)

    7)::Composition:: a filled diamond is attached to an aggregating to denote the composition relationship with an aggregated class.
        ● A car has an engine
            ○ Engine has no value to be used independently!
                ■ If used, then by a car
            ○ Same for wheels
        ● A room has walls / ceiling / floor
            ○ If there is a used wall, it must be in a specific room

        ● It is a strong “has a” relationship (consists of)
            ○ Whole vs Part relationship, but strong (ownership)
            ○ The whole creates/destroys the parts.
                ■ Car object creates engine/wheel objects
            ○ Part is used only by the whole
                ■ The engine is not shared between 2 cars
            ○ The part has no life of itself
                ■ If a university is closed, no departments anymore!!
        ● Composition allows reuseability

        ● The composition relations are implemented using data fields in classes.

    8)::Aggregation:: an empty diamond is attached to an aggregating class to denote the aggregation relationship with an aggregated class.
        It is a weak “has a” relationship
            ○ Whole vs Part relationship, but weak (no ownership)
            ■ E.g. Department has professors. If department is shutdown, they are still ==> professors/exist
        ○ Whole class or some other class can create the part object
        ○ If whole object is destroyed, the part may still be in use by others
        ● Aggregation may exist between objects of the same class. For example, a person may have a supervisor

    9)::Inheritance(Generalization)::
        ● It represents Is-a relationship
        ● Student is-a person. Teacher is-a person. Dean is-a person
            ○ So some common variables/functions + some unique variables/functions
        ● Circle is-a shape.
            ○ Rectangle is-a shape. Triangle is-a shape.
        ● Software Engineer is-an employee.
            ○ Manager is-an employee.
            ○ Office Boy is-an employee
        ● Apple is-a fruit. Orange is-a fruit. Watermelon is-a fruit
        ● (Wagon / Bicycle / Motor vehicle / Railed vehicle) is-a vehicle

    10) Multiplicity
        ● One-to-one Associations
            ○ Each citizen has a single national ID
        ● One-to-many Associations
            ○ Car class has 4 wheels
            ○ Customer has Bank Account(s)
        ● Many-to-many Associations
            ○ Student has List<courses>
            ○ Course has List<students>

    11) Note : Since aggregation and composition relationships are represented using classes in the
               same way, we will not differentiate them and call both compositions for simplicity.

    12) Wrapper classes:
        12.1) You can construct a wrapper object either from a primitive data type value or from a string
               representing the numeric value
        12.2) The wrapper classes do not have no-arg constructors
        12.3) The instances of all wrapper classes are immutable (once you create instance giving it initial value, you can't change its value!!
        12.4) wrapper class has the constants MAX_VALUE and MIN_VALUE. MAX_VALUE
              limits of corresponding primitive data type
        12.5) Each numeric wrapper class contains the methods (primitiveValue Ex. doubleValue()) to return primitive data type from the wrapper!!
        12.6) wrapper1.compareTo(wrapper2)==> returns 1 if wrapper1 > wrapper2 |||| 0 if wrapper1 = wrapper2 |||| -1 if wrapper1 < wrapper2
        12.7) valueOf (String s).==> This method creates a new object initialized to the value represented by the specified string
        12.7) parse==> convert String to numeric value Ex. parseInt(String s) || parseDouble(String s)...etc
        12.8) parse(String,radix)==> overloaded to covert string to the numeric value with base radix can be 10 decimal || 8 octal|| 16 hexa || 2 binary
              Ex. Integer.parseInt("11", 2) returns 3;
                  Integer.parseInt("12", 2)==> Exception Error!!
        12.9) String.format("%x", 26) returns 1A; we can use static method format to convert between number systems' representation of the value  %x

    13)###BOXING##:::
        Converting a primitive value to a wrapper object is called boxing
        reverse conversion is called unboxing!!
        Java allows primitive types and wrapper classes to be converted automatically (autoboxing and autounboxing)
        Ex. Integer x = new Integer(3) =======Eqv===== Integer x = 3 (autoBoxing)

    14) BigInteger && BigDecimal classes:
        can be used to represent integers or decimal numbers of any size and precision.
        both are immutable
        14.1) can create objects from those classes like that new BigInteger(String) and new BigDecimal(String)
        14.2) arithmetic operation => use the add, subtract, multiply, divide, and remainder methods
        14.3) There is no limit to the precision of a BigDecimal object. The divide method may throw
               an ArithmeticException if the result cannot be terminated
        14.4) you can use the
                overloaded divide(BigDecimal d, int scale, int roundingMode) method to specify
                a scale and a rounding mode to avoid this exception, where scale is the maximum number
                of digits after the decimal point.


    15)::Strings::
        methods(IMP):
        charAt(index)==> returns the character at the specific idx!!
        length()==> returns the length of the string!! piece of cake:)
        substring()==> slicing
        indexOf(char || substring)==> returns the first index of the character or substring
        lastIndexOf(char || substring) ==> returns the last index of the character or substring
       15.1) convert character of array to string we can pass the array as an args of constructor when create the string
                 String message = new String(charArray);

       15.2) Immutable Strings && Interned Strings.
             Strings are immutable if we want to do modification we actually create new string of the new modification and assign its ref. to the variable!! which will reserve a space on the memory

             Interned strings ==> Strings that have been created by the same way(without using new operator!!!) and have the same contents will point to the same location

       15.3) Replacing and Splitting Strings
             Once a string is created, its contents cannot be changed. The methods replace,
             replaceFirst, and replaceAll return a new string derived from the original string
             (without changing the original string!).
       15.4) split("#" || " ")==> returns array of splited strings with

    16) Matching, Replacing and Splitting by Patterns
        in strings equals method is equivalent to matches, but the last one is more powerful!
        equals can compare between fixed strings but matches can check if a string is a pattern of another one
        "Java is fun".matches("Java.*")==> true
        "Java is cool".matches("Java.*")===> true
        "Java is powerful".matches("Java.*") ==> true
        here he checks if the string is started with Java and ignore the rest!!

        16.1) replaceAll(delimiter,sub)==> delimiter can be a punch of characters if you found any of them just replace it with (sub)
              Ex. ==>   String s = "a+b$#c".replaceAll("[$+#]", "NNN");==> (aNNNbNNNNNNc)
                        System.out.println(s); will search for($,+ or #) and replace all o them with NNN


       16.2) String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
             will split if he found any of these characters (.,:;?)
             tokens[0] = "Java"
             tokens[1] = "C"
             tokens[2] = "C#"
             tokens[3] = "C++"


       16.3) convert string to array of character using .toCharArray() method

       16.4) slicing string from specific Stridx -> EndIdx
             source.getChars(startIdx,EndIdx,distension,startIdxInDistension)
             char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
             "CS3720".getChars(2, 6, dst, 4);
             dst==> {'J', 'A', 'V', 'A', '3', '7', '2', '0'}.


       16.5) to convert array of character to string use String(array) || String.valueOf(array)

       16.6) look at the reference for StringBuilder && StringBuffer!!

* */
