package Intellegent.StringBuilder_VarArgs;

public class VarArgs {
    public static void main(String[] args) {
        ortalamaHesapla("Ahmet",90,80,70);
        ortalamaHesapla("Mehmet",90,80);
        ortalamaHesapla("Veli",90);


    }//main bitiş

    public static void ortalamaHesapla(String isim,int... sayi){//yapacağınız işlem belli ama ne kadar veri gireceiniz belli değilse
                                                                //VargArgs 'dan yararlanılır. VarArgs method imzasında son paramaetre olmalı
        int toplam=0;
        for (int w:sayi) {
            toplam+=w;
        }
        System.out.println(sayi.length);
        System.out.println(isim + "=" +toplam / sayi.length);
    }
}
