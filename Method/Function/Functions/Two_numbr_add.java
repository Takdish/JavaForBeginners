package Method.Function.Functions;

import java.util.Scanner;

public class Two_numbr_add {
    public static int addTwoNumber(int a, int b) {
        return a + b;
    }

    public static int calculateProduct(int c, int d) {
        return c * d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of  b: ");
        int b = sc.nextInt();
        System.out.print("The sum of a and b is : " + addTwoNumber(a, b));

        System.out.println("\n");

        System.out.print("enter the value of c :");
        int c = sc.nextInt();
        System.out.print("enter the value of d :");
        int d = sc.nextInt();
        System.out.println("The product of 2 number is : " + calculateProduct(c, d));

        sc.close();
    }
}
