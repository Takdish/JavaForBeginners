// package InHeritance;

import java.util.*;

class A {
    void showA() {
        System.out.println("a class show");
    }
}

class B extends A {
    void showB() {
        System.out.println("B class show");
    }
}

public class MultiLevel_Inhertiance extends B {
    void showC() {
        System.out.println("C class show");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();
        System.out.println("----------------");
        B obj2 = new B();
        obj2.showB();
        obj2.showA();
        System.out.println("-----------------");
        MultiLevel_Inhertiance obj3 = new MultiLevel_Inhertiance();
        obj3.showC();
        obj3.showA();
        obj3.showB();
    }
}
