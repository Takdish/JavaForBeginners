class bankAccount {
    static String bankName = "PNB";
    int accountNumber;
    String accountHolderName;
    double balance;

    bankAccount(int acNO, String holderName, int initialBalance) {
        accountNumber = acNO;
        accountHolderName = holderName;
        balance = initialBalance;
    }

    static {

        System.out.println("Static");
    }

    void display() {
        System.out.println("Bank name : " + bankName + "\n" + "Holder name : " + accountHolderName + "\n" + "A/c No : "
                + accountNumber + "\n" +
                "balance : " + balance);
    }
}

public class const_bank {
    public static void main(String[] args) {
        bankAccount ac = new bankAccount(2411131, "takdish", 10000);
        bankAccount ac2 = new bankAccount(241130, "Shaquib", 20000);
        System.out.println();
        ac.display();
        System.out.println();
        ac2.display();
        System.out.println();
    }

}
