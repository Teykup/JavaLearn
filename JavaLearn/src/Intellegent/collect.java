package Intellegent;

import java.util.Arrays;
import java.util.LinkedList;

public class collect {
    public static void main(String[] args) {
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("javaCAN", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "İlker", "javaCAN", "Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan", "Harun", "Haluk", "Hasmayan"));

        ll2.addAll(ll3);
        System.out.println(ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(\"Hasan\") = " + ll2.remove("Hasmayan"));
        System.out.println(ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Harun, Haluk, Hasmayan]
        System.out.println("ll2.remove(\"tekinay\") = " + ll2.remove("tekin"));
        System.out.println(ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Harun, Haluk, Hasmayan]
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));
        System.out.println(ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
        System.out.println(ll3);//[Hasan, Harun, Haluk, Hasmayan]
        //System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve, Hasan, Harun, Haluk, Hasmayan]
       //System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));//
       //System.out.println("ll2 = " + ll2);//[javaCAN, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javaCAN, Merve]
    }
}
