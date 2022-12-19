package Intellegent.StringBuilder_VarArgs;

public class VarArgs_2 {
    public static class Go {
        public static void main(String[] args) {//

            Go.Go(1,"hello");
            Go.Go(2,"hello","hi");
            Go.Go(1,"hello","hi");
        }//main bitiş
        public static void Go(int x , String...y){

            System.out.println(y[y.length-x]+" ");
        }
    }//main sonu
}
