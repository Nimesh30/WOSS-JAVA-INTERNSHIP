public class MinMaxElement {
    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, -4, 2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

