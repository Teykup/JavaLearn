package Intellegent.mlkt;

public class q4 {
    public static void main(String[] args) {
        //4 -->>  Write a return method that can reverse string
        //Ex : Reverse("ABCD") ==> DCBA

        String str = "ABCD";
        reverse(str);

    }

    private static void reverse(String str) {
        String str2 = "";
        for (int i = str.length()-1; i >= 0; i--) {

            str2+=str.substring(i,i+1);

        }
        System.out.println(str2);
    }
}
