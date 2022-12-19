package home_work;

import java.util.Scanner;

public class task_05 {
      public static void main(String[] args) {

        /* TASK01-> Ask user to enter mid-term grade, final grade, and project grade
        Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)*/
         /* Scanner scan = new Scanner(System.in);
          System.out.println("Enter your mid-term grade : ");
          int midTerm= scan.nextInt();
          System.out.println("Enter your project grade : ");
          int project= scan.nextInt();
          System.out.println("Enter your final grade : ");
          int finalG= scan.nextInt();
          double general = midTerm*0.30 + project*0.20 + finalG*0.50;
          System.out.println("Grade is : "+ general);



    }

        /* TASK02 ->
        * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle endeksini bulun.  Sonucu tamsayi ve ondalikli sayi olarak yazdirin
        * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir*/


          /*Scanner input= new Scanner(System.in);
          System.out.println("boyunuz kaç cm : ");
          double boy= input.nextInt();
          System.out.println("kg cinsinden ağırlığınızı yazınız : ");
          double kilo= input.nextInt();
          double vki2= kilo / (boy * boy) * 10000;
          System.out.println( "Vucut kutle endeksiniz : " +vki2);


          /* TASK03->
           * Kullaniciya gunde kac saat uyudugunu sorun,
           * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin*/
          /*Scanner sc=new Scanner(System.in);
          System.out.println("Bir günde kaç saat uyuyorsunuz?");
          int uyku=sc.nextInt();
          System.out.println("Ayda: " +(uyku*30/24) + " yılda: " +(uyku*365/24)+ " 40 yılda: " + (uyku*((365*40)/24)));

          /* TASK04 ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
          Scanner sc=new Scanner(System.in);
          System.out.println("İsminizi giriniz");
          String isim=sc.nextLine();
          System.out.println("Yaşınızı giriniz");
          int yas=sc.nextInt();
          System.out.println("kilonuzu giriniz");
          int kilo= sc.nextInt();
          System.out.println("boyunzuu giriniz");
          int boy= sc.nextInt();
          System.out.println("salonu kaç ay kullanacaksınız?");
          int salon= sc.nextInt();
          int aylik=salon*20;
          System.out.println(" "+isim+" aylık ücretiniz: " +aylik+"$'dır. ");





      }
}

