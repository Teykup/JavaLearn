package Intellegent;

import java.util.Scanner;

public class loops_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir değer giriniz");
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {

                if (j<=i)
                    System.out.print("*");
            }
            System.out.println("");
        }

    }
}
