package Intellegent.mlkt;



public class q2 {
    public static void main(String[] args) {

       /* Write a return method that can remove the duplicated values from string
        Ex : removeDup("AAABBBCCC") ==> ABC

    */
        String str = "AAABBBCCC";
        replacestr(str);


    }

    private static void replacestr(String str) {
        String a = "";
        for (int i = 0; i < str.length()-1; i++) {

            if (!a.contains(str.substring(i,i+1))){
                a+=str.substring(i,i+1);
            }
        }
        System.out.println(a);
    }

}
