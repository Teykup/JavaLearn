package With_Elly_Practice.Day_02;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        System.out.println("-----Arttirma-----");

        int a = 1;

        System.out.println(++a); //2  value :2
        System.out.println(a++); //2  value :3
        System.out.println(a); //3

        System.out.println("-----Azaltma----");

        int b = 5;

        System.out.println(--b); //4  value :4
        System.out.println(b--); //4  value :3
        System.out.println(b); //3

        System.out.println("---soru1---");
        int x = 20;
        int y = 15;

        System.out.println(++x + y--);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

            Scanner scan = new Scanner(System.in);
            System.out.println("5 basamakli bir sayi giriniz : ");
            int sayi = scan.nextInt();
            int ilkIki =sayi/1000; //12
            int sonIki = sayi%100; //45
            int ilkIkiTop = (ilkIki/10) + (ilkIki%10); //1+2
            System.out.println("ilkIkiTop = " + ilkIkiTop);
            int sonIkiTop = (sonIki/10) + ( sonIki%10); //4+5
            System.out.println("sonIkiTop = " + sonIkiTop);
            System.out.println("esas toplam = " + (ilkIkiTop + sonIkiTop));
    }
}
