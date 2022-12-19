package Intellegent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market_HC {



        public static class Manav {
            static Scanner scan = new Scanner(System.in);
            static List<String> urun = new ArrayList();
            static List<Double> fiyatlari = new ArrayList();
            static List<String> sepeturun = new ArrayList<>();
            static List<Double> sepetkilo = new ArrayList<>();
            static double sepetkiloborcu = 0;

            public static void main(String[] args) {
                String dongudevam = "";
                int sepeturunno = 0;
                double sepetkiloo = 0;
                urun.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz  ", "Cilek", "Kavun", "Uzum", "Limon"));
                fiyatlari.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
                do {
                    System.out.println("Urun numaralarimiz\t\tUrunlerimiz ve Fiyatlarimiz ");
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(i + "-------------------------->" + urun.get(i) + "\t\t" + fiyatlari.get(i) + "TL");
                    }
                    System.out.println("Almak istediginiz urunun nosunu giriniz: ");
                    sepeturunno = scan.nextInt();
                    System.out.println("Kac kilo almak istediginizi giriniz: ");
                    sepetkiloo = scan.nextInt();
                    sepetguncel(sepeturunno, sepetkiloo);
                    System.out.println("Sepetinizdeki urunler : ");
                    for (int j = 0; j < sepetkilo.size(); j++) {
                        System.out.println(sepeturun.get(j) + " " + sepetkilo.get(j) + " Kilo");
                    }
                    System.out.println("Toplam borcunuz : " + sepetkiloborcu + "TL");
                    System.out.println("Alisverise devam etmek istiyor musunuz ? Evet ise \"E\" Hayir ise \"H\" giriniz");
                    dongudevam = scan.next();
                } while (dongudevam.equalsIgnoreCase("e"));
                toplamodeme();
            }

            public static void sepetguncel(int sepeturunno, double sepetkiloo) {
                sepeturun.add(urun.get(sepeturunno));
                sepetkilo.add(sepetkiloo);
                sepetkiloborcu = (fiyatlari.get(sepeturunno) * sepetkiloo);
            }

            public static void toplamodeme() {
                System.out.println("Toplam odemeniz gereken miktar : " + sepetkiloborcu + " TL dir.");
                System.out.println("Odeme icin lutfen para girisi yapiniz");
                double paragiris = scan.nextDouble();
                if (paragiris < sepetkiloborcu) {
                    System.out.println("Odeme icin yeterli bir miktar giriniz");
                    toplamodeme();
                } else if (paragiris == sepetkiloborcu) {
                    System.out.println("Odemeniz icin tesekkurler iyi gunler");
                } else System.out.println("Odemeniz icin tesekkurler Para ustunuz : " + (paragiris - sepetkiloborcu));
            }
        }


    }

