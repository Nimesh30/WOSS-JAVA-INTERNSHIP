import java.util.HashMap;

public class FindDuplicatesHashMap {

        public static void main(String[] args) {

            int arr[] = {1,2,3,4,2,5,1};

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int num : arr){
                map.put(num, map.getOrDefault(num,0)+1);
            }

            for(int key : map.keySet()){
                if(map.get(key) > 1){
                    System.out.println("Duplicate: " + key);
                }
            }
        }
    }

