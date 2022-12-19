package Intellegent;

import java.util.Scanner;

public class market {
    /*
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin.
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kasaya Hoşgeldiniz \n----------------------------------------------------------------");
        System.out.print("Müsteri için 1'i ,Kasiyer için 2'yi tuşlayın" + "\n1-) Müşteri\n2-) Kasiyer\n3-) Cıkıs \n--> ");
        int giris = scan.nextInt();
        System.out.println("\n----------------------------------------------------------------");

        if (giris == 2) {
            System.out.print("Kartı varsa ve 10 üründen fazla aldıysa uygulanacak indirim %a / a= ");
            int a = scan.nextInt();
            System.out.print("kartı varsa ve 10 üründen az aldıysa uygulanacak indirim %b  b= ");
            int b = scan.nextInt();
            System.out.print("Kartı yoksa ve 10 üründen fazla aldıysa uygulanacak indirim %c c= ");
            int c = scan.nextInt();
            System.out.print("Kartı yoksa ve 10 üründen az aldıysa uygulanacak indirim %d  d=");
            int d = scan.nextInt();
            System.out.print("Müsteri için 1'i çıkmak için 0 'ı tuşlayın  \n1-) Müşteri \n0-) Cıkıs \n-->");
            int giris2 = scan.nextInt();
            if (giris2 == 1) {
                System.out.print("ürün adedini giriniz : ");
                int adet = scan.nextInt();
                System.out.print("ürün fiyatını giriniz :");
                double fiyat = scan.nextInt();
                System.out.print("Kartınız var mı (Y/N) :");
                char card = scan.next().toUpperCase().charAt(0);

                if (card == 'Y' && adet > 10) {
                    System.out.println("ürün fiyatı : " + (adet * fiyat - (adet * fiyat * a / 100) + " TL"));
                } else if (card == 'Y' && adet <= 10) {
                    System.out.println("ürün fiyatı : " + (adet * fiyat - (adet * fiyat * b / 100) + " TL"));
                } else if (card == 'N' && adet > 10) {
                    System.out.println("ürün fiyatı : " + (adet * fiyat - (adet * fiyat * c / 100) + " TL"));
                } else if (card == 'N' && adet <= 10) {
                    System.out.println("ürün fiyatı : " + (adet * fiyat - (adet * fiyat * d / 100) + " TL"));
                } else System.out.println("hatalı giris yaptiniz");
            } else if (giris2 == 0) {
                scan.close();
            } else System.out.println("yanlış giris yaptiniz");


        } else if (giris == 1) {
            System.out.print("ürün adedini giriniz : ");
            int adet = scan.nextInt();
            System.out.print("ürün fiyatını giriniz :");
            double fiyat = scan.nextInt();
            System.out.print("Kartınız var mı (Y/N) :");
            char card = scan.next().toUpperCase().charAt(0);

            if (card == 'Y' && adet > 10) {
                System.out.println("ürün fiyatı : " + adet * fiyat * 80 / 100 + " TL");
            } else if (card == 'Y' && adet <= 10) {
                System.out.println("ürün fiyatı : " + adet * fiyat * 85 / 100 + " TL");
            } else if (card == 'N' && adet > 10) {
                System.out.println("ürün fiyatı : " + adet * fiyat * 85 / 100 + " TL");
            } else if (card == 'N' && adet <= 10) {
                System.out.println("ürün fiyatı : " + adet * fiyat * 90 / 100 + " TL");
            } else System.out.println("hatalı giris yaptiniz");

        } else if (giris == 3) {
            scan.close();

        } else System.out.println("hatalı giris yaptiniz : ");

        scan.close();
    }
}

