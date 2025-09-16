import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        BankAccount account = new BankAccount("Krishna", 123456, 10000);

        int choice;
        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
