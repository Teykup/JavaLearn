package j01_Veriables;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("merhaba dünya");//bu komut konsala yazılan metni print eder
        // dan yazılan ifadeler komut veya kod satırı olarak değil yprum olarak tanımlanır.
        /*
        bu araya yazılan her ifade yorum satırı olur java kod olarak derlemez.
         */

        // imlecin olduğu satır ctrl+d ile alt satıra kopyalanır.
        System.out.println("javacan'lara selam olsun");//çalışmasını istemediniz kod satırının başınna // yazarak yoruma alınır.

          /*
          TRİCK: javada code satırı cümle (statement) sonuna mutlaka ; koyulmalı
           code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
           CTE düzeltimeden code yazılmaz yazılan code çalışmaz.
           */

        System.out.println("hata");

        //TASK: ad, soyad ,yaş, memleket ve meslek print ediniz (console yazdırınız)

        System.out.println("adım-soyadım:Rabia Algül ");
        System.out.println("yaşım: 20");
        System.out.println("memleketim: Artvin");
        System.out.println("mesleğim: öğrenci");
        /*
         TRICK:
         print->yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
         println_>yazdıra işleminden sonraki komutu ALT satırda devam ettirir.
         javada space "boşluk" bir character olarak tanımlanır.
         r a b i a-> 9 karakter
         */


    }




}
