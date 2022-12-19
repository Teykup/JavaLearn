package Intellegent;

import java.util.Scanner;

public class asal_1 {
    // Kullanıcıdan sayı isteyin. Alınan sayının asal sayı olup olmadığını yazdırın.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif bir sayı giriniz : ");
        int a = scan.nextInt();

        int sayac= 0;
        for (int i = 1; i <= a ; i++) {
            sayac += (a%i == 0) ? 1:0;

        }
        System.out.println((sayac == 2) ? "true":"false" );

    }

}
