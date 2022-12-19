package day1;


import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
      Kullanicidan bir String aliniz.
      String'de var olan her character'in sayisini ekrana yazdiriniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
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
            for (int i = 0; i < str.length() ; i++) {


                if (str.substring(i, i + 1).contains(str.substring(0, 1))) {
                    count++;
                }
                }
                result += str.substring(0, 1) + count;
                str = str.replaceAll(str.substring(0, 1), "");
            }
            System.out.println(result);
        }


    }





