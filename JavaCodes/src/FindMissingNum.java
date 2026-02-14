import java.util.Scanner;

public class FindMissingNum {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 5, 6, 7, 8, 9, 10};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 9 numbers fin sequence: ");
            int[] nums = new int[9];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int length = nums.length +1;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);

        int totalSum = (length * (length + 1)) / 2;
        System.out.println(totalSum);

        int missingNum = totalSum - sum;
        System.out.println("Missing Number is: " + missingNum);
    }
}
