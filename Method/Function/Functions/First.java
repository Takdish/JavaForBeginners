package Method.Function.Functions;

import java.util.Scanner;

public class First {
    static void printMyName(String name) {
        System.out.println("your name : " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        printMyName(name);

    }
}
