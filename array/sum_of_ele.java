import java.util.Scanner;

public class sum_of_ele {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();
        int sum = 0;
        int[] arr = { 2, 4, 6, 8, 10 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("The sum of arr : " + sum);
    }
}