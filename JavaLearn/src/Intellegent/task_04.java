package Intellegent;

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        //kullanıcıdan üçgen paralelkenar ve dikdörtgen kelimerlinden birini ve 2 sayı seçmesini isteyin.
        //hangi şekil seçerse o şeklin alanını ve çevresini hesap ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println(" paralelkenar \n üçgen \n dikdörtgen \n şekillerinden brini seçiniz :");
        String skl = scan.next().trim().toLowerCase();
        System.out.println("1.sayı : ");
        int a = scan.nextInt();
        System.out.println("2.sayı : ");
        int b = scan.nextInt();
        alan(a, b, skl);
    }

    private static int alan(int a, int b, String skl) {
        switch (skl) {
            case "ücgen":
                int alan;
                return alan = +((a * b) / 2);
        }

        return a;
    }


}
