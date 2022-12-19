package Intellegent;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {

        //faktöriyel

        Scanner scan = new Scanner(System.in);
        System.out.print("faktöriyeli alınacak sayıyı giriniz : ");
        int a = scan.nextInt();
        faktöriyel(a);

    }

    private static void faktöriyel(int a) {
        for (int  i ; a == 1; a-- ){
            i=1*a;
            System.out.println(i);
        }
    }
}
