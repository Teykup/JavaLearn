package home_work;

public class task_06 {


        public static void main(String[] args) {

       /*
        //Task_01 genel not= vize30% + proje20% + final50%
        Scanner scan = new Scanner(System.in);

        System.out.print("vize notunu gir : ");
        int vize = scan.nextInt();
        System.out.print("proje notunu giriniz");
        int proje = scan.nextInt();
        System.out.print("final notunu giriniz");
        double finl = scan.nextInt();

        System.out.println("Genel not : " + (vize*30/100+proje*20/100+finl*50/100) );

        */
//---------------------------------------------------------------------------------------------------
            //TASK_02
       /* Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
                * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
                *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir

        */

        /*Scanner scan = new Scanner(System.in);

        System.out.print("boyun (cm) : ");
        double byi =scan.nextInt();
        double boy = (byi/100);
        System.out.println(boy);
        System.out.print("kilon (kg) :");
        double kilo =scan.nextInt();
        System.out.print("VKE =" +(kilo/(boy*boy)));

         */
//-------------------------------------------------------------------------------------------
            /*
             * TASK->
             *
             * Kullaniciya gunde kac saat uyudugunu sorun,
             * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
             *
             * Ornek : Input : 8
             *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
             */
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("gunde kac saat uyuyorsunuz? : ");
        double uyk = scan.nextInt();
        System.out.println("ayda : "+(30*uyk/24) +" gun uyuyorsun"+"\n" +"yilda : " +(365*uyk/24)+" gun uyuyorsun" +"\n" +"40 yilda : " +(365*40*uyk/24) +" gun uyuyorsun");

        */
//-------------------------------------------------------------------------------------------------------
         /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
          */

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("isim soyisim : " );
        String adsad = scan.nextLine();
        System.out.println("yaş: ");
        int yas = scan.nextInt();
        System.out.println("kilo: " );
        int kilo = scan.nextInt();
        System.out.println("boy: " );
        int boy = scan.nextInt();
        System.out.println("kaç ay spor yapacaksınız? : " );
        double salon = scan.nextDouble();
        System.out.println("isim soyisim : " +(adsad)+"yas = " + (yas) +" kilo = " + (kilo)+ " boy" + (boy) +" ücret : "+(salon));

 */

//------------------------------------------------------------------------------------------------------------------------


            // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("2 tam sayi giriniz : ");
        double ch = scan.nextDouble();
        double ax = scan.nextDouble();

        System.out.println("toplamlari : " +(ch+ax) +"farklari : " + (ch-ax) +"carpimalri: " + (ch*ax) +"bolumleri : " + (ch/ax) );

 */
//-------------------------------------------------------------------------------------------------------------------------------------------------

 /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
/*
        Scanner s = new Scanner(System.in);
        System.out.println(" üçgenin 2 dik kenarının uzunlukları : ");
        double x = s.nextDouble();
        double y = s.nextDouble();
        System.out.println("Üçgenin hipotenüsü : " + Math.sqrt(x * x + y * y));


 */
            //--------------------------------------------------------------------------------------------------------------------------------------------

        /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("mesafe (m) : ");
        double x = scanner.nextDouble();
        System.out.println("aracın ortalama hızı (m/s) : ");
        double v = scanner.nextDouble();
        System.out.println(" Aracın hedefe ulaşma süresi = " + x/v);


 */
            /*
             * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
             * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
             */
 /*
        Scanner scan  =  new Scanner(System.in);
        System.out.println("vize notlarınızı giriniz : ");
        double v1 = scan.nextDouble();
        double v2 = scan.nextDouble();
        System.out.println("Final notunu giriniz : ");
        double f = scan.nextDouble();
        System.out.println("Gecme notu " +((v1+v2)/2*0.3+f*0.7));


  */

          /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("3 tane sayı giriniz : ");
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        System.out.println("sonuç : " +((a*a-b*b)/(c*3)));


 */

            // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

            // c = (f-32)*5/9
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("sıcaklık fahreneit degeri");
        double fah = scan.nextDouble();
        System.out.println("celcius : " + (fah-32)*5/9);
*/

        }
    }


