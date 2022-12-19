package home_work;

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
/*
        int x = 4;
        x++; //5
        x += x;//10
        --x;//9
        x = 7 + x;//16
        x *= x;//256
        x -= 3;//253
        System.out.println(" x = " + x );//253

        int a = 3;
        double d = 4.5;

        d+=a;//7.5
        a+=d;//10
        d-=a;//-2.5
        a-=d;//12



        System.out.println(" d = " + ++d );//-1.5
        System.out.println(" a = " + a-- );//12

 */

//-----------------------------------------------------------
        /*
		 Write a program that prints multiplication table for 1.
		 Do not use any loop.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7
			1x8=8
			1x9=9
			1x10=10
		 */
         /*
        System.out.println( i+" ler çarpım tablosu");
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));
        System.out.println(( (1)+"x"+(i) +"="+ (i++)));

          */
        //------------------------------------------------------------------------------------------------------------------------------------------------------
        /* Soru 10:
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */
        /*
        Scanner scan =new Scanner(System.in);
        System.out.println("3 basamaklı sayı giriniz");
        int x =scan.nextInt();
        int ilkbasamak= x%10;
        int sonbasamak= x/100;
        System.out.println(x+" 'nin ilk basamağı " +"+" +" 'nin son basamağı = "+(sonbasamak+sonbasamak));
        */
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------
        /*
         * Girilen saati  saniyeye çeviren program yazınız
         * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */
/*
        Scanner scan =new Scanner(System.in);
        System.out.println("saat giriniz (h) : ");
        double h = scan.nextDouble();
        System.out.println("dakika giriniz (dk) : " +
                ") : ");
        int m= scan.nextInt();
        System.out.println("Girilen verilere göre toplam saniye: "+(h*3600)+(m*60));
*/
//------------------------------------------------------------------------------------------------------------------
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
/*
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı tanımlayınız: ");
        int s= scan.nextInt();
        System.out.println("Girilen sayının birler basamağı: "+(s%10));
        System.out.println("Girilen sayının onlar basamağı: "+((s/10)%10));
        System.out.println("Girilen sayının yüzler basamağı: "+(s/100));

 */

//-----------------------------------------------------------------------------------------------------------------------

        /* Soru 5:
         * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
         */
/*
        int a = 120;
        int b =60;
        int c = 10;
        int d = 20;
        int e = 40;

        a/=b;
        a*=c;
        a+=d;
        a-=e;
        System.out.println("sonuç = " + a);

 */
//-----------------------------------------------------------------------------------------------------------------------------------
        /*
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Saniyeyi, saat-dakika ve saniye formatına çevirici : ");
        System.out.println("\n Lütfen saniye verisini tanımlayınız: ");
        int s= scan.nextInt();
        System.out.println(+s+" saniye = "+(s/3600)+" saat "+(s%3600/60)+" dakika ve "+s%60+" saniyedir. Teşekkürler :)");

        /*
        //-------------------------------------------------------------------------------------------------------------------------
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

        Scanner sc= new Scanner(System.in);

        System.out.println("çiftlikteki hayvanların toplam ayak sayısını hesaplama");

        System.out.println("lütfen inek sayısını giriniz:");
        int i = sc.nextInt();

        System.out.println("lütfen koyun sayısını giriniz:");
        int k = sc.nextInt();

        System.out.println("lütfen tavuk sayısını giriniz:");
        int t = sc.nextInt();

        System.out.println("çiftlikteki hayvanların toplam ayak sayısı="+((i*4)+(k*4)+(t*2)));



    }
}