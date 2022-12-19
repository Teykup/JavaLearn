package home_work.New_Stage;

import java.util.Scanner;

public class TASK_01 {

     /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */
     private static int randomNum(int max) {
         return max = (int)(Math.random()*max);
     }

    private static boolean powerOfThree(int a) {
        for (int c = a; c % 3 == 0; ) {
            System.out.println(a % 3 == 0 ? "üçün katıdır" : "üçün katı değildir");
        }
        return false;
    }

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Rastgele oluşturulacak sayıların alabileceği maximum değerini giriniz : ");
            int max = scan.nextInt();
            System.out.println(randomNum(max));


//----------------------------------------------------------------------------------------------------------------------------
/*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */
            System.out.println("Bir sayı giriniz : ");
            int a = scan.nextInt();
          // powerOfThree();

        }


    }

