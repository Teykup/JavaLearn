package Intellegent;

import java.util.Scanner;

public class Gun_Atama {
    public static void main(String[] args) {

        // * Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
        //  * baslayan gun isimlerini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
        //         * veya Persembe” ilkHarf=S output = “Sali” Buyuk kucuk harf problem olmamasi
        //         * icin toUpperCase methodunu kullanin

        Scanner scan = new Scanner(System.in);
        System.out.println("Girdiğiniz harfi gün ismi ile eşleyen program");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Haftanın günlerinden birinin ilk harfini giriniz: ");
        int flag = 0;

        char gun = scan.next().toUpperCase().charAt(0);
        if (gun == 'P') {
            System.out.println("P ile başlayan haftanın günleri :  ' Pazartesi, Perşembe , Pazar ' ");
            flag++;
        } else if (gun == 'S') {
            System.out.println("S ile başlayan haftanın günleri :  ' Salı '");
            flag++;
        } else if (gun == 'Ç') {
            System.out.println("C ile başlayan haftanın günleri :  ' Cuma , Cuamrtesi ,  Carşamba'");
            flag++;
        }if (flag==0){
            System.out.println("Girdiğiniz harf ile başlayan gün ismi bulunamadı" );

        }


    }
}
