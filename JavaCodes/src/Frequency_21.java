import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with digits..");
        String s = input.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character key:map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
