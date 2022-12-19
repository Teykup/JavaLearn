package Intellegent.StringBuilder_VarArgs;

import java.util.HashSet;
import java.util.TreeSet;

public class new_1 {
    public static void main(String[] args) {



       TreeSet<String>ts = new TreeSet<>();
        long time;
        int N = 1000   ;
        time = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            ts.add("isim"+i);
        }
        System.out.println(ts);
        System.out.println("tree time= " + (System.currentTimeMillis() - time));

        HashSet<String>hs = new HashSet<>();

        time = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            hs.add("isim"+i);
        }
        System.out.println(hs);
        System.out.println("hash time = " + (System.currentTimeMillis() - time));
    }
}

