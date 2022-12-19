package Intellegent;

import java.util.Scanner;

public class Tashj {
    public static void main(String[] args) {

        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin.
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("kaç tane ürün aldınız : ");
        int n = scan.nextInt();
        System.out.println("ürün fiyatını giriniz");
        int fiyat = scan.nextInt();
        System.out.println("kartınız var mı (Evet/Hayır)");
        char cn = scan.next().toLowerCase().charAt(0);
        if (cn == 'e'){
            if (n>10){
                System.out.println((n*fiyat*80/100));

            }else{
                System.out.println((n*fiyat*85/100));
            }
        }
        else if (cn =='h' ){
            if (n>10){
                System.out.println((n*fiyat*85/100));

            }else{
                System.out.println((n*fiyat*90/100));

            }

        }else {
            System.out.println("yanlış değer girdiniz");
        }

        scan.close();





    }
}
