

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCodes {
    public static void main(String[] args) {

        //Create an ArrayList and Add element

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks of  no " + (i + 1));
            int marks = input.nextInt();
            list.add(marks);
        }

        // Retrieve element from ArrayList

        for (Integer integer : list) {
            System.out.println(integer);
        }

//         Remove element from ArrayList and retrieve an elements...

        System.out.println("Present index length is " + list.size());
        System.out.println("Enter index for remove...");
        int marks = input.nextInt();
        list.remove(marks);
        for (Integer integer : list) {

            System.out.println(integer);
        }

//         Remove specific element from List

        System.out.println("Present elements are " + list);
        System.out.println("Enter element for remove...");
        marks = input.nextInt();

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == marks) {
//                list.remove(i);
//            }
//        }
        if(list.contains(marks)) {
            list.remove(Collections.binarySearch(list,marks));
            System.out.println(list);
        }else  {
            System.out.println("Element not found");
        }

    }
}
