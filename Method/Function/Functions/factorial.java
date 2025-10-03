package Method.Function.Functions;

import java.util.Scanner;

public class factorial {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid value");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        } // break the loop
        System.out.print("The factorial of n is : " + factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        printFactorial(n); // call
    }
}
