import java.util.*;

// ---------- INTERFACES (abstraction: a contract, no implementation) ----------

interface Authenticatable {
    boolean login(String email, String password);
    boolean verifyPin(int pin);
}

interface Transactable {
    void deposit(double amount);
    void withdraw(double amount);
}

// ---------- USER ----------

class User implements Authenticatable {
    private String email;
    private String password;
    private int atmPin;

    public void createAccount(String email, String password, int atmPin) {
        this.email = email;
        this.password = password;
        this.atmPin = atmPin;
        System.out.println("Account created successfully. Welcome " + email + "!\n");
    }

    @Override
    public boolean login(String inputEmail, String inputPassword) {
        if (!email.equals(inputEmail)) {
            System.out.println("Invalid email");
            return false;
        }
        if (!password.equals(inputPassword)) {
            System.out.println("Invalid Password");
            return false;
        }
        System.out.println("Login Successful\n");
        return true;
    }

    @Override
    public boolean verifyPin(int inputPin) {
        if (inputPin != atmPin) {
            System.out.println("Invalid Pin, Access denied");
            return false;
        }
        return true;
    }
}

// ---------- ABSTRACT CLASS ----------
// Holds the fields/behaviour every account shares, but leaves the
// account-specific rules (type, withdraw limit) to subclasses.

abstract class BankAccount implements Transactable {
    protected static final String BANK_NAME = "State Bank of India";
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Bank name   : " + BANK_NAME);
        System.out.println("Holder name : " + accountHolderName);
        System.out.println("A/c No      : " + accountNumber);
        System.out.println("A/c Type    : " + getAccountType());
        System.out.println("Balance     : " + balance + "\n");
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful");
    }

    // Abstract methods -> every subclass MUST provide its own version
    abstract String getAccountType();
    abstract double getWithdrawLimit();
}

// ---------- INHERITANCE + POLYMORPHISM ----------
// Both subclasses extend BankAccount but override withdraw()
// differently. Calling code just uses a BankAccount reference and
// the correct version runs automatically at runtime.

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    String getAccountType() {
        return "Savings";
    }

    @Override
    double getWithdrawLimit() {
        return 50000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            System.out.println("Withdraw limit exceeded for Savings Account");
        } else if (balance - amount < MIN_BALANCE) {
            System.out.println("Insufficient balance (must maintain min balance of " + MIN_BALANCE + ")");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful");
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 10000;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    String getAccountType() {
        return "Current";
    }

    @Override
    double getWithdrawLimit() {
        return balance + OVERDRAFT_LIMIT;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            System.out.println("Insufficient balance, even with overdraft limit");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful (overdraft limit: " + OVERDRAFT_LIMIT + ")");
        }
    }
}

// ---------- ATM ----------
// Note the parameter type: BankAccount, not SavingsAccount or
// CurrentAccount. This is polymorphism in action - showMenu() works
// with ANY current or future subclass without changing a line here.

class ATM {
    void showMenu(BankAccount account, Scanner sc) {
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance : " + account.getBalance());
                break;
            case 2:
                System.out.print("Enter Amount : ");
                double amt = sc.nextDouble();
                account.withdraw(amt); // resolves to Savings/Current version at runtime
                System.out.println("Available balance : " + account.getBalance());
                break;
            case 3:
                System.out.print("Enter Amount : ");
                double dep = sc.nextDouble();
                account.deposit(dep);
                System.out.println("Available balance : " + account.getBalance());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

// ---------- MAIN ----------

public class SingleUserATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome User");

        User u1 = new User();
        System.out.print("Create Email: ");
        String email = sc.nextLine();
        System.out.print("Create your Password: ");
        String password = sc.nextLine();
        System.out.print("Create your pin: ");
        int pin = sc.nextInt();
        sc.nextLine();
        u1.createAccount(email, password, pin);

        System.out.print("Choose account type (1-Savings, 2-Current): ");
        int type = sc.nextInt();
        sc.nextLine();

        // BankAccount reference can point to EITHER subclass - polymorphism again
        BankAccount account = (type == 2)
                ? new CurrentAccount(2411131, "Takdish", 10000)
                : new SavingsAccount(2411131, "Takdish", 10000);

        System.out.print("Enter Email to login: ");
        String inEmail = sc.nextLine();
        System.out.print("Enter Password: ");
        String inPass = sc.nextLine();

        if (u1.login(inEmail, inPass)) {
            System.out.println("----Bank details----");
            account.display();

            System.out.print("Enter ATM PIN: ");
            int inPin = sc.nextInt();

            if (u1.verifyPin(inPin)) {
                ATM atm = new ATM();
                atm.showMenu(account, sc);
            } else {
                System.out.println("Invalid PIN. Access denied.");
            }
        } else {
            System.out.println("Login failed. Cannot access bank account and ATM");
        }

        sc.close();
    }
}