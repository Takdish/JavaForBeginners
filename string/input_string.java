package string;

import java.util.Scanner;

public class input_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println(name);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your full name:");
        String nameFull = sc2.nextLine();
        char letter = sc2.next().charAt(0);

        System.out.println("You are: " + nameFull);
    }
}
