import java.util.HashMap;

public class CheckSentance_22 {
    public static void main(String[] args) {

        String s1 = "nimesh dalpatbhai prajapati prajapati";

        String[] s2 = s1.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        boolean isUnique = true;

        for (String word : s2) {
            map.put(word, map.getOrDefault(word, 0) + 1);

            if (map.get(word) > 1) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            System.out.println("Sentence is unique...");
        } else {
            System.out.println("Sentence is not unique...");
        }
    }
}
