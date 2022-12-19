package Intellegent;

import java.util.Scanner;

public class deneme_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("iki tane sayı giriniz : ");
        System.out.print("1.sayı :");
        int a = scan.nextInt();
        System.out.print("2.sayı :");
        int b = scan.nextInt();
        System.out.println("Sayılar eşit mi : "+esitMi(a, b));
    }

    private static boolean esitMi(int a, int b) {
        boolean esit = false ;
        if (a == b){
            esit = true ;
        }else esit=false;
        return esit;

    }
}