interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}
class Account implements Bank {
    private double balance = 0;
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
}
public class Q3 {
    public static void main(String[] args) {
        System.out.println("24BIT106 Kalp N Dhariwal");
        Account acc = new Account();
        acc.deposit(5000);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(2000);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(4000);
        System.out.println("Balance: " + acc.getBalance());
    }
}