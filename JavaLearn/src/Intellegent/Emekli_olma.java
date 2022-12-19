package Intellegent;

import java.util.Scanner;

public class Emekli_olma {

    public static void main(String[] args) {

        // Kullanicidan cinsiyet ve yas aliniz
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
        // emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin

        Scanner sc = new Scanner(System.in);
        System.out.println("Cinsiyetinzi giriniz (E/K) :  ");
        char cns = sc.next().toUpperCase().charAt(0);
        System.out.println("Yaşınızı giriniz");
        int yas = sc.nextInt();
        if (cns == 'K') {
            System.out.println(yas > 60 ? "emekli olabilirisin" : "emekli olamazsın  " + (60 - yas) + "yıl çalışman gerekli");

        }
        if (cns == 'E') {
            System.out.println(yas > 65 ? "emekli olabilirisin" : "emekli olamazsın  " + (65 - yas) + "yıl çalışman gerekli");


        }
    }
}
