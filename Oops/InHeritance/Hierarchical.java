// package InHeritance;

class A {
    void showA() {
        System.out.println("A class");
    }
}

class Hierarchical extends A {
    void showB() {
        System.out.println("B class");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.showA();
        System.out.println("--------");
        Hierarchical obj2 = new Hierarchical();
        obj2.showA();
        obj2.showB();
        System.out.println("--------");
        C obj3 = new C();
        obj3.showA();
        obj3.showC();
    }
}

class C extends A {
    void showC() {
        System.out.println("C class");
    }

}
