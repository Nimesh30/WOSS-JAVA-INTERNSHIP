import java.util.HashMap;

public class DuplicateElement_9 {
    public static void main(String[] args) {


        int [] arr = {3,56,12,45,34,56,12,78,56,78};

        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for(int key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key);
            }
        }
//        System.out.println(map);

    }
}
