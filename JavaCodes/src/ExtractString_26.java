import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExtractString_26   {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();

        ArrayList<String> letters = new ArrayList<>();
        ArrayList<Integer>digits = new ArrayList<>();

        for(Character c :s.toCharArray()){
            if(Character.isDigit(c)){
                digits.add(Integer.parseInt(c+""));
            }else if(Character.isLetter(c)){
                letters.add(c+"");
            }
        }

        Collections.sort(letters);
        Collections.sort(digits);
        System.out.println(letters);
        System.out.println(digits);
    }

}
