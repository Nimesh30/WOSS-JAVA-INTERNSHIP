import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string with digits..");
        String s = input.nextLine();

//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i=0;i<s.length();i++){
//            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//        }
//        for(Character key:map.keySet()) {
//            System.out.println(key + " = " + map.get(key));
//        }
        int digits = 0;
        int letter = 0;
        int others =0;
        for(Character c : s.toCharArray()){
            if(Character.isDigit(c)){
                digits++;
            }else if(Character.isLetter(c)){
                letter++;
            }else{
                others++;
            }
        }

        System.out.println("digits :"+digits + " and letter :" + letter+" others :"+others);

    }
}
