package Method;

import java.util.Scanner;

public class permutation {
    public static int factorial(int x) {
        int xFact = 1;
        for (int i = 1; i <= x; i++) {
            xFact *= i;
        }
        return xFact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the val of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the val of r : ");
        int r = sc.nextInt();

        int nPr = factorial(n) / factorial(n - r);
        System.out.print("The combination of nPr = " + nPr);
    }
}
