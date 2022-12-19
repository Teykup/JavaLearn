package home_work;

import java.util.Random;
import java.util.Scanner;

public class tak_111 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------");

        System.out.println(randomNum());

        System.out.println("-------------------------------");

        System.out.println("Bir sayı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println(powerOfThree(sayi1));

        System.out.println("-------------------------------");

        cevir();

        System.out.println("-------------------------------");

        cevreHesapla();

        System.out.println("-------------------------------");

        enKucuk();

        System.out.println("-------------------------------");

        System.out.println("Artık olup olmadığını merak attiğiniz yılı giriniz : ");
        int yil = scan.nextInt();
        System.out.println(artikYilMi(yil));

        System.out.println("-------------------------------");

        System.out.println("Saniyeye çevirmek istediğiniz dakikayı giriniz : ");
        int dakika = scan.nextInt();
        System.out.println(howManySeconds(dakika));

        System.out.println("-------------------------------");

        System.out.println("Çevirmek istediğiniz Cümleyi giriniz : ");
        String hack = scan.nextLine();
        System.out.println(hacker(hack));

        System.out.println("-------------------------------");

        System.out.println("Bir e- mail giriniz");
        String mail=scan.nextLine();
        System.out.println(isValid(mail));

        System.out.println("-------------------------------");

        System.out.println("Bir string giriniz");
        String str1=scan.nextLine();
        System.out.println("Az önce girdiğiniz stringin sonunun bitip bitmediği kontrol edilecek bir string giriniz");
        String str2=scan.nextLine();
        System.out.println(kontrolEt(str1, str2));

        System.out.println("-------------------------------");

        System.out.print("İşe Başlama saatini giriniz : ");
        double baslamaSaati=scan.nextDouble();
        System.out.print("İş Bitiş saatini giriniz : ");
        double bitisSaati=scan.nextDouble();
        System.out.print("Çalışma ücretini giriniz : ");
        double saatlikUcret = scan.nextDouble();
        System.out.print("Fazla mesai katsayısını giriniz : ");
        double kat = scan.nextDouble();
        System.out.println(ucretHesap(saatlikUcret, baslamaSaati, bitisSaati, kat));


    }



    /*
   Ismi randomNum olan bir method oluşturun.
   Parametre olarak int max almalı.
   Bu method, 0 ile max arasında.random bir değer döndürmelidir.
   Random numarayı döndürünüz.
   Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
   Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
    */
    public static int randomNum() {
        Random rand = new Random();
        return rand.nextInt(Integer.MAX_VALUE);
    }

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.

     */
    public static boolean powerOfThree(int a) {
        while (a > 3) {
            a /= 3;
        }
        return a % 3 == 0;
    }

    // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
// ceviren bir method yaziniz.
    public static void cevir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çevirmek istediğiniz değeri giriniz");
        double a = scan.nextDouble();
        System.out.println("Çevirmek istediğiniz birimi giriniz : Mil için m,Kilogram için k, Saat için s :");
        char b = scan.next().trim().toLowerCase().charAt(0);
        switch (b) {
            case 'm' -> System.out.println(a + " mil >> " + (a * 1.6) + " km");
            case 's' -> System.out.println(a + " saat >> " + (a * 3600) + " saniye");
            case 'k' -> System.out.println(a + " kg >> " + (a * 1000) + " gr");
            default -> System.out.println("Geçersiz değer girdiniz");
        }

    }
    /*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

    public static void cevreHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayı giriniz");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Seçiminizi giriniz : paralelkenar, dikdörtgen ve üçgen ");
        char secim = scan.next().trim().toLowerCase().charAt(0);
        switch (secim) {
            case 'p' ->
                    System.out.println("Paralelkenarın çevresi : " + (2 * (a + b)) + " paralelkenarın alanı : " + (a * b));
            case 'd' ->
                    System.out.println("Dikdörtgenin çevresi : " + (2 * (a + b)) + " paralelkenarın alanı : " + (a * b));
            case 'ü' ->
                    System.out.println("Üçgenin çevresi : " + ((a + b) + Math.sqrt(a * a + b * b)) + " paralelkenarın alanı : " + (a * b * 0.5));
            default -> System.out.println("Geçersiz Seçim yaptınız");
        }
    }
    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz
    */
    public static void enKucuk(){
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double a = scan.nextDouble();
        System.out.println("bir sayı daha giriniz");
        double b = scan.nextDouble();
        System.out.println("son sayıyı giriniz");
        double c = scan.nextDouble();

        if(a<b && a<c) {
            System.out.println("En küçük sayı : " + a);
        }else if (b < a && b < c) {
            System.out.println("En küçük sayı : " + b);
        }else {
            System.out.println("En küçük sayı : " + c );
        }


    }
    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz
     */
    public static boolean artikYilMi(int a){
        return (a%4==0&&a%100!=0)||a%400==0;
    }
    /*
    Saati saniyeye çeviren  method create ediniz
     */
    public static int howManySeconds(int a) {
        return a*3600;
    }
    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
​
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
    public static String hacker(String str){
        return str.replace("s","5").replace("a","4").replace("e","3").replace("i","1").replace("o","0");
    }
    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create edinizŞartlar:
     * Bir mail adresinde @ karakteri olmalı
     * Bir mail adresinde . (nokta) karakteri olmalı
     * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

     */
    public static boolean isValid(String str){
        return str.contains("@") && str.substring(str.indexOf("@")).contains(".")&& str.substring(0,str.indexOf("@")).length()>0;
    }
    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
    public static boolean kontrolEt(String a,String b){
        return a.endsWith(b);
    }
    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
    public static double ucretHesap(double saatlikUcret,double baslamaSaati, double bitisSaati,double kat){
        double calismaSaati=bitisSaati-baslamaSaati;
        double fazlaMesai =calismaSaati-8;
        if (fazlaMesai>0)
            return saatlikUcret*8+fazlaMesai*kat*saatlikUcret;
        else
            return saatlikUcret*calismaSaati;
    }
}
