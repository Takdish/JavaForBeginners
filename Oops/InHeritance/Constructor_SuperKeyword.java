// package InHeritance;

// import.java.*;
class bankAccount {
    static String BankName = "State bank of india";
    int accountNumber;
    String accountHolderName;
    double balance;

    bankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    } // parent constructor

    double getBalance() {
        return balance;
    }

    @Override /**/
    public String toString() {
        return "Bank name : " + this.BankName + "\n" + "Holder name : " + this.accountHolderName + "\n" + "A/c No : "
                + this.accountNumber + "\n" +
                "balance : " + this.balance + "\n";
    }
}

public class Constructor_SuperKeyword extends bankAccount {
    Constructor_SuperKeyword(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public static void main(String[] args) {
        System.out.println();
        Constructor_SuperKeyword user1 = new Constructor_SuperKeyword(2411131, "Md Takdish", 10000);
        // System.out.println(user1.getBalance());// only balance
        System.out.println(user1);

        Constructor_SuperKeyword user2 = new Constructor_SuperKeyword(2411149, "Talib anjum", 12300);
        // System.out.println(user2.getBalance());
        System.out.println(user2);

        Constructor_SuperKeyword user3 = new Constructor_SuperKeyword(2411300, "Md Farhan", 21000);
        // System.out.println(user3.getBalance());
        System.out.println(user3);
    }
}