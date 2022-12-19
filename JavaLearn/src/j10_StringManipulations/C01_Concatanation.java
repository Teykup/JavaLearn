package j10_StringManipulations;

public class C01_Concatanation {

    public static void main(String[] args) {

        /* concat() methodu içine (parametre ) aldığuı string veriable'ı çalıştığı stringin sonuna ekler.
        Java da concat işlemi yapılırken eğer en az 1 string verable'ı  varsa toplama değil concat yapar
         */
        String name = "Nur";
        String meslek = "Qa tester";
        name.concat(meslek);//Nur Qa tester
        System.out.println(name);//Nur

        // String methodları variable da  geçici değişiklik yapar . Değişkene atama yapılırsa kalıcaı değişir
        name = meslek.concat(name);
        System.out.println("name" + name);


    }
}
