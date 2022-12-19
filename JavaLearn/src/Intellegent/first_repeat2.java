package Intellegent;

import java.util.ArrayList;

public class first_repeat2 {


    public static void main(String[] args) {

        String a = "ABCDAEBBC";
        ArrayList kutu = new ArrayList<>();
        System.out.println("tekrar_first(a, kutu) = " + tekrar_first(a, kutu));

    }

    private static String tekrar_first(String a, ArrayList kutu) {
        for (int i = 0; i < a.length() - 1; i++) {
            String karakter = a.substring(i, i + 1);
            if (!kutu.contains(karakter))
                kutu.add(karakter);
            else return karakter;


        }

        return null;
    }
}
