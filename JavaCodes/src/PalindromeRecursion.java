public class PalindromeRecursion {

    static boolean isPalindrome(String s, int start, int end) {

        // Base case: one or zero characters
        if (start >= end) {
            return true;
        }

        // If characters at current positions are not equal
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call for remaining string
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
