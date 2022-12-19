package Intellegent;

import java.util.Scanner;

public class soru {
    // Soru 4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
        String name = scan.nextLine();

        System.out.println("soyisim giriniz : ");
        String syad = scan.nextLine();

        if (name.length() > syad.length()){
            System.out.println("ismi soyisminden daha uzun");
        }else if (name.length() == syad.length()) {
            System.out.println("isim uzunluğu soyismin uzunluğuna eşit");
        } else
            System.out.println("soyismi isminden daha uzun");

    }
}
