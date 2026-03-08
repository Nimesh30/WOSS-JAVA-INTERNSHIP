import java.util.HashSet;
    // A Happy Number is a number that eventually becomes 1
    // when you repeatedly replace the number with the sum of the squares of its digits.
public class HappyNewYearHashSet {

//        Take the number.
//        Square each digit.
//        Add the squares.
//        Repeat the process with the new number.
//        If the result becomes 1 → Happy Number.
//        If the process repeats in a loop and never reaches 1 → Not a Happy Number.

    public static void main(String[] args) {

        int n = 19;

        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)) {

            set.add(n);

            int sum = 0;

            while(n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        if(n == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}
