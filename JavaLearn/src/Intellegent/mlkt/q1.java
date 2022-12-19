package Intellegent.mlkt;

import java.util.ArrayList;
import java.util.Scanner;

public class q1 {

    //1 -->> Write a a return method that check if a string is build out of the same letters as another string.
    //Ex : same("abc", "cab"); --> true
    //        same("abc", "abb"); --> false
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str1 = scan.nextLine().trim();
        System.out.println("String bir ifade giriniz");
        String str2 = scan.nextLine().trim();
        int flag = 1;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.trim().length(); i++) {

                a.add(str1.charAt(i));
                System.out.println(a);
            }
            for (int i = 0; i < str2.length() - 1; i++) {

                if (!a.contains(str1.charAt(i))) {
                    flag = 0;
                }

            }
            System.out.println(flag);
        }else System.out.println("0");
    }
}
