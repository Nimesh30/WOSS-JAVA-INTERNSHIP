import java.util.Scanner;

public class OddEvenRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for start range ");
        int start = sc.nextInt();

//        System.out.println("Enter number for end range ");
//        int end = sc.nextInt();
//
//        System.out.println("Select 1 for Odd and 2 for Even ");
//        int type = sc.nextInt();
//         switch (type) {
//             case 1:
//                 for(int i = start; i <= end; i++){
//                     if(i%2!=0){
//                         System.out.println(i);
//                     }
//                 }
//                 break;
//             case 2:
//                 for (int i = start; i <= end; i++){
//                    if(i%2==0){
//                     System.out.println(i);
//                 }
//             }
//                 break;
//         }
        for(int i=0; i<=start; i++){
            for(int j=0; j<=start; j++){
                if(i==j){
                    System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }

        }
    }
}
