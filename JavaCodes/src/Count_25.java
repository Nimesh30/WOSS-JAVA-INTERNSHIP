import java.util.Scanner;

public class Count_25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = in.nextLine();

        int letters =0;
        int digits =0;
        int spaces =0;
        int others = 0;
        for(Character c : s.toCharArray()){
            if(Character.isDigit(c)){
                digits++;
            }else if(Character.isLetter(c)){
                letters++;
            }else if(Character.isSpaceChar(c)){
                spaces++;
            }else{
                others++;
            }

        }

        System.out.println("letters : "+letters + "\n " +"Digits : "+ digits +" \n" + "Spaces : "+spaces + "\n Others :" + others);

    }
}
