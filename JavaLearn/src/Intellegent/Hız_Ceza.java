package Intellegent;

import java.util.Scanner;

public class Hız_Ceza {
    public static void main(String[] args) {

        /* Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini hesaplayin. 45
         * hiz siniridir. Eger hiziniz 55-775 arasinda ise: Ceza 100 $'dir.
         *
         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         *
         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
         *
         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         *
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         *
         * Örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         *
         * -----------------------------------------
         *
         * Örn;
         *
         * currentSpeed(Hiziniz) 87 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * true;
         *
         * sonuç 320 olmalidir.
         *
         * currentSpeed(Hiziniz) 65 ve isDriverLicenceAvailable(Ehliyeti var mi?) =
         * false;
         *
         * sonuç 300 olmalidir.

         */
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("Hız sınır 45 km/h \n-------------------------------------------------\nHızınızı giriniz :");
        int hız = sc.nextInt();
        System.out.print("Araç plakası giriniz : ");

        sc.nextLine();
        // aracın hızını int istediğimiz için imleç girilen değeri int'e çevirdi
        // imleç alt satıra inmediği için scan.nextLine ifadesi \n satırını okudu. bu ilk çözümdü.
        // Satırın tamamını String olarak oku ve tam sayıya çevir(2. yöntem)
        String plaka = sc.nextLine().toUpperCase().replace(" ", "");
        System.out.println("ehliyetiniz var mı (Y/N): ");
        char dc = sc.next().toUpperCase().charAt(0);
        System.out.println("Girdiğiniz bilgileri onaylıyor musunuz (Y/N)?");
        char onay = sc.next().toUpperCase().charAt(0);
        System.out.println("----------------------------------------------------------");

        if (onay == 'Y' && hız >= 55 && hız < 75) {
            if (dc == 'Y') {
                System.out.println("plaka : " + plaka + "\nCezanız : 100 $ ");
            } else System.out.println("plaka :" + plaka + "\nCezanız : 300 $");
        }
        if (onay == 'Y' && hız >= 75 && hız < 84) {
            if (dc == 'Y') {
                System.out.println("plaka : " + plaka + "\nCezanız : 150 $ ");
            } else System.out.println("plaka :" + plaka + "\nCezanız : 350 $");
        }
        if (onay == 'Y' && hız >= 85 && hız < 94) {
            if (dc == 'Y') {
                System.out.println("plaka : " + plaka + "\nCezanız : 320 $ ");
            } else System.out.println("plaka :" + plaka + "\nCezanız : 520 $");

        }
        if (onay == 'Y' && hız >= 94) {
            if (dc == 'Y') {
                System.out.println("plaka : " + plaka + "\nCezanız : 500 $ ");
            } else System.out.println("plaka :" + plaka + "\nCezanız : 700 $");
            ;
        } else if (onay == 'Y' && hız < 55) {
            if (dc == 'Y') {
                System.out.println("plaka : " + plaka + "\nÖdenecek borcunuz bulunmamaktadır. ");
            } else {
                System.out.println("plaka : " + plaka + "\nCezanız : 200 $ ");
            }
        }else if (onay == 'N'){
            System.out.println("Lütfen tekrar giriş yapınız");
        }


    }
}