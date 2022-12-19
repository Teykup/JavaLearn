package Intellegent.StringBuilder_VarArgs;

import java.util.Scanner;

public class a_3_b_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle gir : ");
        String str = scan.nextLine();
        method1(str);
    }

    private static void method1(String str) {

        String result = "";
        while (str.length() > 0) {
            int count = 0;
            for (int i = 0; i < str.length() - 1; i++) {


                if (str.substring(i, i + 1).contains(str.substring(0,1))){
                    count++;
                }
                result+=str.substring(0,1)+count;
                str = str.replaceAll(str.substring(0, 1),"");
            }
        }


    }

}
