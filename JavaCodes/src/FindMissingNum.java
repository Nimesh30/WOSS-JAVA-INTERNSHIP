import java.util.Scanner;

public class FindMissingNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers in sequence ");

        int[] nums = new int[9];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int length = nums.length + 1;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int totalSum = (length * (length + 1)) / 2;

        int missingNum = totalSum - sum;

        System.out.println("Missing Number is: " + missingNum);
    }
}
