package chapters;
//-----------------------------------------------------------------
class A{
    int x,y,z;
    public A(){
        System.out.println("No-args A");
    }
    public A(int x, int y , int z){
        System.out.println("args- A");
    }
    protected void fun(){
        System.out.println("fun-A");
    }
    public void f1(){

    }
}
class B extends A{
    public B(){
//       super();//valid,but actually the compiler do it implicitly !!
//        A(); inValid to invoke constructor of the superClass directly without using super keyword
    }
    public B(int x, int y , int z){
        super(x,y,z);
        System.out.println("args B");
    }
    public B(int x , int y){
        System.out.println("args2- B");
    }

    @Override
    public void fun(){
        System.out.println("fun B");
    }
//    @Override
//    protected void f1(){-> error
//
//    }

}
//-----------------------------------------------------------------
//try to compile this block of code!!!
//class Test {
//    public static void main(String[] args) {
//        new Person().printPerson();
//        new student().printPerson();
//    }
//}
//class student extends Person {
//    @Override
//    public String getInfo() {
//        return "Student";
//    }
//}
//class Person {
//    public String getInfo() {
//        return "Person";
//    }
//    public void printPerson() {
//        System.out.println(getInfo());
//    }
//}
//-----------------------------------------------------------------
//try to compile this block of code!!!
//class Test {
//    public static void main(String[] args) {
//        new Person().printPerson();
//        new student().printPerson();
//    }
//}
//class student extends Person {
//    private String getInfo() {
//        return "Student";
//    }
//}
//class Person {
//    private String getInfo() {
//        return "Person";
//    }
//    public void printPerson() {
//        System.out.println(getInfo());
//    }
//}
//-----------------------------------------------------------------
//what is the outPut ?!
//class Test {
//    public static void main(String[] args) {
//        new a();
//        new b();
//    }
//}
//class a {
//    int i = 7;
//    public a() {
//        setI(20);
//        System.out.println("i from A is " + i);
//    }
//    public void setI(int i) {
//        this.i = 2 * i;
//    }
//}
//class b extends a {
//    public b() {
//        System.out.println("i from B is " + i);
//    }
//    public void setI(int i) {
//        this.i = 3 * i;
//    }
//}

//-----------------------------------------------------------------
public class Chapter11 {
    public static void main(String [] args){
        System.out.println("السلام عليكم :)");
        System.out.println("لا تنسوني من صالح دعائكم");
        B b= new B(1,2);

//       Can this happen?
//        Object []ob = new Object[50];
//        Object []ob1 = new int[50];
//        Object []ob2 = new Integer[50];
//        Object []ob3 = new String[50];

        Integer[] list1 = {12, 24, 55, 1};
        Double[] list2 = {12.4, 24.0, 55.2, 1.0};
        int[] list3 = {1, 2, 3};
        printArray(list1);
        printArray(list2);
//        printArray(list3); Error?!
//        A a = new Object(); Error we have to make casting

//        run this code
//        Object a1 = new A();
//        Object a= (A)a1;
    }
    public static void printArray(Object[] list){
        for(Object o : list){
            System.out.println(o+" ");
        }
        System.out.println();
    }


}
/*Main Points
    0) check out the main concepts of the OOP
        1. Data Abstraction.
        2. Encapsulation.
        3. Information Hiding.
        4. Polymorphism.
        5. Inheritance.
        6. Reusability

    1)##Inheritance##
        $define new classes from existing classes. and inherit some of its properties,these properties are controlled by the superClass

        $we can use this principle to gather all classes those have common features to make them belong to a parent class
            and avoid redundancy and make system maintained!!

        $SuperClass,parentClass or baseClass: Has the general features (دا البابا)

        $subClass,childClass, extendedClass or derivedClass: can be special or specific case of the SuperClass (car is a vehicle)!! ==> Vehicle is the superClass && car is specific purpose of the superClass

        $UML : A triangular arrow pointing to the superclass is used to denote the inheritance relationship between the two classes involved

        $A subclass inherits accessible data fields and methods from its superclass and may also add new data fields and methods

        $UML Note: parent Class must be placed in the top and child class under it!!

        $Syntax: public class Circle extends GeometricObject

        $In fact, a subclass usually contains more information and methods than its superclass

        $Private data fields in a superclass are not accessible outside the class. Therefore,
            they cannot be used directly in a subclass. They can, however, be accessed/mutated
            through public accessors/mutators if defined in the superclass.

        $Inheritance is used to model the is-a relationship. Do not blindly extend a class just for the sake of reusing methods.
            Ex.it makes no sense for a Tree class to
                extend a Person class, even though they share common properties such as height
                and weight. A subclass and its superclass must have the (is-a relationship)

        $No Multiple Inheritance:: Java is provided only the single inheritance which means that the subClass can only inherit from one SuperClass!!

        $(T/F)==> A subclass is a subset of a superclass. (F)  a subclass usually contains more information and methods than its superclass

        $Super Keyword:: refers to the superclass and can be used to invoke the superclass’s methods and constructors.

        $Constructors of superClass is not inherited!. They can only be invoked from the constructors of the subclasses using the keyword super.

        $Syntax:: super(), or super(parameters);
            super(): invokes the no-args constructor
            super(parameters): invokes the  superclass constructor that matches the arguments
            Imp. Note: super keyword must be written first on the method or constructors of the subClass!!!!
            Invoking a superclass constructor’s name in a subclass causes a syntax error.

        $A constructor may invoke an overloaded constructor or its superclass constructor
            If neither
            is invoked explicitly, the compiler automatically puts super() as the first statement in the
            constructor

        $###constructor chaining.###
            When constructing an object of a subclass
            1) the subclass constructor first invokes its superclass constructor before performing its own tasks
            2) If the superclass is derived from another class ?
                2.1) the superclass constructor invokes its parent-class constructor before performing its own tasks.

            3...) this process continues until the last constructor along the inheritance hierarchy is called.

        $###Note::
            If a class is designed to be extended, it is better to provide a no-arg constructor to avoid
            programming errors

        $$ Design Guide:
             If possible, you should provide a no-arg constructor for every class to make the class
             easy to extend and to avoid errors.

        $$ (T/F)==> When invoking a constructor from a subclass, its superclass’s no-arg constructor is always invoked.? F
                Why!!!!. by default the subClass will invoke the no-args constructor of the superClass until you explicitly use super Keyword and invoke a specific constructor! go up ,check the Ex.

        ## Overriding Methods ##
            0) Means to provide a new implementation for method in the subClass!

            1) to override methode:
                that method must be defined in the superClass && be public && written in the subClass using the same signature and same return type as in its superClass!!

            2) why using override methods?
               Sometimes it is necessary for the subclass to modify the implementation of a method defined in the superclass
               and make the code more reusable

            3) super.super.toString()?? can it be done ?! No,This is a syntax error.

            4) a private method cannot be overridden:
                If a method defined in a subclass is private in its superclass, the two methods are completely unrelated

            5) static methods can be inherited but cannot be overridden!!

            6) How do you invoke an overridden superclass method from a subclass? using the super keyword + .overriddenMethode()

            7)##Overloading##
                Means to define multiple methods with the same name but different in signatures!!

            8) ■ Overridden methods are in different classes related by inheritance; overloaded methods
                    can be either in the same class or different classes related by inheritance.
                ■ Overridden methods have the same signature and return type; overloaded methods
                    have the same name but a different parameter list.

            9) @Override annotation:: to tell the compiler that method is overridden To avoid mistakes


        $$ Every class in java is inherited from Object class and can not change that!
            .toString()==> returns the details of the object
            if you don't inherit this method in your class and tried to call it ,it will return the address of the object in memory
            so you can override this method from Object class and use it


    2)##Polymorphism##:
        $ Polymorphism means that a variable of a supertype can refer to a subtype object. versa vice can not be done!!
            1) A class defines a type && a subclass is called a subtype && superclass is called supertype
            2) you can say Circle is a subtype of GeometricObject
                and GeometricObject is a supertype for Circle.
            3) every instance of a subclass is also an instance of its superclass, but not vice versa
            4) every circle is a geometric object, but not every geometric object is a circle!!
            5) you can always pass an instance of a subclass to a parameter of its superclass type.
            6) q-> الاب يقدر يشاور على ابناءه العكس ماينفعش

        $ Dynamic Binding:
            1) A method can be implemented in several classes along the inheritance chain. The JVM
                decides which method is invoked at runtime.
        $###matching vs. binding####
           The declared type of the reference variable decides which method to match at compile time.
           The compiler finds a matching method according to the parameter type, number of parameters, and order of the parameters at compile time
           The JVM dynamically binds the implementation of the method at runtime, decided by the actual type of the variable.


    3)##Casting && instanceof##
        One object reference can be typecast into another object reference

        $ Implicit casting: Object o = new Student();legal because an instance of Student is an instance of Object.
        $but if we want to do this -> Student b = o;this is illegal!! we have to make casting which is called (Explicit Casting)
            The reason here because instance of Student will be always instance of the Object class ,but versa vice is not necessary, so we have to tell the compiler Explicitly!!
            So we have to do this ->  Student b = (Student)o;--> Explicit casting

        $ Upcasting -> الكبير بيشاور على الصغير ودا العادى
            It is always possible to cast an instance of a subclass to a variable of a superclass

        $ Down casting -> انك تعرف الكومبايلر ان الكبير دا الصغير وارث منه ف اعمل الكاستنج
            casting an instance of a superclass to a variable of its subclass
            explicit casting must be used to confirm your intention to the compiler

            ClassCastException: طب ايه اللى هيحصل لو عملنا كاستنج عمياني من غير ما نتاكد ان الكبير دا الصغير وراث منه هنبلع ايرور دا لو طلع مافيش وراثه
            so we have to use instanceof operator!!
            if (myObject instanceof Circle)---> Check if myObject is an instance of Circle

            1) we make casting to access methods in the subClass safely with no error
                Object myObject = new Circle();
                myObject.getDiameter()
                /// this code will give an error due to Object class does not have getDiameter() method ,so we have to make casting
                Why don't we define it at first with no need for casting!!!!!!!!!!!!
                    To enable generic programming, it is a good practice to define a variable with a supertype, which can accept an object of any subtype.

            2) The object member access operator (.) precedes the casting operator. Use parentheses
                to ensure that casting is done before the dot operator, as in
                        ((Circle)object).getArea();
            3) Casting can be done only when the source object(when we create it, we make it point to the needed class) is an instance of the target class

            4) Casting a primitive type VS casting an object reference
                Casting a primitive : returns a new value
                casting an object reference: No new object is created

            ■ You can always successfully cast an instance of a subclass to a superclass.? True implicit casting
            ■ You can always successfully cast an instance of a superclass to a subclass.? false explicit casting


    4) equals Method:
       You should override this method in your custom class to test whether two
        distinct objects have the same content.

        the equals method is incorrectly written as equals(Circle circle) it should be generic like this:
            equals(Object circle) && do explicit casting

   5) Visibility increases in this order. private -> default (no modifier) -> protected -> public
        Note:
        A subclass may override a protected method defined in its superclass and change its
        visibility to public. However, a subclass cannot weaken the accessibility of a method
        defined in the superclass. For example, if a method is defined as public in the superclass,
        it must be defined as public in the subclass. يعنى نقدر نزودها لكن مانقدرش نضعفها

    6) preventing Extending or overriding::
        Final class : to prevent classes from being extended use
        the final modifier to indicate that a class is final and cannot be a parent class

    7) public, protected, private, static, abstract, and final are used on classes and class members (data and methods)
        Expect final modifier can also be used on local variables in a method

* */
