package Intellegent.StringBuilder_VarArgs;

public class StringBuilder_equals {
    public static void main(String[] args) {

        //----------------------------------------------------------
        StringBuilder a1 = new StringBuilder("hardy");
        StringBuilder a2 = new StringBuilder("hardy");
        StringBuilder a3 = a1;
        StringBuilder a4 = new StringBuilder();
        a4.append("hardy");
        a1.append("");

       // System.out.println("a2.equals(a2) = " + a2.equals(a2));
       // System.out.println("a1.equals(a2) = " + a1.equals(a2));
       // System.out.println("a1 == a2 = " + (a1 == a2));
       // System.out.println("a1.equals(a3) = " + a1.equals(a3));
        //System.out.println("a1==a3 = " + a1 == a3);
        System.out.println("a4.equals(a1) = " + a4.equals(a1));
        System.out.println("a1.equals(a2) = " + a1.equals(a2));

        //----------------------------------------
        String s1 = "hardy";
        String s2 = "hardy";
        String s3 = new String("HELLO");
        String s4 = s1;
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s4);//true
        System.out.println(s1.equals(s4));//true
        //--------------------------------------------------------------
        System.out.println("s1.equals(a1) = " + s1.equals(a1));//false
        //System.out.println("a1==s2 = " + (a2 == s1));//false

    }
}
