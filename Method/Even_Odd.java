
import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("The number : ");
        System.out.print(a + "\n");
        // if user give a number check,either even or not
        if (a % 2 == 0) {
            System.out.print("is ");
            System.out.println("even");
        } else {
            System.err.println("odd");
        }
    }

}
