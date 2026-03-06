import java.util.*;;

class Addition {
    void add(int a, int b) {
        System.out.println("sum of 2 no :" + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("sum of 3 no :" + (a + b + c));
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Addition Add = new Addition();
        Add.add(1, 2);
        Add.add(3, 2);
    }
}
