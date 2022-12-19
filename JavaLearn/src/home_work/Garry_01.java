package home_work;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Garry_01 {

    public static void anagram() {
        //   7-      Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
        //           (Method Creation kullanın)
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine().toLowerCase();
        String b = scan.nextLine().toLowerCase();
        int flag = 0;
        for (int i = 0; i < a.length(); i++) {


            String c = String.valueOf(a.charAt(i)); //mary , many

            if (a.length()!=b.length()){
                System.out.println("anagram değildir");
                break;
            }
            if (b.contains(c)) {
                flag++;//1,2
                System.out.print("1");

            }
            else {
                System.out.println("anagram değildir");
                break;

            }
            if (flag==a.length()&& flag==b.length()){
                System.out.println("Anagram");
            }

        }
    }
    public static void main(String[] args) {
        anagram();
        //   String Manipulations Sorular

        //   1-      name1 ve name2 degiskenlerini olusturun.
        //   name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        //           name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method olusturun
        //   e.g:
        //   name1= mehmet
        //   name2= ahmet
        //   Print ==> mehahmetmet
        //           (İsimleri kullanıcıdan alın)

        Scanner scan = new Scanner(System.in);
        //    System.out.print("bir isim giriniz : ");
        //    String name1 = scan.nextLine();
        //    System.out.print("bir isim daha giriniz : ");
        //    String name2 = scan.nextLine();
        //    System.out.println(name1.length() % 2 == 0 ? name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2, name1.length()) : "name1 cift sayili olmadigi icin ortasina yerlestiremedik");

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        //   2-      Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelimeye ayiriniz,
        //           ad ayri soyad ayri sekilde ekrana yazdiriniz.
        //    System.out.println("adınızı soyadınızı giriniz : ");
        //    String adsoyad = scan.nextLine();
        //    int a = adsoyad.indexOf(" ");
        //    System.out.println("adınız : " +adsoyad.substring(0, a) +"\nsoyadınız : " + adsoyad.substring(a, adsoyad.length()));


        //   3-       * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
        //           * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
        //    *
        //    * input : ali
        //           * output: girdiginiz kelime 3 harfli ve unique karaktere sahip
        //           *
        //    * input : ece
        //           * output: girdiginiz kelime 3 harfli ve unique karaktere sahip degil
        // String ucharf = scan.nextLine().trim().replace(" ", "");
        // char a = ucharf.charAt(0) , b = ucharf.charAt(1), c = ucharf.charAt(2);
        // System.out.println( (ucharf.length()==3) ? a!=b && b!=c && c!=a ?"girdiginiz kelime 3 harfli ve unique karaktere sahip" :"girdiginiz kelime 3 harfli ama unique karaktere sahip degil" : "girdiginiz kelime 3 harfli değil");


        //   4- 		 * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa
        //           * son iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
        //           *
//	 * ornek input = Ali output = lilili
        //           *
//	 * input = el output = el
        //   System.out.println("isim giriniz : ");
        //   String a = scan.nextLine();
//
        //   if (a.length()>=3){
        //       char x = a.charAt(a.length()-1);
        //       char y = a.charAt(a.length()-2);
        //       System.out.println( y +""+x );
//
        //   }


        //   5- 		 * Asagidaki String degiskenini kullanarak konsolda A L i yazdiriniz.
        //           * String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //  String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //  int a = pickName.indexOf('A');
        //  int l = pickName.indexOf('L');
        //  int i = pickName.indexOf('I');
        //  System.out.println(""+pickName.charAt(a)+pickName.charAt(l)+pickName.charAt(i) );


        //   6- 		Create 2 words : name1 and name2
        //   if the name1 has even numbers of characters,
        //           then insert the second word in the middle of the first name
        //   if the first word has odd numbers
        //   Then print the “Name2 cannot be inserted in the name1”
        //   e.g:
        //   name1= mehmet
        //   name2= ahmet
        //   Print ==> mehahmetmet


        //   7-      Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
        //           (Method Creation kullanın)

        // String a = scan.next();
        // String b = scan.next();


        //   8- 		Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //   isim-soyisim : M***** B*******
        //   kart no : **** **** **** 1234

    //   System.out.println("isminizi giriniz : ");
    //   String ad = scan.nextLine();
    //   System.out.println("soyadını giriniz :");
    //   String sad = scan.nextLine();
    //   System.out.println("kart numaranı giriniz :");
    //   String kkrt = scan.nextLine();
    //   for (int i = 1; i <=ad.length()-1 ; i++) {
    //       ad=ad.replace(ad.charAt(i), '*');
    //       System.out.println(ad);
        }

        //System.out.println(ad.charAt(0) + ad.replace(ad , "*") + "\n" + sad.charAt(0) + sad.replace(sad, "*******") + "\n" + kkrt.charAt(0) + kkrt.replace(kkrt, "*******"));


  //   //   9- 		String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
  //   //   String str1 = “$13.99”
  //   //   String str2 = “$10.55”
  //   //   İpucu :)) : Double.parseDouble() methodunu kullanabilirsiniz.

  //   String str1 = "$13.99";
  //   String str2 = "$10.55";
  //   String a1 = str1.replace("$", "");
  //   String a2 = str2.replace("$", "");
  //   double a = Double.parseDouble(a1);
  //   double b = Double.parseDouble(a2);
  //   System.out.println("say1+say2 = " + (a + b));


  //   //   10-    	Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
  //   //   Girilen kelime cumlede kullanilmamis.
  //   //   Girilen kelime cumlede 1 kere kullanilmis.
  //   //   Girilen kelime cumlede 1’den fazla kullanilmis.
  //   System.out.println("cümle giriniz : ");
  //   String line = scan.nextLine();
  //   System.out.println("kelime giriniz : ");
  //   String word = scan.next();
  //   if (line.contains(word)) {





        }








