package Intellegent;

import java.util.Scanner;

public class loops_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <a ; j++) {
                if (i==j){
                    System.out.print("1");
                }else System.out.print("0");
            }

            System.out.println("");
        }

    }
}
