package Intellegent;

import java.util.Scanner;

//public class Task_02 {
//public static void main(String[] args) {
//    String name1 = "mehmet";
//    String name2 = "ahmet";

//    if (name1.length()%2 == 0) {
//        System.out.println(name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2));
//    } else System.out.println(name1+" karekter uzunluğu çift sayı olmadığı için ortasına yerleştiremedik.");
//}


///*
//2-      Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
//yri soyad ayri sekilde ekrana yazdiriniz.*/
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.println("ad ve soyadınızı giriniz");
//    String s = scan.nextLine().trim();
//    if (s.indexOf(' ') == s.lastIndexOf(' ')) {
//        System.out.println("Ad: " + s.substring(0, s.indexOf(' ')) + "\nSoyad: " + s.substring(s.indexOf(' ') + 1));
//    }
//    scan.close();
//}


///*
//3-       * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
// * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.

// * input : ali
// * output: girdiginiz kelime 3 harfli ve unique karaktere sahip
// *
// * input : ece
// * output: girdiginiz kelime 3 harfli ve unique karaktere sahip degil*/
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.print("3 harfli bir ism giriniz: ");
//    String name = scan.next().trim();
//    char c1= name.charAt(0);
//    char c2= name.charAt(1);
//    char c3= name.charAt(2);

//    System.out.println(name.length() == 3 ? ((c1 == c2 || c1==c3 || c2==c3) ? "girdiginiz kelime 3 harfli ve unique karaktere sahip degil" : "girdiginiz kelime 3 harfli ve unique karaktere sahip" ):"girdiğiniz isim 3 harfli değil");
//    scan.close();
//}


///*
//4- 		 * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa
// * son iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin

//         * ornek input = Ali output = lilili
// *
//         * input = el output = el
//
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.print("bir kelime giriniz: ");
//    String kelime = scan.next().trim();

//    if (kelime.length() >= 3) {
//        System.out.println(kelime.substring(kelime.length()-2).repeat(3));
//    } else System.out.println(kelime);
//    scan.close();
//}


///*
//5- 		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz.
// * String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";*/
//public static void main(String[] args) {
//    String harfDepo= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    System.out.println(harfDepo.charAt(harfDepo.indexOf('A'))+" "+harfDepo.charAt(harfDepo.indexOf('L'))+" "+harfDepo.toLowerCase().charAt(harfDepo.indexOf('I')));

//}


///*
//7-      Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
//    (Method Creation kullanın)*/
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.print("Anagram kontrolü için ilk kelimeyi giriniz: ");
//    String s1 = scan.nextLine().replaceAll("\\s", "").toLowerCase();
//    System.out.print("Anagram kontrolü için ikinci kelimeyi giriniz: ");
//    String s2 = scan.nextLine().replaceAll("\\s", "").toLowerCase();

//    if (Anagram(s1, s2)) {
//        System.out.println(s1+" ve "+s2+" Anagram");
//    } else System.out.println(s1+" ve "+s2+" Anagram değil. ");
//    scan.close();
//}
//public static boolean Anagram(String s1, String s2) {
//    if (s1.length() == s2.length()) {
//        for (int i = 0; i < s1.length(); i++) {
//            for (int j = 0; j < s2.length(); j++) {
//                if (s1.charAt(i) == s2.charAt(j)) {
//                    s2 = s2.substring(0,j) + s2.substring(j + 1);
//                    break;
//                }
//            }
//        }
//        if (s2.length() == 0) {
//            return true;
//        } return false;
//    }return false;
//}


///*
//8- 		Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
//-soyisim : M***** B*******
// no : **** **** **** 1234 */
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.print("isim ve soyisim giriniz : ");
//    String adSoyad = scan.nextLine().trim();
//    System.out.print("16 haneli kredi kart no giriniz: ");
//    long kredi = scan.nextLong();

//    String yeniad = adSoyad.toUpperCase().charAt(0)+adSoyad.substring(1,adSoyad.indexOf(" ")).replaceAll("\\w","*")+" "+adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1)+adSoyad.substring(adSoyad.indexOf(" ")+2).replaceAll("\\w","*");
//    String yenikart = String.valueOf(kredi);
//    yenikart = yenikart.substring(0,12).replaceAll("\\d","*")+yenikart.substring(12);
//    System.out.println(yeniad);
//    System.out.println(yenikart);
//    scan.close();
//}


///*
//    9- 		String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
//ng str1 = “$13.99”
//ng str2 = “$10.55”
//u :)) : Double.parseDouble() methodunu kullanabilirsiniz.*/
//public static void main(String[] args) {
//    String str1 = "$13.99";
//    String str2 = "$10.55";
//    double d1 = Double.parseDouble(str1.substring(1));
//    double d2 = Double.parseDouble(str2.substring(1));
//    double sum = d1 + d2;
//    System.out.println("sum = " + sum);
//}


///*
//    10-    	Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
//len kelime cumlede kullanilmamis.
//len kelime cumlede 1 kere kullanilmis.
//len kelime cumlede 1’den fazla kullanilmis. */
//public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    System.out.print("bir cümle giriniz: ");
//    String cumle = scan.nextLine().toLowerCase();
//    System.out.print("bir kelime giriniz: ");
//    String kelime = scan.nextLine().toLowerCase();

//       if (cumle.indexOf(kelime) > -1) {
//           if (cumle.indexOf(kelime) == cumle.lastIndexOf(kelime)) {
//               System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
//           } else System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
//       } else System.out.println("Girilen kelime cumlede kullanilmamis.");
//       scan.close();
//   }
//
