import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for Table : ");
        int table = sc.nextInt();

        for (int i = 1; i <=10 ; i++) {
//            System.out.format( "%d * %d = %d\n",table, i , table*i ); //8 * 1 = 8;
            System.out.printf("%d * %d = %d%n", table, i, table * i);
        }
    }
}
