// package Oops;

import java.util.*;

class User {
    String Email;
    String Password;
    int AtmPin;

    void CreateAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create Email: ");
        Email = sc.nextLine(); //
        System.out.print("Create your Password: ");
        Password = sc.nextLine();
        System.out.print("Create your pin: ");
        AtmPin = sc.nextInt();
        System.out.println("Your account create Successfully Welcome" + "\n");
    } // Account Create Data Store
      // public static String generateOtp(int length){

    // }
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

    boolean verifyPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ATM PIN: ");
        int Pin = sc.nextInt();
        if (Pin != AtmPin) {
            System.out.println("Invalid Pin, Access granted");
            return false;
        }
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

    double getBalance() {
        return balance;
    }

    void display() {
        System.out.println("Bank name : " + BankName + "\n" + "Holder name : " + accountHolderName + "\n" + "A/c No : "
                + accountNumber + "\n" +
                "balance : " + balance + "\n");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl Amount Successfully");
        } else {
            System.out.println("Insufficent Balance");
        }
    }
}

class ATM {
    void showMenu(bankAccount account) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        // (!inputPin.createAccount(PIN).equals(AtmPin))
        switch (choice) {
            case 1:
                System.out.println("Balance : " + account.getBalance());
                break;

            case 2:
                System.out.print("Enter Amount : ");
                int amt = sc.nextInt();
                account.withdraw(amt);// important
                System.out.println("Available balance : " + account.getBalance());
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

public class SingleUserATM {
    public static void main(String[] args) {
        System.out.println("Welcome User");
        User U1 = new User(); // user class ka

        U1.CreateAccount();
        SingleUserATM sUserATM = new SingleUserATM();

        bankAccount ac1 = new bankAccount(2411131, "Takdish", 10000); // bankaccount class ka

        if (U1.Login()) {
            System.out.println("----Bank details----");
            ac1.display(); // ishe bankaccount class ka method hai (display method)
            if (U1.verifyPin()) { // true
                ATM atm = new ATM();
                atm.showMenu(ac1);
            }
        } else {
            System.out.println("Login failed. Cannot access bankAccount and Atm");
        }
    }
}
