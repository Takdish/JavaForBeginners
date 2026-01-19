package Method;

import java.util.Scanner;

public class Even_odd_withoutModulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        while (a >= 2) {
            a = a - 2;
        }
        if (a == 1) {
            System.out.print("The number is even");
        } else {
            System.out.print("The number is odd");
        }
    }
}
