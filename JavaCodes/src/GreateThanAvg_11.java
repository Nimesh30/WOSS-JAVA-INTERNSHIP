public class GreateThanAvg_11 {
    public static void main(String[] args) {

        int[] nums = {1, 4, 17, 7, 25, 3, 100};


        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum= sum+nums[i];
        }
        int avg = sum/nums.length;
        System.out.println(avg);

        for(int key:nums){
            if(key>avg){
                System.out.println(key);
            }
        }
    }
}
