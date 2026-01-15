import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for fibonacci series:");
        int no = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= no; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

    }
}
