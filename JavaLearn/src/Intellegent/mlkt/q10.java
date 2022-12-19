package Intellegent.mlkt;

import java.util.Arrays;

public class q10 {
    // Write a return method that can sort an int array in descending order
    //without using the sort method of the Arrays class
    //Ex : int [] arr = {10,20,7,8,90};
    //     arr = sort (arr); ==>  {90,20,10,8,7};
    public static void main(String[] args) {
        int arr[] = {10, 8, 6, 4, 2, 0};
        System.out.println("Arrays.toString(sortexample(arr)) = " + Arrays.toString(sortexample(arr)));


    }
    private static int[] sortexample(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int exchange = arr[j];
                    arr[j] = arr[i];
                    arr[i] = exchange;
                }
            }
        }

        return arr;
    }
}

