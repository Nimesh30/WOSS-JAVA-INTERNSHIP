import java.util.Arrays;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5,0,3,0,6,5};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Move Zeros First..");
        moveZerosToFirst(arr);
        System.out.println(Arrays.toString(arr));
    }
//MOve all moveZerosToEnd toEnd end
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0; // counts non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (count < n) {
            arr[count++] = 0;
        }
    }

    public static void moveZerosToFirst(int[] arr) {
        int n = arr.length;
        int index = n - 1;

        // Place non-zero elements from the end
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (index >= 0) {
            arr[index--] = 0;
        }
    }
}
