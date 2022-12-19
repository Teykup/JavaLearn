package Intellegent;

import java.util.Scanner;

public class Nestedif_Cozum {
    public static void main(String[] args) {

        // Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.

        Scanner sc = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz : ");
        String password = sc.nextLine();
        char psw = password.charAt(0);
        if (psw >= 'A' && psw <= 'Z') {
            if (psw == 'A') {
                System.out.println("Gecerli Sifre");
            } else System.out.println("Gecersiz Sifre");
        }
        else if (psw >= 'a' && psw <= 'z') {
            if (psw == 'z') {
                System.out.println("Gecerli Sifre");
            } else System.out.println("Gecersiz Sifre");
        }
        else  System.out.println("geçersiz giriş yaptınız");



    }



}

