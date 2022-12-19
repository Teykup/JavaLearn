package Intellegent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class karesi {
    public static void main(String[] args) {

        ArrayList<Integer> numArr = new ArrayList<Integer>(List.of(1,2,3,4,5));
        int sum=0;
        for(int i : numArr){
            sum+= i*i;
        }
        System.out.println("Kareler toplamı= "+sum);
    }
}