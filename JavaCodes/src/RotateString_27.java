public class RotateString_27 {
    public static void main(String[] args) {
        String s = "dabc";
        String s1 ="abcd" ;
        String temp =s+s;


        if(temp.contains(s1)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
