package Intellegent;

import java.util.Scanner;

public class Kenar_kare {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan dikdörtgen kenar uzunluklarini isteyin ve dikdörtgen kare olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Dörtgenin dik kenaralrının uzunluklarını metre cinsinden giriniz. \n 1. Kenar uzunluğu: ");
        double kenar = scanner.nextDouble();
        System.out.println("2. Kenar uzunluğunu giriniz : ");
        double kenar2 = scanner.nextDouble();
        System.out.println("Bütün açıları 90 derece mi ? (Y/N)");
        char degree = scanner.next().toUpperCase().charAt(0);
        if (kenar2 == kenar && degree == 'Y' ) {
            System.out.println("Bu bir karedir");
        }else if (kenar2 != kenar && degree == 'Y') {
            System.out.println("bu bir dikdörtgendir");
        }else {
            System.out.println("kenar uzunluklarını girdiğiniz cisim kare veya dikdörtgen değildir. ");
        }

    }
}
