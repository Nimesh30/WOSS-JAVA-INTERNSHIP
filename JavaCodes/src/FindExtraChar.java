public class FindExtraChar {
    public static void main(String[] args) {
        char result = 0;
        String s1 = "Hello";
        String s2 = "Helloo";

        // ^ XOR cancels same charasters...
        for (char c : s1.toCharArray()) {
            result ^= c;
        }

        for (char c : s2.toCharArray()) {
            result ^= c;
        }

        System.out.println(result);
    }
}
