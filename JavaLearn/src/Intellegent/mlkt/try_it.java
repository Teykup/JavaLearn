package Intellegent.mlkt;

import java.util.Arrays;

public class try_it {

    public static void main(String[] args) {
        //9  -->>  Write a return method that can sort an int array in Ascending
        //order without using the sort method of the Arrays class
        //Ex : int[] arr = {10,9,8,7};//9,10,8,7//

        //     arr = Sort(arr); ==> {7,8,9,10};
        int[] arr = {5,-9,10,7};
        System.out.println(Arrays.toString(example(arr)));

    }

    private static int[] example(int []arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int change =arr[j];
                    arr[j]=arr[i];
                    arr[i]=change;
                }

            }

        }
        return arr;
    }
}
