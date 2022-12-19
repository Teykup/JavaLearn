package j18_Constructor;

public class C01_Constructur {
    /*
    1-constructor ismi Calss name le aynı olmalı.büyük harf ile başlamalı
    2-constructor create edildiğinde nameden sonra () {}mutlaka konulmalı
    3-constructor create edildiğinde java default constructor u ezer
    4-cons. return type ı olmaz method dan ayıran özelliği
    5-class oluştupunda java default constructoru kendi create eder.
     */



    String str;//instance veriable / obje veriable
    String selam = "güzel insan";

    public static void main(String[] args) {
        C01_Constructur obj1 = new C01_Constructur();
        C01_Constructur obj2 = new C01_Constructur();
        C01_Constructur obj3 = new C01_Constructur();
        C01_Constructur obj4 = new C01_Constructur();

        obj1.str="javacan";
        obj2.str = "javatar";
        System.out.println(obj3.selam);
    }
}
