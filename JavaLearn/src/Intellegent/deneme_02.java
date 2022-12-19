package Intellegent;

import java.util.Scanner;

public class deneme_02 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz : ");
        String ad = scan.nextLine().toLowerCase();
        System.out.println("Soyadınız giriniz : ");
        String syad = scan.nextLine().toLowerCase();

        DonusumUpper(ad,syad);

    }

    private static void DonusumUpper(String ad , String syad) {
        char a1 = ad.toUpperCase().charAt(0);
        char a2 = syad.toUpperCase().charAt(0);
        System.out.print("Adınız : " +a1+ ad.substring(1));
        System.out.print(" Soyadınız : " +a2+ syad.substring(1));


    }


}
