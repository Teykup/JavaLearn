package Intellegent.mlkt;

import java.util.Scanner;

public class q13 {
    //13 -->>  Write a method which can identifies given number is even or odd
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int a = scan.nextInt();
        System.out.println(even_odd(a));
    }

    private static String even_odd(int a) {
        return a%2==0 ? "even":"odd";
    }


}
