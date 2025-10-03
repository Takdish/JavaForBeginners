
import java.util.Scanner;

public class calculator_Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking a numbers as input
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble(); 

        // Taking operator input
        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Taking a numbers as input.
        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double result = 0; //value rakh rahe hai,isiliye zero

        // Using switch case to perform operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) { // Prevent division by zero
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
                return; // Exit the program
        }

        // Displaying the result
        System.out.println("Result: " + result);

        scanner.close(); // Close scanner to prevent resource leak
    }
}
