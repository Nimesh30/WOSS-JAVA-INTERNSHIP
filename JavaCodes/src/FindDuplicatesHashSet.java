import java.util.*;


public class FindDuplicatesHashSet {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 4, 5, 1};

            Set<Integer> set = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();

            for (int num : arr) {
                if (!set.add(num)) {
                    duplicates.add(num);
                }
            }

            System.out.println("Duplicates: " + duplicates);
        }
    }




