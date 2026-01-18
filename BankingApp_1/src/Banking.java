import java.util.ArrayList;
import java.util.Scanner;

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class Banking {

    private int balance;
    private final ArrayList<String> list = new ArrayList<>();

    public Banking(int balance) {
        this.balance = balance;
        list.add("Balance " + balance);
    }

    public void deposit(int amount) {


            if (amount <= 0) {
                throw new MyException("Amount can't be negative or zero");
            }


        balance += amount;
        list.add("Deposit " + amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        list.add("Withdraw " + amount);
        System.out.println("Withdrawn: " + amount);
    }

    public void viewStatement() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n1. Deposit Statements");
        System.out.println("2. Withdraw Statements");
        System.out.println("3. Full Statement");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.println("\n--- Statement ---");

        for (String s : list) {
            switch (choice) {
                case 1:
                    if (s.startsWith("Deposit")) {
                        System.out.println(s);
                    }
                    break;

                case 2:
                    if (s.startsWith("Withdraw")) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println(s);
                    break;

                default:
                    System.out.println("Invalid choice");
                    return;
            }
        }
    }

    public static void main(String[] args) {

        Banking bank = new Banking(1000);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Statement");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount to Deposit: ");
                    try {
                        bank.deposit(input.nextInt());
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter Amount to Withdraw: ");
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
