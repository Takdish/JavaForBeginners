// more better, professionally code , scalable
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + " make sound " + "at the age of " + this.age;
    }
}

public class example2 extends Animal {
    example2(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        example2 eg = new example2("Doggesh bhai", 21);
        example2 eg2 = new example2("boss", 21);
        example2[] Example = { eg, eg2 };
        for (example2 ex : Example) {
            System.out.println(ex);
        }
    }
}
