import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Scanner;

public class Occurrences_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = input.nextLine();

        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String string :map.keySet()) {
            System.out.println(string + " " +map.get(string));
        }
//        System.out.println(count);
    }
}
