import java.util.*;

class BankAccount {
    int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Name: " + name + ", Balance: " + balance);
    }
}

class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(101, "Aryan", 5000);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
