import java.util.Scanner;

class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000; // initial balance
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposited: " + deposit);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: " + withdraw);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
