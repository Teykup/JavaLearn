package Intellegent.StringBuilder_VarArgs;

public class karşılaştırma {
    public static void main(String[] args) {


        String str = "";

        StringBuilder strBuild = new StringBuilder();
        int N = 1000   ;
        long time;
        time = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str = str+"+";
        }
        System.out.println("String time = " +(System.currentTimeMillis()- time));

        time = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            strBuild.append("+");
        }
        System.out.println("S.builder time = " +(System.currentTimeMillis()- time));
    }
}
