package Intellegent;

import java.util.Scanner;

public class Toplam_Overflow {
    public static void main(String[] args) {

       // Verilen iki sayinin (sifirdan büyük veya sifira esit) toplamini hesaplayan ve yazdiran bir Java programi yazin. Verilen tamsayilar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdirin.
       // Ornek:
       // INPUT :
       // 25
       // 46
       // OUTPUT :
       // Numaralarin Toplami:
       // 71

        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------0'a eşit veya sıfırdan büyük 2 sayı giriniz --------------");
        System.out.println("1. sayı :");
        double say1 = scan.nextDouble();
        System.out.println("2. sayı :");
        double say2 = scan.nextDouble();
        double sonuc = (say1 +say2);
        int sonuc2 = (int) sonuc;
        int flag = 0 ;
        int bsmk = 0;
        if (say1 >= 0 && say2 >= 0) {
            System.out.println("sayi1 +sayi2 = " + sonuc);
            flag++;
            while(sonuc2 != 0) {
                sonuc2 /= 10; // sayi = sayi / 10;
                ++bsmk;
            }
            if (bsmk < 10)
                System.out.println("Girdiginiz sayinin basamak sayisi = " + (bsmk));
            if (bsmk >= (10) ){
                System.out.println("OverFlow");
            }

        }else if (say1 < 0 && say2 < 0){
            System.out.println("girdiğiniz değer negatif sayı içermekte . ");
        }if (flag == 0 )
            System.out.println("Girdiğiniz değer tanımlanamadı . ");





    }
}
