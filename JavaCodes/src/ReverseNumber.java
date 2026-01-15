public class ReverseNumber {

    public static void ReverseNumber1(int no){
        int rev =0;
        while(no!=0){
            int rem = no%10;
            rev = rev*10 + rem;
            no = no/10;
        }
        System.out.println(rev);
    }


    public static void main(String[] args) {
        int no = 2346;
        ReverseNumber1(no);
    }
}
