package Intellegent.mlkt;

public class q3 {
    public static void main(String[] args) {
        //Write a return method that can find the unique characters from the string
        //Ex :   unique("AAABBBCCCDEF") ==> "DEF";
        String str = "AAABBBCCCDEF";
        firstlast(str);
    }

    private static void firstlast(String str) {
        for (int i = 0; i <str.length() ; i++) {
            String str2 = "";
            String a = str.substring(i,i+1);

            if (str.indexOf(a)==str.lastIndexOf(a)){
                str2+=a;
            }
            System.out.print(str2);
        }

    }
}
