import java.util.Scanner;

public class CalculateDays_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter days ");
        int num = input.nextInt();

        int year = num/365;
        num = num%365;
        int week = num/7;
        num = num%7;
        int days = num;

        System.out.println("year "+ year +" Week "+ week + " Days "+ days);


    }
}
