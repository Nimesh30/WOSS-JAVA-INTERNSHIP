import java.util.Arrays;

public class CheckAnagrams {
    public static void main(String[] args) {

        String s1 = "Mother In Law";
        String s2 = "Hitler Woman";

        // Remove spaces (\\s is for spaces)
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they cannot be anagrams
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        // It will compare sorted arrays
        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
}
