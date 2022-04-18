// 1. Make class A abstract.
abstract class A {
    public void f1() {
        System.out.println("A.f1 called");
    }

    public final void f2() {
        System.out.println("A.f2 called");
    }

    public abstract void f3();
}

class B extends A {
    public void f1() {
        super.f1();
        System.out.println("B.f1 called");
    }

    // 2. Remove f2() override from class B.

    public void f3() {
        System.out.println("B.f3 called");
    }
}

class C extends A {
    public void f1() {
        super.f1();
        System.out.println("C.f1 called");
    }

    // 3. Override f3 in class C.
    public void f3() {
        System.out.println("C.f3 called");
    }
}

abstract class D extends C {
    public void f3() {
        System.out.println("D.f3 called");
    }
}

final class E extends D {
}

// 4. Class F can't extend final class E. Delete F.

public class Lab5Pb1 {
    public static void main(String[] args) {
        // 5. new A(), new D(), and new F() should be removed.
        A[] ps = new A[3];
        ps[0] = new B();
        ps[1] = new C();
        ps[2] = new E();
        for (int i = 0; i < ps.length; i++) {
            ps[i].f1();
            ps[i].f2();
            ps[i].f3();
            System.out.println("_________________");
        }
        // Output
        // A.f1 called
        // B.f1 called
        // A.f2 called
        // B.f3 called
        // _________________
        // A.f1 called
        // C.f1 called
        // A.f2 called
        // C.f3 called
        // _________________
        // A.f1 called
        // C.f1 called
        // A.f2 called
        // D.f3 called
        // _________________
    }
}
