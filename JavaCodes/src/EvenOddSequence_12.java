import org.w3c.dom.ls.LSOutput;

public class EvenOddSequence_12 {
    public static void main(String[] args) {

        int[] nums = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

//        int []arr = new int[nums.length]!
        int j = nums.length - 1;
        for (int i = 0; i <= nums.length / 2; i++) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                System.out.println(nums[i]);
            }
        }

//
        for (int key : nums) {
            System.out.print(key + " ");
        }

    }

}
