package Intellegent.mlkt;

//5 -->>  Write a return method that can find the frequency of characters
//Ex :  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class q5 {
    public static void main(String[] args) {
        String str = "AAABBCADD";
        System.out.println("frequency(str) = " + frequency(str));

    }
    private static String frequency(String str) {

        String result = "";
        while (str.length() > 0) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.substring(i,i+1).contains(str.substring(0, 1)))
                    count++;
            }
            result+=str.substring(0,1)+count;
            str = str.replaceAll(str.substring(0, 1), "");
        }


        return result;
    }
}
