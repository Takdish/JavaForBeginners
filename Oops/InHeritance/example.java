// package InHeritance;

class Animal {
    String name;
    int age;

    public String toString() {
        return this.name + " IS-A " + this.age + " year old ";
    }
}

class example extends Animal {

    example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String arg[]) {
        example d = new example("Dogesh bhai", 21);
        System.out.println(d); // automatically call .toString();

    }
}
