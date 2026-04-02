import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(5000);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();

            acc.withdraw(amt);
            System.out.println("Withdrawal successful");
            System.out.println("New Balance: " + acc.getBalance());

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: insufficient funds");

        } finally {
            System.out.println("Transaction completed");
            System.out.println("Final Balance: " + acc.getBalance());
        }

        sc.close();
    }
}