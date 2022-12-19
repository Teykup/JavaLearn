package Intellegent;

import java.util.Scanner;

public class loops_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("istenen harfi giriniz : ");
        char b = scan.next().charAt(0);
        String v = "selam javaCAN'lar'";


        for (int i = 0; i < v.length() - 1; i++) {
            if (v.indexOf(i) == b) {
                i++;
                System.out.println(i+" tane "+b+" sayısı içermekte");
            }else continue;

        }

    }
}
