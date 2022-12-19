package Intellegent;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {


        // Soru 1) Kullanicidan dikdörtgen kenar uzunluklarini isteyin ve dikdörtgen kare olup olmadigini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.print("kısa kenar uzunluğu: ");
        int a = scanner.nextInt();
        System.out.println("uzun kenar uzunlğu : ");
        int b = scanner.nextInt();
        System.out.println( a==b ? "kare": "dikdörtgen");


    }
}
