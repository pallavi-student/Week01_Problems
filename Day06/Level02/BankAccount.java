package Day06.Level02;

// Program to Simulate an ATM
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jane Doe", 456789, 50000);
        account.deposit(5000);
        account.withdraw(2000);
        account.displayBalance();
    }
}
