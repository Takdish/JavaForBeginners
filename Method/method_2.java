package Method;

public class method_2 {
    public static void greet(char name) {
        System.out.println("Hello" + " " + name);
    }

    public static void sum(int a, int b) {
        System.out.println("sum is : " + (a + b));

    }

    public static void intro(String name2, int age) {
        System.out.println("Hello " + name2 + "your age is " + age);
    }

    public static void student(String name3, int semester, int age, double grade) {
        System.out.println("hello " + name3 + "You are in " + semester + "nd sem" + "\n" + "your age is : " + age + "\n"
                + "Your grade : " + grade);
    }

    public static void main(String[] args) {
        greet('t');
        greet('f');
        System.out.println();
        intro("takdish, ", 20);
        intro("faisal, ", 19);
        intro("Faizan, ", 20);
        System.out.println();
        student("takdish ", 2, 29, 65.43);
        System.out.println();
        student("faizan", 2, 20, 65.77);
        System.out.println();
        sum(19, 1);

        // System.out.println(greet);
    }
}
