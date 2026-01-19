import java.util.Scanner;

public class VovelsUpCase_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string...");
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder();

        System.out.println(s + " prajapati");
        for(char c : s.toCharArray()){
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println((Character.toUpperCase(c)));
                s1.append(Character.toUpperCase(c));
            }else {
                System.out.println(Character.toLowerCase(c));
                s1.append(Character.toLowerCase(c));
            }
        }
        System.out.println(s1);
    }
}
