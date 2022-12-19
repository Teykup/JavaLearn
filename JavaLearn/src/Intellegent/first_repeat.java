package Intellegent;

public class first_repeat {


    public static void main(String[] args) {

        String a = "ABCDAEBBC";
        tekrar_first(a);

    }

    private static void tekrar_first(String a) {
        for (int i = 0; i <a.length()-1 ; i++) {
            char ch1 =a.charAt(i);
            for (int j = 0; j <a.length()-1 ; j++) {
                char ch2 = a.charAt(j);
                if (ch1==ch2){
                    System.out.println(ch1);
                    break;
                }
                break;
            }
        }


    }
}
