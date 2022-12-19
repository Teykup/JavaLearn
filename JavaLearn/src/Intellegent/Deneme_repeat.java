package Intellegent;

import java.util.Scanner;

public class Deneme_repeat {





    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("1.notunu griniz : ");
        int a = scan.nextInt();
        System.out.println("2.notunu griniz : ");
        int b = scan.nextInt();
        System.out.println("3.notunu griniz : ");
        int c = scan.nextInt();
        System.out.println("Not Ortalaman : " +NotOrt(a, b, c));


    }//kapanış main

    private static double NotOrt(int a,int b, int c) {
        double ort = (a+b+c)/3;
        return ort;
    }


}
