public class CountNonRepChar {
    public static void main(String[] args) {
        String str = "pproogramming";
        int[] count = new int[256];

        //This will count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        // It will find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                System.out.println("First non-repeated char: " + str.charAt(i));
                return;
            }
        }

        System.out.println("Not found.");
    }
}


