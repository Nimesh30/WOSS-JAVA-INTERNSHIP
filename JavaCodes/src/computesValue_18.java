import java.util.Enumeration;
import java.util.Scanner;

public class computesValue_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number...");
        int no = input.nextInt();

        int five2 = (no*10)+ no;
        int five3 = (no*100)+five2;
        System.out.println(no + " + " +five2 + " + " +five3 +" = " + (no + five2 + five3));

    }
}
