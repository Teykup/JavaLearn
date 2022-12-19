package home_work.New_Stage;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
     //  10-    	Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
     //  Girilen kelime cumlede kullanilmamis.
     //  Girilen kelime cumlede 1 kere kullanilmis.
     //  Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan = new Scanner(System.in);
        System.out.print("cümlü giriniz : ");
        String cml = scan.nextLine();
        System.out.println("kelime giriniz :");
        String klm = scan.next();

        if (cml.contains(klm)){
            if (cml.indexOf(klm)==cml.lastIndexOf(klm)){
                System.out.println("1 tane içeriyor");
            }else System.out.println("1 den fazla");
        }else System.out.println("içermiyor");





    }
}
