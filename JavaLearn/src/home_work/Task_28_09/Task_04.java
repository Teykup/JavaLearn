package home_work.Task_28_09;

import java.util.Scanner;

public class Task_04 {

    public static void main(String[] args) {

        /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        String s = "I love java";
        System.out.println(s.length());
 //----------------------------------------------------------------------------------------------------------------------
         /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        String str1 = "Sprint plannin";
        System.out.println(str1.length());
//----------------------------------------------------------------------------------------------------------------------
/*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */

        //Kodu aşağıya yazınız
        String str2 = "paper";
        System.out.println(str2.toUpperCase());
//------------------------------------------------------------------------------------------------------------------------
 /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.
        String str3 = "OraNge";
        System.out.println(str3.toLowerCase());
//---------------------------------------------------------------------------------------------------------------------
 /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */

        //Kodu aşağıya yazınız.
        String str4 = "New Jersey";
        System.out.println(str4.toUpperCase());
//----------------------------------------------------------------------------------------------------------------------
     /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.
        String str5 = "New Jersey";
        System.out.println(str5.toLowerCase());
//----------------------------------------------------------------------------------------------------------------------
 /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.
        String str6 = "PADDLE";
        System.out.println(str6.toLowerCase());
//----------------------------------------------------------------------------------------------------------------------
/*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.   */

        //Kodu aşağıya yazınız.
        String str7 = "apple";
        System.out.println(str7.contains("app"));
//----------------------------------------------------------------------------------------------------------------------
/*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.

        String str8 = "apple";
        System.out.println(str8.contains("App"));
//----------------------------------------------------------------------------------------------------------------------
         /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        //Kodu aşağıya yazınız.
        String str9 = "orange";
        System.out.println(str9.equals("Apple"));
//----------------------------------------------------------------------------------------------------------------------
    /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String str10 = "apple";
        System.out.println(str10.equalsIgnoreCase("apple"));
//----------------------------------------------------------------------------------------------------------------------
/*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.
        String str11 = "Florida";
        System.out.println(str11.indexOf("o"));
//----------------------------------------------------------------------------------------------------------------------
/*  Thank you olan bir String oluşturun.
            Thank you içindeki, sadece  'y' harfinin bulunduğu konumu yazdırın.
            // Thank you Stringini oluşturun.  */

        //Kodu aşağıya yazınız.

        String str12 = "Thank you";
        System.out.println(str12.indexOf("y")+1);
//----------------------------------------------------------------------------------------------------------------------
        /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.
        String s1 = "      Clarus  Way          ";
        System.out.println(s1.trim());
//----------------------------------------------------------------------------------------------------------------------
 /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        //Kodu buraya yazınız.
        String s2 = "Mouse";
        System.out.println(s2.charAt(1));
//----------------------------------------------------------------------------------------------------------------------
/*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu buraya yazınız.
        String s3 = "    Chocolade     ";
        System.out.println(s3.trim());
//----------------------------------------------------------------------------------------------------------------------
// TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        boolean boslukcheck = text.contains(" ");
        System.out.println("boslucheck = " + boslukcheck); //boslukVarMi = true

scan.close();


    }
}
