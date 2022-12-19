package Intellegent;

import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {
        System.out.println("Günlük Ücret Hesaplama");
        Scanner scan = new Scanner(System.in);
        System.out.println("saatlik ücretinizi giriniz : ");
        double ücret = scan.nextDouble();
        System.out.println("İşe başlama saati : ");
        double starttime = scan.nextDouble();
        System.out.println("İş bitiş saati : ");
        double finishtime = scan.nextDouble();
        System.out.println("mesai katsayısını giriniz : ");
        double katlama = scan.nextDouble();
        System.out.print("alacağınız ücret : " +mesai(ücret,starttime,finishtime,katlama) );
    }



    public static double mesai(double ücret, double starttime, double finishtime, double katlama) {
        double csaat= (24-starttime)+finishtime;
        double csaat1 = finishtime-starttime;

        if (finishtime<starttime){
            if (csaat>8) {
                return ((csaat - 8) * ücret * katlama) + 8 * ücret;
            }else return csaat*ücret;

        }else
            if (csaat1<=8) {
                return csaat1 * ücret;
            }else return (csaat1-8)*ücret*katlama +8*ücret;
    }
}