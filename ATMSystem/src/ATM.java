import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount for withdraw:");
        int userAmount = input.nextInt();

        if (userAmount % 100 != 0) {
            System.out.println("Invalid amount. Enter multiples of 100 only.");
            return;
        }

        int five = 0, two = 0, one = 0;

            // Ensure at least one note of each if possible
            if (userAmount >= 800) {
                five = 1;
                two = 1;
                one = 1;
                userAmount -= 800;
            }

            five += userAmount / 500;
            userAmount %= 500;

            two += userAmount / 200;
            userAmount %= 200;

            one += userAmount / 100;

        System.out.println("500 = " + five + "  200 = " + two + "  100 = " + one);
    }
}
