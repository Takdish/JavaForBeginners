package Oops;

import java.util.Scanner;

class User {
    String Email;
    String Password;

    void CreateAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create Email: ");
        Email = sc.nextLine(); //
        System.out.print("Create your Password: ");
        Password = sc.nextLine();
        System.out.println("Your account create Successfully Welcome" + "\n");
    } // Account Create Data Store

    boolean Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your details to login ");
        System.out.print("Enter Email : ");
        String inputEmail = sc.nextLine();
        if (!Email.equals(inputEmail)) {
            System.out.println("Invalid email ");
            return false;
        }
        System.out.print("Enter Password : ");
        String inputPassword = sc.nextLine();
        if (!Password.equals(inputPassword)) {
            System.out.println("❌ Invalid Password");
            return false;
        }
        System.out.println("✅ Login Successful\n");
        return true;
    }
}

class bankAccount {
    static String BankName = "State bank of india";
    int accountNumber;
    String accountHolderName;
    double balance;

    bankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Bank name : " + BankName + "\n" + "Holder name : " + accountHolderName + "\n" + "A/c No : "
                + accountNumber + "\n" +
                "balance : " + balance);
    }
}

public class UserAtm {
    public static void main(String[] args) {
        System.out.println("Welcome User");
        User U1 = new User();

        U1.CreateAccount();
        bankAccount ac1 = new bankAccount(2411131, "Takdish", 10000);

        if (U1.Login()) {
            ac1.display();
        }

        System.out.println("\n----- NEXT USER -----\n");
        User U2 = new User();
        U2.CreateAccount();

        bankAccount ac2 = new bankAccount(2411130, "Shaquib", 20000);

        if (U2.Login()) {
            ac2.display();
        }
    }
}
