
import java.util.Scanner;

public class inputFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt(); 
        System.out.print("The number is : " +  a);
    }
}