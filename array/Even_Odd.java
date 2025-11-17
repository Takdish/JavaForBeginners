
import java.util.Scanner;

public class Even_Odd {
    static void EvenODD(int n) {
        if (n % 2 == 0) {
            System.out.println("Even " + n);
        } else {
            System.out.println("Odd " + n);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 25; i++) {
            EvenODD(i);
        }
    }
}
