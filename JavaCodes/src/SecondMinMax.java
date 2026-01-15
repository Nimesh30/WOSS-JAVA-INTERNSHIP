public class SecondMinMax {
    public static void main(String[] args) {
         int []arr = {3,5,7,8,1,2,0};

         int max =Integer.MIN_VALUE;
         int secMax = arr[0];
         int min = Integer.MAX_VALUE;
         int secMin = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if ( max < arr[i] ) {
                secMax = max;
                max = arr[i];
//                System.out.println("max = "+max);
            }
//            int []arr = {3,5,7,8,1,2};
            if(min > arr[i] ){
                secMin = min;
//                System.out.println(secMin);
                min = arr[i];
//                System.out.println(min);
            } else if (arr[i]>min && arr[i]<secMin) {
                secMin = arr[i];
//                System.out.println(secMin);
            }
        }
        System.out.println("Out "+secMax);
        System.out.println("Out "+secMin);
//        System.out.println(min);



    }
}
