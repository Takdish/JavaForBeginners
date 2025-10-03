import java.util.*;
import java.util.Scanner;

public class food_Order {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome Sir! What do you want today? ");
        int Food = sc.nextInt(); // user se input lete hain

        int price = 0;
        String selectFood = "";
        switch (Food) {
            case 1:
                selectFood = "pizza";
                price = 10;
                break;
            case 2:
                selectFood = "Coffee";
                price = 5;
                break;
            case 3:
                selectFood = "Burger";
                price = 7;
                break;
            case 4:
                selectFood = "paneer butter masala";
                price = 20;
                break;
            case 5:
                selectFood = "Chicken butter masala";
                price = 22;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("You selected: " + selectFood + "\n");
        System.out.print("How Many Quantity,Do You Want Sir: ");
        int quantity = sc.nextInt();
        System.out.println(quantity + "\n");
        int totalprice = price * quantity;
        System.out.println("Your Price Sir! " + "\n" + totalprice + "$");
        sc.close();
    }
}