package Intellegent.mlkt;

import java.util.Arrays;

//package Intellegent.hakan;
//
//public class q7 {
//    //7  -->>  Write a return method that can the maximum number from an int Array
//
//    public static void main(String[] args) {
//
//        int arr[] ={5,10,100,50,60,1,25,33};
//        System.out.println("maxValue(arr) = " + maxValue(arr));
//
//    }
//
//    private static int maxValue(int[] arr) {
//        int max =Integer.MIN_VALUE;
//        for (int each:arr) {
//            if (each>max)
//                max=each;
//        }
//        return max;
//    }
//}
//-------------------------------------------------------
public class q7 {
    //7  -->>  Write a return method that can the maximum number from an int Array

    public static void main(String[] args) {

        int arr[] ={5,10,100,50,60,1,25,33};
        System.out.println("maxValue(arr) = " + maxValue(arr));

  
    }

    private static int maxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}