package Intellegent;

import java.util.Arrays;

public class q3_04_11 {
    public static void main(String[] args) {
//Soru 3)
        int arr01 [][] = { {1,2,3}, {4,5}, {6,7} };
        int arr03[] = new int[arr01.length];
        for (int i = 0; i < arr01.length; i++) {
            int arr02[] = arr01[i];
            System.out.println(Arrays.toString(arr02));
            for (int j = 0; j < arr02.length; j++) {
                arr03[i] += arr02[j];
            }
        }
        System.out.println(Arrays.toString(arr03));
    }
}
