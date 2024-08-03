import java.util.Scanner;

class BankAccount {
    private int accountNumber;

    private String accountHolderName;
    private double balance;

    // Constructor to initialize the bank account with an account number and account holder's name
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initialize the balance to zero
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive value.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + " successful.");
            } else {
                System.out.println("Insufficient funds. Cannot withdraw " + amount + ".");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please withdraw a positive value.");
        }
    }

    // Method to get the current balance in the account
    public double getBalance() {
        return balance;
    }
}
public class BankAccount1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        BankAccount account = new BankAccount(12345, "John Doe");
        account.deposit(a);
        System.out.println("Account balance after deposit: " + account.getBalance());

        account.withdraw(b);
        System.out.println("Account balance after withdrawal: " + account.getBalance());

        account.withdraw(c);
        System.out.println("Account balance after withdrawal: " + account.getBalance());
    }
}

