// package InHeritance;

// import java.;
// import java.util.Scanner;/
import java.util.*;

class Parent {
    int x = 10;// parent class

    public static void main(String[] args) {
        variable_Super_KeyWord ref = new variable_Super_KeyWord();
        System.out.println(ref); // automatically calls .toString()
    }
}

class variable_Super_KeyWord extends Parent {
    int x = 20;// child class

    @Override
    // why is it necessary to write public behind String
    // ----toString() already exists in the parent class:
    public String toString() {
        return "Child x " + x + "\n" + "Parent x " + super.x;
    }
}
