import java.util.ArrayList;
import java.util.Scanner;

public class Banking {

    private int balance;
    private final ArrayList<Integer> list = new ArrayList<>();

    public Banking(int balance) {
        this.balance = balance;
        list.add(balance);
    }

    public void deposit(int amount) {
        balance += amount;
        list.add(amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        list.add(-amount);
        System.out.println("Withdrawn: " + amount);
    }

    public void viewStatement() {
        System.out.println("Statements:");
        for (int txn : list) {
            if (txn > 0)
                System.out.println("Deposit: " + txn);
            else
                System.out.println("Withdraw: " + Math.abs(txn));
        }
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Banking bank = new Banking(1000);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Statement");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Amount to Deposit : ");
                    bank.deposit(input.nextInt());
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw : ");
                    bank.withdraw(input.nextInt());
                    break;
                case 3:
                    System.out.println("Current Balance: " + bank.balance);
                    bank.viewStatement();
                    break;
                case 4:
                    return;
            }
        }
    }
}
