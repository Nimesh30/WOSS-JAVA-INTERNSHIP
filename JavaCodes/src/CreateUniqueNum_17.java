public class CreateUniqueNum_17 {
    public static void main(String[] args) {
        int[] digits = {1, 2, 6, 7};

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i != j && j != k && i != k) {
                        int number = digits[i] * 100
                                + digits[j] * 10
                                + digits[k];
                        System.out.println(number);
                    }
                }
            }
        }
    }
}
