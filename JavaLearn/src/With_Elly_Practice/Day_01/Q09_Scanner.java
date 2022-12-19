package With_Elly_Practice.Day_01;

import java.util.Scanner;

public class Q09_Scanner {
    public static void main(String[] args) {

        //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
//  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
//  Isim – soyisim : Elly Dainty
//  Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("cemberin yaricapini girinz : ");
        double yaricap = scan.nextDouble();

        System.out.println("yaricap = " + yaricap);
        System.out.println("cemberin cevresi : " + 2 * 3.14 * yaricap);
        System.out.println("dairenin alani : " + 3.14 * yaricap * yaricap);

        System.out.println("lutfen isminizi giriniz : ");
        String isim = scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz :");
        String soyIsim = scan.nextLine();

        System.out.println("isim -soyisim  :" + isim + " " + soyIsim);


    }
}
