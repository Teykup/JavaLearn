package Intellegent;

import java.util.Scanner;

public class loops_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("çarpım boyutu giriniz : ");
        int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i * j+" ");



            }
            System.out.println("");
        }
    }
}
