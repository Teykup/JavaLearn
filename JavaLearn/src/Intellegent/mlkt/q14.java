package Intellegent.mlkt;

import java.util.Scanner;

public class q14 {
    //14 -->> Write a method that can divide two numbers without using division operator


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bölünen sayıyı girinz : ");
        int a = scan.nextInt();
        System.out.println("bölen sayıyı giriniz : ");
        int b = scan.nextInt();
        bölme(a, b);
    }

    private static void bölme(int a, int b) {
        int count = 0;
        if (b == 0) {
            System.out.println("belirsiz");
        }
        if (a < 0 && b > 0) {
            while (a <= b) {
                a += b;
                count++;
            }
            System.out.println("bölüm=" + (count-1)+ "  kalan=" +( a+6));


        }
    }
}