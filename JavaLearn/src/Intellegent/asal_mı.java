package Intellegent;

import java.util.Scanner;

public class asal_mı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int repeat =0;
        asalmı(sayi,repeat);

    }

    private static void asalmı(int sayi,int repeat) {
        for (int i = 1; i < sayi+1; i++) {
            if (sayi%i==0){
                repeat++;
            }
        }
        if(repeat==2){
            System.out.println("asal sayı");
        } else System.out.println("asal değil");


    }
}
