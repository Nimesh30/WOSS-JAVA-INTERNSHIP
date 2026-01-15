import java.util.HashMap;

public class UniqueNumbers_10 {
    public static void main(String[] args) {

        int[] arr = {3, 56, 12, 45, 34, 56, 12, 78, 56};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
