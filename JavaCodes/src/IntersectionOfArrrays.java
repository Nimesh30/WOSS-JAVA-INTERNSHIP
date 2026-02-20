import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrrays {

    public static void main(String []args){
         int [] arr1= { 1,2,3,4,5};
         int [] arr2= { 4,5,6,7,8};

         // Find which elements are already present in 1st array.
        //Intersection of two array
        Set<Integer> set = new HashSet<>();
        Set <Integer> result = new HashSet<>();

        for (int num :arr1){
            set.add(num);
        }

        for(int num :arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        System.out.println(result);
    }
}
