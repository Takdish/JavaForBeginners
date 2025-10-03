package Method;

import java.util.Scanner;

public class Palinodom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time you want");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int original = n;
            int ans = 0;
            while (n != 0) {
                // attension
                int lastDig = n % 10;
                ans = ans * 10 + lastDig;
                n = n / 10;
            }
            if (original == ans) {
                System.out.println("palindom");
            } else {
                System.out.println("not a palindom");
            }
            t--;
        }
    }
}
