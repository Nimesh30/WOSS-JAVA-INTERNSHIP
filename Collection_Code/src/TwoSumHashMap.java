import java.util.HashMap;

public class TwoSumHashMap {
        public static void main(String[] args) {

            int arr[] = {2,7,11,15};
            int target = 9;

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int num : arr){

                int complement = target - num;

                if(map.containsKey(complement)){
                    System.out.println(num + " + " + complement);
                    return;
                }

                map.put(num,1);
            }
        }
    }

