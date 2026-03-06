/* #Class
   1- Class is a blueprint for Object.
   2- It is used to create Object.
   3- It is the collection of Object.
   4- It is a "Logical" entity.
   5- The class represent a group  of Object having similar "behaviour" + "State/property". 
   
   #Object 
   1- Object is a "real World" entity.
   2- An Object is an instance of the Class.
   */
class bankAccount {
    static String bankName = "PNB";
    int accountNumber;
    String accountHolderName;
    double balance;

    bankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
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
