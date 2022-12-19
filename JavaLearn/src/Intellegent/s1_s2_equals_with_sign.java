package Intellegent;

import java.util.Scanner;

public class s1_s2_equals_with_sign {



        public static String Test () {
            try {
                System.out.println("try");
                throw new Exception();
            } catch (Exception e) {
                System.out.println("catch");
                return "return";
            }
            finally {
                System.out.println("finally");
                return "test";
            }



    }

    public static void main(String[] args) {
        Test();
    }
}