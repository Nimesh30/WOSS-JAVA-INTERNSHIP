import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to search: ");
        int number = input.nextInt();
        System.out.println(list);

        if (list.contains(number)) {
            System.out.println("Number is available ....");
            System.out.println("Enter new number :");
            int newNumber = input.nextInt();
            list.set(list.indexOf(number), newNumber);
            System.out.println(list);
        } else {
            System.out.println("Number is not available");
        }

    }
}
