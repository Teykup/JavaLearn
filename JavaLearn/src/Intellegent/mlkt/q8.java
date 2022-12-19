package Intellegent.mlkt;

import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int arr[] ={5,10,100,50,60,1,25,33};
        System.out.println("maxValue(arr) = " + maxValue(arr));

    }
    private static int maxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
