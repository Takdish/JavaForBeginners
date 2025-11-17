package Oops;

/*
/*Constructor in java is a special type  of --METHOD-- that is used to ---INITIALIZE THE OBJECT---
 * constructor name must be same as its --CLASS NAME--
 * must have no explicit --RETURN TYPE--
 * every class has a constructor called --default Constructor..
 */
class Student {
    // variable

    String name;

    //// constructor:same name as class, no return type
    Student() {
        name = "Takdish";
        System.out.println("constructor called");
    }

    // to display, create method
    void display() {
        System.out.println(name);
    }
}

public class constructor01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // Constructor get call here automatically class--object.
        s1.display(); // method call...
    }
}
