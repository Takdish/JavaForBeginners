package Method;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) { // jab tak wo number 0 nah ho jaye
            int lastNumber = n % 10;
            sum += lastNumber;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
