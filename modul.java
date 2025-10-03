import java.util.Scanner;

public class modul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Single Scanner object

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("The modulus of a and b is: " + (a % b));

        sc.close(); // Close the Scanner to prevent resource leak
    }
}
// This program calculates the modulus of two integers entered by the user.