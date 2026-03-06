// package InHeritance;

import java.util.*;

class A {
    void showA() {
        System.out.println("a class show");
    }
}

class Single_Type extends A {
    void showB() {
        System.out.println("b class show");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();
        Single_Type obj2 = new Single_Type(); // khud ko + class A ka bhi properties use
        System.out.println("-----------------");
        obj2.showA();
        obj2.showB();
    }
}
